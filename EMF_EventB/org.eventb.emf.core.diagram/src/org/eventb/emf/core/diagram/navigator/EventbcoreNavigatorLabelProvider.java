package org.eventb.emf.core.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
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
import org.eventb.emf.core.diagram.edit.parts.ContextEditPart;
import org.eventb.emf.core.diagram.edit.parts.ContextExtendsEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineRefinesEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineSeesEditPart;
import org.eventb.emf.core.diagram.edit.parts.ProjectEditPart;
import org.eventb.emf.core.diagram.edit.parts.WrappingLabel2EditPart;
import org.eventb.emf.core.diagram.edit.parts.WrappingLabelEditPart;
import org.eventb.emf.core.diagram.part.EventbcoreDiagramEditorPlugin;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;
import org.eventb.emf.core.diagram.providers.EventbcoreParserProvider;

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
					"Navigator?Diagram?http://emf.eventb.org/models/core?Project", EventbcoreElementTypes.Project_1001); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://emf.eventb.org/models/core/context?Context", EventbcoreElementTypes.Context_2001); //$NON-NLS-1$
		case MachineEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://emf.eventb.org/models/core/machine?Machine", EventbcoreElementTypes.Machine_2002); //$NON-NLS-1$
		case MachineRefinesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://emf.eventb.org/models/core/machine?Machine?refines", EventbcoreElementTypes.MachineRefines_4005); //$NON-NLS-1$
		case MachineSeesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://emf.eventb.org/models/core/machine?Machine?sees", EventbcoreElementTypes.MachineSees_4006); //$NON-NLS-1$
		case ContextExtendsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://emf.eventb.org/models/core/context?Context?extends", EventbcoreElementTypes.ContextExtends_4007); //$NON-NLS-1$
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
			return getProject_1001Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2001Text(view);
		case MachineEditPart.VISUAL_ID:
			return getMachine_2002Text(view);
		case MachineRefinesEditPart.VISUAL_ID:
			return getMachineRefines_4005Text(view);
		case MachineSeesEditPart.VISUAL_ID:
			return getMachineSees_4006Text(view);
		case ContextExtendsEditPart.VISUAL_ID:
			return getContextExtends_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getProject_1001Text(View view) {
		Project domainModelElement = (Project) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContext_2001Text(View view) {
		IParser parser = EventbcoreParserProvider.getParser(
				EventbcoreElementTypes.Context_2001,
				view.getElement() != null ? view.getElement() : view,
				EventbcoreVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMachine_2002Text(View view) {
		IParser parser = EventbcoreParserProvider.getParser(
				EventbcoreElementTypes.Machine_2002,
				view.getElement() != null ? view.getElement() : view,
				EventbcoreVisualIDRegistry
						.getType(WrappingLabel2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMachineRefines_4005Text(View view) {
		IParser parser = EventbcoreParserProvider.getParser(
				EventbcoreElementTypes.MachineRefines_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMachineSees_4006Text(View view) {
		IParser parser = EventbcoreParserProvider.getParser(
				EventbcoreElementTypes.MachineSees_4006,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContextExtends_4007Text(View view) {
		IParser parser = EventbcoreParserProvider.getParser(
				EventbcoreElementTypes.ContextExtends_4007,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			EventbcoreDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
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
