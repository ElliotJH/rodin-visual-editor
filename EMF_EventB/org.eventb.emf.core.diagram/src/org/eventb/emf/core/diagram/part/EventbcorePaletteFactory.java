package org.eventb.emf.core.diagram.part;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

/**
 * @generated
 */
public class EventbcorePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCore1Group());
	}

	/**
	 * Creates "core" palette tool group
	 * @generated
	 */
	private PaletteContainer createCore1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Core1Group_title);
		paletteContainer.setId("createCore1Group"); //$NON-NLS-1$
		paletteContainer.add(createMachine1CreationTool());
		paletteContainer.add(createMachineSees2CreationTool());
		paletteContainer.add(createContext3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMachine1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Machine1CreationTool_title,
				Messages.Machine1CreationTool_desc, null, null) {
		};
		entry.setId("createMachine1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMachineSees2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.MachineSees2CreationTool_title,
				Messages.MachineSees2CreationTool_desc, null, null) {
		};
		entry.setId("createMachineSees2CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Context3CreationTool_title,
				Messages.Context3CreationTool_desc, null, null) {
		};
		entry.setId("createContext3CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
