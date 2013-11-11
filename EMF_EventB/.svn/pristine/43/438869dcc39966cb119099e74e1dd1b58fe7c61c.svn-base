package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.core.EventBAttributes;
import org.eventb.core.IInvariant;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class InvariantSynchroniser extends AbstractSynchroniser {

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.PREDICATE_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.THEOREM_ATTRIBUTE);
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	protected EventBElement createEventBElement() {
		return MachineFactory.eINSTANCE.createInvariant();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return MachinePackage.eINSTANCE.getMachine_Invariants();
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return IInvariant.ELEMENT_TYPE;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		// create EMF node
		Invariant eventBElement = (Invariant) super.load(rodinElement, emfParent, monitor);
		if (rodinElement instanceof IInvariant) {
			eventBElement.setTheorem(((IInvariant) rodinElement).isTheorem());
			if (((IInvariant) rodinElement).hasPredicateString()) {
				eventBElement.setPredicate(((IInvariant) rodinElement).getPredicateString());
			}
		}
		return eventBElement;
	}

	@Override
	public IRodinElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, rodinParent, monitor);
		if (rodinElement instanceof IInvariant && emfElement instanceof Invariant) {
			if (((Invariant) emfElement).getPredicate() != null) {
				((IInvariant) rodinElement).setPredicateString(((Invariant) emfElement).getPredicate(), monitor);
			}
			((IInvariant) rodinElement).setTheorem(((Invariant) emfElement).isTheorem(), monitor);
		}
		return rodinElement;
	}
}
