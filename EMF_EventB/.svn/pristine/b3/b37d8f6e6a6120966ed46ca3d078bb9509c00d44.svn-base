package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.core.EventBAttributes;
import org.eventb.core.IWitness;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.Witness;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class WitnessSynchroniser extends AbstractSynchroniser {

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.PREDICATE_ATTRIBUTE);
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	protected EventBElement createEventBElement() {
		return MachineFactory.eINSTANCE.createWitness();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return MachinePackage.eINSTANCE.getEvent_Witnesses();
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return IWitness.ELEMENT_TYPE;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		// create EMF node
		Witness eventBElement = (Witness) super.load(rodinElement, emfParent, monitor);
		if (rodinElement instanceof IWitness) {
			if (((IWitness) rodinElement).hasPredicateString()) {
				eventBElement.setPredicate(((IWitness) rodinElement).getPredicateString());
			}
		}
		return eventBElement;
	}

	@Override
	public IRodinElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, rodinParent, monitor);
		if (rodinElement instanceof IWitness && emfElement instanceof Witness) {
			if (((Witness) emfElement).getPredicate() != null) {
				((IWitness) rodinElement).setPredicateString(((Witness) emfElement).getPredicate(), monitor);
			}
		}
		return rodinElement;
	}

}
