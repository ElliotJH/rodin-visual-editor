package org.eventb.emf.core.diagram.providers;

import org.eventb.emf.core.diagram.part.EventbcoreDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = EventbcoreDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			EventbcoreDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
