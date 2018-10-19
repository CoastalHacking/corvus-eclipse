/**
 */
package us.coastalhacking.corvus.semiotics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see us.coastalhacking.corvus.semiotics.SemioticsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='us.coastalhacking.corvus'"
 * @generated
 */
public interface SemioticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "semiotics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.coastalhacking.us/corvus/semiotics/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "semiotics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SemioticsPackage eINSTANCE = us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.semiotics.Signifier <em>Signifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.semiotics.Signifier
	 * @see us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl#getSignifier()
	 * @generated
	 */
	int SIGNIFIER = 1;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFIER__SIGNIFIEDS = 0;

	/**
	 * The number of structural features of the '<em>Signifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.semiotics.Semiotics <em>Semiotics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.semiotics.Semiotics
	 * @see us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl#getSemiotics()
	 * @generated
	 */
	int SEMIOTICS = 0;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMIOTICS__SIGNIFIEDS = SIGNIFIER__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMIOTICS__SIGNIFIERS = SIGNIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Semiotics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMIOTICS_FEATURE_COUNT = SIGNIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Semiotics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMIOTICS_OPERATION_COUNT = SIGNIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.semiotics.Signified <em>Signified</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.semiotics.Signified
	 * @see us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl#getSignified()
	 * @generated
	 */
	int SIGNIFIED = 2;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFIED__SIGNIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Signified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFIED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Signified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFIED_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.semiotics.Semiotics <em>Semiotics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semiotics</em>'.
	 * @see us.coastalhacking.corvus.semiotics.Semiotics
	 * @generated
	 */
	EClass getSemiotics();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.semiotics.Signifier <em>Signifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signifier</em>'.
	 * @see us.coastalhacking.corvus.semiotics.Signifier
	 * @generated
	 */
	EClass getSignifier();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.corvus.semiotics.Signifier#getSignifieds <em>Signifieds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signifieds</em>'.
	 * @see us.coastalhacking.corvus.semiotics.Signifier#getSignifieds()
	 * @see #getSignifier()
	 * @generated
	 */
	EReference getSignifier_Signifieds();

	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.semiotics.Signified <em>Signified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signified</em>'.
	 * @see us.coastalhacking.corvus.semiotics.Signified
	 * @generated
	 */
	EClass getSignified();

	/**
	 * Returns the meta object for the reference list '{@link us.coastalhacking.corvus.semiotics.Signified#getSignifiers <em>Signifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Signifiers</em>'.
	 * @see us.coastalhacking.corvus.semiotics.Signified#getSignifiers()
	 * @see #getSignified()
	 * @generated
	 */
	EReference getSignified_Signifiers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SemioticsFactory getSemioticsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.semiotics.Semiotics <em>Semiotics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.semiotics.Semiotics
		 * @see us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl#getSemiotics()
		 * @generated
		 */
		EClass SEMIOTICS = eINSTANCE.getSemiotics();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.semiotics.Signifier <em>Signifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.semiotics.Signifier
		 * @see us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl#getSignifier()
		 * @generated
		 */
		EClass SIGNIFIER = eINSTANCE.getSignifier();

		/**
		 * The meta object literal for the '<em><b>Signifieds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNIFIER__SIGNIFIEDS = eINSTANCE.getSignifier_Signifieds();

		/**
		 * The meta object literal for the '{@link us.coastalhacking.corvus.semiotics.Signified <em>Signified</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.semiotics.Signified
		 * @see us.coastalhacking.corvus.semiotics.impl.SemioticsPackageImpl#getSignified()
		 * @generated
		 */
		EClass SIGNIFIED = eINSTANCE.getSignified();

		/**
		 * The meta object literal for the '<em><b>Signifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNIFIED__SIGNIFIERS = eINSTANCE.getSignified_Signifiers();

	}

} //SemioticsPackage
