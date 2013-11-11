package org.eventb.emf.persistence.factory;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eventb.emf.core.EventBObject;
import org.rodinp.core.RodinMarkerUtil;
import org.rodinp.core.builder.IAutomaticTool;
import org.rodinp.core.builder.IExtractor;
import org.rodinp.core.builder.IGraph;

public class ModelUpdateTool implements IAutomaticTool, IExtractor {
	public boolean run(IFile source, IFile target, IProgressMonitor monitor) throws CoreException {
		Collection<RodinResource> rodinResources = RodinResourceFactory.getHandledResources(target);

		if (rodinResources != null) {
			for (RodinResource rodinResource : rodinResources) {
				ChangeListenerRegistry.notifyChangeListener(rodinResource);
			}
		}

		return false;
	}

	public void clean(IFile source, IFile target, IProgressMonitor monitor) throws CoreException {
		//		Collection<RodinResource> rodinResources = RodinResourceFactory.getHandledResources(target);
		//
		//		if (rodinResources != null) {
		//			for (RodinResource rodinResource : rodinResources) {
		//				// TODO verify that this is a good idea
		//				RodinResourceFactory.getSavedResources().remove(rodinResource);
		//			}
		//		}
	}

	public void extract(IFile source, IGraph graph, IProgressMonitor monitor) throws CoreException {
		graph.addTarget(source);
	}

	/**
	 * Clears all errors and warning diagnostics on the {@link RodinResource}
	 * which are based on Rodin markers. After that it generates new errors and
	 * warnings based on the Rodin markers of the {@link RodinResource}'s
	 * underlying persistent resource.
	 * 
	 * @param rodinResource
	 */
	public static void updateDiagnostics(final RodinResource rodinResource) {
		// clear old diagnostics (coming from Rodin markers)
		final EList<Diagnostic> errors = rodinResource.getErrors();
		clearRodinMarkers(errors);
		final EList<Diagnostic> warnings = rodinResource.getWarnings();
		clearRodinMarkers(warnings);

		try {
			IResource underlyingResource = rodinResource.getRodinFile().getUnderlyingResource();
			final IMarker[] markers = underlyingResource.findMarkers(RodinMarkerUtil.RODIN_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);

			// copy markers to Resource
			for (IMarker marker : markers) {
				final RodinDiagnostic diagnostic = createDiagnostic(rodinResource, marker);
				int severity = marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);

				if (severity == IMarker.SEVERITY_ERROR) {
					errors.add(diagnostic);
				} else if (severity == IMarker.SEVERITY_WARNING) {
					warnings.add(diagnostic);
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static RodinDiagnostic createDiagnostic(final RodinResource resource, final IMarker marker) {
		final int charStart = RodinMarkerUtil.getCharStart(marker);
		final int charEnd = RodinMarkerUtil.getCharEnd(marker);
		String attributeId = marker.getAttribute(RodinMarkerUtil.ATTRIBUTE_ID, null);
		final EventBObject eventBObject = resource.getMap().get(RodinMarkerUtil.getInternalElement(marker));

		return new RodinDiagnostic(marker, eventBObject, attributeId, marker.getAttribute(IMarker.MESSAGE, "unknown"), charStart, charEnd);
	}

	private static void clearRodinMarkers(EList<Diagnostic> diagnostics) {
		final Set<Diagnostic> toBeRemoved = new HashSet<Diagnostic>();

		for (Diagnostic diagnostic : diagnostics) {
			if (diagnostic instanceof RodinDiagnostic) {
				toBeRemoved.add(diagnostic);
			}
		}

		diagnostics.removeAll(toBeRemoved);
	}
}
