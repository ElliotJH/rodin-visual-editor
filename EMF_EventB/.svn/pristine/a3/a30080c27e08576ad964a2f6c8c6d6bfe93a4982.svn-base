package org.eventb.emf.core.externalisation;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class External {
	private static final String BUNDLE_NAME = "org.eventb.emf.core.externalisation.external"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private External() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
