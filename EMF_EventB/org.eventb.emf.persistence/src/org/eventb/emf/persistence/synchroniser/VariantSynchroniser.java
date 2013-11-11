package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.core.EventBAttributes;
import org.eventb.core.IVariant;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Variant;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class VariantSynchroniser extends AbstractSynchroniser {

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.EXPRESSION_ATTRIBUTE);
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	protected EventBElement createEventBElement() {
		return MachineFactory.eINSTANCE.createVariant();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return MachinePackage.eINSTANCE.getMachine_Variant();
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return IVariant.ELEMENT_TYPE;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		// create EMF node
		Variant eventBElement = (Variant) super.load(rodinElement, emfParent, monitor);
		if (rodinElement instanceof IVariant) {
			if (((IVariant) rodinElement).hasExpressionString()) {
				eventBElement.setExpression(((IVariant) rodinElement).getExpressionString());
			}
		}
		return eventBElement;
	}

	@Override
	public IRodinElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, rodinParent, monitor);
		if (rodinElement instanceof IVariant && emfElement instanceof Variant) {
			if (((Variant) emfElement).getExpression() != null) {
				((IVariant) rodinElement).setExpressionString(((Variant) emfElement).getExpression(), monitor);
			}
		}
		return rodinElement;
	}

}
