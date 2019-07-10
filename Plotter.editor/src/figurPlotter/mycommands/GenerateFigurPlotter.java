package figurPlotter.mycommands;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import figurPlotter.FigurPlotterPackage;
import plotter.jobs.GenerateJob;

public class GenerateFigurPlotter extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("Execution Triggered");

		IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
		Object firstElement = selection.getFirstElement();
		System.out.println(firstElement.getClass());

		if (firstElement instanceof IFile) {

			// get the selected ecore file
			IFile fileEcore = (IFile) selection.getFirstElement();

			IProject project = fileEcore.getProject();

			ResourceSet resourceSet = new ResourceSetImpl();
			// load the ecore file
			URI uriEcoreFile = URI.createFileURI(fileEcore.getRawLocation().toString());
			Resource resEcoreFile = resourceSet.createResource(uriEcoreFile);
			FigurPlotterPackage package2;
			try {
				resEcoreFile.load(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}

			// start generation
			System.out.println("Generating Java code now.");
			GenerateJob job = new GenerateJob("Generating Java code", resEcoreFile, project, resourceSet);
			job.setUser(true);
			job.schedule();

		}
		return null;
	}

}
