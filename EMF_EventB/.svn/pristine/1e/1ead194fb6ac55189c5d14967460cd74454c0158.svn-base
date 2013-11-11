package org.eventb.emf.persistence.synchroniser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eventb.core.EventBAttributes;
import org.eventb.core.ICommentedElement;
import org.eventb.core.IMachineRoot;
import org.eventb.emf.core.CoreFactory;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Machine;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.RodinDBException;

public class DynamicSynchroniser extends AbstractSynchroniser {

	private static EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
	private static CorePackage eventBPackage = CorePackage.eINSTANCE;
	private static CoreFactory eventBFactory = CoreFactory.eINSTANCE;

	private static final Set<IAttributeType> handledAttributes = new HashSet<IAttributeType>();

	static {
		handledAttributes.add(EventBAttributes.COMMENT_ATTRIBUTE);
	}

	@Override
	protected Set<IAttributeType> getHandledAttributeTypes() {
		return handledAttributes;
	}

	@Override
	public EventBElement load(final IRodinElement rodinElement, final EventBElement emfParent, final IProgressMonitor monitor) throws RodinDBException {

		// create EMF node for element
		final EventBElement bElement = DynamicEventB.createElement((IInternalElement) rodinElement);

		// TODO deal with name
		// bElement.eSet(bElement.eGet(feature)"name",
		// newValue)setName(rodinElement.getElementName());

		if (rodinElement instanceof ICommentedElement) {
			//			bElement.setComment(((ICommentedElement) rodinElement).getComment());
		}
		for (final IAttributeType attributeType : ((IInternalElement) rodinElement).getAttributeTypes()) {
			// TODO deal with attributes
			// still needed now that AbstractSynchroniser handles arbitrary
			// attributes?
		}

		// attach new node to parent as an exte nsion
		//		emfParent.getExtensions().add((EventBExtension) bElement);

		return bElement;
	}

	@Override
	public IInternalElement save(final EventBElement emfElement, final IRodinElement rodinParent, final IProgressMonitor monitor) throws RodinDBException {
		final Machine emfMachine = (Machine) emfElement;
		final IRodinFile rodinFile = (IRodinFile) rodinParent;

		final IMachineRoot root = (IMachineRoot) rodinFile.getRoot();
		root.create(null, monitor);
		root.setComment(emfMachine.getComment(), monitor);
		// FIXME root.setConfiguration(emfMachine.getConfiguration(), monitor);

		return root;
	}

	@Override
	protected EventBElement createEventBElement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EStructuralFeature getFeature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected IInternalElementType<?> getRodinType() {
		// TODO Auto-generated method stub
		return null;
	}

}
