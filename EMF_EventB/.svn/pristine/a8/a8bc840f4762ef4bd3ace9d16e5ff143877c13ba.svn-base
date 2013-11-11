package org.eventb.emf.persistence;

import java.lang.reflect.InvocationTargetException;

import org.eventb.core.IAction;
import org.eventb.core.IContextRoot;
import org.eventb.core.IConvergenceElement;
import org.eventb.core.IEvent;
import org.eventb.core.IGuard;
import org.eventb.core.IInvariant;
import org.eventb.core.IMachineRoot;
import org.eventb.core.IParameter;
import org.eventb.core.IRefinesEvent;
import org.eventb.core.IRefinesMachine;
import org.eventb.core.ISeesContext;
import org.eventb.core.ITheorem;
import org.eventb.core.IVariable;
import org.eventb.core.IVariant;
import org.eventb.core.IWitness;
import org.rodinp.core.IParent;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinDBException;

public class DefaultComponentVisitor {
	public void accept(final IRodinElement internalElement)
			throws RodinDBException {
		if (internalElement != null) {
			final Object[] args = { internalElement };
			final Class[] types = { internalElement.getClass() };

			try {
				this.getClass().getMethod("visit", types).invoke(this, args);
			} catch (final InvocationTargetException e) {
				final Throwable cause = e.getCause();
				if (cause != null && cause instanceof RodinDBException) {
					throw (RodinDBException) cause;
				} else {
					logError(e);
				}
			} catch (final IllegalArgumentException e) {
				logError(e);
			} catch (final SecurityException e) {
				logError(e);
			} catch (final IllegalAccessException e) {
				logError(e);
			} catch (final NoSuchMethodException e) {
				logError(e);
			}
		}
	}

	protected void visit(final IMachineRoot node) throws RodinDBException {
		in(node);
		visitChildren(node);
		out(node);
	}

	protected void in(final IMachineRoot node) {
		defaultIn(node);
	}

	protected void out(final IMachineRoot node) {
		defaultIn(node);
	}

	protected void visit(final IContextRoot node) throws RodinDBException {
		in(node);
		visitChildren(node);
		out(node);
	}

	protected void in(final IContextRoot node) {
		defaultIn(node);
	}

	protected void out(final IContextRoot node) {
		defaultIn(node);
	}

	protected void visit(final IRefinesMachine node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IRefinesMachine node) {
		defaultIn(node);
	}

	protected void out(final IRefinesMachine node) {
		defaultIn(node);
	}

	protected void visit(final ISeesContext node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final ISeesContext node) {
		defaultIn(node);
	}

	protected void out(final ISeesContext node) {
		defaultIn(node);
	}

	protected void visit(final IVariable node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IVariable node) {
		defaultIn(node);
	}

	protected void out(final IVariable node) {
		defaultIn(node);
	}

	protected void visit(final IInvariant node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IInvariant node) {
		defaultIn(node);
	}

	protected void out(final IInvariant node) {
		defaultIn(node);
	}

	protected void visit(final ITheorem node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final ITheorem node) {
		defaultIn(node);
	}

	protected void out(final ITheorem node) {
		defaultIn(node);
	}

	protected void visit(final IVariant node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IVariant node) {
		defaultIn(node);
	}

	protected void out(final IVariant node) {
		defaultIn(node);
	}

	protected void visit(final IEvent node) throws RodinDBException {
		in(node);
		visitChildren(node);
		out(node);
	}

	protected void in(final IEvent node) {
		defaultIn(node);
	}

	protected void out(final IEvent node) {
		defaultIn(node);
	}

	protected void visit(final IConvergenceElement node)
			throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IConvergenceElement node) {
		defaultIn(node);
	}

	protected void out(final IConvergenceElement node) {
		defaultIn(node);
	}

	protected void visit(final IRefinesEvent node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IRefinesEvent node) {
		defaultIn(node);
	}

	protected void out(final IRefinesEvent node) {
		defaultIn(node);
	}

	protected void visit(final IParameter node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IParameter node) {
		defaultIn(node);
	}

	protected void out(final IParameter node) {
		defaultIn(node);
	}

	protected void visit(final IGuard node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IGuard node) {
		defaultIn(node);
	}

	protected void out(final IGuard node) {
		defaultIn(node);
	}

	protected void visit(final IWitness node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IWitness node) {
		defaultIn(node);
	}

	protected void out(final IWitness node) {
		defaultIn(node);
	}

	protected void visit(final IAction node) throws RodinDBException {
		in(node);
		// leaf, don't visit children
		out(node);
	}

	protected void in(final IAction node) {
		defaultIn(node);
	}

	protected void out(final IAction node) {
		defaultIn(node);
	}

	// TODO add visit methods for contexts

	protected void defaultIn(final IRodinElement node) {
		// empty default implementation
	}

	protected void defaultOut(final IRodinElement node) {
		// empty default implementation
	}

	private void visitChildren(final IParent node) throws RodinDBException {
		for (final IRodinElement child : node.getChildren()) {
			accept(child);
		}
	}

	private void logError(final Exception e) {
		// TODO Auto-generated method stub
		e.printStackTrace();
	}
}
