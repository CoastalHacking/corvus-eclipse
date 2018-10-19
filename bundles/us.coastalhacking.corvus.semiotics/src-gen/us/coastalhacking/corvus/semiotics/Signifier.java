/**
 */
package us.coastalhacking.corvus.semiotics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.semiotics.Signifier#getSignifieds <em>Signifieds</em>}</li>
 * </ul>
 *
 * @see us.coastalhacking.corvus.semiotics.SemioticsPackage#getSignifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Signifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Signifieds</b></em>' reference list.
	 * The list contents are of type {@link us.coastalhacking.corvus.semiotics.Signified}.
	 * It is bidirectional and its opposite is '{@link us.coastalhacking.corvus.semiotics.Signified#getSignifiers <em>Signifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signifieds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signifieds</em>' reference list.
	 * @see us.coastalhacking.corvus.semiotics.SemioticsPackage#getSignifier_Signifieds()
	 * @see us.coastalhacking.corvus.semiotics.Signified#getSignifiers
	 * @model opposite="signifiers"
	 * @generated
	 */
	EList<Signified> getSignifieds();

} // Signifier
