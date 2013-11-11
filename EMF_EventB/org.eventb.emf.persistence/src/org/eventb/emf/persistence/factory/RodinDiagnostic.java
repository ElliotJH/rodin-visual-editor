package org.eventb.emf.persistence.factory;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eventb.emf.core.EventBObject;

public class RodinDiagnostic implements Diagnostic {

	private final String message;
	private final IMarker marker;
	private final EventBObject eventBObject;
	private final int charStart;
	private final int charEnd;
	private final String attributeId;

	public RodinDiagnostic(final IMarker marker, EventBObject eventBObject, String attributeId, final String message, int charStart, int charEnd) {
		this.marker = marker;
		this.eventBObject = eventBObject;
		this.message = message;
		this.attributeId = attributeId;
		this.charStart = charStart;
		this.charEnd = charEnd;
	}

	/**
	 * NOT implemented, returns -1
	 */
	public int getColumn() {
		return 0;
	}

	/**
	 * NOT implemented, returns -1
	 */
	public int getLine() {
		return 0;
	}

	/**
	 * NOT implemented, returns "unknown"
	 */
	public String getLocation() {
		return "unknown";
	}

	public String getMessage() {
		return message;
	}

	public IMarker getMarker() {
		return marker;
	}

	public EventBObject getEventBObject() {
		return eventBObject;
	}

	/**
	 * Returns the start position of the given marker. Returns <code>-1</code>
	 * if the marker does not exist or does not carry a start position.
	 * 
	 * @param marker
	 *            marker to read
	 * @return the start position of the given marker or <code>-1</code> in case
	 *         of error
	 */
	public int getCharStart() {
		return charStart;
	}

	/**
	 * Returns the end position of the given marker. Returns <code>-1</code> if
	 * the marker does not exist or does not carry an end position.
	 * 
	 * @param marker
	 *            marker to read
	 * @return the end position of the given marker or <code>-1</code> in case
	 *         of error
	 */
	public int getCharEnd() {
		return charEnd;
	}

	/**
	 * Returns the attribute id of the relevant attribute which was affected by
	 * this problem in the RodinDB or <code>null</code> if non was set.
	 * 
	 * @return
	 */
	public String getAttributeId() {
		return attributeId;
	}
}
