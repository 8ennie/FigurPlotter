package plotter.generator

import org.eclipse.emf.ecore.resource.Resource
import figurPlotter.FigurPlotterPackage
import org.eclipse.emf.ecore.EClassifier
import figurPlotter.Figur
import plotter.util.JavaFormatter
import plotter.util.XmlFormatter
import java.io.InputStream
import java.io.ByteArrayInputStream
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IFolder
import plotter.util.ImportStatementFinder
import org.eclipse.core.resources.IProject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.util.ExtendedMetaData
import org.eclipse.emf.ecore.util.BasicExtendedMetaData
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.EPackage

class MetaModelGen {

	public static String PACKAGE;

	public static String PACKAGE_PATH;

	public static String SOURCE_FOLDER_PATH;
	
	private static ResourceSet resourceSet;

	var ImportStatementFinder importFinder = new ImportStatementFinder()

	new(String PACKAGE, String SOURCE_FOLDER_PATH, String PACKAGE_PATH, ResourceSet resourceSet) {
		this.PACKAGE = PACKAGE;
		this.SOURCE_FOLDER_PATH = SOURCE_FOLDER_PATH
		this.PACKAGE_PATH = PACKAGE_PATH;
		this.resourceSet = resourceSet;
	}

	def genMetaModel(IProject project, IProgressMonitor progressMonitor) {
		var IFolder entityFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "figurs");
		var ExtendedMetaData modelMetaData = new BasicExtendedMetaData(EPackage.Registry.INSTANCE);
		for (EClassifier e : FigurPlotterPackage.eINSTANCE.EClassifiers) {
			var EClass figuresEClass =  modelMetaData.getType("http://www.example.org/figurplotter", e.name) as EClass;
//			if(!figuresEClass.EAllSuperTypes.empty && !figuresEClass.name.equals('Figur')){
//				if(figuresEClass.EAllSuperTypes.head.name.equals('Figur')){
				var content = compileEntitiesGen(figuresEClass);
				createFile(entityFolder, figuresEClass.name + "Gen.java", true, content, progressMonitor);

//				content = figurChildClass(figuresEClass);
//				createFile(entityFolder, figuresEClass.name + ".java", true, content, progressMonitor);
//				}
//			}
			
		}
//		var EClass figuresEClass =  modelMetaData.getType("http://www.example.org/figurplotter", "Figur") as EClass;
//		println(figuresEClass)
//		for(e: figuresEClass.EAllAttributes){
//			println(e)
//		}
//		for (EClassifier e : FigurPlotterPackage.eINSTANCE.EClassifiers) {
//			var IFolder entityFolder = project.getFolder(SOURCE_FOLDER_PATH + PACKAGE_PATH + "figurs");
//			if (!e.name.equals('Figur') && !e.name.equals('Plotter') && !e.name.equals('Point')) {
//
//				var content = genFigurChildClass(e);
//				createFile(entityFolder, e.name + "Gen.java", true, content, progressMonitor);
//
//				content = figurChildClass(e);
//				createFile(entityFolder, e.name + ".java", true, content, progressMonitor);
//			} else if (e.name.equals('Figur') || e.name.equals('Plotter') || e.name.equals('Point')) {
//				var content = genFigurClass(e);
//				createFile(entityFolder, e.name + "Gen.java", true, content, progressMonitor);
//			}
//
//		}

	}

	def figurChildClass(EClass e) {
		'''
			package «PACKAGE»figurs;
			
			/**
			* This is the {@link «e.name»} entity class.
			*
			*@generated
			*/
			public class «e.name» extends «e.name»Gen {
					
			}
		'''
	}

	def genFigurClass(EClass e) {
		'''
			package «PACKAGE»figurs;
			
			/**
			* This is the {@link «e.name»} entity class.
			*
			*@generated
			*/
			public abstract class «e.name»Gen {
				
			
			}
		'''
	}



	def genFigurChildClass(EClass e) {
		'''
			package «PACKAGE»figurs;
			
			/**
			* This is the {@link «e.name»} entity class.
			*
			*@generated
			*/
			public abstract class «e.name»Gen extends FigurGen {
				
			}
				
			
			
		'''
	}

def compileEntitiesGen(EClass e) {
		'''
			package «PACKAGE»figurs;
			
			import de.thm.plotter.figurimpl.*;
			
			/**
			* This is the {@link «e.name»} figurs class.
			*
			*@generated
			*/
			public abstract class «e.name»Gen «IF !e.EAllSuperTypes.empty» extends «e.EAllSuperTypes.head.name» «ENDIF» {
			
				// attributes
				«FOR a : e.EAllAttributes»
					private «a.EType.instanceTypeName» «a.name»;
				«ENDFOR»
				
				// references
				«FOR a : e.EAllReferences.filter[!many]»
					private «a.EReferenceType.name» «a.name»;
				«ENDFOR»
				«FOR a : e.EAllReferences.filter[many]»
					private java.util.ArrayList<«a.EReferenceType.name»> «a.name»;
				«ENDFOR»
				
				«IF !e.EAllAttributes.empty && !e.EAllReferences.empty»
					/**
					* Full constructor.
					*/
					public «e.name»Gen(
					«FOR a : e.EAllAttributes SEPARATOR ', '» «a.EType.instanceTypeName» «a.name» «ENDFOR» 
					«FOR a : e.EAllReferences.filter[!many] BEFORE ', ' SEPARATOR ', '» «a.EReferenceType.name» «a.name» «ENDFOR»
					«FOR a : e.EAllReferences.filter[many] BEFORE ', ' SEPARATOR ', '» java.util.ArrayList<«a.EReferenceType.name»> «a.name» «ENDFOR») {
					super();
					«FOR a : e.EAllAttributes + e.EAllReferences»
						this.«a.name» = «a.name»;
					«ENDFOR»
					}
				«ENDIF»
				
					/**
					* Default empty constructor
					*
					* @generated
					*/
					public «e.name»Gen(){
					};
				
				
				«FOR a : e.EAllAttributes»
					public «a.EType.instanceTypeName» get«a.name.toFirstUpper» () {
						return this.«a.name»;
					}
					public void set«a.name.toFirstUpper»  («a.EType.instanceTypeName» «a.name.toFirstUpper»){
						this.«a.name» = 	«a.name.toFirstUpper»;		 	
					}
					
				«ENDFOR»
				
				«FOR a : e.EAllReferences.filter[!many]»
					public «a.EReferenceType.name» get«a.name.toFirstUpper» () {
						return this.«a.name»;
					}
					public void set«a.name.toFirstUpper»  («a.EReferenceType.name» «a.name.toFirstUpper»){
						this.«a.name» = 	«a.name.toFirstUpper»;		 	
					}
				«ENDFOR»
				«FOR a : e.EAllReferences.filter[many]»
					public java.util.ArrayList<«a.EReferenceType.name»> get«a.name.toFirstUpper» () {
					 	return this.«a.name»;
					}
					public void set«a.name.toFirstUpper»  (java.util.ArrayList<«a.EReferenceType.name»> «a.name.toFirstUpper»){
						this.«a.name» = 	«a.name.toFirstUpper»;		 	
					}
					
				«ENDFOR»
			
			}
		'''
	}

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
}
