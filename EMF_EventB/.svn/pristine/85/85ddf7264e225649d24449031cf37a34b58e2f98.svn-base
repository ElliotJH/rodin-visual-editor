package org.eventb.emf.core.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBNamedCommentedComponentElement;
import org.eventb.emf.core.Project;
import org.eventb.emf.core.machine.Event;

public class NameUtils {


	/**
	 * generates a safe default name for the element (which will belong to the owner element).
	 * the name is based on the given name appended with an integer to make it unique within the namespace
	 *
	 * @param el - the EventBNamedElement to be named
	 * @param name - textual part of the name
	 * @param owner - the owner (or future owner) of the element
	 * @return the safe default name that will not cause a naming collision
	 */
	public static String getSafeName(final EventBElement el, final String name, final EObject owner, final EStructuralFeature feature){
		int i = 1;
		String safeName = name+i++;
		while (nameCollision(el,safeName,owner,feature))
			safeName=name+i++;
		return safeName;
	}


	public static boolean nameCollision(final EventBElement el, final String name, final EObject ns, EStructuralFeature feature) {
		if (!(el instanceof EventBNamed))		return false;
		if (name==((EventBNamed)el).getName()) 			return false;	//do not detect this as a collision
		if (el instanceof Project) 			return true; 	//cannot rename projects at present
		EventBElement namespace;
		if (ns instanceof EventBElement) namespace = (EventBElement) ns; else  namespace=el;
		while (namespace.eContainer() instanceof EventBElement &&
				!(namespace instanceof Project ||
				  namespace instanceof EventBNamedCommentedComponentElement ||
				  namespace instanceof Event))
			namespace=(EventBElement)namespace.eContainer();
		if (namespace instanceof Project) return isin(getNames(namespace.getAllContained(CorePackage.eINSTANCE.getEventBNamedCommentedComponentElement(),false)),name);
		else
			return isin(getNames(namespace.getAllContained(CorePackage.eINSTANCE.getEventBElement(),false)),name);
	}

	/**
	 * Returns a string representing the fully qualified name of an element 
	 * 
	 * @param eObject
	 * @return
	 */
	public static String getQualifiedName(EObject eObject){
		if (eObject.eContainer()==null){
			return getName(eObject);
		}else{
			return getQualifiedName(eObject.eContainer())+"::"+getName(eObject);
		}
	}
	
	/**
	 * Returns a user friendly name for the element.
	 * If there is a feature called "name" this is returned, otherwise
	 * If there is a feature called "label" this is returned, otherwise
	 * the meta-class name is returned enclosed in angle brackets.
	 * @param eObject
	 * @return
	 */
	public static String getName(EObject eObject){
		EClass eClass = eObject.eClass();
		EStructuralFeature nameFeature = eClass.getEStructuralFeature("name");
		if(nameFeature!=null){
			return eObject.eGet(nameFeature).toString();
		}
		EStructuralFeature labelFeature = eClass.getEStructuralFeature("label");
		if(labelFeature!=null){
			return eObject.eGet(labelFeature).toString();
		}
		return "<"+eClass.getName()+">";
	}
	
	////////////////////////////////////////////////////
	// Following methods should be moved somewhere else //

	/**
	 * Takes an List of UMLB elements and returns a list of their names
	 *
	 * @param list of UMLB elements
	 * @return an array of names
	 */
	public static List<String> getNames(final List list){
		return getNames(list,false,false);
	}

	/**
	 * Takes an List of UMLB elements and returns a list of their names
	 * Optionally the meta class name (excluding 'UMLB') can be included
	 *
	 * @param list of UMLB elements
	 * @param if true, include metaclass name (i.e. class name) as a prefix to the element name
	 * @return an array of names
	 */
	public static List<String> getNames(final List list, final boolean incClassNames){
		return getNames(list,incClassNames,false);
	}
	/**
	 * Takes an List of B elements and returns a list of their names
	 * Optionally the meta class name can be included
	 * and the owning construct can be included
	 *
	 * @param list of B elements
	 * @param if true, include metaclass name (i.e. class name) as a prefix to the element name
	 * @param if true, include owning construct name as a prefix to the element name
	 * @return an array of names
	 */
	public static List<String> getNames(final List list, final boolean incClassNames, final boolean incOwners){
		ArrayList<String> names = new ArrayList<String>();
		if (list==null) return names;
		for (Object o: list){
			String prefix = "";
			if (incOwners && o instanceof EventBElement)
				prefix= ((EventBNamed)((EventBElement)o).getContaining(CorePackage.eINSTANCE.getEventBNamedCommentedComponentElement())).getName()+" :: ";
			if (incClassNames && o instanceof EObject)
				prefix=	prefix+ ((EObject) o).eClass().getName()+" - ";
			if (o==null) names.add("<null>");
			else if (o instanceof Enumerator ) names.add(prefix+((Enumerator)o).getName());
			else if (o instanceof EventBNamed) names.add(prefix+((EventBNamed)o).getName());
			else if (o instanceof Boolean) names.add(prefix+((Boolean)o).toString());
			else names.add("<WARNING: unsupported item>");
		}
		return names;
	}

	private static boolean isin(final List<String> names, final String name){
		for (String element : names)
			if (element!=null && element.equals(name)) return true;
		return false;
	}
}
