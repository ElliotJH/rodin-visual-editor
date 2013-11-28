package org.eventb.emf.core.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import org.eventb.emf.core.diagram.edit.parts.EventbcoreEditPartFactory;
import org.eventb.emf.core.diagram.edit.parts.ProjectEditPart;
import org.eventb.emf.core.diagram.part.EventbcoreVisualIDRegistry;

/**
 * @generated
 */
public class EventbcoreEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public EventbcoreEditPartProvider() {
		super(new EventbcoreEditPartFactory(),
				EventbcoreVisualIDRegistry.TYPED_INSTANCE,
				ProjectEditPart.MODEL_ID);
	}

}
