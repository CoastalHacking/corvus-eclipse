/**
 */
package us.coastalhacking.corvus.entrypoint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.entrypoint.EntryPointRoot#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.entrypoint.EntrypointPackage#getEntryPointRoot()
 * @model
 * @generated
 */
public interface EntryPointRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Points</b></em>' containment reference list.
	 * The list contents are of type {@link us.coastalhacking.corvus.entrypoint.EntryPoint}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.entrypoint.EntryPoint#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Points</em>' containment reference list.
	 * @see us.coastalhacking.corvus.entrypoint.EntrypointPackage#getEntryPointRoot_EntryPoints()
	 * @see us.coastalhacking.corvus.entrypoint.EntryPoint#getGroup
	 * @model opposite="group" containment="true"
	 * @generated
	 */
	EList<EntryPoint> getEntryPoints();

} // EntryPointRoot
