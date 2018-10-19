/**
 */
package us.coastalhacking.corvus.entrypoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;

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
 * @see us.coastalhacking.corvus.entrypoint.EntrypointFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='us.coastalhacking.corvus'"
 * @generated
 */
public interface EntrypointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entrypoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.coastalhacking.us/corvus/entrypoint/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "entrypoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntrypointPackage eINSTANCE = us.coastalhacking.corvus.entrypoint.impl.EntrypointPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl
	 * @see us.coastalhacking.corvus.entrypoint.impl.EntrypointPackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 0;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__SIGNIFIEDS = SemioticsPackage.SEMIOTICS__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__SIGNIFIERS = SemioticsPackage.SEMIOTICS__SIGNIFIERS;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_OPERATION_COUNT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.entrypoint.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see us.coastalhacking.corvus.entrypoint.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntrypointFactory getEntrypointFactory();

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
		 * The meta object literal for the '{@link us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl
		 * @see us.coastalhacking.corvus.entrypoint.impl.EntrypointPackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

	}

} //EntrypointPackage
