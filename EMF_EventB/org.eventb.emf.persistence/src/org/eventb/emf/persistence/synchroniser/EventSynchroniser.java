package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.core.EventBAttributes;
import org.eventb.core.IConvergenceElement.Convergence;
import org.eventb.core.IEvent;
import org.eventb.core.IRefinesEvent;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.MachineFactory;
import org.eventb.emf.core.machine.MachinePackage;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class EventSynchroniser extends AbstractSynchroniser {

	public static final String INITIALISATION = "INITIALISATION";

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.CONVERGENCE_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.TARGET_ATTRIBUTE);
		handledAttributes.add(EventBAttributes.EXTENDED_ATTRIBUTE);
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	protected EventBElement createEventBElement() {
		return MachineFactory.eINSTANCE.createEvent();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return MachinePackage.eINSTANCE.getMachine_Events();
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return IEvent.ELEMENT_TYPE;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		// create EMF node
		Event eventBElement = (Event) super.load(rodinElement, emfParent, monitor);
		if (rodinElement instanceof IEvent) {
			IEvent event = (IEvent) rodinElement;

			if (event.getConvergence() == Convergence.ORDINARY) {
				eventBElement.setConvergence(org.eventb.emf.core.machine.Convergence.ORDINARY);
			} else if (event.getConvergence() == Convergence.CONVERGENT) {
				eventBElement.setConvergence(org.eventb.emf.core.machine.Convergence.CONVERGENT);
			} else if (event.getConvergence() == Convergence.ANTICIPATED) {
				eventBElement.setConvergence(org.eventb.emf.core.machine.Convergence.ANTICIPATED);
			}

			// extends flag
			final boolean extended = event.isExtended();
			eventBElement.setExtended(extended);

			// refines attribute
			EList<String> refinesNames = eventBElement.getRefinesNames();
			if (extended && INITIALISATION.equals(event.getLabel())) {
				/*
				 * Grumble grumble, special cases...
				 * Workaround for bug / design decision
				 * http://sourceforge.net/tracker/?func=detail&atid=651669&aid=2810797&group_id=108850
				 */
				refinesNames.add(INITIALISATION);
			} else {
				for (IRefinesEvent refinesEvent : event.getRefinesClauses()) {
					String refines = refinesEvent.getAbstractEventLabel();
					//save the rodin internal name of the refinesEvent element for later use when saving
					saveRodinReferenceInternalName(eventBElement, "refines", refines, refinesEvent.getElementName());
					//add the refines to the EMF event
					refinesNames.add(refines);
				}
			}
		}
		return eventBElement;
	}

	@Override
	public IRodinElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {

		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, rodinParent, monitor);
		if (rodinElement instanceof IEvent && emfElement instanceof Event) {
			IEvent rodinEvent = (IEvent) rodinElement;
			Event emfEvent = (Event) emfElement;
			if (emfEvent.getConvergence() == org.eventb.emf.core.machine.Convergence.ORDINARY) {
				rodinEvent.setConvergence(Convergence.ORDINARY, monitor);
			} else if (emfEvent.getConvergence() == org.eventb.emf.core.machine.Convergence.CONVERGENT) {
				rodinEvent.setConvergence(Convergence.CONVERGENT, monitor);
			} else if (emfEvent.getConvergence() == org.eventb.emf.core.machine.Convergence.ANTICIPATED) {
				rodinEvent.setConvergence(Convergence.ANTICIPATED, monitor);
			}

			boolean extended = emfEvent.isExtended();
			rodinEvent.setExtended(extended, monitor);
			EList<String> refinesNames = emfEvent.getRefinesNames();

			if (extended && INITIALISATION.equals(emfEvent.getName())) {
				if (refinesNames.size() > 0) {
					/*
					 * Grumble grumble, special cases...
					 * Workaround for bug / design decision
					 * http://sourceforge.net/tracker/?func=detail&atid=651669&aid=2810797&group_id=108850
					 * 
					 * Need to filter extended event name if it is INITIALISATION,
					 * otherwise we leave it to Rodin to complain about it.
					 */
					final String extendsName = refinesNames.get(0);
					if (!INITIALISATION.equals(extendsName)) {
						IRefinesEvent refinesEvent = rodinEvent.getRefinesClause(getRodinReferenceInternalName(emfEvent, "refines", extendsName));
						refinesEvent.create(null, monitor);
						refinesEvent.setAbstractEventLabel(extendsName, monitor);
					}
				}
			} else {
				for (String refinesName : refinesNames) {
					IRefinesEvent refinesEvent = rodinEvent.getRefinesClause(getRodinReferenceInternalName(emfEvent, "refines", refinesName));
					refinesEvent.create(null, monitor);
					refinesEvent.setAbstractEventLabel(refinesName, monitor);
				}
			}
		}
		return rodinElement;
	}
}
