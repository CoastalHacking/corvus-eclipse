/**
 */
package us.coastalhacking.corvus.eclipse.resources;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage
 * @generated
 */
public interface EclipseResourcesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EclipseResourcesFactory eINSTANCE = us.coastalhacking.corvus.eclipse.resources.impl.EclipseResourcesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>IMarker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IMarker</em>'.
	 * @generated
	 */
	IMarker createIMarker();

	/**
	 * Returns a new object of class '<em>IResource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IResource</em>'.
	 * @generated
	 */
	IResource createIResource();

	/**
	 * Returns a new object of class '<em>IContainer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IContainer</em>'.
	 * @generated
	 */
	IContainer createIContainer();

	/**
	 * Returns a new object of class '<em>IProject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IProject</em>'.
	 * @generated
	 */
	IProject createIProject();

	/**
	 * Returns a new object of class '<em>IFile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFile</em>'.
	 * @generated
	 */
	IFile createIFile();

	/**
	 * Returns a new object of class '<em>IFolder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IFolder</em>'.
	 * @generated
	 */
	IFolder createIFolder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EclipseResourcesPackage getEclipseResourcesPackage();

} //EclipseResourcesFactory
