/**
 */
package us.coastalhacking.corvus.eclipse.runtime;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='eclipseRuntime' prefix='EclipseRuntime' modelName='EclipseRuntime' basePackage='us.coastalhacking.corvus.eclipse'"
 * @generated
 */
public interface EclipseRuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://model.coastalhacking.us/corvus/eclipseRuntime/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eclipseRuntime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclipseRuntimePackage eINSTANCE = us.coastalhacking.corvus.eclipse.runtime.impl.EclipseRuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link us.coastalhacking.corvus.eclipse.runtime.impl.IPathImpl <em>IPath</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.coastalhacking.corvus.eclipse.runtime.impl.IPathImpl
	 * @see us.coastalhacking.corvus.eclipse.runtime.impl.EclipseRuntimePackageImpl#getIPath()
	 * @generated
	 */
	int IPATH = 0;

	/**
	 * The feature id for the '<em><b>Signifieds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATH__SIGNIFIEDS = SemioticsPackage.SEMIOTICS__SIGNIFIEDS;

	/**
	 * The feature id for the '<em><b>Signifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATH__SIGNIFIERS = SemioticsPackage.SEMIOTICS__SIGNIFIERS;

	/**
	 * The feature id for the '<em><b>Portable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATH__PORTABLE = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IPath</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATH_FEATURE_COUNT = SemioticsPackage.SEMIOTICS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>IPath</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPATH_OPERATION_COUNT = SemioticsPackage.SEMIOTICS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link us.coastalhacking.corvus.eclipse.runtime.IPath <em>IPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IPath</em>'.
	 * @see us.coastalhacking.corvus.eclipse.runtime.IPath
	 * @generated
	 */
	EClass getIPath();

	/**
	 * Returns the meta object for the attribute '{@link us.coastalhacking.corvus.eclipse.runtime.IPath#getPortable <em>Portable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Portable</em>'.
	 * @see us.coastalhacking.corvus.eclipse.runtime.IPath#getPortable()
	 * @see #getIPath()
	 * @generated
	 */
	EAttribute getIPath_Portable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EclipseRuntimeFactory getEclipseRuntimeFactory();

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
		 * The meta object literal for the '{@link us.coastalhacking.corvus.eclipse.runtime.impl.IPathImpl <em>IPath</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.coastalhacking.corvus.eclipse.runtime.impl.IPathImpl
		 * @see us.coastalhacking.corvus.eclipse.runtime.impl.EclipseRuntimePackageImpl#getIPath()
		 * @generated
		 */
		EClass IPATH = eINSTANCE.getIPath();

		/**
		 * The meta object literal for the '<em><b>Portable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPATH__PORTABLE = eINSTANCE.getIPath_Portable();

	}

} //EclipseRuntimePackage
