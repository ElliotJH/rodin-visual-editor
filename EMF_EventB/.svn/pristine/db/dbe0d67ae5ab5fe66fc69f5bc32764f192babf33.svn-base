package org.eventb.emf.persistence.synchroniser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.persistence.ISynchroniser;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinDBException;

public class SkipSynchroniser implements ISynchroniser { //extends AbstractSynchroniser {

	//	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();
	//
	//	@Override
	//	protected Set<IAttributeType> getHandledAttributeTypes() {
	//		return handledAttributes;
	//	}
	//
	//	//
	//	@Override
	//	protected EventBElement createEventBElement() {
	//		return ContextFactory.eINSTANCE.createConstant();
	//	}
	//
	//	@Override
	//	protected EStructuralFeature getFeature() {
	//		return ContextPackage.eINSTANCE.getContext_Constants();
	//	}
	//
	//	@Override
	//	protected IInternalElementType<?> getRodinType() {
	//		return IConstant.ELEMENT_TYPE;
	//	}

	public <T extends EventBElement> EventBElement load(IRodinElement rodinElement, EventBElement emfParent, IProgressMonitor monitor) throws RodinDBException {
		return emfParent;
	}

	public IInternalElement save(EventBElement emfElement, IRodinElement rodinParent, IProgressMonitor monitor) throws RodinDBException {
		return asInternalElement(rodinParent);
	}

	private IInternalElement asInternalElement(IRodinElement rodinElement) {
		if (rodinElement instanceof IInternalElement) {
			return (IInternalElement) rodinElement;
		} else if (rodinElement instanceof IRodinFile) {
			return ((IRodinFile) rodinElement).getRoot();
		} else {
			return null;
		}
	}

}
