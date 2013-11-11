package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.core.EventBAttributes;
import org.eventb.core.IAxiom;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.context.Axiom;
import org.eventb.emf.core.context.ContextFactory;
import org.eventb.emf.core.context.ContextPackage;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class AxiomSynchroniser extends AbstractSynchroniser {

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
		return ContextFactory.eINSTANCE.createAxiom();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return ContextPackage.eINSTANCE.getContext_Axioms();
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return IAxiom.ELEMENT_TYPE;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		// create EMF node
		Axiom eventBElement = (Axiom) super.load(rodinElement, emfParent, monitor);
		if (rodinElement instanceof IAxiom) {
			eventBElement.setTheorem(((IAxiom) rodinElement).isTheorem());
			if (((IAxiom) rodinElement).hasPredicateString()) {
				eventBElement.setPredicate(((IAxiom) rodinElement).getPredicateString());
			}
		}
		return eventBElement;
	}

	@Override
	public IRodinElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, rodinParent, monitor);
		if (rodinElement instanceof IAxiom && emfElement instanceof Axiom) {
			if (((Axiom) emfElement).getPredicate() != null) {
				((IAxiom) rodinElement).setPredicateString(((Axiom) emfElement).getPredicate(), monitor);
			}
			((IAxiom) rodinElement).setTheorem(((Axiom) emfElement).isTheorem(), monitor);
		}
		return rodinElement;
	}

}
