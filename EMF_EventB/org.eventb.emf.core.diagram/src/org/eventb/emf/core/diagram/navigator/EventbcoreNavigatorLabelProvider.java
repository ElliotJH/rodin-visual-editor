package org.eventb.emf.core.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.context.Context;
import org.eventb.emf.core.diagram.edit.parts.ContextEditPart;
import org.eventb.emf.core.diagram.edit.parts.Machine2EditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineEditPart;
import org.eventb.emf.core.diagram.edit.parts.ProjectEditPart;
import org.eventb.emf.core.diagram.part.EventbcoreDiagramEditorPlugin;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;
import org.eventb.emf.core.machine.Machine;

/**
 * @generated
 */
public class EventbcoreNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		EventbcoreDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		EventbcoreDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof EventbcoreNavigatorItem
				&& !isOwnView(((EventbcoreNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof EventbcoreNavigatorGroup) {
			EventbcoreNavigatorGroup group = (EventbcoreNavigatorGroup) element;
			return EventbcoreDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof EventbcoreNavigatorItem) {
			EventbcoreNavigatorItem navigatorItem = (EventbcoreNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (EventbcoreVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://emf.eventb.org/models/core?Project", EventbcoreElementTypes.Project_1000); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://emf.eventb.org/models/core/context?Context", EventbcoreElementTypes.Context_2001); //$NON-NLS-1$
		case MachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://emf.eventb.org/models/core/machine?Machine", EventbcoreElementTypes.Machine_2002); //$NON-NLS-1$
		case Machine2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://emf.eventb.org/models/core/machine?Machine", EventbcoreElementTypes.Machine_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = EventbcoreDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& EventbcoreElementTypes.isKnownElementType(elementType)) {
			image = EventbcoreElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof EventbcoreNavigatorGroup) {
			EventbcoreNavigatorGroup group = (EventbcoreNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof EventbcoreNavigatorItem) {
			EventbcoreNavigatorItem navigatorItem = (EventbcoreNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (EventbcoreVisualIDRegistry.getVisualID(view)) {
		case ProjectEditPart.VISUAL_ID:
			return getProject_1000Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2001Text(view);
		case MachineEditPart.VISUAL_ID:
			return getMachine_2002Text(view);
		case Machine2EditPart.VISUAL_ID:
			return getMachine_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProject_1000Text(View view) {
		Project domainModelElement = (Project) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContext_2001Text(View view) {
		Context domainModelElement = (Context) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMachine_2002Text(View view) {
		Machine domainModelElement = (Machine) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMachine_4001Text(View view) {
		Machine domainModelElement = (Machine) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ProjectEditPart.MODEL_ID.equals(EventbcoreVisualIDRegistry
				.getModelID(view));
	}

}
