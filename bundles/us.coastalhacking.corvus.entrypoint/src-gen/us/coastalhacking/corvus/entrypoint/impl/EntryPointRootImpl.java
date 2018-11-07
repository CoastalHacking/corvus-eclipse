/**
 */
package us.coastalhacking.corvus.entrypoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.corvus.entrypoint.EntryPoint;
import us.coastalhacking.corvus.entrypoint.EntryPointRoot;
import us.coastalhacking.corvus.entrypoint.EntrypointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.entrypoint.impl.EntryPointRootImpl#getEntryPoints <em>Entry Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointRootImpl extends MinimalEObjectImpl.Container implements EntryPointRoot {
	/**
	 * The cached value of the '{@link #getEntryPoints() <em>Entry Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryPoint> entryPoints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntrypointPackage.Literals.ENTRY_POINT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryPoint> getEntryPoints() {
		if (entryPoints == null) {
			entryPoints = new EObjectContainmentWithInverseEList<EntryPoint>(EntryPoint.class, this, EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS, EntrypointPackage.ENTRY_POINT__GROUP);
		}
		return entryPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntryPoints()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS:
				return ((InternalEList<?>)getEntryPoints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS:
				return getEntryPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS:
				getEntryPoints().clear();
				getEntryPoints().addAll((Collection<? extends EntryPoint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS:
				getEntryPoints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS:
				return entryPoints != null && !entryPoints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryPointRootImpl
