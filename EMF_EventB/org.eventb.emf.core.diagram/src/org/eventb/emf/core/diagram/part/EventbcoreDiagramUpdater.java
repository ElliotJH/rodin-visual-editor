package org.eventb.emf.core.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.diagram.edit.parts.ContextEditPart;
import org.eventb.emf.core.diagram.edit.parts.ContextExtendsEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineRefinesEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineSeesEditPart;
import org.eventb.emf.core.diagram.edit.parts.ProjectEditPart;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;

/**
 * @generated
 */
public class EventbcoreDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EventbcoreNodeDescriptor> getSemanticChildren(View view) {
		switch (EventbcoreVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreNodeDescriptor> getProject_1001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Project modelElement = (Project) view.getElement();
		LinkedList<EventbcoreNodeDescriptor> result = new LinkedList<EventbcoreNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			EventBNamedCommentedComponentElement childElement = (EventBNamedCommentedComponentElement) it
					.next();
			int visualID = EventbcoreVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new EventbcoreNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MachineEditPart.VISUAL_ID) {
				result.add(new EventbcoreNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getContainedLinks(View view) {
		switch (EventbcoreVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1001ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2001ContainedLinks(view);
		case MachineEditPart.VISUAL_ID:
			return getMachine_2002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getIncomingLinks(View view) {
		switch (EventbcoreVisualIDRegistry.getVisualID(view)) {
		case ContextEditPart.VISUAL_ID:
			return getContext_2001IncomingLinks(view);
		case MachineEditPart.VISUAL_ID:
			return getMachine_2002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getOutgoingLinks(View view) {
		switch (EventbcoreVisualIDRegistry.getVisualID(view)) {
		case ContextEditPart.VISUAL_ID:
			return getContext_2001OutgoingLinks(view);
		case MachineEditPart.VISUAL_ID:
			return getMachine_2002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getProject_1001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getContext_2001ContainedLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Context_Extends_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_2002ContainedLinks(
			View view) {
		Machine modelElement = (Machine) view.getElement();
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Machine_Sees_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Machine_Refines_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getContext_2001IncomingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Machine_Sees_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Context_Extends_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_2002IncomingLinks(
			View view) {
		Machine modelElement = (Machine) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Machine_Refines_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getContext_2001OutgoingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Context_Extends_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_2002OutgoingLinks(
			View view) {
		Machine modelElement = (Machine) view.getElement();
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Machine_Sees_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Machine_Refines_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getIncomingFeatureModelFacetLinks_Machine_Sees_4006(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MachinePackage.eINSTANCE
					.getMachine_Sees()) {
				result.add(new EventbcoreLinkDescriptor(setting.getEObject(),
						target, EventbcoreElementTypes.MachineSees_4006,
						MachineSeesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getIncomingFeatureModelFacetLinks_Machine_Refines_4005(
			Machine target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MachinePackage.eINSTANCE
					.getMachine_Refines()) {
				result.add(new EventbcoreLinkDescriptor(setting.getEObject(),
						target, EventbcoreElementTypes.MachineRefines_4005,
						MachineRefinesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getIncomingFeatureModelFacetLinks_Context_Extends_4007(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == ContextPackage.eINSTANCE
					.getContext_Extends()) {
				result.add(new EventbcoreLinkDescriptor(setting.getEObject(),
						target, EventbcoreElementTypes.ContextExtends_4007,
						ContextExtendsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getOutgoingFeatureModelFacetLinks_Machine_Sees_4006(
			Machine source) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		for (Iterator<?> destinations = source.getSees().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new EventbcoreLinkDescriptor(source, destination,
					EventbcoreElementTypes.MachineSees_4006,
					MachineSeesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getOutgoingFeatureModelFacetLinks_Machine_Refines_4005(
			Machine source) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		for (Iterator<?> destinations = source.getRefines().iterator(); destinations
				.hasNext();) {
			Machine destination = (Machine) destinations.next();
			result.add(new EventbcoreLinkDescriptor(source, destination,
					EventbcoreElementTypes.MachineRefines_4005,
					MachineRefinesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getOutgoingFeatureModelFacetLinks_Context_Extends_4007(
			Context source) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		for (Iterator<?> destinations = source.getExtends().iterator(); destinations
				.hasNext();) {
			Context destination = (Context) destinations.next();
			result.add(new EventbcoreLinkDescriptor(source, destination,
					EventbcoreElementTypes.ContextExtends_4007,
					ContextExtendsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<EventbcoreNodeDescriptor> getSemanticChildren(View view) {
			return EventbcoreDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<EventbcoreLinkDescriptor> getContainedLinks(View view) {
			return EventbcoreDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<EventbcoreLinkDescriptor> getIncomingLinks(View view) {
			return EventbcoreDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<EventbcoreLinkDescriptor> getOutgoingLinks(View view) {
			return EventbcoreDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
