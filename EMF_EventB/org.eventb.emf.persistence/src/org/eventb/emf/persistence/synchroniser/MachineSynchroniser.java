package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.core.EventBAttributes;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.IRefinesMachine;
import org.eventb.core.ISeesContext;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachineFactory;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

public class MachineSynchroniser extends AbstractSynchroniser {

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.TARGET_ATTRIBUTE);
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	protected Machine createEventBElement() {
		return MachineFactory.eINSTANCE.createMachine();
	}

	@Override
	protected EStructuralFeature getFeature() {
		return CorePackage.eINSTANCE.getProject_Components();
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		return IMachineRoot.ELEMENT_TYPE;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {
		// create EMF node for machine
		final Machine eventBElement = (Machine) super.load(rodinElement, emfParent, monitor);

		if (rodinElement instanceof IMachineRoot) {
			EList<String> refinesNames = eventBElement.getRefinesNames();
			IMachineRoot machineRoot = (IMachineRoot) rodinElement;

			for (IRefinesMachine refinesMachine : machineRoot.getRefinesClauses()) {
				//save the rodin internal name of the refinesMachine element for later use when saving
				saveRodinReferenceInternalName(eventBElement, "refines", refinesMachine.getAbstractMachineName(), refinesMachine.getElementName());
				refinesNames.add(refinesMachine.getAbstractMachineName());
			}

			EList<String> seesNames = eventBElement.getSeesNames();
			for (ISeesContext seesContext : machineRoot.getSeesClauses()) {
				//save the rodin internal name of the seesContext element for later use when saving
				saveRodinReferenceInternalName(eventBElement, "sees", seesContext.getSeenContextName(), seesContext.getElementName());
				seesNames.add(seesContext.getSeenContextName());
			}
		}

		return eventBElement;
	}

	@Override
	public IRodinElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		// get machine file if synchronised from project
		final IRodinElement parent = rodinParent instanceof IRodinProject ? ((IEventBProject) rodinParent.getAdapter(IEventBProject.class))
				.getMachineFile(((EventBNamed) emfElement).getName()) : rodinParent;

		// create Rodin element
		IRodinElement rodinElement = super.save(emfElement, parent, monitor);
		if (rodinElement instanceof IMachineRoot && emfElement instanceof Machine) {
			EList<String> refinesNames = ((Machine) emfElement).getRefinesNames();
			for (String refinesName : refinesNames) {
				IRefinesMachine refinesMachine = ((IMachineRoot) rodinElement).getRefinesClause(getRodinReferenceInternalName(emfElement, "refines", refinesName));
				refinesMachine.create(null, monitor);
				refinesMachine.setAbstractMachineName(refinesName, monitor);
			}
			EList<String> seesNames = ((Machine) emfElement).getSeesNames();
			for (String seesName : seesNames) {
				ISeesContext seesContext = ((IMachineRoot) rodinElement).getSeesClause(getRodinReferenceInternalName(emfElement, "sees", seesName));
				seesContext.create(null, monitor);
				seesContext.setSeenContextName(seesName, monitor);
			}
		}

		return rodinElement;
	}
}
