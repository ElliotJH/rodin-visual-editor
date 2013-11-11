package org.eventb.emf.persistence;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EAnnotation;
import org.osgi.framework.BundleContext;

public class PersistencePlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eventb.emf.persistence";

	/**
	 * Source key for {@link EAnnotation}s for certain attributes on Rodin
	 * elements
	 */
	public final static String SOURCE_RODIN_INTERNAL_ANNOTATION = "http:///org/eventb/core/RodinInternalAnnotations";
	/**
	 * @since 2.5
	 */
	public final static String SOURCE_RODIN_REFERENCE_NAMES_ANNOTATION = "http:///org/eventb/core/RodinReferenceNamesAnnotations";

	// The shared instance
	private static PersistencePlugin plugin;

	/**
	 * The constructor
	 */
	public PersistencePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static PersistencePlugin getDefault() {
		return plugin;
	}
}
