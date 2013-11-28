package org.eventb.emf.core.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eventb.emf.core.diagram.providers.EventbcoreElementTypes;

/**
 * @generated
 */
public class EventbcorePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createComponent1Group());
		paletteRoot.add(createRelationship2Group());
	}

	/**
	 * Creates "Component" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponent1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Component1Group_title);
		paletteContainer.setId("createComponent1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Component1Group_desc);
		paletteContainer.add(createMachine1CreationTool());
		paletteContainer.add(createContext2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Relationship" palette tool group
	 * @generated
	 */
	private PaletteContainer createRelationship2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Relationship2Group_title);
		paletteContainer.setId("createRelationship2Group"); //$NON-NLS-1$
		paletteContainer.add(createSees1CreationTool());
		paletteContainer.add(createRefines2CreationTool());
		paletteContainer.add(createExtends3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMachine1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Machine1CreationTool_title,
				Messages.Machine1CreationTool_desc,
				Collections.singletonList(EventbcoreElementTypes.Machine_2002));
		entry.setId("createMachine1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventbcoreElementTypes
				.getImageDescriptor(EventbcoreElementTypes.Machine_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Context2CreationTool_title,
				Messages.Context2CreationTool_desc,
				Collections.singletonList(EventbcoreElementTypes.Context_2001));
		entry.setId("createContext2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventbcoreElementTypes
				.getImageDescriptor(EventbcoreElementTypes.Context_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSees1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Sees1CreationTool_title,
				Messages.Sees1CreationTool_desc,
				Collections
						.singletonList(EventbcoreElementTypes.MachineSees_4006));
		entry.setId("createSees1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventbcoreElementTypes
				.getImageDescriptor(EventbcoreElementTypes.MachineSees_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRefines2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Refines2CreationTool_title,
				Messages.Refines2CreationTool_desc,
				Collections
						.singletonList(EventbcoreElementTypes.MachineRefines_4005));
		entry.setId("createRefines2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventbcoreElementTypes
				.getImageDescriptor(EventbcoreElementTypes.MachineRefines_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtends3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Extends3CreationTool_title,
				Messages.Extends3CreationTool_desc,
				Collections
						.singletonList(EventbcoreElementTypes.ContextExtends_4007));
		entry.setId("createExtends3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(EventbcoreElementTypes
				.getImageDescriptor(EventbcoreElementTypes.ContextExtends_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
