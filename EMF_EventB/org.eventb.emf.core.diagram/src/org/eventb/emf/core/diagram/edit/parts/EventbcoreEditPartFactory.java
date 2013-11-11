package org.eventb.emf.core.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;

/**
 * @generated
 */
public class EventbcoreEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EventbcoreVisualIDRegistry.getVisualID(view)) {

			case ProjectEditPart.VISUAL_ID:
				return new ProjectEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case MachineEditPart.VISUAL_ID:
				return new MachineEditPart(view);

			case Machine2EditPart.VISUAL_ID:
				return new Machine2EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
