package org.eventb.emf.persistence.synchroniser;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.Project;
import org.eventb.emf.persistence.ISynchroniser;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;

public class ProjectSynchroniser implements ISynchroniser {

	public ProjectSynchroniser() {
		// TODO Auto-generated constructor stub
	}

	public <T extends EventBElement> EventBElement load(IRodinElement rodinElement, EventBElement emfParent, IProgressMonitor monitor) {
		if (rodinElement instanceof IRodinProject)
			return getEventBProject((IRodinProject) rodinElement, monitor);
		return null;
	}

	public static Project getEventBProject(final IRodinProject rodinProject, IProgressMonitor monitor) {
		Project eventBPro = CoreFactory.eINSTANCE.createProject();
		eventBPro.setName(rodinProject.getElementName());
		return eventBPro;
	}

	public IRodinElement save(EventBElement emfElement, IRodinElement rodinParent, IProgressMonitor monitor) throws CoreException {
		if (rodinParent instanceof IRodinProject && emfElement instanceof Project) {
			return createRodinProject((IRodinProject) rodinParent);
		}
		return null;
	}

	/**
	 * creates a new Rodin project (overwrites). (adapted from
	 * org.eventb.ui.wizards.NewProjectWizard.java doFinish())
	 * 
	 * @throws CoreException
	 */
	public IRodinProject createRodinProject(IRodinProject rodinProject) throws CoreException {
		final IProject project = rodinProject.getProject();
		if (!project.exists())
			project.create(null);
		project.open(null);

		// add the Rodin nature if it isn't already there
		IProjectDescription description = project.getDescription();
		if (!description.hasNature(RodinCore.NATURE_ID)) {
			List<String> natures = Arrays.asList(description.getNatureIds());
			natures.add(RodinCore.NATURE_ID);
			description.setNatureIds(natures.toArray(description.getNatureIds()));
			project.setDescription(description, null);
		}

		return rodinProject;
	}
}
