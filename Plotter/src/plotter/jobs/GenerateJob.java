package plotter.jobs;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import plotter.generator.FigurPlotter;

public class GenerateJob extends Job implements IJobChangeListener {

	long jobBegin;
	Resource resEcoreFile;
	IProject project;
	ResourceSet resourceSet;

	public GenerateJob(String name, Resource resEcoreFile, IProject project, ResourceSet resourceSet) {
		super(name);
		this.resEcoreFile = resEcoreFile;
		this.project = project;
		this.resourceSet = resourceSet;
		addJobChangeListener(this);
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		// start the generation
		jobBegin = System.currentTimeMillis();

		FigurPlotter generator = new FigurPlotter();
		generator.doGenerate(resEcoreFile, project, monitor, resourceSet);
		return Status.OK_STATUS;
	}

	@Override
	public void aboutToRun(IJobChangeEvent event) {
	}

	@Override
	public void awake(IJobChangeEvent event) {
	}

	@Override
	public void done(IJobChangeEvent event) {
		long jobEnd = System.currentTimeMillis();
		if (event.getResult().isOK()) {
			System.out.println("Generating Java code has finished (took " + (jobEnd - jobBegin) + " ms).");
		} else if (event.getResult().matches(Status.CANCEL)) {
			System.out.println("Generating Java code has been cancelled (took " + (jobEnd - jobBegin) + " ms).");
		}
	}

	@Override
	public void running(IJobChangeEvent event) {
	}

	@Override
	public void scheduled(IJobChangeEvent event) {
	}

	@Override
	public void sleeping(IJobChangeEvent event) {
	}

}
