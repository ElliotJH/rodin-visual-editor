package org.eventb.emf.core.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;

/**
 * @generated
 */
public class MachineSeesItemSemanticEditPolicy extends
		EventbcoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MachineSeesItemSemanticEditPolicy() {
		super(EventbcoreElementTypes.MachineSees_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
