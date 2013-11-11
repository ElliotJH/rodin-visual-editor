package org.eventb.emf.persistence.synchroniser;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.rodinp.core.IInternalElement;

public class DynamicEventB {

	private static final EcoreFactory ecoreFactory;
	private static final CorePackage eventBPackage;
	private static final EcorePackage dynamicEventBPackage;
	private static final EcoreFactory dynamicEventBFactory;
	private static final EClass dynamicBElement;

	static {
		ecoreFactory = EcoreFactory.eINSTANCE;
		eventBPackage = CorePackage.eINSTANCE;
		// TODO: see if dynamicEventBPackage is in the registry, if not create
		// it and save it there
		dynamicEventBPackage = null;
		dynamicEventBFactory = dynamicEventBPackage.getEcoreFactory();
		// TODO: add dynamicBElement (extends BExtension) if not already there
		// if (dynamicEventBPackage.getEClassifiers().)
		dynamicBElement = null;

	}

	public static EventBElement createElement(
			final IInternalElement rodinElement) {
		return (EventBElement) dynamicEventBFactory
				.create(getMetaClass(rodinElement));
	}

	public static EClass getMetaClass(final IInternalElement rodinElement) {
		// FIXME:
		// need to save the dynamic emf changes - maybe in a separate EPackage?
		// generic synchroniser?

		final String eClassName = rodinElement.getElementType().getId();
		// FIXME:
		// this could cause a cast error if the package contains a classifier of
		// that name that is not an EClass
		EClass unknownElementClass = (EClass) dynamicEventBPackage
				.getEClassifier(eClassName);

		if (unknownElementClass == null) {
			// create a new metaclass for the unknown rodin element
			unknownElementClass = ecoreFactory.createEClass();
			unknownElementClass.setName(rodinElement.getElementType().getId());
			unknownElementClass.getESuperTypes().add(
					eventBPackage.getEventBElement());
			unknownElementClass.getESuperTypes().add(dynamicBElement);
			dynamicEventBPackage.getEClassifiers().add(unknownElementClass);
		}

		// FIXME:
		// this could cause a cast error if the metaclass contains a
		// EStructuralFeature of that name that is not an EReference
		EReference children = (EReference) unknownElementClass
				.getEStructuralFeature("children");
		// create a containment feature for children of the new metaclass
		if (children == null) {
			children = ecoreFactory.createEReference();
			children.setName("children");
			children.setEType(eventBPackage.getEventBElement());
			children.setContainment(true);
			children.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
			unknownElementClass.getEReferences().add(children);
		}
		return unknownElementClass;
	}
}
