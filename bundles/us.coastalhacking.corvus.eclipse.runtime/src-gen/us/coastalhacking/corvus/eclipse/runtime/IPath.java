/**
 */
package us.coastalhacking.corvus.eclipse.runtime;

import us.coastalhacking.corvus.semiotics.Semiotics;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPath</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.runtime.IPath#getPortable <em>Portable</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimePackage#getIPath()
 * @model
 * @generated
 */
public interface IPath extends Semiotics {
	/**
	 * Returns the value of the '<em><b>Portable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portable</em>' attribute.
	 * @see #setPortable(String)
	 * @see us.coastalhacking.corvus.eclipse.runtime.EclipseRuntimePackage#getIPath_Portable()
	 * @model unique="false"
	 * @generated
	 */
	String getPortable();

	/**
	 * Sets the value of the '{@link us.coastalhacking.corvus.eclipse.runtime.IPath#getPortable <em>Portable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portable</em>' attribute.
	 * @see #getPortable()
	 * @generated
	 */
	void setPortable(String value);

} // IPath
