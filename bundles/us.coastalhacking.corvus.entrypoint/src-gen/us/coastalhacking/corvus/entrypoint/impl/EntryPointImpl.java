/**
 */
package us.coastalhacking.corvus.entrypoint.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.corvus.entrypoint.EntryPoint;
import us.coastalhacking.corvus.entrypoint.EntryPointRoot;
import us.coastalhacking.corvus.entrypoint.EntrypointPackage;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;
import us.coastalhacking.corvus.semiotics.Signified;
import us.coastalhacking.corvus.semiotics.Signifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl#getSignifieds <em>Signifieds</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl#getSignifiers <em>Signifiers</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.entrypoint.impl.EntryPointImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryPointImpl extends MinimalEObjectImpl.Container implements EntryPoint {
	/**
	 * The cached value of the '{@link #getSignifieds() <em>Signifieds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignifieds()
	 * @generated
	 * @ordered
	 */
	protected EList<Signified> signifieds;

	/**
	 * The cached value of the '{@link #getSignifiers() <em>Signifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Signifier> signifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntrypointPackage.Literals.ENTRY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signified> getSignifieds() {
		if (signifieds == null) {
			signifieds = new EObjectWithInverseResolvingEList.ManyInverse<Signified>(Signified.class, this, EntrypointPackage.ENTRY_POINT__SIGNIFIEDS, SemioticsPackage.SIGNIFIED__SIGNIFIERS);
		}
		return signifieds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signifier> getSignifiers() {
		if (signifiers == null) {
			signifiers = new EObjectWithInverseResolvingEList.ManyInverse<Signifier>(Signifier.class, this, EntrypointPackage.ENTRY_POINT__SIGNIFIERS, SemioticsPackage.SIGNIFIER__SIGNIFIEDS);
		}
		return signifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointRoot getGroup() {
		if (eContainerFeatureID() != EntrypointPackage.ENTRY_POINT__GROUP) return null;
		return (EntryPointRoot)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointRoot basicGetGroup() {
		if (eContainerFeatureID() != EntrypointPackage.ENTRY_POINT__GROUP) return null;
		return (EntryPointRoot)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(EntryPointRoot newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGroup, EntrypointPackage.ENTRY_POINT__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(EntryPointRoot newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != EntrypointPackage.ENTRY_POINT__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS, EntryPointRoot.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntrypointPackage.ENTRY_POINT__GROUP, newGroup, newGroup));
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
			case EntrypointPackage.ENTRY_POINT__SIGNIFIEDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignifieds()).basicAdd(otherEnd, msgs);
			case EntrypointPackage.ENTRY_POINT__SIGNIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignifiers()).basicAdd(otherEnd, msgs);
			case EntrypointPackage.ENTRY_POINT__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((EntryPointRoot)otherEnd, msgs);
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
			case EntrypointPackage.ENTRY_POINT__SIGNIFIEDS:
				return ((InternalEList<?>)getSignifieds()).basicRemove(otherEnd, msgs);
			case EntrypointPackage.ENTRY_POINT__SIGNIFIERS:
				return ((InternalEList<?>)getSignifiers()).basicRemove(otherEnd, msgs);
			case EntrypointPackage.ENTRY_POINT__GROUP:
				return basicSetGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EntrypointPackage.ENTRY_POINT__GROUP:
				return eInternalContainer().eInverseRemove(this, EntrypointPackage.ENTRY_POINT_ROOT__ENTRY_POINTS, EntryPointRoot.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntrypointPackage.ENTRY_POINT__SIGNIFIEDS:
				return getSignifieds();
			case EntrypointPackage.ENTRY_POINT__SIGNIFIERS:
				return getSignifiers();
			case EntrypointPackage.ENTRY_POINT__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case EntrypointPackage.ENTRY_POINT__SIGNIFIEDS:
				getSignifieds().clear();
				getSignifieds().addAll((Collection<? extends Signified>)newValue);
				return;
			case EntrypointPackage.ENTRY_POINT__SIGNIFIERS:
				getSignifiers().clear();
				getSignifiers().addAll((Collection<? extends Signifier>)newValue);
				return;
			case EntrypointPackage.ENTRY_POINT__GROUP:
				setGroup((EntryPointRoot)newValue);
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
			case EntrypointPackage.ENTRY_POINT__SIGNIFIEDS:
				getSignifieds().clear();
				return;
			case EntrypointPackage.ENTRY_POINT__SIGNIFIERS:
				getSignifiers().clear();
				return;
			case EntrypointPackage.ENTRY_POINT__GROUP:
				setGroup((EntryPointRoot)null);
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
			case EntrypointPackage.ENTRY_POINT__SIGNIFIEDS:
				return signifieds != null && !signifieds.isEmpty();
			case EntrypointPackage.ENTRY_POINT__SIGNIFIERS:
				return signifiers != null && !signifiers.isEmpty();
			case EntrypointPackage.ENTRY_POINT__GROUP:
				return basicGetGroup() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Signified.class) {
			switch (derivedFeatureID) {
				case EntrypointPackage.ENTRY_POINT__SIGNIFIERS: return SemioticsPackage.SIGNIFIED__SIGNIFIERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Signified.class) {
			switch (baseFeatureID) {
				case SemioticsPackage.SIGNIFIED__SIGNIFIERS: return EntrypointPackage.ENTRY_POINT__SIGNIFIERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntryPointImpl
