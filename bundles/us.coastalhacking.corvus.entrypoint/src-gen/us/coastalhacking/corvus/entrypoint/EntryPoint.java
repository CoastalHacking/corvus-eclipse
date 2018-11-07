/**
 */
package us.coastalhacking.corvus.entrypoint;

import us.coastalhacking.corvus.semiotics.Semiotics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.entrypoint.EntryPoint#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.entrypoint.EntrypointPackage#getEntryPoint()
 * @model
 * @generated
 */
public interface EntryPoint extends Semiotics {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.entrypoint.EntryPointRoot#getEntryPoints <em>Entry Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' container reference.
	 * @see #setGroup(EntryPointRoot)
	 * @see us.coastalhacking.corvus.entrypoint.EntrypointPackage#getEntryPoint_Group()
	 * @see us.coastalhacking.corvus.entrypoint.EntryPointRoot#getEntryPoints
	 * @model opposite="entryPoints" transient="false"
	 * @generated
	 */
	EntryPointRoot getGroup();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.entrypoint.EntryPoint#getGroup <em>Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' container reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(EntryPointRoot value);

} // EntryPoint
