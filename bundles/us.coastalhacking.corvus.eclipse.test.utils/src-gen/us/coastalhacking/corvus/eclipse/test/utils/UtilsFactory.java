/**
 */
package us.coastalhacking.corvus.eclipse.test.utils;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.corvus.eclipse.test.utils.UtilsPackage
 * @generated
 */
public interface UtilsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsFactory eINSTANCE = us.coastalhacking.corvus.eclipse.test.utils.impl.UtilsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Root</em>'.
	 * @generated
	 */
	TestRoot createTestRoot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilsPackage getUtilsPackage();

} //UtilsFactory
