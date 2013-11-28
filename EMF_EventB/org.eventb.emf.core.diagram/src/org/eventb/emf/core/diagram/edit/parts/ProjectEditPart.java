package org.eventb.emf.core.diagram.edit.parts;

import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eventb.emf.core.diagram.edit.policies.ProjectCanonicalEditPolicy;
import org.eventb.emf.core.diagram.edit.policies.ProjectItemSemanticEditPolicy;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;

/**
 * @generated
 */
public class ProjectEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Eventbcore"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1001;

	/**
	 * @generated
	 */
	public ProjectEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ProjectItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ProjectCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						EventbcoreVisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

}
