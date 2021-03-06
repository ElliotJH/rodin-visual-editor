package org.eventb.emf.core.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;

/**
 * @generated
 */
public class ContextExtendsItemSemanticEditPolicy extends
		EventbcoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextExtendsItemSemanticEditPolicy() {
		super(EventbcoreElementTypes.ContextExtends_4007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
