package plotter.generator

import figurPlotter.Arrow
import figurPlotter.Circle
import figurPlotter.Figur
import figurPlotter.Line
import figurPlotter.Plotter
import figurPlotter.Polygon
import figurPlotter.Rectangle
import figurPlotter.Square
import java.io.ByteArrayInputStream
import java.io.InputStream
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import plotter.util.ImportStatementFinder
import plotter.util.JavaFormatter
import plotter.util.XmlFormatter

class FigurPlotter {

	/**
	 * The path where to generate the Java files.
	 */
	public static final String SOURCE_FOLDER_PATH = "src-gen/";

	/**
	 * The base package name.
	 */
	public static final String PACKAGE = "de.thm.plotter.";

	public static final String PACKAGE_PATH = "/" + PACKAGE.replaceAll("\\.", "/");

	public static final String COMPLETE_PATH = SOURCE_FOLDER_PATH + PACKAGE_PATH;

	var ImportStatementFinder importFinder = new ImportStatementFinder()

	/**
	 * Creates a file (containing the content-CharSequence) within the given IFolder.
	 */
	def void createFile(IFolder folder, String fileName, boolean overrideFile, CharSequence content,
		IProgressMonitor progressMonitor) {
		if (progressMonitor.canceled) {
			throw new RuntimeException("Progress canceled");
		}
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		var IFile iFile = folder.getFile(fileName);
		// TODO, nur in der Testphase
		if (iFile.exists && true /*overrideFile*/ ) {
			iFile.delete(true, null);
		}
		if (!iFile.exists) {
			// process the code
			var String formattedCode
			if (fileName.endsWith(".java")) {
				// organize imports
				var String sourceWithImports = importFinder.getWithImports(content.toString);
				// format the code
				formattedCode = JavaFormatter.format(sourceWithImports);
			} else if (fileName.endsWith(".xml")) {
				// format the code
				formattedCode = XmlFormatter.format(content.toString)
			}

			var byte[] bytes
			if (formattedCode !== null) { // has the code been formatted?
				bytes = formattedCode.getBytes();
			} else { // code could not be formatted
				bytes = content.toString.bytes;
				System.err.println("File " + fileName + " could not be formatted.")
			}
			// save the file
			var InputStream source = new ByteArrayInputStream(bytes);
			iFile.create(source, true, null);
		}
	}

	/**
	 * Starts the generation of the given Resource file in the given IProject.
	 */
	def void doGenerate(Resource resourceEcore, IProject project, IProgressMonitor progressMonitor,
		ResourceSet resourceSet) {
		try {
			// begin the task with the amount of work
			progressMonitor.beginTask("Generating Java code", 2);

			progressMonitor.subTask("Creating folders");

			// create deeper folders
			var IFolder folder = project.getFolder(SOURCE_FOLDER_PATH + "de");
			if (!folder.exists()) {
				folder.create(true, true, null);
			}
			folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm");
			if (!folder.exists()) {
				folder.create(true, true, null);
			}
			folder = project.getFolder(SOURCE_FOLDER_PATH + "/de/thm/plotter");
			if (!folder.exists()) {
				folder.create(true, true, null);
			}

			// create entity package folder
			folder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "figurs");
			if (!folder.exists()) {
				folder.create(true, true, null);
			}

			/*
			 * We start to generate the classes for our application. First we create the *Gen classes, then die classes which extends the *Gen classes, in which the
			 * user can to customizations.
			 */
			// create Entities
			// create Entities
			var IFolder entityFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "figurs");
			progressMonitor.subTask("Generating Entities");

			var MetaModelGen metaModelgen = new MetaModelGen(PACKAGE, SOURCE_FOLDER_PATH, PACKAGE_PATH, resourceSet)
			metaModelgen.genMetaModel(project, progressMonitor)

			entityFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "main");
			var CharSequence content = compileMainClassGen(resourceEcore);
			createFile(entityFolder, "MainGen.java", true, content, progressMonitor);

			// finish the progress monitor
			progressMonitor.done;

		} catch (Exception ex) {
			ex.printStackTrace;
		}
	}

	def compileMainClassGen(Resource resourceEcore) {
		'''
			package «PACKAGE»main;
			
			import de.thm.plotter.figurimpl.*;
			import de.thm.plotter.figurs.*;
			import processing.core.PApplet;
			
			@SuppressWarnings("serial")
			public class MainGen extends PApplet {
				public static void main(final String[] args) {
					PApplet.main(MainGen.class.getName());
				}
			
			«FOR Figur f : resourceEcore.allContents.toIterable.filter(typeof(Figur))»
				private «f.eClass.name» «f.name»;
			«ENDFOR»
			
			
				@Override
				public void draw() {
					«FOR Figur f : resourceEcore.allContents.toIterable.filter(typeof(Figur))»
						this.«f.name».show(this);
					«ENDFOR»
				}
			
				public void settings() {
				  	«FOR Plotter p : resourceEcore.allContents.toIterable.filter(typeof(Plotter))»
				  	this.size(«p.canvasLength», «p.canvasWidth»);
				«ENDFOR»
				}
			
				@Override
				public void setup() {
««« 				this.fill(120, 50, 240);
«««   				this.strokeWeight(1);
					
«««				Generation the Figures  »»»
				// Lines
				«FOR Line l : resourceEcore.allContents.toIterable.filter(typeof(Line))»
					this.«l.name» = new Line("«l.name»", "«l.color»", «l.filled», «l.strokeWeight», «l.degree», «l.displayName», new Point(«l.center.XPos», «l.center.YPos»), «l.lenght» , null);
				«ENDFOR»
				// Arrows
				«FOR Arrow a : resourceEcore.allContents.toIterable.filter(typeof(Arrow))»
					this.«a.name» = new Arrow("«a.name»", "«a.color»", «a.filled», «a.strokeWeight», «a.degree», «a.displayName», new Point(«a.center.XPos», «a.center.YPos»), «a.lenght», «a.arrowheadLeft»,«a.arrowheadRight», null);
				«ENDFOR»
				
				// Circles
				«FOR Circle c : resourceEcore.allContents.toIterable.filter(typeof(Circle))»
					this.«c.name» = new Circle("«c.name»", "«c.color»", «c.filled», «c.strokeWeight», «c.degree», «c.displayName», new Point(«c.center.XPos», «c.center.YPos»), 2 * «c.radius», null);
				«ENDFOR»
				
				// Rectangles
				«FOR Rectangle r  : resourceEcore.allContents.toIterable.filter(typeof(Rectangle))»
					this.«r.name» = new Rectangle("«r.name»", "«r.color»", «r.filled», «r.strokeWeight», «r.degree», «r.displayName», new Point(«r.center.XPos», «r.center.YPos»), «r.sizeA», «r.sizeB», null);
				«ENDFOR»
				
				// Squares
				«FOR Square s  : resourceEcore.allContents.toIterable.filter(typeof(Square))»
					this.«s.name» = new Square("«s.name»", "«s.color»", «s.filled», «s.strokeWeight», «s.degree», «s.displayName», new Point(«s.center.XPos», «s.center.YPos»), «s.sizeA», null);
				«ENDFOR»
				
				// Polygons
				«FOR Polygon p  : resourceEcore.allContents.toIterable.filter(typeof(Polygon))»
					this.«p.name» = new Polygon("«p.name»", "«p.color»", «p.filled», «p.strokeWeight», «p.degree», «p.displayName», new Point(«p.center.XPos», «p.center.YPos»), «p.radius», «p.numberOfVertices», null);
				«ENDFOR»
				}
			}
			'''
	}

}
