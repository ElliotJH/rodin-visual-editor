package org.eventb.emf.core.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.diagram.edit.parts.ContextEditPart;
import org.eventb.emf.core.diagram.edit.parts.Machine2EditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineEditPart;
import org.eventb.emf.core.diagram.edit.parts.ProjectEditPart;
import org.eventb.emf.core.machine.MachinePackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class EventbcoreVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eventb.emf.core.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProjectEditPart.MODEL_ID.equals(view.getType())) {
				return ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				EventbcoreDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (CorePackage.eINSTANCE.getProject().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Project) domainElement)) {
			return ProjectEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
				.getModelID(containerView);
		if (!ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProjectEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProjectEditPart.VISUAL_ID:
			if (ContextPackage.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (MachinePackage.eINSTANCE.getMachine().isSuperTypeOf(
					domainElement.eClass())) {
				return MachineEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
				.getModelID(containerView);
		if (!ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProjectEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProjectEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProjectEditPart.VISUAL_ID:
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MachineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MachinePackage.eINSTANCE.getMachine().isSuperTypeOf(
				domainElement.eClass())) {
			return Machine2EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Project element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ProjectEditPart.VISUAL_ID:
			return false;
		case ContextEditPart.VISUAL_ID:
		case MachineEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
