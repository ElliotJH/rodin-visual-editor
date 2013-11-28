package org.eventb.emf.core.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eventb.emf.core.diagram.edit.commands.ContextExtendsCreateCommand;
import org.eventb.emf.core.diagram.edit.commands.ContextExtendsReorientCommand;
import org.eventb.emf.core.diagram.edit.commands.MachineSeesCreateCommand;
import org.eventb.emf.core.diagram.edit.commands.MachineSeesReorientCommand;
import org.eventb.emf.core.diagram.edit.parts.ContextExtendsEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineSeesEditPart;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;

/**
 * @generated
 */
public class ContextItemSemanticEditPolicy extends
		EventbcoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContextItemSemanticEditPolicy() {
		super(EventbcoreElementTypes.Context_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (EventbcoreVisualIDRegistry.getVisualID(incomingLink) == MachineSeesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (EventbcoreVisualIDRegistry.getVisualID(incomingLink) == ContextExtendsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (EventbcoreVisualIDRegistry.getVisualID(outgoingLink) == ContextExtendsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EventbcoreElementTypes.MachineSees_4006 == req.getElementType()) {
			return null;
		}
		if (EventbcoreElementTypes.ContextExtends_4007 == req.getElementType()) {
			return getGEFWrapper(new ContextExtendsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (EventbcoreElementTypes.MachineSees_4006 == req.getElementType()) {
			return getGEFWrapper(new MachineSeesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (EventbcoreElementTypes.ContextExtends_4007 == req.getElementType()) {
			return getGEFWrapper(new ContextExtendsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MachineSeesEditPart.VISUAL_ID:
			return getGEFWrapper(new MachineSeesReorientCommand(req));
		case ContextExtendsEditPart.VISUAL_ID:
			return getGEFWrapper(new ContextExtendsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
