package org.eventb.emf.core.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;

/**
 * @generated
 */
public class Machine2ItemSemanticEditPolicy extends
		EventbcoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Machine2ItemSemanticEditPolicy() {
		super(EventbcoreElementTypes.Machine_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
