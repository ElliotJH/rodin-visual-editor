/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.Extension;
import org.eventb.emf.formulas.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eventb.emf.formulas.FormulasPackage
 * @generated
 */
public class FormulasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormulasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulasSwitch() {
		if (modelPackage == null) {
			modelPackage = FormulasPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FormulasPackage.BFORMULA: {
				BFormula bFormula = (BFormula)theEObject;
				T result = caseBFormula(bFormula);
				if (result == null) result = caseExtension(bFormula);
				if (result == null) result = caseAbstractExtension(bFormula);
				if (result == null) result = caseEventBElement(bFormula);
				if (result == null) result = caseEventBObject(bFormula);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BEXPRESSION_RESOLVED: {
				BExpressionResolved bExpressionResolved = (BExpressionResolved)theEObject;
				T result = caseBExpressionResolved(bExpressionResolved);
				if (result == null) result = caseBFormula(bExpressionResolved);
				if (result == null) result = caseExtension(bExpressionResolved);
				if (result == null) result = caseAbstractExtension(bExpressionResolved);
				if (result == null) result = caseEventBElement(bExpressionResolved);
				if (result == null) result = caseEventBObject(bExpressionResolved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BPREDICATE_RESOLVED: {
				BPredicateResolved bPredicateResolved = (BPredicateResolved)theEObject;
				T result = caseBPredicateResolved(bPredicateResolved);
				if (result == null) result = caseBFormula(bPredicateResolved);
				if (result == null) result = caseExtension(bPredicateResolved);
				if (result == null) result = caseAbstractExtension(bPredicateResolved);
				if (result == null) result = caseEventBElement(bPredicateResolved);
				if (result == null) result = caseEventBObject(bPredicateResolved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BASSIGNMENT_RESOLVED: {
				BAssignmentResolved bAssignmentResolved = (BAssignmentResolved)theEObject;
				T result = caseBAssignmentResolved(bAssignmentResolved);
				if (result == null) result = caseBFormula(bAssignmentResolved);
				if (result == null) result = caseExtension(bAssignmentResolved);
				if (result == null) result = caseAbstractExtension(bAssignmentResolved);
				if (result == null) result = caseEventBElement(bAssignmentResolved);
				if (result == null) result = caseEventBObject(bAssignmentResolved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = caseBFormula(constant);
				if (result == null) result = caseExtension(constant);
				if (result == null) result = caseAbstractExtension(constant);
				if (result == null) result = caseEventBElement(constant);
				if (result == null) result = caseEventBObject(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseBFormula(unaryOperator);
				if (result == null) result = caseExtension(unaryOperator);
				if (result == null) result = caseAbstractExtension(unaryOperator);
				if (result == null) result = caseEventBElement(unaryOperator);
				if (result == null) result = caseEventBObject(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseBFormula(binaryOperator);
				if (result == null) result = caseExtension(binaryOperator);
				if (result == null) result = caseAbstractExtension(binaryOperator);
				if (result == null) result = caseEventBElement(binaryOperator);
				if (result == null) result = caseEventBObject(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.MULTI_OPERAND: {
				MultiOperand multiOperand = (MultiOperand)theEObject;
				T result = caseMultiOperand(multiOperand);
				if (result == null) result = caseBFormula(multiOperand);
				if (result == null) result = caseExtension(multiOperand);
				if (result == null) result = caseAbstractExtension(multiOperand);
				if (result == null) result = caseEventBElement(multiOperand);
				if (result == null) result = caseEventBObject(multiOperand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BECOMES_EQUAL_TO_ASSIGNMENT: {
				BecomesEqualToAssignment becomesEqualToAssignment = (BecomesEqualToAssignment)theEObject;
				T result = caseBecomesEqualToAssignment(becomesEqualToAssignment);
				if (result == null) result = caseBAssignmentResolved(becomesEqualToAssignment);
				if (result == null) result = caseBFormula(becomesEqualToAssignment);
				if (result == null) result = caseExtension(becomesEqualToAssignment);
				if (result == null) result = caseAbstractExtension(becomesEqualToAssignment);
				if (result == null) result = caseEventBElement(becomesEqualToAssignment);
				if (result == null) result = caseEventBObject(becomesEqualToAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BECOMES_MEMBER_OF_ASSIGNMENT: {
				BecomesMemberOfAssignment becomesMemberOfAssignment = (BecomesMemberOfAssignment)theEObject;
				T result = caseBecomesMemberOfAssignment(becomesMemberOfAssignment);
				if (result == null) result = caseBAssignmentResolved(becomesMemberOfAssignment);
				if (result == null) result = caseBFormula(becomesMemberOfAssignment);
				if (result == null) result = caseExtension(becomesMemberOfAssignment);
				if (result == null) result = caseAbstractExtension(becomesMemberOfAssignment);
				if (result == null) result = caseEventBElement(becomesMemberOfAssignment);
				if (result == null) result = caseEventBObject(becomesMemberOfAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BECOMES_SUCH_THAT_ASSIGNMENT: {
				BecomesSuchThatAssignment becomesSuchThatAssignment = (BecomesSuchThatAssignment)theEObject;
				T result = caseBecomesSuchThatAssignment(becomesSuchThatAssignment);
				if (result == null) result = caseBAssignmentResolved(becomesSuchThatAssignment);
				if (result == null) result = caseBFormula(becomesSuchThatAssignment);
				if (result == null) result = caseExtension(becomesSuchThatAssignment);
				if (result == null) result = caseAbstractExtension(becomesSuchThatAssignment);
				if (result == null) result = caseEventBElement(becomesSuchThatAssignment);
				if (result == null) result = caseEventBObject(becomesSuchThatAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.INTEGER_LITERAL_EXPRESSION: {
				IntegerLiteralExpression integerLiteralExpression = (IntegerLiteralExpression)theEObject;
				T result = caseIntegerLiteralExpression(integerLiteralExpression);
				if (result == null) result = caseBExpressionResolved(integerLiteralExpression);
				if (result == null) result = caseBFormula(integerLiteralExpression);
				if (result == null) result = caseExtension(integerLiteralExpression);
				if (result == null) result = caseAbstractExtension(integerLiteralExpression);
				if (result == null) result = caseEventBElement(integerLiteralExpression);
				if (result == null) result = caseEventBObject(integerLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.IDENTIFIER_EXPRESSION: {
				IdentifierExpression identifierExpression = (IdentifierExpression)theEObject;
				T result = caseIdentifierExpression(identifierExpression);
				if (result == null) result = caseBExpressionResolved(identifierExpression);
				if (result == null) result = caseBFormula(identifierExpression);
				if (result == null) result = caseExtension(identifierExpression);
				if (result == null) result = caseAbstractExtension(identifierExpression);
				if (result == null) result = caseEventBElement(identifierExpression);
				if (result == null) result = caseEventBObject(identifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BOUND_IDENTIFIER_EXPRESSION: {
				BoundIdentifierExpression boundIdentifierExpression = (BoundIdentifierExpression)theEObject;
				T result = caseBoundIdentifierExpression(boundIdentifierExpression);
				if (result == null) result = caseIdentifierExpression(boundIdentifierExpression);
				if (result == null) result = caseBExpressionResolved(boundIdentifierExpression);
				if (result == null) result = caseBFormula(boundIdentifierExpression);
				if (result == null) result = caseExtension(boundIdentifierExpression);
				if (result == null) result = caseAbstractExtension(boundIdentifierExpression);
				if (result == null) result = caseEventBElement(boundIdentifierExpression);
				if (result == null) result = caseEventBObject(boundIdentifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.FORALL_PREDICATE: {
				ForallPredicate forallPredicate = (ForallPredicate)theEObject;
				T result = caseForallPredicate(forallPredicate);
				if (result == null) result = caseBPredicateResolved(forallPredicate);
				if (result == null) result = caseBFormula(forallPredicate);
				if (result == null) result = caseExtension(forallPredicate);
				if (result == null) result = caseAbstractExtension(forallPredicate);
				if (result == null) result = caseEventBElement(forallPredicate);
				if (result == null) result = caseEventBObject(forallPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.EXIST_PREDICATE: {
				ExistPredicate existPredicate = (ExistPredicate)theEObject;
				T result = caseExistPredicate(existPredicate);
				if (result == null) result = caseBPredicateResolved(existPredicate);
				if (result == null) result = caseBFormula(existPredicate);
				if (result == null) result = caseExtension(existPredicate);
				if (result == null) result = caseAbstractExtension(existPredicate);
				if (result == null) result = caseEventBElement(existPredicate);
				if (result == null) result = caseEventBObject(existPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.LAMBDA_EXPRESSION: {
				LambdaExpression lambdaExpression = (LambdaExpression)theEObject;
				T result = caseLambdaExpression(lambdaExpression);
				if (result == null) result = caseBExpressionResolved(lambdaExpression);
				if (result == null) result = caseBFormula(lambdaExpression);
				if (result == null) result = caseExtension(lambdaExpression);
				if (result == null) result = caseAbstractExtension(lambdaExpression);
				if (result == null) result = caseEventBElement(lambdaExpression);
				if (result == null) result = caseEventBObject(lambdaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1: {
				QuantifiedUnionExpression1 quantifiedUnionExpression1 = (QuantifiedUnionExpression1)theEObject;
				T result = caseQuantifiedUnionExpression1(quantifiedUnionExpression1);
				if (result == null) result = caseBExpressionResolved(quantifiedUnionExpression1);
				if (result == null) result = caseBFormula(quantifiedUnionExpression1);
				if (result == null) result = caseExtension(quantifiedUnionExpression1);
				if (result == null) result = caseAbstractExtension(quantifiedUnionExpression1);
				if (result == null) result = caseEventBElement(quantifiedUnionExpression1);
				if (result == null) result = caseEventBObject(quantifiedUnionExpression1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION2: {
				QuantifiedUnionExpression2 quantifiedUnionExpression2 = (QuantifiedUnionExpression2)theEObject;
				T result = caseQuantifiedUnionExpression2(quantifiedUnionExpression2);
				if (result == null) result = caseBExpressionResolved(quantifiedUnionExpression2);
				if (result == null) result = caseBFormula(quantifiedUnionExpression2);
				if (result == null) result = caseExtension(quantifiedUnionExpression2);
				if (result == null) result = caseAbstractExtension(quantifiedUnionExpression2);
				if (result == null) result = caseEventBElement(quantifiedUnionExpression2);
				if (result == null) result = caseEventBObject(quantifiedUnionExpression2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION1: {
				QuantifiedIntersectionExpression1 quantifiedIntersectionExpression1 = (QuantifiedIntersectionExpression1)theEObject;
				T result = caseQuantifiedIntersectionExpression1(quantifiedIntersectionExpression1);
				if (result == null) result = caseBExpressionResolved(quantifiedIntersectionExpression1);
				if (result == null) result = caseBFormula(quantifiedIntersectionExpression1);
				if (result == null) result = caseExtension(quantifiedIntersectionExpression1);
				if (result == null) result = caseAbstractExtension(quantifiedIntersectionExpression1);
				if (result == null) result = caseEventBElement(quantifiedIntersectionExpression1);
				if (result == null) result = caseEventBObject(quantifiedIntersectionExpression1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2: {
				QuantifiedIntersectionExpression2 quantifiedIntersectionExpression2 = (QuantifiedIntersectionExpression2)theEObject;
				T result = caseQuantifiedIntersectionExpression2(quantifiedIntersectionExpression2);
				if (result == null) result = caseBExpressionResolved(quantifiedIntersectionExpression2);
				if (result == null) result = caseBFormula(quantifiedIntersectionExpression2);
				if (result == null) result = caseExtension(quantifiedIntersectionExpression2);
				if (result == null) result = caseAbstractExtension(quantifiedIntersectionExpression2);
				if (result == null) result = caseEventBElement(quantifiedIntersectionExpression2);
				if (result == null) result = caseEventBObject(quantifiedIntersectionExpression2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION1: {
				SetComprehensionExpression1 setComprehensionExpression1 = (SetComprehensionExpression1)theEObject;
				T result = caseSetComprehensionExpression1(setComprehensionExpression1);
				if (result == null) result = caseBExpressionResolved(setComprehensionExpression1);
				if (result == null) result = caseBFormula(setComprehensionExpression1);
				if (result == null) result = caseExtension(setComprehensionExpression1);
				if (result == null) result = caseAbstractExtension(setComprehensionExpression1);
				if (result == null) result = caseEventBElement(setComprehensionExpression1);
				if (result == null) result = caseEventBObject(setComprehensionExpression1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2: {
				SetComprehensionExpression2 setComprehensionExpression2 = (SetComprehensionExpression2)theEObject;
				T result = caseSetComprehensionExpression2(setComprehensionExpression2);
				if (result == null) result = caseBExpressionResolved(setComprehensionExpression2);
				if (result == null) result = caseBFormula(setComprehensionExpression2);
				if (result == null) result = caseExtension(setComprehensionExpression2);
				if (result == null) result = caseAbstractExtension(setComprehensionExpression2);
				if (result == null) result = caseEventBElement(setComprehensionExpression2);
				if (result == null) result = caseEventBObject(setComprehensionExpression2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.INT: {
				INT int_ = (INT)theEObject;
				T result = caseINT(int_);
				if (result == null) result = caseConstant(int_);
				if (result == null) result = caseBExpressionResolved(int_);
				if (result == null) result = caseBFormula(int_);
				if (result == null) result = caseExtension(int_);
				if (result == null) result = caseAbstractExtension(int_);
				if (result == null) result = caseEventBElement(int_);
				if (result == null) result = caseEventBObject(int_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NAT: {
				NAT nat = (NAT)theEObject;
				T result = caseNAT(nat);
				if (result == null) result = caseConstant(nat);
				if (result == null) result = caseBExpressionResolved(nat);
				if (result == null) result = caseBFormula(nat);
				if (result == null) result = caseExtension(nat);
				if (result == null) result = caseAbstractExtension(nat);
				if (result == null) result = caseEventBElement(nat);
				if (result == null) result = caseEventBObject(nat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NAT1: {
				NAT1 nat1 = (NAT1)theEObject;
				T result = caseNAT1(nat1);
				if (result == null) result = caseConstant(nat1);
				if (result == null) result = caseBExpressionResolved(nat1);
				if (result == null) result = caseBFormula(nat1);
				if (result == null) result = caseExtension(nat1);
				if (result == null) result = caseAbstractExtension(nat1);
				if (result == null) result = caseEventBElement(nat1);
				if (result == null) result = caseEventBObject(nat1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BOOL: {
				BOOL bool = (BOOL)theEObject;
				T result = caseBOOL(bool);
				if (result == null) result = caseConstant(bool);
				if (result == null) result = caseBExpressionResolved(bool);
				if (result == null) result = caseBFormula(bool);
				if (result == null) result = caseExtension(bool);
				if (result == null) result = caseAbstractExtension(bool);
				if (result == null) result = caseEventBElement(bool);
				if (result == null) result = caseEventBObject(bool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TRUE: {
				TRUE true_ = (TRUE)theEObject;
				T result = caseTRUE(true_);
				if (result == null) result = caseConstant(true_);
				if (result == null) result = caseBExpressionResolved(true_);
				if (result == null) result = caseBFormula(true_);
				if (result == null) result = caseExtension(true_);
				if (result == null) result = caseAbstractExtension(true_);
				if (result == null) result = caseEventBElement(true_);
				if (result == null) result = caseEventBObject(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.FALSE: {
				FALSE false_ = (FALSE)theEObject;
				T result = caseFALSE(false_);
				if (result == null) result = caseConstant(false_);
				if (result == null) result = caseBExpressionResolved(false_);
				if (result == null) result = caseBFormula(false_);
				if (result == null) result = caseExtension(false_);
				if (result == null) result = caseAbstractExtension(false_);
				if (result == null) result = caseEventBElement(false_);
				if (result == null) result = caseEventBObject(false_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.EMPTYSET: {
				EMPTYSET emptyset = (EMPTYSET)theEObject;
				T result = caseEMPTYSET(emptyset);
				if (result == null) result = caseConstant(emptyset);
				if (result == null) result = caseBExpressionResolved(emptyset);
				if (result == null) result = caseBFormula(emptyset);
				if (result == null) result = caseExtension(emptyset);
				if (result == null) result = caseAbstractExtension(emptyset);
				if (result == null) result = caseEventBElement(emptyset);
				if (result == null) result = caseEventBObject(emptyset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TRUTH: {
				TRUTH truth = (TRUTH)theEObject;
				T result = caseTRUTH(truth);
				if (result == null) result = caseConstant(truth);
				if (result == null) result = caseBPredicateResolved(truth);
				if (result == null) result = caseBFormula(truth);
				if (result == null) result = caseExtension(truth);
				if (result == null) result = caseAbstractExtension(truth);
				if (result == null) result = caseEventBElement(truth);
				if (result == null) result = caseEventBObject(truth);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.FALSITY: {
				FALSITY falsity = (FALSITY)theEObject;
				T result = caseFALSITY(falsity);
				if (result == null) result = caseConstant(falsity);
				if (result == null) result = caseBPredicateResolved(falsity);
				if (result == null) result = caseBFormula(falsity);
				if (result == null) result = caseExtension(falsity);
				if (result == null) result = caseAbstractExtension(falsity);
				if (result == null) result = caseEventBElement(falsity);
				if (result == null) result = caseEventBObject(falsity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SUCC_EXPRESSION: {
				SuccExpression succExpression = (SuccExpression)theEObject;
				T result = caseSuccExpression(succExpression);
				if (result == null) result = caseBExpressionResolved(succExpression);
				if (result == null) result = caseBFormula(succExpression);
				if (result == null) result = caseExtension(succExpression);
				if (result == null) result = caseAbstractExtension(succExpression);
				if (result == null) result = caseEventBElement(succExpression);
				if (result == null) result = caseEventBObject(succExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PRED_EXPRESSION: {
				PredExpression predExpression = (PredExpression)theEObject;
				T result = casePredExpression(predExpression);
				if (result == null) result = caseBExpressionResolved(predExpression);
				if (result == null) result = caseBFormula(predExpression);
				if (result == null) result = caseExtension(predExpression);
				if (result == null) result = caseAbstractExtension(predExpression);
				if (result == null) result = caseEventBElement(predExpression);
				if (result == null) result = caseEventBObject(predExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BOOL_EXPRESSION: {
				BoolExpression boolExpression = (BoolExpression)theEObject;
				T result = caseBoolExpression(boolExpression);
				if (result == null) result = caseUnaryOperator(boolExpression);
				if (result == null) result = caseBExpressionResolved(boolExpression);
				if (result == null) result = caseBFormula(boolExpression);
				if (result == null) result = caseExtension(boolExpression);
				if (result == null) result = caseAbstractExtension(boolExpression);
				if (result == null) result = caseEventBElement(boolExpression);
				if (result == null) result = caseEventBObject(boolExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.CARD_EXPRESSION: {
				CardExpression cardExpression = (CardExpression)theEObject;
				T result = caseCardExpression(cardExpression);
				if (result == null) result = caseUnaryOperator(cardExpression);
				if (result == null) result = caseBExpressionResolved(cardExpression);
				if (result == null) result = caseBFormula(cardExpression);
				if (result == null) result = caseExtension(cardExpression);
				if (result == null) result = caseAbstractExtension(cardExpression);
				if (result == null) result = caseEventBElement(cardExpression);
				if (result == null) result = caseEventBObject(cardExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.POW_EXPRESSION: {
				PowExpression powExpression = (PowExpression)theEObject;
				T result = casePowExpression(powExpression);
				if (result == null) result = caseUnaryOperator(powExpression);
				if (result == null) result = caseBExpressionResolved(powExpression);
				if (result == null) result = caseBFormula(powExpression);
				if (result == null) result = caseExtension(powExpression);
				if (result == null) result = caseAbstractExtension(powExpression);
				if (result == null) result = caseEventBElement(powExpression);
				if (result == null) result = caseEventBObject(powExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.POW1_EXPRESSION: {
				Pow1Expression pow1Expression = (Pow1Expression)theEObject;
				T result = casePow1Expression(pow1Expression);
				if (result == null) result = caseUnaryOperator(pow1Expression);
				if (result == null) result = caseBExpressionResolved(pow1Expression);
				if (result == null) result = caseBFormula(pow1Expression);
				if (result == null) result = caseExtension(pow1Expression);
				if (result == null) result = caseAbstractExtension(pow1Expression);
				if (result == null) result = caseEventBElement(pow1Expression);
				if (result == null) result = caseEventBObject(pow1Expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.KUNION_EXPRESSION: {
				KUnionExpression kUnionExpression = (KUnionExpression)theEObject;
				T result = caseKUnionExpression(kUnionExpression);
				if (result == null) result = caseUnaryOperator(kUnionExpression);
				if (result == null) result = caseBExpressionResolved(kUnionExpression);
				if (result == null) result = caseBFormula(kUnionExpression);
				if (result == null) result = caseExtension(kUnionExpression);
				if (result == null) result = caseAbstractExtension(kUnionExpression);
				if (result == null) result = caseEventBElement(kUnionExpression);
				if (result == null) result = caseEventBObject(kUnionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.KINTERSECTION_EXPRESSION: {
				KIntersectionExpression kIntersectionExpression = (KIntersectionExpression)theEObject;
				T result = caseKIntersectionExpression(kIntersectionExpression);
				if (result == null) result = caseUnaryOperator(kIntersectionExpression);
				if (result == null) result = caseBExpressionResolved(kIntersectionExpression);
				if (result == null) result = caseBFormula(kIntersectionExpression);
				if (result == null) result = caseExtension(kIntersectionExpression);
				if (result == null) result = caseAbstractExtension(kIntersectionExpression);
				if (result == null) result = caseEventBElement(kIntersectionExpression);
				if (result == null) result = caseEventBObject(kIntersectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.DOMAIN_EXPRESSION: {
				DomainExpression domainExpression = (DomainExpression)theEObject;
				T result = caseDomainExpression(domainExpression);
				if (result == null) result = caseUnaryOperator(domainExpression);
				if (result == null) result = caseBExpressionResolved(domainExpression);
				if (result == null) result = caseBFormula(domainExpression);
				if (result == null) result = caseExtension(domainExpression);
				if (result == null) result = caseAbstractExtension(domainExpression);
				if (result == null) result = caseEventBElement(domainExpression);
				if (result == null) result = caseEventBObject(domainExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.RANGE_EXPRESSION: {
				RangeExpression rangeExpression = (RangeExpression)theEObject;
				T result = caseRangeExpression(rangeExpression);
				if (result == null) result = caseUnaryOperator(rangeExpression);
				if (result == null) result = caseBExpressionResolved(rangeExpression);
				if (result == null) result = caseBFormula(rangeExpression);
				if (result == null) result = caseExtension(rangeExpression);
				if (result == null) result = caseAbstractExtension(rangeExpression);
				if (result == null) result = caseEventBElement(rangeExpression);
				if (result == null) result = caseEventBObject(rangeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PRJ1_EXPRESSION: {
				Prj1Expression prj1Expression = (Prj1Expression)theEObject;
				T result = casePrj1Expression(prj1Expression);
				if (result == null) result = caseUnaryOperator(prj1Expression);
				if (result == null) result = caseBExpressionResolved(prj1Expression);
				if (result == null) result = caseBFormula(prj1Expression);
				if (result == null) result = caseExtension(prj1Expression);
				if (result == null) result = caseAbstractExtension(prj1Expression);
				if (result == null) result = caseEventBElement(prj1Expression);
				if (result == null) result = caseEventBObject(prj1Expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PRJ1_GEN_EXPRESSION: {
				Prj1GenExpression prj1GenExpression = (Prj1GenExpression)theEObject;
				T result = casePrj1GenExpression(prj1GenExpression);
				if (result == null) result = caseBExpressionResolved(prj1GenExpression);
				if (result == null) result = caseBFormula(prj1GenExpression);
				if (result == null) result = caseExtension(prj1GenExpression);
				if (result == null) result = caseAbstractExtension(prj1GenExpression);
				if (result == null) result = caseEventBElement(prj1GenExpression);
				if (result == null) result = caseEventBObject(prj1GenExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PRJ2_EXPRESSION: {
				Prj2Expression prj2Expression = (Prj2Expression)theEObject;
				T result = casePrj2Expression(prj2Expression);
				if (result == null) result = caseUnaryOperator(prj2Expression);
				if (result == null) result = caseBExpressionResolved(prj2Expression);
				if (result == null) result = caseBFormula(prj2Expression);
				if (result == null) result = caseExtension(prj2Expression);
				if (result == null) result = caseAbstractExtension(prj2Expression);
				if (result == null) result = caseEventBElement(prj2Expression);
				if (result == null) result = caseEventBObject(prj2Expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PRJ2_GEN_EXPRESSION: {
				Prj2GenExpression prj2GenExpression = (Prj2GenExpression)theEObject;
				T result = casePrj2GenExpression(prj2GenExpression);
				if (result == null) result = caseBExpressionResolved(prj2GenExpression);
				if (result == null) result = caseBFormula(prj2GenExpression);
				if (result == null) result = caseExtension(prj2GenExpression);
				if (result == null) result = caseAbstractExtension(prj2GenExpression);
				if (result == null) result = caseEventBElement(prj2GenExpression);
				if (result == null) result = caseEventBObject(prj2GenExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.IDENTITY_EXPRESSION: {
				IdentityExpression identityExpression = (IdentityExpression)theEObject;
				T result = caseIdentityExpression(identityExpression);
				if (result == null) result = caseUnaryOperator(identityExpression);
				if (result == null) result = caseBExpressionResolved(identityExpression);
				if (result == null) result = caseBFormula(identityExpression);
				if (result == null) result = caseExtension(identityExpression);
				if (result == null) result = caseAbstractExtension(identityExpression);
				if (result == null) result = caseEventBElement(identityExpression);
				if (result == null) result = caseEventBObject(identityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.IDENTITY_GEN_EXPRESSION: {
				IdentityGenExpression identityGenExpression = (IdentityGenExpression)theEObject;
				T result = caseIdentityGenExpression(identityGenExpression);
				if (result == null) result = caseBExpressionResolved(identityGenExpression);
				if (result == null) result = caseBFormula(identityGenExpression);
				if (result == null) result = caseExtension(identityGenExpression);
				if (result == null) result = caseAbstractExtension(identityGenExpression);
				if (result == null) result = caseEventBElement(identityGenExpression);
				if (result == null) result = caseEventBObject(identityGenExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.UNARY_MINUS_EXPRESSION: {
				UnaryMinusExpression unaryMinusExpression = (UnaryMinusExpression)theEObject;
				T result = caseUnaryMinusExpression(unaryMinusExpression);
				if (result == null) result = caseUnaryOperator(unaryMinusExpression);
				if (result == null) result = caseBExpressionResolved(unaryMinusExpression);
				if (result == null) result = caseBFormula(unaryMinusExpression);
				if (result == null) result = caseExtension(unaryMinusExpression);
				if (result == null) result = caseAbstractExtension(unaryMinusExpression);
				if (result == null) result = caseEventBElement(unaryMinusExpression);
				if (result == null) result = caseEventBObject(unaryMinusExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.MIN_EXPRESSION: {
				MinExpression minExpression = (MinExpression)theEObject;
				T result = caseMinExpression(minExpression);
				if (result == null) result = caseUnaryOperator(minExpression);
				if (result == null) result = caseBExpressionResolved(minExpression);
				if (result == null) result = caseBFormula(minExpression);
				if (result == null) result = caseExtension(minExpression);
				if (result == null) result = caseAbstractExtension(minExpression);
				if (result == null) result = caseEventBElement(minExpression);
				if (result == null) result = caseEventBObject(minExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.MAX_EXPRESSION: {
				MaxExpression maxExpression = (MaxExpression)theEObject;
				T result = caseMaxExpression(maxExpression);
				if (result == null) result = caseUnaryOperator(maxExpression);
				if (result == null) result = caseBExpressionResolved(maxExpression);
				if (result == null) result = caseBFormula(maxExpression);
				if (result == null) result = caseExtension(maxExpression);
				if (result == null) result = caseAbstractExtension(maxExpression);
				if (result == null) result = caseEventBElement(maxExpression);
				if (result == null) result = caseEventBObject(maxExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.INVERSE_EXPRESSION: {
				InverseExpression inverseExpression = (InverseExpression)theEObject;
				T result = caseInverseExpression(inverseExpression);
				if (result == null) result = caseUnaryOperator(inverseExpression);
				if (result == null) result = caseBExpressionResolved(inverseExpression);
				if (result == null) result = caseBFormula(inverseExpression);
				if (result == null) result = caseExtension(inverseExpression);
				if (result == null) result = caseAbstractExtension(inverseExpression);
				if (result == null) result = caseEventBElement(inverseExpression);
				if (result == null) result = caseEventBObject(inverseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NOT_PREDICATE: {
				NotPredicate notPredicate = (NotPredicate)theEObject;
				T result = caseNotPredicate(notPredicate);
				if (result == null) result = caseUnaryOperator(notPredicate);
				if (result == null) result = caseBPredicateResolved(notPredicate);
				if (result == null) result = caseBFormula(notPredicate);
				if (result == null) result = caseExtension(notPredicate);
				if (result == null) result = caseAbstractExtension(notPredicate);
				if (result == null) result = caseEventBElement(notPredicate);
				if (result == null) result = caseEventBObject(notPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.FINITE_PREDICATE: {
				FinitePredicate finitePredicate = (FinitePredicate)theEObject;
				T result = caseFinitePredicate(finitePredicate);
				if (result == null) result = caseUnaryOperator(finitePredicate);
				if (result == null) result = caseBPredicateResolved(finitePredicate);
				if (result == null) result = caseBFormula(finitePredicate);
				if (result == null) result = caseExtension(finitePredicate);
				if (result == null) result = caseAbstractExtension(finitePredicate);
				if (result == null) result = caseEventBElement(finitePredicate);
				if (result == null) result = caseEventBObject(finitePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PARALLEL_PRODUCT_EXPRESSION: {
				ParallelProductExpression parallelProductExpression = (ParallelProductExpression)theEObject;
				T result = caseParallelProductExpression(parallelProductExpression);
				if (result == null) result = caseBinaryOperator(parallelProductExpression);
				if (result == null) result = caseBExpressionResolved(parallelProductExpression);
				if (result == null) result = caseBFormula(parallelProductExpression);
				if (result == null) result = caseExtension(parallelProductExpression);
				if (result == null) result = caseAbstractExtension(parallelProductExpression);
				if (result == null) result = caseEventBElement(parallelProductExpression);
				if (result == null) result = caseEventBObject(parallelProductExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.RANGE_RESTRICTION_EXPRESSION: {
				RangeRestrictionExpression rangeRestrictionExpression = (RangeRestrictionExpression)theEObject;
				T result = caseRangeRestrictionExpression(rangeRestrictionExpression);
				if (result == null) result = caseBinaryOperator(rangeRestrictionExpression);
				if (result == null) result = caseBExpressionResolved(rangeRestrictionExpression);
				if (result == null) result = caseBFormula(rangeRestrictionExpression);
				if (result == null) result = caseExtension(rangeRestrictionExpression);
				if (result == null) result = caseAbstractExtension(rangeRestrictionExpression);
				if (result == null) result = caseEventBElement(rangeRestrictionExpression);
				if (result == null) result = caseEventBObject(rangeRestrictionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.RANGE_SUBTRACTION_EXPRESSION: {
				RangeSubtractionExpression rangeSubtractionExpression = (RangeSubtractionExpression)theEObject;
				T result = caseRangeSubtractionExpression(rangeSubtractionExpression);
				if (result == null) result = caseBinaryOperator(rangeSubtractionExpression);
				if (result == null) result = caseBExpressionResolved(rangeSubtractionExpression);
				if (result == null) result = caseBFormula(rangeSubtractionExpression);
				if (result == null) result = caseExtension(rangeSubtractionExpression);
				if (result == null) result = caseAbstractExtension(rangeSubtractionExpression);
				if (result == null) result = caseEventBElement(rangeSubtractionExpression);
				if (result == null) result = caseEventBObject(rangeSubtractionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.UPTO_EXPRESSION: {
				UptoExpression uptoExpression = (UptoExpression)theEObject;
				T result = caseUptoExpression(uptoExpression);
				if (result == null) result = caseBinaryOperator(uptoExpression);
				if (result == null) result = caseBExpressionResolved(uptoExpression);
				if (result == null) result = caseBFormula(uptoExpression);
				if (result == null) result = caseExtension(uptoExpression);
				if (result == null) result = caseAbstractExtension(uptoExpression);
				if (result == null) result = caseEventBElement(uptoExpression);
				if (result == null) result = caseEventBObject(uptoExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.EXPONENTIATION_EXPRESSION: {
				ExponentiationExpression exponentiationExpression = (ExponentiationExpression)theEObject;
				T result = caseExponentiationExpression(exponentiationExpression);
				if (result == null) result = caseBinaryOperator(exponentiationExpression);
				if (result == null) result = caseBExpressionResolved(exponentiationExpression);
				if (result == null) result = caseBFormula(exponentiationExpression);
				if (result == null) result = caseExtension(exponentiationExpression);
				if (result == null) result = caseAbstractExtension(exponentiationExpression);
				if (result == null) result = caseEventBElement(exponentiationExpression);
				if (result == null) result = caseEventBObject(exponentiationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SET_SUBTRACTION_EXPRESSION: {
				SetSubtractionExpression setSubtractionExpression = (SetSubtractionExpression)theEObject;
				T result = caseSetSubtractionExpression(setSubtractionExpression);
				if (result == null) result = caseBinaryOperator(setSubtractionExpression);
				if (result == null) result = caseBExpressionResolved(setSubtractionExpression);
				if (result == null) result = caseBFormula(setSubtractionExpression);
				if (result == null) result = caseExtension(setSubtractionExpression);
				if (result == null) result = caseAbstractExtension(setSubtractionExpression);
				if (result == null) result = caseEventBElement(setSubtractionExpression);
				if (result == null) result = caseEventBObject(setSubtractionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.FUNCTION_EXPRESSION: {
				FunctionExpression functionExpression = (FunctionExpression)theEObject;
				T result = caseFunctionExpression(functionExpression);
				if (result == null) result = caseBinaryOperator(functionExpression);
				if (result == null) result = caseBExpressionResolved(functionExpression);
				if (result == null) result = caseBFormula(functionExpression);
				if (result == null) result = caseExtension(functionExpression);
				if (result == null) result = caseAbstractExtension(functionExpression);
				if (result == null) result = caseEventBElement(functionExpression);
				if (result == null) result = caseEventBObject(functionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.IMAGE_EXPRESSION: {
				ImageExpression imageExpression = (ImageExpression)theEObject;
				T result = caseImageExpression(imageExpression);
				if (result == null) result = caseBinaryOperator(imageExpression);
				if (result == null) result = caseBExpressionResolved(imageExpression);
				if (result == null) result = caseBFormula(imageExpression);
				if (result == null) result = caseExtension(imageExpression);
				if (result == null) result = caseAbstractExtension(imageExpression);
				if (result == null) result = caseEventBElement(imageExpression);
				if (result == null) result = caseEventBObject(imageExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.IMPLICATION_PREDICATE: {
				ImplicationPredicate implicationPredicate = (ImplicationPredicate)theEObject;
				T result = caseImplicationPredicate(implicationPredicate);
				if (result == null) result = caseBinaryOperator(implicationPredicate);
				if (result == null) result = caseBPredicateResolved(implicationPredicate);
				if (result == null) result = caseBFormula(implicationPredicate);
				if (result == null) result = caseExtension(implicationPredicate);
				if (result == null) result = caseAbstractExtension(implicationPredicate);
				if (result == null) result = caseEventBElement(implicationPredicate);
				if (result == null) result = caseEventBObject(implicationPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.EQUIVALENCE_PREDICATE: {
				EquivalencePredicate equivalencePredicate = (EquivalencePredicate)theEObject;
				T result = caseEquivalencePredicate(equivalencePredicate);
				if (result == null) result = caseBinaryOperator(equivalencePredicate);
				if (result == null) result = caseBPredicateResolved(equivalencePredicate);
				if (result == null) result = caseBFormula(equivalencePredicate);
				if (result == null) result = caseExtension(equivalencePredicate);
				if (result == null) result = caseAbstractExtension(equivalencePredicate);
				if (result == null) result = caseEventBElement(equivalencePredicate);
				if (result == null) result = caseEventBObject(equivalencePredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.EQUAL_PREDICATE: {
				EqualPredicate equalPredicate = (EqualPredicate)theEObject;
				T result = caseEqualPredicate(equalPredicate);
				if (result == null) result = caseBinaryOperator(equalPredicate);
				if (result == null) result = caseBPredicateResolved(equalPredicate);
				if (result == null) result = caseBFormula(equalPredicate);
				if (result == null) result = caseExtension(equalPredicate);
				if (result == null) result = caseAbstractExtension(equalPredicate);
				if (result == null) result = caseEventBElement(equalPredicate);
				if (result == null) result = caseEventBObject(equalPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NOT_EQUAL_PREDICATE: {
				NotEqualPredicate notEqualPredicate = (NotEqualPredicate)theEObject;
				T result = caseNotEqualPredicate(notEqualPredicate);
				if (result == null) result = caseBinaryOperator(notEqualPredicate);
				if (result == null) result = caseBPredicateResolved(notEqualPredicate);
				if (result == null) result = caseBFormula(notEqualPredicate);
				if (result == null) result = caseExtension(notEqualPredicate);
				if (result == null) result = caseAbstractExtension(notEqualPredicate);
				if (result == null) result = caseEventBElement(notEqualPredicate);
				if (result == null) result = caseEventBObject(notEqualPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BELONG_PREDICATE: {
				BelongPredicate belongPredicate = (BelongPredicate)theEObject;
				T result = caseBelongPredicate(belongPredicate);
				if (result == null) result = caseBinaryOperator(belongPredicate);
				if (result == null) result = caseBPredicateResolved(belongPredicate);
				if (result == null) result = caseBFormula(belongPredicate);
				if (result == null) result = caseExtension(belongPredicate);
				if (result == null) result = caseAbstractExtension(belongPredicate);
				if (result == null) result = caseEventBElement(belongPredicate);
				if (result == null) result = caseEventBObject(belongPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NOT_BELONG_PREDICATE: {
				NotBelongPredicate notBelongPredicate = (NotBelongPredicate)theEObject;
				T result = caseNotBelongPredicate(notBelongPredicate);
				if (result == null) result = caseBinaryOperator(notBelongPredicate);
				if (result == null) result = caseBPredicateResolved(notBelongPredicate);
				if (result == null) result = caseBFormula(notBelongPredicate);
				if (result == null) result = caseExtension(notBelongPredicate);
				if (result == null) result = caseAbstractExtension(notBelongPredicate);
				if (result == null) result = caseEventBElement(notBelongPredicate);
				if (result == null) result = caseEventBObject(notBelongPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SUBSET_STRICT_PREDICATE: {
				SubsetStrictPredicate subsetStrictPredicate = (SubsetStrictPredicate)theEObject;
				T result = caseSubsetStrictPredicate(subsetStrictPredicate);
				if (result == null) result = caseBinaryOperator(subsetStrictPredicate);
				if (result == null) result = caseBPredicateResolved(subsetStrictPredicate);
				if (result == null) result = caseBFormula(subsetStrictPredicate);
				if (result == null) result = caseExtension(subsetStrictPredicate);
				if (result == null) result = caseAbstractExtension(subsetStrictPredicate);
				if (result == null) result = caseEventBElement(subsetStrictPredicate);
				if (result == null) result = caseEventBObject(subsetStrictPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NOT_SUBSET_STRICT_PREDICATE: {
				NotSubsetStrictPredicate notSubsetStrictPredicate = (NotSubsetStrictPredicate)theEObject;
				T result = caseNotSubsetStrictPredicate(notSubsetStrictPredicate);
				if (result == null) result = caseBinaryOperator(notSubsetStrictPredicate);
				if (result == null) result = caseBPredicateResolved(notSubsetStrictPredicate);
				if (result == null) result = caseBFormula(notSubsetStrictPredicate);
				if (result == null) result = caseExtension(notSubsetStrictPredicate);
				if (result == null) result = caseAbstractExtension(notSubsetStrictPredicate);
				if (result == null) result = caseEventBElement(notSubsetStrictPredicate);
				if (result == null) result = caseEventBObject(notSubsetStrictPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SUBSET_PREDICATE: {
				SubsetPredicate subsetPredicate = (SubsetPredicate)theEObject;
				T result = caseSubsetPredicate(subsetPredicate);
				if (result == null) result = caseBinaryOperator(subsetPredicate);
				if (result == null) result = caseBPredicateResolved(subsetPredicate);
				if (result == null) result = caseBFormula(subsetPredicate);
				if (result == null) result = caseExtension(subsetPredicate);
				if (result == null) result = caseAbstractExtension(subsetPredicate);
				if (result == null) result = caseEventBElement(subsetPredicate);
				if (result == null) result = caseEventBObject(subsetPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.NOT_SUBSET_PREDICATE: {
				NotSubsetPredicate notSubsetPredicate = (NotSubsetPredicate)theEObject;
				T result = caseNotSubsetPredicate(notSubsetPredicate);
				if (result == null) result = caseBinaryOperator(notSubsetPredicate);
				if (result == null) result = caseBPredicateResolved(notSubsetPredicate);
				if (result == null) result = caseBFormula(notSubsetPredicate);
				if (result == null) result = caseExtension(notSubsetPredicate);
				if (result == null) result = caseAbstractExtension(notSubsetPredicate);
				if (result == null) result = caseEventBElement(notSubsetPredicate);
				if (result == null) result = caseEventBObject(notSubsetPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.LESS_PREDICATE: {
				LessPredicate lessPredicate = (LessPredicate)theEObject;
				T result = caseLessPredicate(lessPredicate);
				if (result == null) result = caseBinaryOperator(lessPredicate);
				if (result == null) result = caseBPredicateResolved(lessPredicate);
				if (result == null) result = caseBFormula(lessPredicate);
				if (result == null) result = caseExtension(lessPredicate);
				if (result == null) result = caseAbstractExtension(lessPredicate);
				if (result == null) result = caseEventBElement(lessPredicate);
				if (result == null) result = caseEventBObject(lessPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.LESS_EQUAL_PREDICATE: {
				LessEqualPredicate lessEqualPredicate = (LessEqualPredicate)theEObject;
				T result = caseLessEqualPredicate(lessEqualPredicate);
				if (result == null) result = caseBinaryOperator(lessEqualPredicate);
				if (result == null) result = caseBPredicateResolved(lessEqualPredicate);
				if (result == null) result = caseBFormula(lessEqualPredicate);
				if (result == null) result = caseExtension(lessEqualPredicate);
				if (result == null) result = caseAbstractExtension(lessEqualPredicate);
				if (result == null) result = caseEventBElement(lessEqualPredicate);
				if (result == null) result = caseEventBObject(lessEqualPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.GREATER_PREDICATE: {
				GreaterPredicate greaterPredicate = (GreaterPredicate)theEObject;
				T result = caseGreaterPredicate(greaterPredicate);
				if (result == null) result = caseBinaryOperator(greaterPredicate);
				if (result == null) result = caseBPredicateResolved(greaterPredicate);
				if (result == null) result = caseBFormula(greaterPredicate);
				if (result == null) result = caseExtension(greaterPredicate);
				if (result == null) result = caseAbstractExtension(greaterPredicate);
				if (result == null) result = caseEventBElement(greaterPredicate);
				if (result == null) result = caseEventBObject(greaterPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.GREATER_EQUAL_PREDICATE: {
				GreaterEqualPredicate greaterEqualPredicate = (GreaterEqualPredicate)theEObject;
				T result = caseGreaterEqualPredicate(greaterEqualPredicate);
				if (result == null) result = caseBinaryOperator(greaterEqualPredicate);
				if (result == null) result = caseBPredicateResolved(greaterEqualPredicate);
				if (result == null) result = caseBFormula(greaterEqualPredicate);
				if (result == null) result = caseExtension(greaterEqualPredicate);
				if (result == null) result = caseAbstractExtension(greaterEqualPredicate);
				if (result == null) result = caseEventBElement(greaterEqualPredicate);
				if (result == null) result = caseEventBObject(greaterEqualPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.DOMAIN_RESTRICTION_EXPRESSION: {
				DomainRestrictionExpression domainRestrictionExpression = (DomainRestrictionExpression)theEObject;
				T result = caseDomainRestrictionExpression(domainRestrictionExpression);
				if (result == null) result = caseBinaryOperator(domainRestrictionExpression);
				if (result == null) result = caseBExpressionResolved(domainRestrictionExpression);
				if (result == null) result = caseBFormula(domainRestrictionExpression);
				if (result == null) result = caseExtension(domainRestrictionExpression);
				if (result == null) result = caseAbstractExtension(domainRestrictionExpression);
				if (result == null) result = caseEventBElement(domainRestrictionExpression);
				if (result == null) result = caseEventBObject(domainRestrictionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.DOMAIN_SUBTRACTION_EXPRESSION: {
				DomainSubtractionExpression domainSubtractionExpression = (DomainSubtractionExpression)theEObject;
				T result = caseDomainSubtractionExpression(domainSubtractionExpression);
				if (result == null) result = caseBinaryOperator(domainSubtractionExpression);
				if (result == null) result = caseBExpressionResolved(domainSubtractionExpression);
				if (result == null) result = caseBFormula(domainSubtractionExpression);
				if (result == null) result = caseExtension(domainSubtractionExpression);
				if (result == null) result = caseAbstractExtension(domainSubtractionExpression);
				if (result == null) result = caseEventBElement(domainSubtractionExpression);
				if (result == null) result = caseEventBObject(domainSubtractionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.DIRECT_PRODUCT_EXPRESSION: {
				DirectProductExpression directProductExpression = (DirectProductExpression)theEObject;
				T result = caseDirectProductExpression(directProductExpression);
				if (result == null) result = caseBinaryOperator(directProductExpression);
				if (result == null) result = caseBExpressionResolved(directProductExpression);
				if (result == null) result = caseBFormula(directProductExpression);
				if (result == null) result = caseExtension(directProductExpression);
				if (result == null) result = caseAbstractExtension(directProductExpression);
				if (result == null) result = caseEventBElement(directProductExpression);
				if (result == null) result = caseEventBObject(directProductExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.DIVISION_EXPRESSION: {
				DivisionExpression divisionExpression = (DivisionExpression)theEObject;
				T result = caseDivisionExpression(divisionExpression);
				if (result == null) result = caseBinaryOperator(divisionExpression);
				if (result == null) result = caseBExpressionResolved(divisionExpression);
				if (result == null) result = caseBFormula(divisionExpression);
				if (result == null) result = caseExtension(divisionExpression);
				if (result == null) result = caseAbstractExtension(divisionExpression);
				if (result == null) result = caseEventBElement(divisionExpression);
				if (result == null) result = caseEventBObject(divisionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SUBTRACT_EXPRESSION: {
				SubtractExpression subtractExpression = (SubtractExpression)theEObject;
				T result = caseSubtractExpression(subtractExpression);
				if (result == null) result = caseBinaryOperator(subtractExpression);
				if (result == null) result = caseBExpressionResolved(subtractExpression);
				if (result == null) result = caseBFormula(subtractExpression);
				if (result == null) result = caseExtension(subtractExpression);
				if (result == null) result = caseAbstractExtension(subtractExpression);
				if (result == null) result = caseEventBElement(subtractExpression);
				if (result == null) result = caseEventBObject(subtractExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.MODULO_EXPRESSION: {
				ModuloExpression moduloExpression = (ModuloExpression)theEObject;
				T result = caseModuloExpression(moduloExpression);
				if (result == null) result = caseBinaryOperator(moduloExpression);
				if (result == null) result = caseBExpressionResolved(moduloExpression);
				if (result == null) result = caseBFormula(moduloExpression);
				if (result == null) result = caseExtension(moduloExpression);
				if (result == null) result = caseAbstractExtension(moduloExpression);
				if (result == null) result = caseEventBElement(moduloExpression);
				if (result == null) result = caseEventBObject(moduloExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.CARTESIAN_PRODUCT_EXPRESSION: {
				CartesianProductExpression cartesianProductExpression = (CartesianProductExpression)theEObject;
				T result = caseCartesianProductExpression(cartesianProductExpression);
				if (result == null) result = caseBinaryOperator(cartesianProductExpression);
				if (result == null) result = caseBExpressionResolved(cartesianProductExpression);
				if (result == null) result = caseBFormula(cartesianProductExpression);
				if (result == null) result = caseExtension(cartesianProductExpression);
				if (result == null) result = caseAbstractExtension(cartesianProductExpression);
				if (result == null) result = caseEventBElement(cartesianProductExpression);
				if (result == null) result = caseEventBObject(cartesianProductExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PARTIAL_FUNCTION_EXPRESSION: {
				PartialFunctionExpression partialFunctionExpression = (PartialFunctionExpression)theEObject;
				T result = casePartialFunctionExpression(partialFunctionExpression);
				if (result == null) result = caseBinaryOperator(partialFunctionExpression);
				if (result == null) result = caseBExpressionResolved(partialFunctionExpression);
				if (result == null) result = caseBFormula(partialFunctionExpression);
				if (result == null) result = caseExtension(partialFunctionExpression);
				if (result == null) result = caseAbstractExtension(partialFunctionExpression);
				if (result == null) result = caseEventBElement(partialFunctionExpression);
				if (result == null) result = caseEventBObject(partialFunctionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TOTAL_FUNCTION_EXPRESSION: {
				TotalFunctionExpression totalFunctionExpression = (TotalFunctionExpression)theEObject;
				T result = caseTotalFunctionExpression(totalFunctionExpression);
				if (result == null) result = caseBinaryOperator(totalFunctionExpression);
				if (result == null) result = caseBExpressionResolved(totalFunctionExpression);
				if (result == null) result = caseBFormula(totalFunctionExpression);
				if (result == null) result = caseExtension(totalFunctionExpression);
				if (result == null) result = caseAbstractExtension(totalFunctionExpression);
				if (result == null) result = caseEventBElement(totalFunctionExpression);
				if (result == null) result = caseEventBObject(totalFunctionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.RELATION_EXPRESSION: {
				RelationExpression relationExpression = (RelationExpression)theEObject;
				T result = caseRelationExpression(relationExpression);
				if (result == null) result = caseBinaryOperator(relationExpression);
				if (result == null) result = caseBExpressionResolved(relationExpression);
				if (result == null) result = caseBFormula(relationExpression);
				if (result == null) result = caseExtension(relationExpression);
				if (result == null) result = caseAbstractExtension(relationExpression);
				if (result == null) result = caseEventBElement(relationExpression);
				if (result == null) result = caseEventBObject(relationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TOTAL_SURJECTION_EXPRESSION: {
				TotalSurjectionExpression totalSurjectionExpression = (TotalSurjectionExpression)theEObject;
				T result = caseTotalSurjectionExpression(totalSurjectionExpression);
				if (result == null) result = caseBinaryOperator(totalSurjectionExpression);
				if (result == null) result = caseBExpressionResolved(totalSurjectionExpression);
				if (result == null) result = caseBFormula(totalSurjectionExpression);
				if (result == null) result = caseExtension(totalSurjectionExpression);
				if (result == null) result = caseAbstractExtension(totalSurjectionExpression);
				if (result == null) result = caseEventBElement(totalSurjectionExpression);
				if (result == null) result = caseEventBObject(totalSurjectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TOTAL_INJECTION_EXPRESSION: {
				TotalInjectionExpression totalInjectionExpression = (TotalInjectionExpression)theEObject;
				T result = caseTotalInjectionExpression(totalInjectionExpression);
				if (result == null) result = caseBinaryOperator(totalInjectionExpression);
				if (result == null) result = caseBExpressionResolved(totalInjectionExpression);
				if (result == null) result = caseBFormula(totalInjectionExpression);
				if (result == null) result = caseExtension(totalInjectionExpression);
				if (result == null) result = caseAbstractExtension(totalInjectionExpression);
				if (result == null) result = caseEventBElement(totalInjectionExpression);
				if (result == null) result = caseEventBObject(totalInjectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PARTIAL_SURJECTION_EXPRESSION: {
				PartialSurjectionExpression partialSurjectionExpression = (PartialSurjectionExpression)theEObject;
				T result = casePartialSurjectionExpression(partialSurjectionExpression);
				if (result == null) result = caseBinaryOperator(partialSurjectionExpression);
				if (result == null) result = caseBExpressionResolved(partialSurjectionExpression);
				if (result == null) result = caseBFormula(partialSurjectionExpression);
				if (result == null) result = caseExtension(partialSurjectionExpression);
				if (result == null) result = caseAbstractExtension(partialSurjectionExpression);
				if (result == null) result = caseEventBElement(partialSurjectionExpression);
				if (result == null) result = caseEventBObject(partialSurjectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PARTIAL_INJECTION_EXPRESSION: {
				PartialInjectionExpression partialInjectionExpression = (PartialInjectionExpression)theEObject;
				T result = casePartialInjectionExpression(partialInjectionExpression);
				if (result == null) result = caseBinaryOperator(partialInjectionExpression);
				if (result == null) result = caseBExpressionResolved(partialInjectionExpression);
				if (result == null) result = caseBFormula(partialInjectionExpression);
				if (result == null) result = caseExtension(partialInjectionExpression);
				if (result == null) result = caseAbstractExtension(partialInjectionExpression);
				if (result == null) result = caseEventBElement(partialInjectionExpression);
				if (result == null) result = caseEventBObject(partialInjectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TOTAL_BIJECTION_EXPRESSION: {
				TotalBijectionExpression totalBijectionExpression = (TotalBijectionExpression)theEObject;
				T result = caseTotalBijectionExpression(totalBijectionExpression);
				if (result == null) result = caseBinaryOperator(totalBijectionExpression);
				if (result == null) result = caseBExpressionResolved(totalBijectionExpression);
				if (result == null) result = caseBFormula(totalBijectionExpression);
				if (result == null) result = caseExtension(totalBijectionExpression);
				if (result == null) result = caseAbstractExtension(totalBijectionExpression);
				if (result == null) result = caseEventBElement(totalBijectionExpression);
				if (result == null) result = caseEventBObject(totalBijectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TOTAL_RELATION_EXPRESSION: {
				TotalRelationExpression totalRelationExpression = (TotalRelationExpression)theEObject;
				T result = caseTotalRelationExpression(totalRelationExpression);
				if (result == null) result = caseBinaryOperator(totalRelationExpression);
				if (result == null) result = caseBExpressionResolved(totalRelationExpression);
				if (result == null) result = caseBFormula(totalRelationExpression);
				if (result == null) result = caseExtension(totalRelationExpression);
				if (result == null) result = caseAbstractExtension(totalRelationExpression);
				if (result == null) result = caseEventBElement(totalRelationExpression);
				if (result == null) result = caseEventBObject(totalRelationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SURJECTIVE_RELATION_EXPRESSION: {
				SurjectiveRelationExpression surjectiveRelationExpression = (SurjectiveRelationExpression)theEObject;
				T result = caseSurjectiveRelationExpression(surjectiveRelationExpression);
				if (result == null) result = caseBinaryOperator(surjectiveRelationExpression);
				if (result == null) result = caseBExpressionResolved(surjectiveRelationExpression);
				if (result == null) result = caseBFormula(surjectiveRelationExpression);
				if (result == null) result = caseExtension(surjectiveRelationExpression);
				if (result == null) result = caseAbstractExtension(surjectiveRelationExpression);
				if (result == null) result = caseEventBElement(surjectiveRelationExpression);
				if (result == null) result = caseEventBObject(surjectiveRelationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.TOTAL_SURJECTIVE_RELATION_EXPRESSION: {
				TotalSurjectiveRelationExpression totalSurjectiveRelationExpression = (TotalSurjectiveRelationExpression)theEObject;
				T result = caseTotalSurjectiveRelationExpression(totalSurjectiveRelationExpression);
				if (result == null) result = caseBinaryOperator(totalSurjectiveRelationExpression);
				if (result == null) result = caseBExpressionResolved(totalSurjectiveRelationExpression);
				if (result == null) result = caseBFormula(totalSurjectiveRelationExpression);
				if (result == null) result = caseExtension(totalSurjectiveRelationExpression);
				if (result == null) result = caseAbstractExtension(totalSurjectiveRelationExpression);
				if (result == null) result = caseEventBElement(totalSurjectiveRelationExpression);
				if (result == null) result = caseEventBObject(totalSurjectiveRelationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.MAPLET_EXPRESSION: {
				MapletExpression mapletExpression = (MapletExpression)theEObject;
				T result = caseMapletExpression(mapletExpression);
				if (result == null) result = caseBinaryOperator(mapletExpression);
				if (result == null) result = caseBExpressionResolved(mapletExpression);
				if (result == null) result = caseBFormula(mapletExpression);
				if (result == null) result = caseExtension(mapletExpression);
				if (result == null) result = caseAbstractExtension(mapletExpression);
				if (result == null) result = caseEventBElement(mapletExpression);
				if (result == null) result = caseEventBObject(mapletExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.SET_EXPRESSION: {
				SetExpression setExpression = (SetExpression)theEObject;
				T result = caseSetExpression(setExpression);
				if (result == null) result = caseMultiOperand(setExpression);
				if (result == null) result = caseBExpressionResolved(setExpression);
				if (result == null) result = caseBFormula(setExpression);
				if (result == null) result = caseExtension(setExpression);
				if (result == null) result = caseAbstractExtension(setExpression);
				if (result == null) result = caseEventBElement(setExpression);
				if (result == null) result = caseEventBObject(setExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.BACKWARD_COMPOSITION_EXPRESSION: {
				BackwardCompositionExpression backwardCompositionExpression = (BackwardCompositionExpression)theEObject;
				T result = caseBackwardCompositionExpression(backwardCompositionExpression);
				if (result == null) result = caseMultiOperand(backwardCompositionExpression);
				if (result == null) result = caseBExpressionResolved(backwardCompositionExpression);
				if (result == null) result = caseBFormula(backwardCompositionExpression);
				if (result == null) result = caseExtension(backwardCompositionExpression);
				if (result == null) result = caseAbstractExtension(backwardCompositionExpression);
				if (result == null) result = caseEventBElement(backwardCompositionExpression);
				if (result == null) result = caseEventBObject(backwardCompositionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.FORWARD_COMPOSITION_EXPRESSION: {
				ForwardCompositionExpression forwardCompositionExpression = (ForwardCompositionExpression)theEObject;
				T result = caseForwardCompositionExpression(forwardCompositionExpression);
				if (result == null) result = caseMultiOperand(forwardCompositionExpression);
				if (result == null) result = caseBExpressionResolved(forwardCompositionExpression);
				if (result == null) result = caseBFormula(forwardCompositionExpression);
				if (result == null) result = caseExtension(forwardCompositionExpression);
				if (result == null) result = caseAbstractExtension(forwardCompositionExpression);
				if (result == null) result = caseEventBElement(forwardCompositionExpression);
				if (result == null) result = caseEventBObject(forwardCompositionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.RELATIONAL_OVERRIDING_EXPRESSION: {
				RelationalOverridingExpression relationalOverridingExpression = (RelationalOverridingExpression)theEObject;
				T result = caseRelationalOverridingExpression(relationalOverridingExpression);
				if (result == null) result = caseMultiOperand(relationalOverridingExpression);
				if (result == null) result = caseBExpressionResolved(relationalOverridingExpression);
				if (result == null) result = caseBFormula(relationalOverridingExpression);
				if (result == null) result = caseExtension(relationalOverridingExpression);
				if (result == null) result = caseAbstractExtension(relationalOverridingExpression);
				if (result == null) result = caseEventBElement(relationalOverridingExpression);
				if (result == null) result = caseEventBObject(relationalOverridingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.AND_PREDICATE: {
				AndPredicate andPredicate = (AndPredicate)theEObject;
				T result = caseAndPredicate(andPredicate);
				if (result == null) result = caseMultiOperand(andPredicate);
				if (result == null) result = caseBPredicateResolved(andPredicate);
				if (result == null) result = caseBFormula(andPredicate);
				if (result == null) result = caseExtension(andPredicate);
				if (result == null) result = caseAbstractExtension(andPredicate);
				if (result == null) result = caseEventBElement(andPredicate);
				if (result == null) result = caseEventBObject(andPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.OR_PREDICATE: {
				OrPredicate orPredicate = (OrPredicate)theEObject;
				T result = caseOrPredicate(orPredicate);
				if (result == null) result = caseMultiOperand(orPredicate);
				if (result == null) result = caseBPredicateResolved(orPredicate);
				if (result == null) result = caseBFormula(orPredicate);
				if (result == null) result = caseExtension(orPredicate);
				if (result == null) result = caseAbstractExtension(orPredicate);
				if (result == null) result = caseEventBElement(orPredicate);
				if (result == null) result = caseEventBObject(orPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.ADD_EXPRESSION: {
				AddExpression addExpression = (AddExpression)theEObject;
				T result = caseAddExpression(addExpression);
				if (result == null) result = caseMultiOperand(addExpression);
				if (result == null) result = caseBExpressionResolved(addExpression);
				if (result == null) result = caseBFormula(addExpression);
				if (result == null) result = caseExtension(addExpression);
				if (result == null) result = caseAbstractExtension(addExpression);
				if (result == null) result = caseEventBElement(addExpression);
				if (result == null) result = caseEventBObject(addExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.MUL_EXPRESSION: {
				MulExpression mulExpression = (MulExpression)theEObject;
				T result = caseMulExpression(mulExpression);
				if (result == null) result = caseMultiOperand(mulExpression);
				if (result == null) result = caseBExpressionResolved(mulExpression);
				if (result == null) result = caseBFormula(mulExpression);
				if (result == null) result = caseExtension(mulExpression);
				if (result == null) result = caseAbstractExtension(mulExpression);
				if (result == null) result = caseEventBElement(mulExpression);
				if (result == null) result = caseEventBObject(mulExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.INTERSECTION_EXPRESSION: {
				IntersectionExpression intersectionExpression = (IntersectionExpression)theEObject;
				T result = caseIntersectionExpression(intersectionExpression);
				if (result == null) result = caseMultiOperand(intersectionExpression);
				if (result == null) result = caseBExpressionResolved(intersectionExpression);
				if (result == null) result = caseBFormula(intersectionExpression);
				if (result == null) result = caseExtension(intersectionExpression);
				if (result == null) result = caseAbstractExtension(intersectionExpression);
				if (result == null) result = caseEventBElement(intersectionExpression);
				if (result == null) result = caseEventBObject(intersectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.UNION_EXPRESSION: {
				UnionExpression unionExpression = (UnionExpression)theEObject;
				T result = caseUnionExpression(unionExpression);
				if (result == null) result = caseMultiOperand(unionExpression);
				if (result == null) result = caseBExpressionResolved(unionExpression);
				if (result == null) result = caseBFormula(unionExpression);
				if (result == null) result = caseExtension(unionExpression);
				if (result == null) result = caseAbstractExtension(unionExpression);
				if (result == null) result = caseEventBElement(unionExpression);
				if (result == null) result = caseEventBObject(unionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FormulasPackage.PARTITION_PREDICATE: {
				PartitionPredicate partitionPredicate = (PartitionPredicate)theEObject;
				T result = casePartitionPredicate(partitionPredicate);
				if (result == null) result = caseMultiOperand(partitionPredicate);
				if (result == null) result = caseBPredicateResolved(partitionPredicate);
				if (result == null) result = caseBFormula(partitionPredicate);
				if (result == null) result = caseExtension(partitionPredicate);
				if (result == null) result = caseAbstractExtension(partitionPredicate);
				if (result == null) result = caseEventBElement(partitionPredicate);
				if (result == null) result = caseEventBObject(partitionPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BFormula</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BFormula</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBFormula(BFormula object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExpression Resolved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExpression Resolved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExpressionResolved(BExpressionResolved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPredicate Resolved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPredicate Resolved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPredicateResolved(BPredicateResolved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BAssignment Resolved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BAssignment Resolved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBAssignmentResolved(BAssignmentResolved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryOperator(UnaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryOperator(BinaryOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Operand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Operand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiOperand(MultiOperand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Becomes Equal To Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Becomes Equal To Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBecomesEqualToAssignment(BecomesEqualToAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Becomes Member Of Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Becomes Member Of Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBecomesMemberOfAssignment(BecomesMemberOfAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Becomes Such That Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Becomes Such That Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBecomesSuchThatAssignment(BecomesSuchThatAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteralExpression(IntegerLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierExpression(IdentifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Identifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Identifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundIdentifierExpression(BoundIdentifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forall Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forall Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForallPredicate(ForallPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exist Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exist Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistPredicate(ExistPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lambda Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lambda Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLambdaExpression(LambdaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Union Expression1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Union Expression1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedUnionExpression1(QuantifiedUnionExpression1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Union Expression2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Union Expression2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedUnionExpression2(QuantifiedUnionExpression2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Intersection Expression1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Intersection Expression1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedIntersectionExpression1(QuantifiedIntersectionExpression1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantified Intersection Expression2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantified Intersection Expression2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifiedIntersectionExpression2(QuantifiedIntersectionExpression2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Comprehension Expression1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Comprehension Expression1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComprehensionExpression1(SetComprehensionExpression1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Comprehension Expression2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Comprehension Expression2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComprehensionExpression2(SetComprehensionExpression2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINT(INT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAT(NAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NAT1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NAT1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNAT1(NAT1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BOOL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BOOL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBOOL(BOOL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRUE(TRUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FALSE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FALSE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFALSE(FALSE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMPTYSET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMPTYSET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMPTYSET(EMPTYSET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRUTH</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRUTH</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRUTH(TRUTH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FALSITY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FALSITY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFALSITY(FALSITY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Succ Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Succ Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuccExpression(SuccExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pred Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pred Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredExpression(PredExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolExpression(BoolExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardExpression(CardExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pow Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowExpression(PowExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pow1 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pow1 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePow1Expression(Pow1Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KUnion Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KUnion Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKUnionExpression(KUnionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KIntersection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KIntersection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKIntersectionExpression(KIntersectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainExpression(DomainExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpression(RangeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prj1 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prj1 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrj1Expression(Prj1Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prj1 Gen Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prj1 Gen Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrj1GenExpression(Prj1GenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prj2 Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prj2 Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrj2Expression(Prj2Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prj2 Gen Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prj2 Gen Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrj2GenExpression(Prj2GenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityExpression(IdentityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Gen Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Gen Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityGenExpression(IdentityGenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Minus Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Minus Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryMinusExpression(UnaryMinusExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinExpression(MinExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxExpression(MaxExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInverseExpression(InverseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotPredicate(NotPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinitePredicate(FinitePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Product Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Product Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelProductExpression(ParallelProductExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Restriction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Restriction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeRestrictionExpression(RangeRestrictionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Subtraction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Subtraction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSubtractionExpression(RangeSubtractionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upto Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upto Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUptoExpression(UptoExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponentiation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponentiation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentiationExpression(ExponentiationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Subtraction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Subtraction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSubtractionExpression(SetSubtractionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionExpression(FunctionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageExpression(ImageExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicationPredicate(ImplicationPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equivalence Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equivalence Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquivalencePredicate(EquivalencePredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equal Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equal Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualPredicate(EqualPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Equal Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Equal Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotEqualPredicate(NotEqualPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Belong Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belong Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBelongPredicate(BelongPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Belong Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Belong Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotBelongPredicate(NotBelongPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Strict Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Strict Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetStrictPredicate(SubsetStrictPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Subset Strict Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Subset Strict Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotSubsetStrictPredicate(NotSubsetStrictPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetPredicate(SubsetPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Subset Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Subset Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotSubsetPredicate(NotSubsetPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessPredicate(LessPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Less Equal Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Less Equal Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLessEqualPredicate(LessEqualPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterPredicate(GreaterPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Equal Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Equal Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterEqualPredicate(GreaterEqualPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Restriction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Restriction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainRestrictionExpression(DomainRestrictionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Subtraction Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Subtraction Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSubtractionExpression(DomainSubtractionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Product Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Product Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectProductExpression(DirectProductExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionExpression(DivisionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtractExpression(SubtractExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuloExpression(ModuloExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Product Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Product Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianProductExpression(CartesianProductExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Function Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialFunctionExpression(PartialFunctionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Function Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalFunctionExpression(TotalFunctionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationExpression(RelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Surjection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Surjection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalSurjectionExpression(TotalSurjectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Injection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Injection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalInjectionExpression(TotalInjectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Surjection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Surjection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialSurjectionExpression(PartialSurjectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Injection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Injection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialInjectionExpression(PartialInjectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Bijection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Bijection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalBijectionExpression(TotalBijectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Relation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalRelationExpression(TotalRelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surjective Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surjective Relation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurjectiveRelationExpression(SurjectiveRelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Surjective Relation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Surjective Relation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalSurjectiveRelationExpression(TotalSurjectiveRelationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maplet Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maplet Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapletExpression(MapletExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetExpression(SetExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward Composition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward Composition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackwardCompositionExpression(BackwardCompositionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward Composition Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward Composition Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardCompositionExpression(ForwardCompositionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Overriding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Overriding Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalOverridingExpression(RelationalOverridingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndPredicate(AndPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrPredicate(OrPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddExpression(AddExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mul Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mul Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMulExpression(MulExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intersection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intersection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntersectionExpression(IntersectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Union Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Union Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnionExpression(UnionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partition Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partition Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartitionPredicate(PartitionPredicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBObject(EventBObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event BElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event BElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBElement(EventBElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExtension(AbstractExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FormulasSwitch
