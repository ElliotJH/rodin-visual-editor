/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eventb.emf.formulas.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulasFactoryImpl extends EFactoryImpl implements FormulasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormulasFactory init() {
		try {
			FormulasFactory theFormulasFactory = (FormulasFactory)EPackage.Registry.INSTANCE.getEFactory("http://emf.eventb.org/models/core/formulas"); 
			if (theFormulasFactory != null) {
				return theFormulasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FormulasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FormulasPackage.BASSIGNMENT_RESOLVED: return createBAssignmentResolved();
			case FormulasPackage.MULTI_OPERAND: return createMultiOperand();
			case FormulasPackage.BECOMES_EQUAL_TO_ASSIGNMENT: return createBecomesEqualToAssignment();
			case FormulasPackage.BECOMES_MEMBER_OF_ASSIGNMENT: return createBecomesMemberOfAssignment();
			case FormulasPackage.BECOMES_SUCH_THAT_ASSIGNMENT: return createBecomesSuchThatAssignment();
			case FormulasPackage.INTEGER_LITERAL_EXPRESSION: return createIntegerLiteralExpression();
			case FormulasPackage.IDENTIFIER_EXPRESSION: return createIdentifierExpression();
			case FormulasPackage.BOUND_IDENTIFIER_EXPRESSION: return createBoundIdentifierExpression();
			case FormulasPackage.FORALL_PREDICATE: return createForallPredicate();
			case FormulasPackage.EXIST_PREDICATE: return createExistPredicate();
			case FormulasPackage.LAMBDA_EXPRESSION: return createLambdaExpression();
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION1: return createQuantifiedUnionExpression1();
			case FormulasPackage.QUANTIFIED_UNION_EXPRESSION2: return createQuantifiedUnionExpression2();
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION1: return createQuantifiedIntersectionExpression1();
			case FormulasPackage.QUANTIFIED_INTERSECTION_EXPRESSION2: return createQuantifiedIntersectionExpression2();
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION1: return createSetComprehensionExpression1();
			case FormulasPackage.SET_COMPREHENSION_EXPRESSION2: return createSetComprehensionExpression2();
			case FormulasPackage.INT: return createINT();
			case FormulasPackage.NAT: return createNAT();
			case FormulasPackage.NAT1: return createNAT1();
			case FormulasPackage.BOOL: return createBOOL();
			case FormulasPackage.TRUE: return createTRUE();
			case FormulasPackage.FALSE: return createFALSE();
			case FormulasPackage.EMPTYSET: return createEMPTYSET();
			case FormulasPackage.TRUTH: return createTRUTH();
			case FormulasPackage.FALSITY: return createFALSITY();
			case FormulasPackage.SUCC_EXPRESSION: return createSuccExpression();
			case FormulasPackage.PRED_EXPRESSION: return createPredExpression();
			case FormulasPackage.BOOL_EXPRESSION: return createBoolExpression();
			case FormulasPackage.CARD_EXPRESSION: return createCardExpression();
			case FormulasPackage.POW_EXPRESSION: return createPowExpression();
			case FormulasPackage.POW1_EXPRESSION: return createPow1Expression();
			case FormulasPackage.KUNION_EXPRESSION: return createKUnionExpression();
			case FormulasPackage.KINTERSECTION_EXPRESSION: return createKIntersectionExpression();
			case FormulasPackage.DOMAIN_EXPRESSION: return createDomainExpression();
			case FormulasPackage.RANGE_EXPRESSION: return createRangeExpression();
			case FormulasPackage.PRJ1_EXPRESSION: return createPrj1Expression();
			case FormulasPackage.PRJ1_GEN_EXPRESSION: return createPrj1GenExpression();
			case FormulasPackage.PRJ2_EXPRESSION: return createPrj2Expression();
			case FormulasPackage.PRJ2_GEN_EXPRESSION: return createPrj2GenExpression();
			case FormulasPackage.IDENTITY_EXPRESSION: return createIdentityExpression();
			case FormulasPackage.IDENTITY_GEN_EXPRESSION: return createIdentityGenExpression();
			case FormulasPackage.UNARY_MINUS_EXPRESSION: return createUnaryMinusExpression();
			case FormulasPackage.MIN_EXPRESSION: return createMinExpression();
			case FormulasPackage.MAX_EXPRESSION: return createMaxExpression();
			case FormulasPackage.INVERSE_EXPRESSION: return createInverseExpression();
			case FormulasPackage.NOT_PREDICATE: return createNotPredicate();
			case FormulasPackage.FINITE_PREDICATE: return createFinitePredicate();
			case FormulasPackage.PARALLEL_PRODUCT_EXPRESSION: return createParallelProductExpression();
			case FormulasPackage.RANGE_RESTRICTION_EXPRESSION: return createRangeRestrictionExpression();
			case FormulasPackage.RANGE_SUBTRACTION_EXPRESSION: return createRangeSubtractionExpression();
			case FormulasPackage.UPTO_EXPRESSION: return createUptoExpression();
			case FormulasPackage.EXPONENTIATION_EXPRESSION: return createExponentiationExpression();
			case FormulasPackage.SET_SUBTRACTION_EXPRESSION: return createSetSubtractionExpression();
			case FormulasPackage.FUNCTION_EXPRESSION: return createFunctionExpression();
			case FormulasPackage.IMAGE_EXPRESSION: return createImageExpression();
			case FormulasPackage.IMPLICATION_PREDICATE: return createImplicationPredicate();
			case FormulasPackage.EQUIVALENCE_PREDICATE: return createEquivalencePredicate();
			case FormulasPackage.EQUAL_PREDICATE: return createEqualPredicate();
			case FormulasPackage.NOT_EQUAL_PREDICATE: return createNotEqualPredicate();
			case FormulasPackage.BELONG_PREDICATE: return createBelongPredicate();
			case FormulasPackage.NOT_BELONG_PREDICATE: return createNotBelongPredicate();
			case FormulasPackage.SUBSET_STRICT_PREDICATE: return createSubsetStrictPredicate();
			case FormulasPackage.NOT_SUBSET_STRICT_PREDICATE: return createNotSubsetStrictPredicate();
			case FormulasPackage.SUBSET_PREDICATE: return createSubsetPredicate();
			case FormulasPackage.NOT_SUBSET_PREDICATE: return createNotSubsetPredicate();
			case FormulasPackage.LESS_PREDICATE: return createLessPredicate();
			case FormulasPackage.LESS_EQUAL_PREDICATE: return createLessEqualPredicate();
			case FormulasPackage.GREATER_PREDICATE: return createGreaterPredicate();
			case FormulasPackage.GREATER_EQUAL_PREDICATE: return createGreaterEqualPredicate();
			case FormulasPackage.DOMAIN_RESTRICTION_EXPRESSION: return createDomainRestrictionExpression();
			case FormulasPackage.DOMAIN_SUBTRACTION_EXPRESSION: return createDomainSubtractionExpression();
			case FormulasPackage.DIRECT_PRODUCT_EXPRESSION: return createDirectProductExpression();
			case FormulasPackage.DIVISION_EXPRESSION: return createDivisionExpression();
			case FormulasPackage.SUBTRACT_EXPRESSION: return createSubtractExpression();
			case FormulasPackage.MODULO_EXPRESSION: return createModuloExpression();
			case FormulasPackage.CARTESIAN_PRODUCT_EXPRESSION: return createCartesianProductExpression();
			case FormulasPackage.PARTIAL_FUNCTION_EXPRESSION: return createPartialFunctionExpression();
			case FormulasPackage.TOTAL_FUNCTION_EXPRESSION: return createTotalFunctionExpression();
			case FormulasPackage.RELATION_EXPRESSION: return createRelationExpression();
			case FormulasPackage.TOTAL_SURJECTION_EXPRESSION: return createTotalSurjectionExpression();
			case FormulasPackage.TOTAL_INJECTION_EXPRESSION: return createTotalInjectionExpression();
			case FormulasPackage.PARTIAL_SURJECTION_EXPRESSION: return createPartialSurjectionExpression();
			case FormulasPackage.PARTIAL_INJECTION_EXPRESSION: return createPartialInjectionExpression();
			case FormulasPackage.TOTAL_BIJECTION_EXPRESSION: return createTotalBijectionExpression();
			case FormulasPackage.TOTAL_RELATION_EXPRESSION: return createTotalRelationExpression();
			case FormulasPackage.SURJECTIVE_RELATION_EXPRESSION: return createSurjectiveRelationExpression();
			case FormulasPackage.TOTAL_SURJECTIVE_RELATION_EXPRESSION: return createTotalSurjectiveRelationExpression();
			case FormulasPackage.MAPLET_EXPRESSION: return createMapletExpression();
			case FormulasPackage.SET_EXPRESSION: return createSetExpression();
			case FormulasPackage.BACKWARD_COMPOSITION_EXPRESSION: return createBackwardCompositionExpression();
			case FormulasPackage.FORWARD_COMPOSITION_EXPRESSION: return createForwardCompositionExpression();
			case FormulasPackage.RELATIONAL_OVERRIDING_EXPRESSION: return createRelationalOverridingExpression();
			case FormulasPackage.AND_PREDICATE: return createAndPredicate();
			case FormulasPackage.OR_PREDICATE: return createOrPredicate();
			case FormulasPackage.ADD_EXPRESSION: return createAddExpression();
			case FormulasPackage.MUL_EXPRESSION: return createMulExpression();
			case FormulasPackage.INTERSECTION_EXPRESSION: return createIntersectionExpression();
			case FormulasPackage.UNION_EXPRESSION: return createUnionExpression();
			case FormulasPackage.PARTITION_PREDICATE: return createPartitionPredicate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAssignmentResolved createBAssignmentResolved() {
		BAssignmentResolvedImpl bAssignmentResolved = new BAssignmentResolvedImpl();
		return bAssignmentResolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiOperand createMultiOperand() {
		MultiOperandImpl multiOperand = new MultiOperandImpl();
		return multiOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BecomesEqualToAssignment createBecomesEqualToAssignment() {
		BecomesEqualToAssignmentImpl becomesEqualToAssignment = new BecomesEqualToAssignmentImpl();
		return becomesEqualToAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BecomesMemberOfAssignment createBecomesMemberOfAssignment() {
		BecomesMemberOfAssignmentImpl becomesMemberOfAssignment = new BecomesMemberOfAssignmentImpl();
		return becomesMemberOfAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BecomesSuchThatAssignment createBecomesSuchThatAssignment() {
		BecomesSuchThatAssignmentImpl becomesSuchThatAssignment = new BecomesSuchThatAssignmentImpl();
		return becomesSuchThatAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteralExpression createIntegerLiteralExpression() {
		IntegerLiteralExpressionImpl integerLiteralExpression = new IntegerLiteralExpressionImpl();
		return integerLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierExpression createIdentifierExpression() {
		IdentifierExpressionImpl identifierExpression = new IdentifierExpressionImpl();
		return identifierExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundIdentifierExpression createBoundIdentifierExpression() {
		BoundIdentifierExpressionImpl boundIdentifierExpression = new BoundIdentifierExpressionImpl();
		return boundIdentifierExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForallPredicate createForallPredicate() {
		ForallPredicateImpl forallPredicate = new ForallPredicateImpl();
		return forallPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistPredicate createExistPredicate() {
		ExistPredicateImpl existPredicate = new ExistPredicateImpl();
		return existPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LambdaExpression createLambdaExpression() {
		LambdaExpressionImpl lambdaExpression = new LambdaExpressionImpl();
		return lambdaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedUnionExpression1 createQuantifiedUnionExpression1() {
		QuantifiedUnionExpression1Impl quantifiedUnionExpression1 = new QuantifiedUnionExpression1Impl();
		return quantifiedUnionExpression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedUnionExpression2 createQuantifiedUnionExpression2() {
		QuantifiedUnionExpression2Impl quantifiedUnionExpression2 = new QuantifiedUnionExpression2Impl();
		return quantifiedUnionExpression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedIntersectionExpression1 createQuantifiedIntersectionExpression1() {
		QuantifiedIntersectionExpression1Impl quantifiedIntersectionExpression1 = new QuantifiedIntersectionExpression1Impl();
		return quantifiedIntersectionExpression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedIntersectionExpression2 createQuantifiedIntersectionExpression2() {
		QuantifiedIntersectionExpression2Impl quantifiedIntersectionExpression2 = new QuantifiedIntersectionExpression2Impl();
		return quantifiedIntersectionExpression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComprehensionExpression1 createSetComprehensionExpression1() {
		SetComprehensionExpression1Impl setComprehensionExpression1 = new SetComprehensionExpression1Impl();
		return setComprehensionExpression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComprehensionExpression2 createSetComprehensionExpression2() {
		SetComprehensionExpression2Impl setComprehensionExpression2 = new SetComprehensionExpression2Impl();
		return setComprehensionExpression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INT createINT() {
		INTImpl int_ = new INTImpl();
		return int_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NAT createNAT() {
		NATImpl nat = new NATImpl();
		return nat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NAT1 createNAT1() {
		NAT1Impl nat1 = new NAT1Impl();
		return nat1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOOL createBOOL() {
		BOOLImpl bool = new BOOLImpl();
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRUE createTRUE() {
		TRUEImpl true_ = new TRUEImpl();
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FALSE createFALSE() {
		FALSEImpl false_ = new FALSEImpl();
		return false_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPTYSET createEMPTYSET() {
		EMPTYSETImpl emptyset = new EMPTYSETImpl();
		return emptyset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRUTH createTRUTH() {
		TRUTHImpl truth = new TRUTHImpl();
		return truth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FALSITY createFALSITY() {
		FALSITYImpl falsity = new FALSITYImpl();
		return falsity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccExpression createSuccExpression() {
		SuccExpressionImpl succExpression = new SuccExpressionImpl();
		return succExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredExpression createPredExpression() {
		PredExpressionImpl predExpression = new PredExpressionImpl();
		return predExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoolExpression createBoolExpression() {
		BoolExpressionImpl boolExpression = new BoolExpressionImpl();
		return boolExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardExpression createCardExpression() {
		CardExpressionImpl cardExpression = new CardExpressionImpl();
		return cardExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowExpression createPowExpression() {
		PowExpressionImpl powExpression = new PowExpressionImpl();
		return powExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pow1Expression createPow1Expression() {
		Pow1ExpressionImpl pow1Expression = new Pow1ExpressionImpl();
		return pow1Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KUnionExpression createKUnionExpression() {
		KUnionExpressionImpl kUnionExpression = new KUnionExpressionImpl();
		return kUnionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KIntersectionExpression createKIntersectionExpression() {
		KIntersectionExpressionImpl kIntersectionExpression = new KIntersectionExpressionImpl();
		return kIntersectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainExpression createDomainExpression() {
		DomainExpressionImpl domainExpression = new DomainExpressionImpl();
		return domainExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prj1Expression createPrj1Expression() {
		Prj1ExpressionImpl prj1Expression = new Prj1ExpressionImpl();
		return prj1Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prj1GenExpression createPrj1GenExpression() {
		Prj1GenExpressionImpl prj1GenExpression = new Prj1GenExpressionImpl();
		return prj1GenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prj2Expression createPrj2Expression() {
		Prj2ExpressionImpl prj2Expression = new Prj2ExpressionImpl();
		return prj2Expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prj2GenExpression createPrj2GenExpression() {
		Prj2GenExpressionImpl prj2GenExpression = new Prj2GenExpressionImpl();
		return prj2GenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityExpression createIdentityExpression() {
		IdentityExpressionImpl identityExpression = new IdentityExpressionImpl();
		return identityExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityGenExpression createIdentityGenExpression() {
		IdentityGenExpressionImpl identityGenExpression = new IdentityGenExpressionImpl();
		return identityGenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryMinusExpression createUnaryMinusExpression() {
		UnaryMinusExpressionImpl unaryMinusExpression = new UnaryMinusExpressionImpl();
		return unaryMinusExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinExpression createMinExpression() {
		MinExpressionImpl minExpression = new MinExpressionImpl();
		return minExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxExpression createMaxExpression() {
		MaxExpressionImpl maxExpression = new MaxExpressionImpl();
		return maxExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseExpression createInverseExpression() {
		InverseExpressionImpl inverseExpression = new InverseExpressionImpl();
		return inverseExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotPredicate createNotPredicate() {
		NotPredicateImpl notPredicate = new NotPredicateImpl();
		return notPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinitePredicate createFinitePredicate() {
		FinitePredicateImpl finitePredicate = new FinitePredicateImpl();
		return finitePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelProductExpression createParallelProductExpression() {
		ParallelProductExpressionImpl parallelProductExpression = new ParallelProductExpressionImpl();
		return parallelProductExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeRestrictionExpression createRangeRestrictionExpression() {
		RangeRestrictionExpressionImpl rangeRestrictionExpression = new RangeRestrictionExpressionImpl();
		return rangeRestrictionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeSubtractionExpression createRangeSubtractionExpression() {
		RangeSubtractionExpressionImpl rangeSubtractionExpression = new RangeSubtractionExpressionImpl();
		return rangeSubtractionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UptoExpression createUptoExpression() {
		UptoExpressionImpl uptoExpression = new UptoExpressionImpl();
		return uptoExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExponentiationExpression createExponentiationExpression() {
		ExponentiationExpressionImpl exponentiationExpression = new ExponentiationExpressionImpl();
		return exponentiationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSubtractionExpression createSetSubtractionExpression() {
		SetSubtractionExpressionImpl setSubtractionExpression = new SetSubtractionExpressionImpl();
		return setSubtractionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionExpression createFunctionExpression() {
		FunctionExpressionImpl functionExpression = new FunctionExpressionImpl();
		return functionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageExpression createImageExpression() {
		ImageExpressionImpl imageExpression = new ImageExpressionImpl();
		return imageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationPredicate createImplicationPredicate() {
		ImplicationPredicateImpl implicationPredicate = new ImplicationPredicateImpl();
		return implicationPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EquivalencePredicate createEquivalencePredicate() {
		EquivalencePredicateImpl equivalencePredicate = new EquivalencePredicateImpl();
		return equivalencePredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualPredicate createEqualPredicate() {
		EqualPredicateImpl equalPredicate = new EqualPredicateImpl();
		return equalPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotEqualPredicate createNotEqualPredicate() {
		NotEqualPredicateImpl notEqualPredicate = new NotEqualPredicateImpl();
		return notEqualPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BelongPredicate createBelongPredicate() {
		BelongPredicateImpl belongPredicate = new BelongPredicateImpl();
		return belongPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotBelongPredicate createNotBelongPredicate() {
		NotBelongPredicateImpl notBelongPredicate = new NotBelongPredicateImpl();
		return notBelongPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetStrictPredicate createSubsetStrictPredicate() {
		SubsetStrictPredicateImpl subsetStrictPredicate = new SubsetStrictPredicateImpl();
		return subsetStrictPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotSubsetStrictPredicate createNotSubsetStrictPredicate() {
		NotSubsetStrictPredicateImpl notSubsetStrictPredicate = new NotSubsetStrictPredicateImpl();
		return notSubsetStrictPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetPredicate createSubsetPredicate() {
		SubsetPredicateImpl subsetPredicate = new SubsetPredicateImpl();
		return subsetPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotSubsetPredicate createNotSubsetPredicate() {
		NotSubsetPredicateImpl notSubsetPredicate = new NotSubsetPredicateImpl();
		return notSubsetPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessPredicate createLessPredicate() {
		LessPredicateImpl lessPredicate = new LessPredicateImpl();
		return lessPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessEqualPredicate createLessEqualPredicate() {
		LessEqualPredicateImpl lessEqualPredicate = new LessEqualPredicateImpl();
		return lessEqualPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterPredicate createGreaterPredicate() {
		GreaterPredicateImpl greaterPredicate = new GreaterPredicateImpl();
		return greaterPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterEqualPredicate createGreaterEqualPredicate() {
		GreaterEqualPredicateImpl greaterEqualPredicate = new GreaterEqualPredicateImpl();
		return greaterEqualPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainRestrictionExpression createDomainRestrictionExpression() {
		DomainRestrictionExpressionImpl domainRestrictionExpression = new DomainRestrictionExpressionImpl();
		return domainRestrictionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainSubtractionExpression createDomainSubtractionExpression() {
		DomainSubtractionExpressionImpl domainSubtractionExpression = new DomainSubtractionExpressionImpl();
		return domainSubtractionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectProductExpression createDirectProductExpression() {
		DirectProductExpressionImpl directProductExpression = new DirectProductExpressionImpl();
		return directProductExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionExpression createDivisionExpression() {
		DivisionExpressionImpl divisionExpression = new DivisionExpressionImpl();
		return divisionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtractExpression createSubtractExpression() {
		SubtractExpressionImpl subtractExpression = new SubtractExpressionImpl();
		return subtractExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuloExpression createModuloExpression() {
		ModuloExpressionImpl moduloExpression = new ModuloExpressionImpl();
		return moduloExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianProductExpression createCartesianProductExpression() {
		CartesianProductExpressionImpl cartesianProductExpression = new CartesianProductExpressionImpl();
		return cartesianProductExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialFunctionExpression createPartialFunctionExpression() {
		PartialFunctionExpressionImpl partialFunctionExpression = new PartialFunctionExpressionImpl();
		return partialFunctionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalFunctionExpression createTotalFunctionExpression() {
		TotalFunctionExpressionImpl totalFunctionExpression = new TotalFunctionExpressionImpl();
		return totalFunctionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationExpression createRelationExpression() {
		RelationExpressionImpl relationExpression = new RelationExpressionImpl();
		return relationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSurjectionExpression createTotalSurjectionExpression() {
		TotalSurjectionExpressionImpl totalSurjectionExpression = new TotalSurjectionExpressionImpl();
		return totalSurjectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalInjectionExpression createTotalInjectionExpression() {
		TotalInjectionExpressionImpl totalInjectionExpression = new TotalInjectionExpressionImpl();
		return totalInjectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialSurjectionExpression createPartialSurjectionExpression() {
		PartialSurjectionExpressionImpl partialSurjectionExpression = new PartialSurjectionExpressionImpl();
		return partialSurjectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialInjectionExpression createPartialInjectionExpression() {
		PartialInjectionExpressionImpl partialInjectionExpression = new PartialInjectionExpressionImpl();
		return partialInjectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalBijectionExpression createTotalBijectionExpression() {
		TotalBijectionExpressionImpl totalBijectionExpression = new TotalBijectionExpressionImpl();
		return totalBijectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalRelationExpression createTotalRelationExpression() {
		TotalRelationExpressionImpl totalRelationExpression = new TotalRelationExpressionImpl();
		return totalRelationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurjectiveRelationExpression createSurjectiveRelationExpression() {
		SurjectiveRelationExpressionImpl surjectiveRelationExpression = new SurjectiveRelationExpressionImpl();
		return surjectiveRelationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalSurjectiveRelationExpression createTotalSurjectiveRelationExpression() {
		TotalSurjectiveRelationExpressionImpl totalSurjectiveRelationExpression = new TotalSurjectiveRelationExpressionImpl();
		return totalSurjectiveRelationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapletExpression createMapletExpression() {
		MapletExpressionImpl mapletExpression = new MapletExpressionImpl();
		return mapletExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetExpression createSetExpression() {
		SetExpressionImpl setExpression = new SetExpressionImpl();
		return setExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackwardCompositionExpression createBackwardCompositionExpression() {
		BackwardCompositionExpressionImpl backwardCompositionExpression = new BackwardCompositionExpressionImpl();
		return backwardCompositionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardCompositionExpression createForwardCompositionExpression() {
		ForwardCompositionExpressionImpl forwardCompositionExpression = new ForwardCompositionExpressionImpl();
		return forwardCompositionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOverridingExpression createRelationalOverridingExpression() {
		RelationalOverridingExpressionImpl relationalOverridingExpression = new RelationalOverridingExpressionImpl();
		return relationalOverridingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndPredicate createAndPredicate() {
		AndPredicateImpl andPredicate = new AndPredicateImpl();
		return andPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrPredicate createOrPredicate() {
		OrPredicateImpl orPredicate = new OrPredicateImpl();
		return orPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddExpression createAddExpression() {
		AddExpressionImpl addExpression = new AddExpressionImpl();
		return addExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MulExpression createMulExpression() {
		MulExpressionImpl mulExpression = new MulExpressionImpl();
		return mulExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectionExpression createIntersectionExpression() {
		IntersectionExpressionImpl intersectionExpression = new IntersectionExpressionImpl();
		return intersectionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionExpression createUnionExpression() {
		UnionExpressionImpl unionExpression = new UnionExpressionImpl();
		return unionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionPredicate createPartitionPredicate() {
		PartitionPredicateImpl partitionPredicate = new PartitionPredicateImpl();
		return partitionPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulasPackage getFormulasPackage() {
		return (FormulasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FormulasPackage getPackage() {
		return FormulasPackage.eINSTANCE;
	}

} //FormulasFactoryImpl
