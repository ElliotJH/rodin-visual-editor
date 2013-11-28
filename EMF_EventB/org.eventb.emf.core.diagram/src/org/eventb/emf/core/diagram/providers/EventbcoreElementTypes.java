package org.eventb.emf.core.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.context.ContextPackage;
import org.eventb.emf.core.diagram.edit.parts.ContextEditPart;
import org.eventb.emf.core.diagram.edit.parts.ContextExtendsEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineRefinesEditPart;
import org.eventb.emf.core.diagram.edit.parts.MachineSeesEditPart;
import org.eventb.emf.core.diagram.edit.parts.ProjectEditPart;
import org.eventb.emf.core.diagram.part.EventbcoreDiagramEditorPlugin;
import org.eventb.emf.core.machine.MachinePackage;

/**
 * @generated
 */
public class EventbcoreElementTypes {

	/**
	 * @generated
	 */
	private EventbcoreElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			EventbcoreDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Project_1001 = getElementType("org.eventb.emf.core.diagram.Project_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2001 = getElementType("org.eventb.emf.core.diagram.Context_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Machine_2002 = getElementType("org.eventb.emf.core.diagram.Machine_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MachineSees_4006 = getElementType("org.eventb.emf.core.diagram.MachineSees_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MachineRefines_4005 = getElementType("org.eventb.emf.core.diagram.MachineRefines_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ContextExtends_4007 = getElementType("org.eventb.emf.core.diagram.ContextExtends_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Project_1001, CorePackage.eINSTANCE.getProject());

			elements.put(Context_2001, ContextPackage.eINSTANCE.getContext());

			elements.put(Machine_2002, MachinePackage.eINSTANCE.getMachine());

			elements.put(MachineSees_4006,
					MachinePackage.eINSTANCE.getMachine_Sees());

			elements.put(MachineRefines_4005,
					MachinePackage.eINSTANCE.getMachine_Refines());

			elements.put(ContextExtends_4007,
					ContextPackage.eINSTANCE.getContext_Extends());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Project_1001);
			KNOWN_ELEMENT_TYPES.add(Context_2001);
			KNOWN_ELEMENT_TYPES.add(Machine_2002);
			KNOWN_ELEMENT_TYPES.add(MachineSees_4006);
			KNOWN_ELEMENT_TYPES.add(MachineRefines_4005);
			KNOWN_ELEMENT_TYPES.add(ContextExtends_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ProjectEditPart.VISUAL_ID:
			return Project_1001;
		case ContextEditPart.VISUAL_ID:
			return Context_2001;
		case MachineEditPart.VISUAL_ID:
			return Machine_2002;
		case MachineSeesEditPart.VISUAL_ID:
			return MachineSees_4006;
		case MachineRefinesEditPart.VISUAL_ID:
			return MachineRefines_4005;
		case ContextExtendsEditPart.VISUAL_ID:
			return ContextExtends_4007;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.eventb.emf.core.diagram.providers.EventbcoreElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.eventb.emf.core.diagram.providers.EventbcoreElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.eventb.emf.core.diagram.providers.EventbcoreElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
