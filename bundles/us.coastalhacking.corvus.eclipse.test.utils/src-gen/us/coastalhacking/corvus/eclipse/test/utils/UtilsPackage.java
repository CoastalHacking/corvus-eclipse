/**
 */
package us.coastalhacking.corvus.eclipse.test.utils;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see us.coastalhacking.corvus.eclipse.test.utils.UtilsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='us.coastalhacking.corvus.eclipse.test'"
 * @generated
 */
public interface UtilsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utils";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "us.coastalhacking.corvus.eclipse.test.utils";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "utils";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsPackage eINSTANCE = us.coastalhacking.corvus.eclipse.test.utils.impl.UtilsPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.test.utils.impl.TestRootImpl <em>Test Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.test.utils.impl.TestRootImpl
	 * @see us.coastalhacking.corvus.eclipse.test.utils.impl.UtilsPackageImpl#getTestRoot()
	 * @generated
	 */
	int TEST_ROOT = 0;

	/**
	 * The number of structural features of the '<em>Test Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ROOT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.test.utils.TestRoot <em>Test Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Root</em>'.
	 * @see us.coastalhacking.corvus.eclipse.test.utils.TestRoot
	 * @generated
	 */
	EClass getTestRoot();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilsFactory getUtilsFactory();

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
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.test.utils.impl.TestRootImpl <em>Test Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.test.utils.impl.TestRootImpl
		 * @see us.coastalhacking.corvus.eclipse.test.utils.impl.UtilsPackageImpl#getTestRoot()
		 * @generated
		 */
		EClass TEST_ROOT = eINSTANCE.getTestRoot();

	}

} //UtilsPackage
