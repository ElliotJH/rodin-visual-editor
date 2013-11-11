/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eventb.emf.formulas.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

import org.eventb.emf.formulas.AddExpression;
import org.eventb.emf.formulas.AndPredicate;
import org.eventb.emf.formulas.BAssignmentResolved;
import org.eventb.emf.formulas.BExpressionResolved;
import org.eventb.emf.formulas.BFormula;
import org.eventb.emf.formulas.BPredicateResolved;
import org.eventb.emf.formulas.BackwardCompositionExpression;
import org.eventb.emf.formulas.BecomesEqualToAssignment;
import org.eventb.emf.formulas.BecomesMemberOfAssignment;
import org.eventb.emf.formulas.BecomesSuchThatAssignment;
import org.eventb.emf.formulas.BelongPredicate;
import org.eventb.emf.formulas.BinaryOperator;
import org.eventb.emf.formulas.BoolExpression;
import org.eventb.emf.formulas.BoundIdentifierExpression;
import org.eventb.emf.formulas.CardExpression;
import org.eventb.emf.formulas.CartesianProductExpression;
import org.eventb.emf.formulas.Constant;
import org.eventb.emf.formulas.DirectProductExpression;
import org.eventb.emf.formulas.DivisionExpression;
import org.eventb.emf.formulas.DomainExpression;
import org.eventb.emf.formulas.DomainRestrictionExpression;
import org.eventb.emf.formulas.DomainSubtractionExpression;
import org.eventb.emf.formulas.EqualPredicate;
import org.eventb.emf.formulas.EquivalencePredicate;
import org.eventb.emf.formulas.ExistPredicate;
import org.eventb.emf.formulas.ExponentiationExpression;
import org.eventb.emf.formulas.FinitePredicate;
import org.eventb.emf.formulas.ForallPredicate;
import org.eventb.emf.formulas.FormulasFactory;
import org.eventb.emf.formulas.FormulasPackage;
import org.eventb.emf.formulas.ForwardCompositionExpression;
import org.eventb.emf.formulas.FunctionExpression;
import org.eventb.emf.formulas.GreaterEqualPredicate;
import org.eventb.emf.formulas.GreaterPredicate;
import org.eventb.emf.formulas.IdentifierExpression;
import org.eventb.emf.formulas.IdentityExpression;
import org.eventb.emf.formulas.IdentityGenExpression;
import org.eventb.emf.formulas.ImageExpression;
import org.eventb.emf.formulas.ImplicationPredicate;
import org.eventb.emf.formulas.IntegerLiteralExpression;
import org.eventb.emf.formulas.IntersectionExpression;
import org.eventb.emf.formulas.InverseExpression;
import org.eventb.emf.formulas.KIntersectionExpression;
import org.eventb.emf.formulas.KUnionExpression;
import org.eventb.emf.formulas.LambdaExpression;
import org.eventb.emf.formulas.LessEqualPredicate;
import org.eventb.emf.formulas.LessPredicate;
import org.eventb.emf.formulas.MapletExpression;
import org.eventb.emf.formulas.MaxExpression;
import org.eventb.emf.formulas.MinExpression;
import org.eventb.emf.formulas.ModuloExpression;
import org.eventb.emf.formulas.MulExpression;
import org.eventb.emf.formulas.MultiOperand;
import org.eventb.emf.formulas.NotBelongPredicate;
import org.eventb.emf.formulas.NotEqualPredicate;
import org.eventb.emf.formulas.NotPredicate;
import org.eventb.emf.formulas.NotSubsetPredicate;
import org.eventb.emf.formulas.NotSubsetStrictPredicate;
import org.eventb.emf.formulas.OrPredicate;
import org.eventb.emf.formulas.ParallelProductExpression;
import org.eventb.emf.formulas.PartialFunctionExpression;
import org.eventb.emf.formulas.PartialInjectionExpression;
import org.eventb.emf.formulas.PartialSurjectionExpression;
import org.eventb.emf.formulas.PartitionPredicate;
import org.eventb.emf.formulas.Pow1Expression;
import org.eventb.emf.formulas.PowExpression;
import org.eventb.emf.formulas.PredExpression;
import org.eventb.emf.formulas.Prj1Expression;
import org.eventb.emf.formulas.Prj1GenExpression;
import org.eventb.emf.formulas.Prj2Expression;
import org.eventb.emf.formulas.Prj2GenExpression;
import org.eventb.emf.formulas.QuantifiedIntersectionExpression1;
import org.eventb.emf.formulas.QuantifiedIntersectionExpression2;
import org.eventb.emf.formulas.QuantifiedUnionExpression1;
import org.eventb.emf.formulas.QuantifiedUnionExpression2;
import org.eventb.emf.formulas.RangeExpression;
import org.eventb.emf.formulas.RangeRestrictionExpression;
import org.eventb.emf.formulas.RangeSubtractionExpression;
import org.eventb.emf.formulas.RelationExpression;
import org.eventb.emf.formulas.RelationalOverridingExpression;
import org.eventb.emf.formulas.SetComprehensionExpression1;
import org.eventb.emf.formulas.SetComprehensionExpression2;
import org.eventb.emf.formulas.SetExpression;
import org.eventb.emf.formulas.SetSubtractionExpression;
import org.eventb.emf.formulas.SubsetPredicate;
import org.eventb.emf.formulas.SubsetStrictPredicate;
import org.eventb.emf.formulas.SubtractExpression;
import org.eventb.emf.formulas.SuccExpression;
import org.eventb.emf.formulas.SurjectiveRelationExpression;
import org.eventb.emf.formulas.TotalBijectionExpression;
import org.eventb.emf.formulas.TotalFunctionExpression;
import org.eventb.emf.formulas.TotalInjectionExpression;
import org.eventb.emf.formulas.TotalRelationExpression;
import org.eventb.emf.formulas.TotalSurjectionExpression;
import org.eventb.emf.formulas.TotalSurjectiveRelationExpression;
import org.eventb.emf.formulas.UnaryMinusExpression;
import org.eventb.emf.formulas.UnaryOperator;
import org.eventb.emf.formulas.UnionExpression;
import org.eventb.emf.formulas.UptoExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormulasPackageImpl extends EPackageImpl implements FormulasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bExpressionResolvedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPredicateResolvedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bAssignmentResolvedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass becomesEqualToAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass becomesMemberOfAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass becomesSuchThatAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundIdentifierExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forallPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedUnionExpression1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedUnionExpression2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedIntersectionExpression1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifiedIntersectionExpression2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComprehensionExpression1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComprehensionExpression2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nat1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptysetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass truthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass falsityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass succExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pow1ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kUnionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kIntersectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prj1ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prj1GenExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prj2ExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prj2GenExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityGenExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryMinusExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inverseExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finitePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelProductExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeRestrictionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeSubtractionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uptoExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exponentiationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setSubtractionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equivalencePredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEqualPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass belongPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notBelongPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetStrictPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notSubsetStrictPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notSubsetPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessEqualPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEqualPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainRestrictionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainSubtractionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directProductExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtractExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianProductExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialFunctionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalFunctionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalSurjectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalInjectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialSurjectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialInjectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalBijectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalRelationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surjectiveRelationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalSurjectiveRelationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapletExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backwardCompositionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardCompositionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalOverridingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orPredicateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mulExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partitionPredicateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eventb.emf.formulas.FormulasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormulasPackageImpl() {
		super(eNS_URI, FormulasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FormulasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormulasPackage init() {
		if (isInited) return (FormulasPackage)EPackage.Registry.INSTANCE.getEPackage(FormulasPackage.eNS_URI);

		// Obtain or create and register package
		FormulasPackageImpl theFormulasPackage = (FormulasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormulasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormulasPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFormulasPackage.createPackageContents();

		// Initialize created meta-data
		theFormulasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFormulasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormulasPackage.eNS_URI, theFormulasPackage);
		return theFormulasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBFormula() {
		return bFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBExpressionResolved() {
		return bExpressionResolvedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPredicateResolved() {
		return bPredicateResolvedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBAssignmentResolved() {
		return bAssignmentResolvedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBAssignmentResolved_Identifiers() {
		return (EReference)bAssignmentResolvedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryOperator() {
		return unaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryOperator_Child() {
		return (EReference)unaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOperator() {
		return binaryOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperator_Left() {
		return (EReference)binaryOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOperator_Right() {
		return (EReference)binaryOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiOperand() {
		return multiOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiOperand_Children() {
		return (EReference)multiOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBecomesEqualToAssignment() {
		return becomesEqualToAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBecomesEqualToAssignment_Expressions() {
		return (EReference)becomesEqualToAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBecomesMemberOfAssignment() {
		return becomesMemberOfAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBecomesMemberOfAssignment_Expression() {
		return (EReference)becomesMemberOfAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBecomesSuchThatAssignment() {
		return becomesSuchThatAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBecomesSuchThatAssignment_Predicate() {
		return (EReference)becomesSuchThatAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerLiteralExpression() {
		return integerLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerLiteralExpression_Number() {
		return (EAttribute)integerLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierExpression() {
		return identifierExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierExpression_Name() {
		return (EAttribute)identifierExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundIdentifierExpression() {
		return boundIdentifierExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForallPredicate() {
		return forallPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForallPredicate_Identifiers() {
		return (EReference)forallPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForallPredicate_Predicate() {
		return (EReference)forallPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistPredicate() {
		return existPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistPredicate_Identifiers() {
		return (EReference)existPredicateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistPredicate_Predicate() {
		return (EReference)existPredicateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLambdaExpression() {
		return lambdaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Ident_pattern() {
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Predicate() {
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLambdaExpression_Expression() {
		return (EReference)lambdaExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedUnionExpression1() {
		return quantifiedUnionExpression1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedUnionExpression1_Identifiers() {
		return (EReference)quantifiedUnionExpression1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedUnionExpression1_Predicate() {
		return (EReference)quantifiedUnionExpression1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedUnionExpression1_Expression() {
		return (EReference)quantifiedUnionExpression1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedUnionExpression2() {
		return quantifiedUnionExpression2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedUnionExpression2_Predicate() {
		return (EReference)quantifiedUnionExpression2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedUnionExpression2_Expression() {
		return (EReference)quantifiedUnionExpression2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedIntersectionExpression1() {
		return quantifiedIntersectionExpression1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedIntersectionExpression1_Identifiers() {
		return (EReference)quantifiedIntersectionExpression1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedIntersectionExpression1_Predicate() {
		return (EReference)quantifiedIntersectionExpression1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedIntersectionExpression1_Expression() {
		return (EReference)quantifiedIntersectionExpression1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantifiedIntersectionExpression2() {
		return quantifiedIntersectionExpression2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedIntersectionExpression2_Predicate() {
		return (EReference)quantifiedIntersectionExpression2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantifiedIntersectionExpression2_Expression() {
		return (EReference)quantifiedIntersectionExpression2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComprehensionExpression1() {
		return setComprehensionExpression1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehensionExpression1_Identifiers() {
		return (EReference)setComprehensionExpression1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehensionExpression1_Predicate() {
		return (EReference)setComprehensionExpression1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehensionExpression1_Expression() {
		return (EReference)setComprehensionExpression1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComprehensionExpression2() {
		return setComprehensionExpression2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehensionExpression2_Predicate() {
		return (EReference)setComprehensionExpression2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComprehensionExpression2_Expression() {
		return (EReference)setComprehensionExpression2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINT() {
		return intEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNAT() {
		return natEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNAT1() {
		return nat1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOOL() {
		return boolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRUE() {
		return trueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFALSE() {
		return falseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMPTYSET() {
		return emptysetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRUTH() {
		return truthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFALSITY() {
		return falsityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSuccExpression() {
		return succExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredExpression() {
		return predExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolExpression() {
		return boolExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardExpression() {
		return cardExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowExpression() {
		return powExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPow1Expression() {
		return pow1ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKUnionExpression() {
		return kUnionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKIntersectionExpression() {
		return kIntersectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainExpression() {
		return domainExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeExpression() {
		return rangeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrj1Expression() {
		return prj1ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrj1GenExpression() {
		return prj1GenExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrj2Expression() {
		return prj2ExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrj2GenExpression() {
		return prj2GenExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityExpression() {
		return identityExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityGenExpression() {
		return identityGenExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryMinusExpression() {
		return unaryMinusExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinExpression() {
		return minExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxExpression() {
		return maxExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInverseExpression() {
		return inverseExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotPredicate() {
		return notPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinitePredicate() {
		return finitePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelProductExpression() {
		return parallelProductExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeRestrictionExpression() {
		return rangeRestrictionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeSubtractionExpression() {
		return rangeSubtractionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUptoExpression() {
		return uptoExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExponentiationExpression() {
		return exponentiationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetSubtractionExpression() {
		return setSubtractionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionExpression() {
		return functionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageExpression() {
		return imageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicationPredicate() {
		return implicationPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquivalencePredicate() {
		return equivalencePredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualPredicate() {
		return equalPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotEqualPredicate() {
		return notEqualPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBelongPredicate() {
		return belongPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotBelongPredicate() {
		return notBelongPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsetStrictPredicate() {
		return subsetStrictPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotSubsetStrictPredicate() {
		return notSubsetStrictPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsetPredicate() {
		return subsetPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotSubsetPredicate() {
		return notSubsetPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessPredicate() {
		return lessPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLessEqualPredicate() {
		return lessEqualPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterPredicate() {
		return greaterPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreaterEqualPredicate() {
		return greaterEqualPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainRestrictionExpression() {
		return domainRestrictionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainSubtractionExpression() {
		return domainSubtractionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectProductExpression() {
		return directProductExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivisionExpression() {
		return divisionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtractExpression() {
		return subtractExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuloExpression() {
		return moduloExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianProductExpression() {
		return cartesianProductExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialFunctionExpression() {
		return partialFunctionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalFunctionExpression() {
		return totalFunctionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationExpression() {
		return relationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalSurjectionExpression() {
		return totalSurjectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalInjectionExpression() {
		return totalInjectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialSurjectionExpression() {
		return partialSurjectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialInjectionExpression() {
		return partialInjectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalBijectionExpression() {
		return totalBijectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalRelationExpression() {
		return totalRelationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurjectiveRelationExpression() {
		return surjectiveRelationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalSurjectiveRelationExpression() {
		return totalSurjectiveRelationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapletExpression() {
		return mapletExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetExpression() {
		return setExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackwardCompositionExpression() {
		return backwardCompositionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardCompositionExpression() {
		return forwardCompositionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalOverridingExpression() {
		return relationalOverridingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndPredicate() {
		return andPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrPredicate() {
		return orPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddExpression() {
		return addExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMulExpression() {
		return mulExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntersectionExpression() {
		return intersectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionExpression() {
		return unionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartitionPredicate() {
		return partitionPredicateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormulasFactory getFormulasFactory() {
		return (FormulasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bFormulaEClass = createEClass(BFORMULA);

		bExpressionResolvedEClass = createEClass(BEXPRESSION_RESOLVED);

		bPredicateResolvedEClass = createEClass(BPREDICATE_RESOLVED);

		bAssignmentResolvedEClass = createEClass(BASSIGNMENT_RESOLVED);
		createEReference(bAssignmentResolvedEClass, BASSIGNMENT_RESOLVED__IDENTIFIERS);

		constantEClass = createEClass(CONSTANT);

		unaryOperatorEClass = createEClass(UNARY_OPERATOR);
		createEReference(unaryOperatorEClass, UNARY_OPERATOR__CHILD);

		binaryOperatorEClass = createEClass(BINARY_OPERATOR);
		createEReference(binaryOperatorEClass, BINARY_OPERATOR__LEFT);
		createEReference(binaryOperatorEClass, BINARY_OPERATOR__RIGHT);

		multiOperandEClass = createEClass(MULTI_OPERAND);
		createEReference(multiOperandEClass, MULTI_OPERAND__CHILDREN);

		becomesEqualToAssignmentEClass = createEClass(BECOMES_EQUAL_TO_ASSIGNMENT);
		createEReference(becomesEqualToAssignmentEClass, BECOMES_EQUAL_TO_ASSIGNMENT__EXPRESSIONS);

		becomesMemberOfAssignmentEClass = createEClass(BECOMES_MEMBER_OF_ASSIGNMENT);
		createEReference(becomesMemberOfAssignmentEClass, BECOMES_MEMBER_OF_ASSIGNMENT__EXPRESSION);

		becomesSuchThatAssignmentEClass = createEClass(BECOMES_SUCH_THAT_ASSIGNMENT);
		createEReference(becomesSuchThatAssignmentEClass, BECOMES_SUCH_THAT_ASSIGNMENT__PREDICATE);

		integerLiteralExpressionEClass = createEClass(INTEGER_LITERAL_EXPRESSION);
		createEAttribute(integerLiteralExpressionEClass, INTEGER_LITERAL_EXPRESSION__NUMBER);

		identifierExpressionEClass = createEClass(IDENTIFIER_EXPRESSION);
		createEAttribute(identifierExpressionEClass, IDENTIFIER_EXPRESSION__NAME);

		boundIdentifierExpressionEClass = createEClass(BOUND_IDENTIFIER_EXPRESSION);

		forallPredicateEClass = createEClass(FORALL_PREDICATE);
		createEReference(forallPredicateEClass, FORALL_PREDICATE__IDENTIFIERS);
		createEReference(forallPredicateEClass, FORALL_PREDICATE__PREDICATE);

		existPredicateEClass = createEClass(EXIST_PREDICATE);
		createEReference(existPredicateEClass, EXIST_PREDICATE__IDENTIFIERS);
		createEReference(existPredicateEClass, EXIST_PREDICATE__PREDICATE);

		lambdaExpressionEClass = createEClass(LAMBDA_EXPRESSION);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__IDENT_PATTERN);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__PREDICATE);
		createEReference(lambdaExpressionEClass, LAMBDA_EXPRESSION__EXPRESSION);

		quantifiedUnionExpression1EClass = createEClass(QUANTIFIED_UNION_EXPRESSION1);
		createEReference(quantifiedUnionExpression1EClass, QUANTIFIED_UNION_EXPRESSION1__IDENTIFIERS);
		createEReference(quantifiedUnionExpression1EClass, QUANTIFIED_UNION_EXPRESSION1__PREDICATE);
		createEReference(quantifiedUnionExpression1EClass, QUANTIFIED_UNION_EXPRESSION1__EXPRESSION);

		quantifiedUnionExpression2EClass = createEClass(QUANTIFIED_UNION_EXPRESSION2);
		createEReference(quantifiedUnionExpression2EClass, QUANTIFIED_UNION_EXPRESSION2__PREDICATE);
		createEReference(quantifiedUnionExpression2EClass, QUANTIFIED_UNION_EXPRESSION2__EXPRESSION);

		quantifiedIntersectionExpression1EClass = createEClass(QUANTIFIED_INTERSECTION_EXPRESSION1);
		createEReference(quantifiedIntersectionExpression1EClass, QUANTIFIED_INTERSECTION_EXPRESSION1__IDENTIFIERS);
		createEReference(quantifiedIntersectionExpression1EClass, QUANTIFIED_INTERSECTION_EXPRESSION1__PREDICATE);
		createEReference(quantifiedIntersectionExpression1EClass, QUANTIFIED_INTERSECTION_EXPRESSION1__EXPRESSION);

		quantifiedIntersectionExpression2EClass = createEClass(QUANTIFIED_INTERSECTION_EXPRESSION2);
		createEReference(quantifiedIntersectionExpression2EClass, QUANTIFIED_INTERSECTION_EXPRESSION2__PREDICATE);
		createEReference(quantifiedIntersectionExpression2EClass, QUANTIFIED_INTERSECTION_EXPRESSION2__EXPRESSION);

		setComprehensionExpression1EClass = createEClass(SET_COMPREHENSION_EXPRESSION1);
		createEReference(setComprehensionExpression1EClass, SET_COMPREHENSION_EXPRESSION1__IDENTIFIERS);
		createEReference(setComprehensionExpression1EClass, SET_COMPREHENSION_EXPRESSION1__PREDICATE);
		createEReference(setComprehensionExpression1EClass, SET_COMPREHENSION_EXPRESSION1__EXPRESSION);

		setComprehensionExpression2EClass = createEClass(SET_COMPREHENSION_EXPRESSION2);
		createEReference(setComprehensionExpression2EClass, SET_COMPREHENSION_EXPRESSION2__PREDICATE);
		createEReference(setComprehensionExpression2EClass, SET_COMPREHENSION_EXPRESSION2__EXPRESSION);

		intEClass = createEClass(INT);

		natEClass = createEClass(NAT);

		nat1EClass = createEClass(NAT1);

		boolEClass = createEClass(BOOL);

		trueEClass = createEClass(TRUE);

		falseEClass = createEClass(FALSE);

		emptysetEClass = createEClass(EMPTYSET);

		truthEClass = createEClass(TRUTH);

		falsityEClass = createEClass(FALSITY);

		succExpressionEClass = createEClass(SUCC_EXPRESSION);

		predExpressionEClass = createEClass(PRED_EXPRESSION);

		boolExpressionEClass = createEClass(BOOL_EXPRESSION);

		cardExpressionEClass = createEClass(CARD_EXPRESSION);

		powExpressionEClass = createEClass(POW_EXPRESSION);

		pow1ExpressionEClass = createEClass(POW1_EXPRESSION);

		kUnionExpressionEClass = createEClass(KUNION_EXPRESSION);

		kIntersectionExpressionEClass = createEClass(KINTERSECTION_EXPRESSION);

		domainExpressionEClass = createEClass(DOMAIN_EXPRESSION);

		rangeExpressionEClass = createEClass(RANGE_EXPRESSION);

		prj1ExpressionEClass = createEClass(PRJ1_EXPRESSION);

		prj1GenExpressionEClass = createEClass(PRJ1_GEN_EXPRESSION);

		prj2ExpressionEClass = createEClass(PRJ2_EXPRESSION);

		prj2GenExpressionEClass = createEClass(PRJ2_GEN_EXPRESSION);

		identityExpressionEClass = createEClass(IDENTITY_EXPRESSION);

		identityGenExpressionEClass = createEClass(IDENTITY_GEN_EXPRESSION);

		unaryMinusExpressionEClass = createEClass(UNARY_MINUS_EXPRESSION);

		minExpressionEClass = createEClass(MIN_EXPRESSION);

		maxExpressionEClass = createEClass(MAX_EXPRESSION);

		inverseExpressionEClass = createEClass(INVERSE_EXPRESSION);

		notPredicateEClass = createEClass(NOT_PREDICATE);

		finitePredicateEClass = createEClass(FINITE_PREDICATE);

		parallelProductExpressionEClass = createEClass(PARALLEL_PRODUCT_EXPRESSION);

		rangeRestrictionExpressionEClass = createEClass(RANGE_RESTRICTION_EXPRESSION);

		rangeSubtractionExpressionEClass = createEClass(RANGE_SUBTRACTION_EXPRESSION);

		uptoExpressionEClass = createEClass(UPTO_EXPRESSION);

		exponentiationExpressionEClass = createEClass(EXPONENTIATION_EXPRESSION);

		setSubtractionExpressionEClass = createEClass(SET_SUBTRACTION_EXPRESSION);

		functionExpressionEClass = createEClass(FUNCTION_EXPRESSION);

		imageExpressionEClass = createEClass(IMAGE_EXPRESSION);

		implicationPredicateEClass = createEClass(IMPLICATION_PREDICATE);

		equivalencePredicateEClass = createEClass(EQUIVALENCE_PREDICATE);

		equalPredicateEClass = createEClass(EQUAL_PREDICATE);

		notEqualPredicateEClass = createEClass(NOT_EQUAL_PREDICATE);

		belongPredicateEClass = createEClass(BELONG_PREDICATE);

		notBelongPredicateEClass = createEClass(NOT_BELONG_PREDICATE);

		subsetStrictPredicateEClass = createEClass(SUBSET_STRICT_PREDICATE);

		notSubsetStrictPredicateEClass = createEClass(NOT_SUBSET_STRICT_PREDICATE);

		subsetPredicateEClass = createEClass(SUBSET_PREDICATE);

		notSubsetPredicateEClass = createEClass(NOT_SUBSET_PREDICATE);

		lessPredicateEClass = createEClass(LESS_PREDICATE);

		lessEqualPredicateEClass = createEClass(LESS_EQUAL_PREDICATE);

		greaterPredicateEClass = createEClass(GREATER_PREDICATE);

		greaterEqualPredicateEClass = createEClass(GREATER_EQUAL_PREDICATE);

		domainRestrictionExpressionEClass = createEClass(DOMAIN_RESTRICTION_EXPRESSION);

		domainSubtractionExpressionEClass = createEClass(DOMAIN_SUBTRACTION_EXPRESSION);

		directProductExpressionEClass = createEClass(DIRECT_PRODUCT_EXPRESSION);

		divisionExpressionEClass = createEClass(DIVISION_EXPRESSION);

		subtractExpressionEClass = createEClass(SUBTRACT_EXPRESSION);

		moduloExpressionEClass = createEClass(MODULO_EXPRESSION);

		cartesianProductExpressionEClass = createEClass(CARTESIAN_PRODUCT_EXPRESSION);

		partialFunctionExpressionEClass = createEClass(PARTIAL_FUNCTION_EXPRESSION);

		totalFunctionExpressionEClass = createEClass(TOTAL_FUNCTION_EXPRESSION);

		relationExpressionEClass = createEClass(RELATION_EXPRESSION);

		totalSurjectionExpressionEClass = createEClass(TOTAL_SURJECTION_EXPRESSION);

		totalInjectionExpressionEClass = createEClass(TOTAL_INJECTION_EXPRESSION);

		partialSurjectionExpressionEClass = createEClass(PARTIAL_SURJECTION_EXPRESSION);

		partialInjectionExpressionEClass = createEClass(PARTIAL_INJECTION_EXPRESSION);

		totalBijectionExpressionEClass = createEClass(TOTAL_BIJECTION_EXPRESSION);

		totalRelationExpressionEClass = createEClass(TOTAL_RELATION_EXPRESSION);

		surjectiveRelationExpressionEClass = createEClass(SURJECTIVE_RELATION_EXPRESSION);

		totalSurjectiveRelationExpressionEClass = createEClass(TOTAL_SURJECTIVE_RELATION_EXPRESSION);

		mapletExpressionEClass = createEClass(MAPLET_EXPRESSION);

		setExpressionEClass = createEClass(SET_EXPRESSION);

		backwardCompositionExpressionEClass = createEClass(BACKWARD_COMPOSITION_EXPRESSION);

		forwardCompositionExpressionEClass = createEClass(FORWARD_COMPOSITION_EXPRESSION);

		relationalOverridingExpressionEClass = createEClass(RELATIONAL_OVERRIDING_EXPRESSION);

		andPredicateEClass = createEClass(AND_PREDICATE);

		orPredicateEClass = createEClass(OR_PREDICATE);

		addExpressionEClass = createEClass(ADD_EXPRESSION);

		mulExpressionEClass = createEClass(MUL_EXPRESSION);

		intersectionExpressionEClass = createEClass(INTERSECTION_EXPRESSION);

		unionExpressionEClass = createEClass(UNION_EXPRESSION);

		partitionPredicateEClass = createEClass(PARTITION_PREDICATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bFormulaEClass.getESuperTypes().add(theCorePackage.getExtension());
		bExpressionResolvedEClass.getESuperTypes().add(this.getBFormula());
		bPredicateResolvedEClass.getESuperTypes().add(this.getBFormula());
		bAssignmentResolvedEClass.getESuperTypes().add(this.getBFormula());
		constantEClass.getESuperTypes().add(this.getBFormula());
		unaryOperatorEClass.getESuperTypes().add(this.getBFormula());
		binaryOperatorEClass.getESuperTypes().add(this.getBFormula());
		multiOperandEClass.getESuperTypes().add(this.getBFormula());
		becomesEqualToAssignmentEClass.getESuperTypes().add(this.getBAssignmentResolved());
		becomesMemberOfAssignmentEClass.getESuperTypes().add(this.getBAssignmentResolved());
		becomesSuchThatAssignmentEClass.getESuperTypes().add(this.getBAssignmentResolved());
		integerLiteralExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		identifierExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		boundIdentifierExpressionEClass.getESuperTypes().add(this.getIdentifierExpression());
		forallPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		existPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		lambdaExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		quantifiedUnionExpression1EClass.getESuperTypes().add(this.getBExpressionResolved());
		quantifiedUnionExpression2EClass.getESuperTypes().add(this.getBExpressionResolved());
		quantifiedIntersectionExpression1EClass.getESuperTypes().add(this.getBExpressionResolved());
		quantifiedIntersectionExpression2EClass.getESuperTypes().add(this.getBExpressionResolved());
		setComprehensionExpression1EClass.getESuperTypes().add(this.getBExpressionResolved());
		setComprehensionExpression2EClass.getESuperTypes().add(this.getBExpressionResolved());
		intEClass.getESuperTypes().add(this.getConstant());
		intEClass.getESuperTypes().add(this.getBExpressionResolved());
		natEClass.getESuperTypes().add(this.getConstant());
		natEClass.getESuperTypes().add(this.getBExpressionResolved());
		nat1EClass.getESuperTypes().add(this.getConstant());
		nat1EClass.getESuperTypes().add(this.getBExpressionResolved());
		boolEClass.getESuperTypes().add(this.getConstant());
		boolEClass.getESuperTypes().add(this.getBExpressionResolved());
		trueEClass.getESuperTypes().add(this.getConstant());
		trueEClass.getESuperTypes().add(this.getBExpressionResolved());
		falseEClass.getESuperTypes().add(this.getConstant());
		falseEClass.getESuperTypes().add(this.getBExpressionResolved());
		emptysetEClass.getESuperTypes().add(this.getConstant());
		emptysetEClass.getESuperTypes().add(this.getBExpressionResolved());
		truthEClass.getESuperTypes().add(this.getConstant());
		truthEClass.getESuperTypes().add(this.getBPredicateResolved());
		falsityEClass.getESuperTypes().add(this.getConstant());
		falsityEClass.getESuperTypes().add(this.getBPredicateResolved());
		succExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		predExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		boolExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		boolExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		cardExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		cardExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		powExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		powExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		pow1ExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		pow1ExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		kUnionExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		kUnionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		kIntersectionExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		kIntersectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		domainExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		domainExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		rangeExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		rangeExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		prj1ExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		prj1ExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		prj1GenExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		prj2ExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		prj2ExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		prj2GenExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		identityExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		identityExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		identityGenExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		unaryMinusExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		unaryMinusExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		minExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		minExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		maxExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		maxExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		inverseExpressionEClass.getESuperTypes().add(this.getUnaryOperator());
		inverseExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		notPredicateEClass.getESuperTypes().add(this.getUnaryOperator());
		notPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		finitePredicateEClass.getESuperTypes().add(this.getUnaryOperator());
		finitePredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		parallelProductExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		parallelProductExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		rangeRestrictionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		rangeRestrictionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		rangeSubtractionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		rangeSubtractionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		uptoExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		uptoExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		exponentiationExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		exponentiationExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		setSubtractionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		setSubtractionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		functionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		functionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		imageExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		imageExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		implicationPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		implicationPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		equivalencePredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		equivalencePredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		equalPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		equalPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		notEqualPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		notEqualPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		belongPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		belongPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		notBelongPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		notBelongPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		subsetStrictPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		subsetStrictPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		notSubsetStrictPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		notSubsetStrictPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		subsetPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		subsetPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		notSubsetPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		notSubsetPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		lessPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		lessPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		lessEqualPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		lessEqualPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		greaterPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		greaterPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		greaterEqualPredicateEClass.getESuperTypes().add(this.getBinaryOperator());
		greaterEqualPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		domainRestrictionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		domainRestrictionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		domainSubtractionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		domainSubtractionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		directProductExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		directProductExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		divisionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		divisionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		subtractExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		subtractExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		moduloExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		moduloExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		cartesianProductExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		cartesianProductExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		partialFunctionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		partialFunctionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		totalFunctionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		totalFunctionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		relationExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		relationExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		totalSurjectionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		totalSurjectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		totalInjectionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		totalInjectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		partialSurjectionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		partialSurjectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		partialInjectionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		partialInjectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		totalBijectionExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		totalBijectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		totalRelationExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		totalRelationExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		surjectiveRelationExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		surjectiveRelationExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		totalSurjectiveRelationExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		totalSurjectiveRelationExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		mapletExpressionEClass.getESuperTypes().add(this.getBinaryOperator());
		mapletExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		setExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		setExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		backwardCompositionExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		backwardCompositionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		forwardCompositionExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		forwardCompositionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		relationalOverridingExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		relationalOverridingExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		andPredicateEClass.getESuperTypes().add(this.getMultiOperand());
		andPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		orPredicateEClass.getESuperTypes().add(this.getMultiOperand());
		orPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());
		addExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		addExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		mulExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		mulExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		intersectionExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		intersectionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		unionExpressionEClass.getESuperTypes().add(this.getMultiOperand());
		unionExpressionEClass.getESuperTypes().add(this.getBExpressionResolved());
		partitionPredicateEClass.getESuperTypes().add(this.getMultiOperand());
		partitionPredicateEClass.getESuperTypes().add(this.getBPredicateResolved());

		// Initialize classes and features; add operations and parameters
		initEClass(bFormulaEClass, BFormula.class, "BFormula", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bExpressionResolvedEClass, BExpressionResolved.class, "BExpressionResolved", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bPredicateResolvedEClass, BPredicateResolved.class, "BPredicateResolved", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bAssignmentResolvedEClass, BAssignmentResolved.class, "BAssignmentResolved", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBAssignmentResolved_Identifiers(), this.getIdentifierExpression(), null, "identifiers", null, 1, -1, BAssignmentResolved.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryOperatorEClass, UnaryOperator.class, "UnaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryOperator_Child(), this.getBFormula(), null, "child", null, 1, 1, UnaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryOperatorEClass, BinaryOperator.class, "BinaryOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOperator_Left(), this.getBFormula(), null, "left", null, 1, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOperator_Right(), this.getBFormula(), null, "right", null, 1, 1, BinaryOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiOperandEClass, MultiOperand.class, "MultiOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiOperand_Children(), this.getBFormula(), null, "children", null, 2, -1, MultiOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(becomesEqualToAssignmentEClass, BecomesEqualToAssignment.class, "BecomesEqualToAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBecomesEqualToAssignment_Expressions(), this.getBExpressionResolved(), null, "expressions", null, 1, -1, BecomesEqualToAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(becomesMemberOfAssignmentEClass, BecomesMemberOfAssignment.class, "BecomesMemberOfAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBecomesMemberOfAssignment_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, BecomesMemberOfAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(becomesSuchThatAssignmentEClass, BecomesSuchThatAssignment.class, "BecomesSuchThatAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBecomesSuchThatAssignment_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, BecomesSuchThatAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralExpressionEClass, IntegerLiteralExpression.class, "IntegerLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteralExpression_Number(), ecorePackage.getEBigInteger(), "number", null, 1, 1, IntegerLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierExpressionEClass, IdentifierExpression.class, "IdentifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifierExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundIdentifierExpressionEClass, BoundIdentifierExpression.class, "BoundIdentifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forallPredicateEClass, ForallPredicate.class, "ForallPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForallPredicate_Identifiers(), this.getBoundIdentifierExpression(), null, "identifiers", null, 1, -1, ForallPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForallPredicate_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, ForallPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existPredicateEClass, ExistPredicate.class, "ExistPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistPredicate_Identifiers(), this.getBoundIdentifierExpression(), null, "identifiers", null, 1, -1, ExistPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExistPredicate_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, ExistPredicate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdaExpressionEClass, LambdaExpression.class, "LambdaExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLambdaExpression_Ident_pattern(), this.getIdentifierExpression(), null, "ident_pattern", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLambdaExpression_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, LambdaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedUnionExpression1EClass, QuantifiedUnionExpression1.class, "QuantifiedUnionExpression1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedUnionExpression1_Identifiers(), this.getIdentifierExpression(), null, "identifiers", null, 1, -1, QuantifiedUnionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedUnionExpression1_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, QuantifiedUnionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedUnionExpression1_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, QuantifiedUnionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedUnionExpression2EClass, QuantifiedUnionExpression2.class, "QuantifiedUnionExpression2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedUnionExpression2_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, QuantifiedUnionExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedUnionExpression2_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, QuantifiedUnionExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedIntersectionExpression1EClass, QuantifiedIntersectionExpression1.class, "QuantifiedIntersectionExpression1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedIntersectionExpression1_Identifiers(), this.getIdentifierExpression(), null, "identifiers", null, 1, -1, QuantifiedIntersectionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedIntersectionExpression1_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, QuantifiedIntersectionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedIntersectionExpression1_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, QuantifiedIntersectionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantifiedIntersectionExpression2EClass, QuantifiedIntersectionExpression2.class, "QuantifiedIntersectionExpression2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantifiedIntersectionExpression2_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, QuantifiedIntersectionExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantifiedIntersectionExpression2_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, QuantifiedIntersectionExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setComprehensionExpression1EClass, SetComprehensionExpression1.class, "SetComprehensionExpression1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetComprehensionExpression1_Identifiers(), this.getIdentifierExpression(), null, "identifiers", null, 1, -1, SetComprehensionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetComprehensionExpression1_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, SetComprehensionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetComprehensionExpression1_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, SetComprehensionExpression1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setComprehensionExpression2EClass, SetComprehensionExpression2.class, "SetComprehensionExpression2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetComprehensionExpression2_Predicate(), this.getBPredicateResolved(), null, "predicate", null, 1, 1, SetComprehensionExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetComprehensionExpression2_Expression(), this.getBExpressionResolved(), null, "expression", null, 1, 1, SetComprehensionExpression2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intEClass, org.eventb.emf.formulas.INT.class, "INT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(natEClass, org.eventb.emf.formulas.NAT.class, "NAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nat1EClass, org.eventb.emf.formulas.NAT1.class, "NAT1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolEClass, org.eventb.emf.formulas.BOOL.class, "BOOL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trueEClass, org.eventb.emf.formulas.TRUE.class, "TRUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falseEClass, org.eventb.emf.formulas.FALSE.class, "FALSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptysetEClass, org.eventb.emf.formulas.EMPTYSET.class, "EMPTYSET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(truthEClass, org.eventb.emf.formulas.TRUTH.class, "TRUTH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(falsityEClass, org.eventb.emf.formulas.FALSITY.class, "FALSITY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(succExpressionEClass, SuccExpression.class, "SuccExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predExpressionEClass, PredExpression.class, "PredExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boolExpressionEClass, BoolExpression.class, "BoolExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardExpressionEClass, CardExpression.class, "CardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powExpressionEClass, PowExpression.class, "PowExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pow1ExpressionEClass, Pow1Expression.class, "Pow1Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kUnionExpressionEClass, KUnionExpression.class, "KUnionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kIntersectionExpressionEClass, KIntersectionExpression.class, "KIntersectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainExpressionEClass, DomainExpression.class, "DomainExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeExpressionEClass, RangeExpression.class, "RangeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prj1ExpressionEClass, Prj1Expression.class, "Prj1Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prj1GenExpressionEClass, Prj1GenExpression.class, "Prj1GenExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prj2ExpressionEClass, Prj2Expression.class, "Prj2Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prj2GenExpressionEClass, Prj2GenExpression.class, "Prj2GenExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityExpressionEClass, IdentityExpression.class, "IdentityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identityGenExpressionEClass, IdentityGenExpression.class, "IdentityGenExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryMinusExpressionEClass, UnaryMinusExpression.class, "UnaryMinusExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minExpressionEClass, MinExpression.class, "MinExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maxExpressionEClass, MaxExpression.class, "MaxExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inverseExpressionEClass, InverseExpression.class, "InverseExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notPredicateEClass, NotPredicate.class, "NotPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finitePredicateEClass, FinitePredicate.class, "FinitePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelProductExpressionEClass, ParallelProductExpression.class, "ParallelProductExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeRestrictionExpressionEClass, RangeRestrictionExpression.class, "RangeRestrictionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeSubtractionExpressionEClass, RangeSubtractionExpression.class, "RangeSubtractionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uptoExpressionEClass, UptoExpression.class, "UptoExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exponentiationExpressionEClass, ExponentiationExpression.class, "ExponentiationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setSubtractionExpressionEClass, SetSubtractionExpression.class, "SetSubtractionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionExpressionEClass, FunctionExpression.class, "FunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageExpressionEClass, ImageExpression.class, "ImageExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implicationPredicateEClass, ImplicationPredicate.class, "ImplicationPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equivalencePredicateEClass, EquivalencePredicate.class, "EquivalencePredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalPredicateEClass, EqualPredicate.class, "EqualPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEqualPredicateEClass, NotEqualPredicate.class, "NotEqualPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(belongPredicateEClass, BelongPredicate.class, "BelongPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notBelongPredicateEClass, NotBelongPredicate.class, "NotBelongPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsetStrictPredicateEClass, SubsetStrictPredicate.class, "SubsetStrictPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notSubsetStrictPredicateEClass, NotSubsetStrictPredicate.class, "NotSubsetStrictPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subsetPredicateEClass, SubsetPredicate.class, "SubsetPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notSubsetPredicateEClass, NotSubsetPredicate.class, "NotSubsetPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessPredicateEClass, LessPredicate.class, "LessPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessEqualPredicateEClass, LessEqualPredicate.class, "LessEqualPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterPredicateEClass, GreaterPredicate.class, "GreaterPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(greaterEqualPredicateEClass, GreaterEqualPredicate.class, "GreaterEqualPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainRestrictionExpressionEClass, DomainRestrictionExpression.class, "DomainRestrictionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainSubtractionExpressionEClass, DomainSubtractionExpression.class, "DomainSubtractionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directProductExpressionEClass, DirectProductExpression.class, "DirectProductExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionExpressionEClass, DivisionExpression.class, "DivisionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subtractExpressionEClass, SubtractExpression.class, "SubtractExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloExpressionEClass, ModuloExpression.class, "ModuloExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianProductExpressionEClass, CartesianProductExpression.class, "CartesianProductExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partialFunctionExpressionEClass, PartialFunctionExpression.class, "PartialFunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalFunctionExpressionEClass, TotalFunctionExpression.class, "TotalFunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationExpressionEClass, RelationExpression.class, "RelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalSurjectionExpressionEClass, TotalSurjectionExpression.class, "TotalSurjectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalInjectionExpressionEClass, TotalInjectionExpression.class, "TotalInjectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partialSurjectionExpressionEClass, PartialSurjectionExpression.class, "PartialSurjectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partialInjectionExpressionEClass, PartialInjectionExpression.class, "PartialInjectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalBijectionExpressionEClass, TotalBijectionExpression.class, "TotalBijectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalRelationExpressionEClass, TotalRelationExpression.class, "TotalRelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(surjectiveRelationExpressionEClass, SurjectiveRelationExpression.class, "SurjectiveRelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(totalSurjectiveRelationExpressionEClass, TotalSurjectiveRelationExpression.class, "TotalSurjectiveRelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapletExpressionEClass, MapletExpression.class, "MapletExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setExpressionEClass, SetExpression.class, "SetExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backwardCompositionExpressionEClass, BackwardCompositionExpression.class, "BackwardCompositionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forwardCompositionExpressionEClass, ForwardCompositionExpression.class, "ForwardCompositionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalOverridingExpressionEClass, RelationalOverridingExpression.class, "RelationalOverridingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andPredicateEClass, AndPredicate.class, "AndPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orPredicateEClass, OrPredicate.class, "OrPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addExpressionEClass, AddExpression.class, "AddExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mulExpressionEClass, MulExpression.class, "MulExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intersectionExpressionEClass, IntersectionExpression.class, "IntersectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionExpressionEClass, UnionExpression.class, "UnionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partitionPredicateEClass, PartitionPredicate.class, "PartitionPredicate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FormulasPackageImpl
