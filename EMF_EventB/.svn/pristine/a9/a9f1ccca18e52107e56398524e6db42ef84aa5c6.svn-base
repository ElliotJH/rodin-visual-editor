package org.eventb.emf.persistence;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eventb.emf.core.EventBElement;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public interface ISynchroniser {
	public <T extends EventBElement> EventBElement load(IRodinElement rodinElement, EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException;

	public IRodinElement save(EventBElement emfElement, IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException, CoreException;
}
