/**
 */
package us.coastalhacking.corvus.entrypoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.corvus.entrypoint.EntrypointPackage
 * @generated
 */
public interface EntrypointFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntrypointFactory eINSTANCE = us.coastalhacking.corvus.entrypoint.impl.EntrypointFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entry Point Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point Root</em>'.
	 * @generated
	 */
	EntryPointRoot createEntryPointRoot();

	/**
	 * Returns a new object of class '<em>Entry Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry Point</em>'.
	 * @generated
	 */
	EntryPoint createEntryPoint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EntrypointPackage getEntrypointPackage();

} //EntrypointFactory
