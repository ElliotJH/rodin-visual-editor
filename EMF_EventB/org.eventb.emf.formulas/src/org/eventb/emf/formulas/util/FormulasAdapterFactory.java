/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.Extension;
import org.eventb.emf.formulas.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eventb.emf.formulas.FormulasPackage
 * @generated
 */
public class FormulasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FormulasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FormulasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormulasSwitch<Adapter> modelSwitch =
		new FormulasSwitch<Adapter>() {
			@Override
			public Adapter caseBFormula(BFormula object) {
				return createBFormulaAdapter();
			}
			@Override
			public Adapter caseBExpressionResolved(BExpressionResolved object) {
				return createBExpressionResolvedAdapter();
			}
			@Override
			public Adapter caseBPredicateResolved(BPredicateResolved object) {
				return createBPredicateResolvedAdapter();
			}
			@Override
			public Adapter caseBAssignmentResolved(BAssignmentResolved object) {
				return createBAssignmentResolvedAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object) {
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object) {
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseMultiOperand(MultiOperand object) {
				return createMultiOperandAdapter();
			}
			@Override
			public Adapter caseBecomesEqualToAssignment(BecomesEqualToAssignment object) {
				return createBecomesEqualToAssignmentAdapter();
			}
			@Override
			public Adapter caseBecomesMemberOfAssignment(BecomesMemberOfAssignment object) {
				return createBecomesMemberOfAssignmentAdapter();
			}
			@Override
			public Adapter caseBecomesSuchThatAssignment(BecomesSuchThatAssignment object) {
				return createBecomesSuchThatAssignmentAdapter();
			}
			@Override
			public Adapter caseIntegerLiteralExpression(IntegerLiteralExpression object) {
				return createIntegerLiteralExpressionAdapter();
			}
			@Override
			public Adapter caseIdentifierExpression(IdentifierExpression object) {
				return createIdentifierExpressionAdapter();
			}
			@Override
			public Adapter caseBoundIdentifierExpression(BoundIdentifierExpression object) {
				return createBoundIdentifierExpressionAdapter();
			}
			@Override
			public Adapter caseForallPredicate(ForallPredicate object) {
				return createForallPredicateAdapter();
			}
			@Override
			public Adapter caseExistPredicate(ExistPredicate object) {
				return createExistPredicateAdapter();
			}
			@Override
			public Adapter caseLambdaExpression(LambdaExpression object) {
				return createLambdaExpressionAdapter();
			}
			@Override
			public Adapter caseQuantifiedUnionExpression1(QuantifiedUnionExpression1 object) {
				return createQuantifiedUnionExpression1Adapter();
			}
			@Override
			public Adapter caseQuantifiedUnionExpression2(QuantifiedUnionExpression2 object) {
				return createQuantifiedUnionExpression2Adapter();
			}
			@Override
			public Adapter caseQuantifiedIntersectionExpression1(QuantifiedIntersectionExpression1 object) {
				return createQuantifiedIntersectionExpression1Adapter();
			}
			@Override
			public Adapter caseQuantifiedIntersectionExpression2(QuantifiedIntersectionExpression2 object) {
				return createQuantifiedIntersectionExpression2Adapter();
			}
			@Override
			public Adapter caseSetComprehensionExpression1(SetComprehensionExpression1 object) {
				return createSetComprehensionExpression1Adapter();
			}
			@Override
			public Adapter caseSetComprehensionExpression2(SetComprehensionExpression2 object) {
				return createSetComprehensionExpression2Adapter();
			}
			@Override
			public Adapter caseINT(INT object) {
				return createINTAdapter();
			}
			@Override
			public Adapter caseNAT(NAT object) {
				return createNATAdapter();
			}
			@Override
			public Adapter caseNAT1(NAT1 object) {
				return createNAT1Adapter();
			}
			@Override
			public Adapter caseBOOL(BOOL object) {
				return createBOOLAdapter();
			}
			@Override
			public Adapter caseTRUE(TRUE object) {
				return createTRUEAdapter();
			}
			@Override
			public Adapter caseFALSE(FALSE object) {
				return createFALSEAdapter();
			}
			@Override
			public Adapter caseEMPTYSET(EMPTYSET object) {
				return createEMPTYSETAdapter();
			}
			@Override
			public Adapter caseTRUTH(TRUTH object) {
				return createTRUTHAdapter();
			}
			@Override
			public Adapter caseFALSITY(FALSITY object) {
				return createFALSITYAdapter();
			}
			@Override
			public Adapter caseSuccExpression(SuccExpression object) {
				return createSuccExpressionAdapter();
			}
			@Override
			public Adapter casePredExpression(PredExpression object) {
				return createPredExpressionAdapter();
			}
			@Override
			public Adapter caseBoolExpression(BoolExpression object) {
				return createBoolExpressionAdapter();
			}
			@Override
			public Adapter caseCardExpression(CardExpression object) {
				return createCardExpressionAdapter();
			}
			@Override
			public Adapter casePowExpression(PowExpression object) {
				return createPowExpressionAdapter();
			}
			@Override
			public Adapter casePow1Expression(Pow1Expression object) {
				return createPow1ExpressionAdapter();
			}
			@Override
			public Adapter caseKUnionExpression(KUnionExpression object) {
				return createKUnionExpressionAdapter();
			}
			@Override
			public Adapter caseKIntersectionExpression(KIntersectionExpression object) {
				return createKIntersectionExpressionAdapter();
			}
			@Override
			public Adapter caseDomainExpression(DomainExpression object) {
				return createDomainExpressionAdapter();
			}
			@Override
			public Adapter caseRangeExpression(RangeExpression object) {
				return createRangeExpressionAdapter();
			}
			@Override
			public Adapter casePrj1Expression(Prj1Expression object) {
				return createPrj1ExpressionAdapter();
			}
			@Override
			public Adapter casePrj1GenExpression(Prj1GenExpression object) {
				return createPrj1GenExpressionAdapter();
			}
			@Override
			public Adapter casePrj2Expression(Prj2Expression object) {
				return createPrj2ExpressionAdapter();
			}
			@Override
			public Adapter casePrj2GenExpression(Prj2GenExpression object) {
				return createPrj2GenExpressionAdapter();
			}
			@Override
			public Adapter caseIdentityExpression(IdentityExpression object) {
				return createIdentityExpressionAdapter();
			}
			@Override
			public Adapter caseIdentityGenExpression(IdentityGenExpression object) {
				return createIdentityGenExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryMinusExpression(UnaryMinusExpression object) {
				return createUnaryMinusExpressionAdapter();
			}
			@Override
			public Adapter caseMinExpression(MinExpression object) {
				return createMinExpressionAdapter();
			}
			@Override
			public Adapter caseMaxExpression(MaxExpression object) {
				return createMaxExpressionAdapter();
			}
			@Override
			public Adapter caseInverseExpression(InverseExpression object) {
				return createInverseExpressionAdapter();
			}
			@Override
			public Adapter caseNotPredicate(NotPredicate object) {
				return createNotPredicateAdapter();
			}
			@Override
			public Adapter caseFinitePredicate(FinitePredicate object) {
				return createFinitePredicateAdapter();
			}
			@Override
			public Adapter caseParallelProductExpression(ParallelProductExpression object) {
				return createParallelProductExpressionAdapter();
			}
			@Override
			public Adapter caseRangeRestrictionExpression(RangeRestrictionExpression object) {
				return createRangeRestrictionExpressionAdapter();
			}
			@Override
			public Adapter caseRangeSubtractionExpression(RangeSubtractionExpression object) {
				return createRangeSubtractionExpressionAdapter();
			}
			@Override
			public Adapter caseUptoExpression(UptoExpression object) {
				return createUptoExpressionAdapter();
			}
			@Override
			public Adapter caseExponentiationExpression(ExponentiationExpression object) {
				return createExponentiationExpressionAdapter();
			}
			@Override
			public Adapter caseSetSubtractionExpression(SetSubtractionExpression object) {
				return createSetSubtractionExpressionAdapter();
			}
			@Override
			public Adapter caseFunctionExpression(FunctionExpression object) {
				return createFunctionExpressionAdapter();
			}
			@Override
			public Adapter caseImageExpression(ImageExpression object) {
				return createImageExpressionAdapter();
			}
			@Override
			public Adapter caseImplicationPredicate(ImplicationPredicate object) {
				return createImplicationPredicateAdapter();
			}
			@Override
			public Adapter caseEquivalencePredicate(EquivalencePredicate object) {
				return createEquivalencePredicateAdapter();
			}
			@Override
			public Adapter caseEqualPredicate(EqualPredicate object) {
				return createEqualPredicateAdapter();
			}
			@Override
			public Adapter caseNotEqualPredicate(NotEqualPredicate object) {
				return createNotEqualPredicateAdapter();
			}
			@Override
			public Adapter caseBelongPredicate(BelongPredicate object) {
				return createBelongPredicateAdapter();
			}
			@Override
			public Adapter caseNotBelongPredicate(NotBelongPredicate object) {
				return createNotBelongPredicateAdapter();
			}
			@Override
			public Adapter caseSubsetStrictPredicate(SubsetStrictPredicate object) {
				return createSubsetStrictPredicateAdapter();
			}
			@Override
			public Adapter caseNotSubsetStrictPredicate(NotSubsetStrictPredicate object) {
				return createNotSubsetStrictPredicateAdapter();
			}
			@Override
			public Adapter caseSubsetPredicate(SubsetPredicate object) {
				return createSubsetPredicateAdapter();
			}
			@Override
			public Adapter caseNotSubsetPredicate(NotSubsetPredicate object) {
				return createNotSubsetPredicateAdapter();
			}
			@Override
			public Adapter caseLessPredicate(LessPredicate object) {
				return createLessPredicateAdapter();
			}
			@Override
			public Adapter caseLessEqualPredicate(LessEqualPredicate object) {
				return createLessEqualPredicateAdapter();
			}
			@Override
			public Adapter caseGreaterPredicate(GreaterPredicate object) {
				return createGreaterPredicateAdapter();
			}
			@Override
			public Adapter caseGreaterEqualPredicate(GreaterEqualPredicate object) {
				return createGreaterEqualPredicateAdapter();
			}
			@Override
			public Adapter caseDomainRestrictionExpression(DomainRestrictionExpression object) {
				return createDomainRestrictionExpressionAdapter();
			}
			@Override
			public Adapter caseDomainSubtractionExpression(DomainSubtractionExpression object) {
				return createDomainSubtractionExpressionAdapter();
			}
			@Override
			public Adapter caseDirectProductExpression(DirectProductExpression object) {
				return createDirectProductExpressionAdapter();
			}
			@Override
			public Adapter caseDivisionExpression(DivisionExpression object) {
				return createDivisionExpressionAdapter();
			}
			@Override
			public Adapter caseSubtractExpression(SubtractExpression object) {
				return createSubtractExpressionAdapter();
			}
			@Override
			public Adapter caseModuloExpression(ModuloExpression object) {
				return createModuloExpressionAdapter();
			}
			@Override
			public Adapter caseCartesianProductExpression(CartesianProductExpression object) {
				return createCartesianProductExpressionAdapter();
			}
			@Override
			public Adapter casePartialFunctionExpression(PartialFunctionExpression object) {
				return createPartialFunctionExpressionAdapter();
			}
			@Override
			public Adapter caseTotalFunctionExpression(TotalFunctionExpression object) {
				return createTotalFunctionExpressionAdapter();
			}
			@Override
			public Adapter caseRelationExpression(RelationExpression object) {
				return createRelationExpressionAdapter();
			}
			@Override
			public Adapter caseTotalSurjectionExpression(TotalSurjectionExpression object) {
				return createTotalSurjectionExpressionAdapter();
			}
			@Override
			public Adapter caseTotalInjectionExpression(TotalInjectionExpression object) {
				return createTotalInjectionExpressionAdapter();
			}
			@Override
			public Adapter casePartialSurjectionExpression(PartialSurjectionExpression object) {
				return createPartialSurjectionExpressionAdapter();
			}
			@Override
			public Adapter casePartialInjectionExpression(PartialInjectionExpression object) {
				return createPartialInjectionExpressionAdapter();
			}
			@Override
			public Adapter caseTotalBijectionExpression(TotalBijectionExpression object) {
				return createTotalBijectionExpressionAdapter();
			}
			@Override
			public Adapter caseTotalRelationExpression(TotalRelationExpression object) {
				return createTotalRelationExpressionAdapter();
			}
			@Override
			public Adapter caseSurjectiveRelationExpression(SurjectiveRelationExpression object) {
				return createSurjectiveRelationExpressionAdapter();
			}
			@Override
			public Adapter caseTotalSurjectiveRelationExpression(TotalSurjectiveRelationExpression object) {
				return createTotalSurjectiveRelationExpressionAdapter();
			}
			@Override
			public Adapter caseMapletExpression(MapletExpression object) {
				return createMapletExpressionAdapter();
			}
			@Override
			public Adapter caseSetExpression(SetExpression object) {
				return createSetExpressionAdapter();
			}
			@Override
			public Adapter caseBackwardCompositionExpression(BackwardCompositionExpression object) {
				return createBackwardCompositionExpressionAdapter();
			}
			@Override
			public Adapter caseForwardCompositionExpression(ForwardCompositionExpression object) {
				return createForwardCompositionExpressionAdapter();
			}
			@Override
			public Adapter caseRelationalOverridingExpression(RelationalOverridingExpression object) {
				return createRelationalOverridingExpressionAdapter();
			}
			@Override
			public Adapter caseAndPredicate(AndPredicate object) {
				return createAndPredicateAdapter();
			}
			@Override
			public Adapter caseOrPredicate(OrPredicate object) {
				return createOrPredicateAdapter();
			}
			@Override
			public Adapter caseAddExpression(AddExpression object) {
				return createAddExpressionAdapter();
			}
			@Override
			public Adapter caseMulExpression(MulExpression object) {
				return createMulExpressionAdapter();
			}
			@Override
			public Adapter caseIntersectionExpression(IntersectionExpression object) {
				return createIntersectionExpressionAdapter();
			}
			@Override
			public Adapter caseUnionExpression(UnionExpression object) {
				return createUnionExpressionAdapter();
			}
			@Override
			public Adapter casePartitionPredicate(PartitionPredicate object) {
				return createPartitionPredicateAdapter();
			}
			@Override
			public Adapter caseEventBObject(EventBObject object) {
				return createEventBObjectAdapter();
			}
			@Override
			public Adapter caseEventBElement(EventBElement object) {
				return createEventBElementAdapter();
			}
			@Override
			public Adapter caseAbstractExtension(AbstractExtension object) {
				return createAbstractExtensionAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BFormula <em>BFormula</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BFormula
	 * @generated
	 */
	public Adapter createBFormulaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BExpressionResolved <em>BExpression Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BExpressionResolved
	 * @generated
	 */
	public Adapter createBExpressionResolvedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BPredicateResolved <em>BPredicate Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BPredicateResolved
	 * @generated
	 */
	public Adapter createBPredicateResolvedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BAssignmentResolved <em>BAssignment Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BAssignmentResolved
	 * @generated
	 */
	public Adapter createBAssignmentResolvedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.MultiOperand <em>Multi Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.MultiOperand
	 * @generated
	 */
	public Adapter createMultiOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BecomesEqualToAssignment <em>Becomes Equal To Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BecomesEqualToAssignment
	 * @generated
	 */
	public Adapter createBecomesEqualToAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BecomesMemberOfAssignment <em>Becomes Member Of Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BecomesMemberOfAssignment
	 * @generated
	 */
	public Adapter createBecomesMemberOfAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BecomesSuchThatAssignment <em>Becomes Such That Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BecomesSuchThatAssignment
	 * @generated
	 */
	public Adapter createBecomesSuchThatAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.IntegerLiteralExpression <em>Integer Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.IntegerLiteralExpression
	 * @generated
	 */
	public Adapter createIntegerLiteralExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.IdentifierExpression <em>Identifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.IdentifierExpression
	 * @generated
	 */
	public Adapter createIdentifierExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BoundIdentifierExpression <em>Bound Identifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BoundIdentifierExpression
	 * @generated
	 */
	public Adapter createBoundIdentifierExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ForallPredicate <em>Forall Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ForallPredicate
	 * @generated
	 */
	public Adapter createForallPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ExistPredicate <em>Exist Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ExistPredicate
	 * @generated
	 */
	public Adapter createExistPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.LambdaExpression <em>Lambda Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.LambdaExpression
	 * @generated
	 */
	public Adapter createLambdaExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.QuantifiedUnionExpression1 <em>Quantified Union Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.QuantifiedUnionExpression1
	 * @generated
	 */
	public Adapter createQuantifiedUnionExpression1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.QuantifiedUnionExpression2 <em>Quantified Union Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.QuantifiedUnionExpression2
	 * @generated
	 */
	public Adapter createQuantifiedUnionExpression2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.QuantifiedIntersectionExpression1 <em>Quantified Intersection Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.QuantifiedIntersectionExpression1
	 * @generated
	 */
	public Adapter createQuantifiedIntersectionExpression1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.QuantifiedIntersectionExpression2 <em>Quantified Intersection Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.QuantifiedIntersectionExpression2
	 * @generated
	 */
	public Adapter createQuantifiedIntersectionExpression2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SetComprehensionExpression1 <em>Set Comprehension Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SetComprehensionExpression1
	 * @generated
	 */
	public Adapter createSetComprehensionExpression1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SetComprehensionExpression2 <em>Set Comprehension Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SetComprehensionExpression2
	 * @generated
	 */
	public Adapter createSetComprehensionExpression2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.INT <em>INT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.INT
	 * @generated
	 */
	public Adapter createINTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NAT <em>NAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NAT
	 * @generated
	 */
	public Adapter createNATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NAT1 <em>NAT1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NAT1
	 * @generated
	 */
	public Adapter createNAT1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BOOL <em>BOOL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BOOL
	 * @generated
	 */
	public Adapter createBOOLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TRUE <em>TRUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TRUE
	 * @generated
	 */
	public Adapter createTRUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.FALSE <em>FALSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.FALSE
	 * @generated
	 */
	public Adapter createFALSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.EMPTYSET <em>EMPTYSET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.EMPTYSET
	 * @generated
	 */
	public Adapter createEMPTYSETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TRUTH <em>TRUTH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TRUTH
	 * @generated
	 */
	public Adapter createTRUTHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.FALSITY <em>FALSITY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.FALSITY
	 * @generated
	 */
	public Adapter createFALSITYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SuccExpression <em>Succ Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SuccExpression
	 * @generated
	 */
	public Adapter createSuccExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.PredExpression <em>Pred Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.PredExpression
	 * @generated
	 */
	public Adapter createPredExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BoolExpression <em>Bool Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BoolExpression
	 * @generated
	 */
	public Adapter createBoolExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.CardExpression <em>Card Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.CardExpression
	 * @generated
	 */
	public Adapter createCardExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.PowExpression <em>Pow Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.PowExpression
	 * @generated
	 */
	public Adapter createPowExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.Pow1Expression <em>Pow1 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.Pow1Expression
	 * @generated
	 */
	public Adapter createPow1ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.KUnionExpression <em>KUnion Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.KUnionExpression
	 * @generated
	 */
	public Adapter createKUnionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.KIntersectionExpression <em>KIntersection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.KIntersectionExpression
	 * @generated
	 */
	public Adapter createKIntersectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.DomainExpression <em>Domain Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.DomainExpression
	 * @generated
	 */
	public Adapter createDomainExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.RangeExpression
	 * @generated
	 */
	public Adapter createRangeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.Prj1Expression <em>Prj1 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.Prj1Expression
	 * @generated
	 */
	public Adapter createPrj1ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.Prj1GenExpression <em>Prj1 Gen Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.Prj1GenExpression
	 * @generated
	 */
	public Adapter createPrj1GenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.Prj2Expression <em>Prj2 Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.Prj2Expression
	 * @generated
	 */
	public Adapter createPrj2ExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.Prj2GenExpression <em>Prj2 Gen Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.Prj2GenExpression
	 * @generated
	 */
	public Adapter createPrj2GenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.IdentityExpression <em>Identity Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.IdentityExpression
	 * @generated
	 */
	public Adapter createIdentityExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.IdentityGenExpression <em>Identity Gen Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.IdentityGenExpression
	 * @generated
	 */
	public Adapter createIdentityGenExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.UnaryMinusExpression <em>Unary Minus Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.UnaryMinusExpression
	 * @generated
	 */
	public Adapter createUnaryMinusExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.MinExpression <em>Min Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.MinExpression
	 * @generated
	 */
	public Adapter createMinExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.MaxExpression <em>Max Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.MaxExpression
	 * @generated
	 */
	public Adapter createMaxExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.InverseExpression <em>Inverse Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.InverseExpression
	 * @generated
	 */
	public Adapter createInverseExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NotPredicate <em>Not Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NotPredicate
	 * @generated
	 */
	public Adapter createNotPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.FinitePredicate <em>Finite Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.FinitePredicate
	 * @generated
	 */
	public Adapter createFinitePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ParallelProductExpression <em>Parallel Product Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ParallelProductExpression
	 * @generated
	 */
	public Adapter createParallelProductExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.RangeRestrictionExpression <em>Range Restriction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.RangeRestrictionExpression
	 * @generated
	 */
	public Adapter createRangeRestrictionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.RangeSubtractionExpression <em>Range Subtraction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.RangeSubtractionExpression
	 * @generated
	 */
	public Adapter createRangeSubtractionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.UptoExpression <em>Upto Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.UptoExpression
	 * @generated
	 */
	public Adapter createUptoExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ExponentiationExpression <em>Exponentiation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ExponentiationExpression
	 * @generated
	 */
	public Adapter createExponentiationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SetSubtractionExpression <em>Set Subtraction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SetSubtractionExpression
	 * @generated
	 */
	public Adapter createSetSubtractionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.FunctionExpression <em>Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.FunctionExpression
	 * @generated
	 */
	public Adapter createFunctionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ImageExpression <em>Image Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ImageExpression
	 * @generated
	 */
	public Adapter createImageExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ImplicationPredicate <em>Implication Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ImplicationPredicate
	 * @generated
	 */
	public Adapter createImplicationPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.EquivalencePredicate <em>Equivalence Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.EquivalencePredicate
	 * @generated
	 */
	public Adapter createEquivalencePredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.EqualPredicate <em>Equal Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.EqualPredicate
	 * @generated
	 */
	public Adapter createEqualPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NotEqualPredicate <em>Not Equal Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NotEqualPredicate
	 * @generated
	 */
	public Adapter createNotEqualPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BelongPredicate <em>Belong Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BelongPredicate
	 * @generated
	 */
	public Adapter createBelongPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NotBelongPredicate <em>Not Belong Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NotBelongPredicate
	 * @generated
	 */
	public Adapter createNotBelongPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SubsetStrictPredicate <em>Subset Strict Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SubsetStrictPredicate
	 * @generated
	 */
	public Adapter createSubsetStrictPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NotSubsetStrictPredicate <em>Not Subset Strict Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NotSubsetStrictPredicate
	 * @generated
	 */
	public Adapter createNotSubsetStrictPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SubsetPredicate <em>Subset Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SubsetPredicate
	 * @generated
	 */
	public Adapter createSubsetPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.NotSubsetPredicate <em>Not Subset Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.NotSubsetPredicate
	 * @generated
	 */
	public Adapter createNotSubsetPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.LessPredicate <em>Less Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.LessPredicate
	 * @generated
	 */
	public Adapter createLessPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.LessEqualPredicate <em>Less Equal Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.LessEqualPredicate
	 * @generated
	 */
	public Adapter createLessEqualPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.GreaterPredicate <em>Greater Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.GreaterPredicate
	 * @generated
	 */
	public Adapter createGreaterPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.GreaterEqualPredicate <em>Greater Equal Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.GreaterEqualPredicate
	 * @generated
	 */
	public Adapter createGreaterEqualPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.DomainRestrictionExpression <em>Domain Restriction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.DomainRestrictionExpression
	 * @generated
	 */
	public Adapter createDomainRestrictionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.DomainSubtractionExpression <em>Domain Subtraction Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.DomainSubtractionExpression
	 * @generated
	 */
	public Adapter createDomainSubtractionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.DirectProductExpression <em>Direct Product Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.DirectProductExpression
	 * @generated
	 */
	public Adapter createDirectProductExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.DivisionExpression <em>Division Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.DivisionExpression
	 * @generated
	 */
	public Adapter createDivisionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SubtractExpression <em>Subtract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SubtractExpression
	 * @generated
	 */
	public Adapter createSubtractExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ModuloExpression <em>Modulo Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ModuloExpression
	 * @generated
	 */
	public Adapter createModuloExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.CartesianProductExpression <em>Cartesian Product Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.CartesianProductExpression
	 * @generated
	 */
	public Adapter createCartesianProductExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.PartialFunctionExpression <em>Partial Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.PartialFunctionExpression
	 * @generated
	 */
	public Adapter createPartialFunctionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TotalFunctionExpression <em>Total Function Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TotalFunctionExpression
	 * @generated
	 */
	public Adapter createTotalFunctionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.RelationExpression <em>Relation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.RelationExpression
	 * @generated
	 */
	public Adapter createRelationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TotalSurjectionExpression <em>Total Surjection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TotalSurjectionExpression
	 * @generated
	 */
	public Adapter createTotalSurjectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TotalInjectionExpression <em>Total Injection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TotalInjectionExpression
	 * @generated
	 */
	public Adapter createTotalInjectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.PartialSurjectionExpression <em>Partial Surjection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.PartialSurjectionExpression
	 * @generated
	 */
	public Adapter createPartialSurjectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.PartialInjectionExpression <em>Partial Injection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.PartialInjectionExpression
	 * @generated
	 */
	public Adapter createPartialInjectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TotalBijectionExpression <em>Total Bijection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TotalBijectionExpression
	 * @generated
	 */
	public Adapter createTotalBijectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TotalRelationExpression <em>Total Relation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TotalRelationExpression
	 * @generated
	 */
	public Adapter createTotalRelationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SurjectiveRelationExpression <em>Surjective Relation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SurjectiveRelationExpression
	 * @generated
	 */
	public Adapter createSurjectiveRelationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.TotalSurjectiveRelationExpression <em>Total Surjective Relation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.TotalSurjectiveRelationExpression
	 * @generated
	 */
	public Adapter createTotalSurjectiveRelationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.MapletExpression <em>Maplet Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.MapletExpression
	 * @generated
	 */
	public Adapter createMapletExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.SetExpression <em>Set Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.SetExpression
	 * @generated
	 */
	public Adapter createSetExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.BackwardCompositionExpression <em>Backward Composition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.BackwardCompositionExpression
	 * @generated
	 */
	public Adapter createBackwardCompositionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.ForwardCompositionExpression <em>Forward Composition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.ForwardCompositionExpression
	 * @generated
	 */
	public Adapter createForwardCompositionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.RelationalOverridingExpression <em>Relational Overriding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.RelationalOverridingExpression
	 * @generated
	 */
	public Adapter createRelationalOverridingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.AndPredicate <em>And Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.AndPredicate
	 * @generated
	 */
	public Adapter createAndPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.OrPredicate <em>Or Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.OrPredicate
	 * @generated
	 */
	public Adapter createOrPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.AddExpression <em>Add Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.AddExpression
	 * @generated
	 */
	public Adapter createAddExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.MulExpression <em>Mul Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.MulExpression
	 * @generated
	 */
	public Adapter createMulExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.IntersectionExpression <em>Intersection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.IntersectionExpression
	 * @generated
	 */
	public Adapter createIntersectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.UnionExpression <em>Union Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.UnionExpression
	 * @generated
	 */
	public Adapter createUnionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.formulas.PartitionPredicate <em>Partition Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.formulas.PartitionPredicate
	 * @generated
	 */
	public Adapter createPartitionPredicateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.core.EventBObject <em>Event BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.core.EventBObject
	 * @generated
	 */
	public Adapter createEventBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.core.EventBElement <em>Event BElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.core.EventBElement
	 * @generated
	 */
	public Adapter createEventBElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.core.AbstractExtension <em>Abstract Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.core.AbstractExtension
	 * @generated
	 */
	public Adapter createAbstractExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eventb.emf.core.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eventb.emf.core.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FormulasAdapterFactory
