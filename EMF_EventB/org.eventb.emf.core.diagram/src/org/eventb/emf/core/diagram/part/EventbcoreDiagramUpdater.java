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
import org.eventb.emf.core.diagram.edit.parts.ContextEditPart;
import org.eventb.emf.core.diagram.edit.parts.Machine2EditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineEditPart;
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
			return getProject_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreNodeDescriptor> getProject_1000SemanticChildren(
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
			return getProject_1000ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2001ContainedLinks(view);
		case MachineEditPart.VISUAL_ID:
			return getMachine_2002ContainedLinks(view);
		case Machine2EditPart.VISUAL_ID:
			return getMachine_4001ContainedLinks(view);
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
		case Machine2EditPart.VISUAL_ID:
			return getMachine_4001IncomingLinks(view);
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
		case Machine2EditPart.VISUAL_ID:
			return getMachine_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getProject_1000ContainedLinks(
			View view) {
		Project modelElement = (Project) view.getElement();
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Machine_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getContext_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
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
		result.addAll(getIncomingTypeModelFacetLinks_Machine_4001(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getContext_2001OutgoingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Machine_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EventbcoreLinkDescriptor> getMachine_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getContainedTypeModelFacetLinks_Machine_4001(
			Project container) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		for (Iterator<?> links = container.getComponents().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Machine) {
				continue;
			}
			Machine link = (Machine) linkObject;
			if (Machine2EditPart.VISUAL_ID != EventbcoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getSees();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Context) {
				continue;
			}
			Context dst = (Context) theTarget;
			List sources = link.getSees();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Context) {
				continue;
			}
			Context src = (Context) theSource;
			result.add(new EventbcoreLinkDescriptor(src, dst, link,
					EventbcoreElementTypes.Machine_4001,
					Machine2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getIncomingTypeModelFacetLinks_Machine_4001(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MachinePackage.eINSTANCE
					.getMachine_Sees()
					|| false == setting.getEObject() instanceof Machine) {
				continue;
			}
			Machine link = (Machine) setting.getEObject();
			if (Machine2EditPart.VISUAL_ID != EventbcoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List sources = link.getSees();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Context) {
				continue;
			}
			Context src = (Context) theSource;
			result.add(new EventbcoreLinkDescriptor(src, target, link,
					EventbcoreElementTypes.Machine_4001,
					Machine2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EventbcoreLinkDescriptor> getOutgoingTypeModelFacetLinks_Machine_4001(
			Context source) {
		Project container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Project) {
				container = (Project) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EventbcoreLinkDescriptor> result = new LinkedList<EventbcoreLinkDescriptor>();
		for (Iterator<?> links = container.getComponents().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Machine) {
				continue;
			}
			Machine link = (Machine) linkObject;
			if (Machine2EditPart.VISUAL_ID != EventbcoreVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			List targets = link.getSees();
			Object theTarget = targets.size() == 1 ? targets.get(0) : null;
			if (false == theTarget instanceof Context) {
				continue;
			}
			Context dst = (Context) theTarget;
			List sources = link.getSees();
			Object theSource = sources.size() == 1 ? sources.get(0) : null;
			if (false == theSource instanceof Context) {
				continue;
			}
			Context src = (Context) theSource;
			if (src != source) {
				continue;
			}
			result.add(new EventbcoreLinkDescriptor(src, dst, link,
					EventbcoreElementTypes.Machine_4001,
					Machine2EditPart.VISUAL_ID));
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
