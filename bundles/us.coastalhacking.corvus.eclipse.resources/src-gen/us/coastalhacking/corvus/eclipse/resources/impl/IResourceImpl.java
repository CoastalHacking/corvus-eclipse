/**
 */
package us.coastalhacking.corvus.eclipse.resources.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import us.coastalhacking.corvus.eclipse.resources.EclipseResourcesPackage;
import us.coastalhacking.corvus.eclipse.resources.IContainer;
import us.coastalhacking.corvus.eclipse.resources.IMarker;
import us.coastalhacking.corvus.eclipse.resources.IProject;
import us.coastalhacking.corvus.eclipse.resources.IResource;
import us.coastalhacking.corvus.eclipse.resources.IWorkspaceRoot;

import us.coastalhacking.corvus.eclipse.runtime.IPath;

import us.coastalhacking.corvus.semiotics.SemioticsPackage;
import us.coastalhacking.corvus.semiotics.Signified;
import us.coastalhacking.corvus.semiotics.Signifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IResource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl#getSignifieds <em>Signifieds</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl#getSignifiers <em>Signifiers</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link us.coastalhacking.corvus.eclipse.resources.impl.IResourceImpl#getFullPath <em>Full Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IResourceImpl extends MinimalEObjectImpl.Container implements IResource {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMarkers() <em>Markers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkers()
	 * @generated
	 * @ordered
	 */
	protected EList<IMarker> markers;

	/**
	 * The cached value of the '{@link #getFullPath() <em>Full Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected IPath fullPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EclipseResourcesPackage.Literals.IRESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signified> getSignifieds() {
		if (signifieds == null) {
			signifieds = new EObjectWithInverseResolvingEList.ManyInverse<Signified>(Signified.class, this, EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS, SemioticsPackage.SIGNIFIED__SIGNIFIERS);
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
			signifiers = new EObjectWithInverseResolvingEList.ManyInverse<Signifier>(Signifier.class, this, EclipseResourcesPackage.IRESOURCE__SIGNIFIERS, SemioticsPackage.SIGNIFIER__SIGNIFIEDS);
		}
		return signifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IRESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IMarker> getMarkers() {
		if (markers == null) {
			markers = new EObjectContainmentWithInverseEList<IMarker>(IMarker.class, this, EclipseResourcesPackage.IRESOURCE__MARKERS, EclipseResourcesPackage.IMARKER__RESOURCE);
		}
		return markers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer getParent() {
		if (eContainerFeatureID() != EclipseResourcesPackage.IRESOURCE__PARENT) return null;
		return (IContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer basicGetParent() {
		if (eContainerFeatureID() != EclipseResourcesPackage.IRESOURCE__PARENT) return null;
		return (IContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(IContainer newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, EclipseResourcesPackage.IRESOURCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IContainer newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != EclipseResourcesPackage.IRESOURCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EclipseResourcesPackage.ICONTAINER__MEMBERS, IContainer.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IRESOURCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPath getFullPath() {
		return fullPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullPath(IPath newFullPath, NotificationChain msgs) {
		IPath oldFullPath = fullPath;
		fullPath = newFullPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IRESOURCE__FULL_PATH, oldFullPath, newFullPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullPath(IPath newFullPath) {
		if (newFullPath != fullPath) {
			NotificationChain msgs = null;
			if (fullPath != null)
				msgs = ((InternalEObject)fullPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclipseResourcesPackage.IRESOURCE__FULL_PATH, null, msgs);
			if (newFullPath != null)
				msgs = ((InternalEObject)newFullPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclipseResourcesPackage.IRESOURCE__FULL_PATH, null, msgs);
			msgs = basicSetFullPath(newFullPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EclipseResourcesPackage.IRESOURCE__FULL_PATH, newFullPath, newFullPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getProject() {
		IProject _xifexpression = null;
		IContainer _parent = this.getParent();
		if ((_parent instanceof IProject)) {
			IContainer _parent_1 = this.getParent();
			_xifexpression = ((IProject) _parent_1);
		}
		else {
			_xifexpression = this.getParent().getProject();
		}
		return _xifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IWorkspaceRoot getWorkspaceRoot() {
		return this.getProject().getWorkspaceRoot();
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
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignifieds()).basicAdd(otherEnd, msgs);
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSignifiers()).basicAdd(otherEnd, msgs);
			case EclipseResourcesPackage.IRESOURCE__MARKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMarkers()).basicAdd(otherEnd, msgs);
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((IContainer)otherEnd, msgs);
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
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS:
				return ((InternalEList<?>)getSignifieds()).basicRemove(otherEnd, msgs);
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS:
				return ((InternalEList<?>)getSignifiers()).basicRemove(otherEnd, msgs);
			case EclipseResourcesPackage.IRESOURCE__MARKERS:
				return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				return basicSetParent(null, msgs);
			case EclipseResourcesPackage.IRESOURCE__FULL_PATH:
				return basicSetFullPath(null, msgs);
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
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				return eInternalContainer().eInverseRemove(this, EclipseResourcesPackage.ICONTAINER__MEMBERS, IContainer.class, msgs);
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
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS:
				return getSignifieds();
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS:
				return getSignifiers();
			case EclipseResourcesPackage.IRESOURCE__NAME:
				return getName();
			case EclipseResourcesPackage.IRESOURCE__MARKERS:
				return getMarkers();
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case EclipseResourcesPackage.IRESOURCE__FULL_PATH:
				return getFullPath();
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
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS:
				getSignifieds().clear();
				getSignifieds().addAll((Collection<? extends Signified>)newValue);
				return;
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS:
				getSignifiers().clear();
				getSignifiers().addAll((Collection<? extends Signifier>)newValue);
				return;
			case EclipseResourcesPackage.IRESOURCE__NAME:
				setName((String)newValue);
				return;
			case EclipseResourcesPackage.IRESOURCE__MARKERS:
				getMarkers().clear();
				getMarkers().addAll((Collection<? extends IMarker>)newValue);
				return;
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				setParent((IContainer)newValue);
				return;
			case EclipseResourcesPackage.IRESOURCE__FULL_PATH:
				setFullPath((IPath)newValue);
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
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS:
				getSignifieds().clear();
				return;
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS:
				getSignifiers().clear();
				return;
			case EclipseResourcesPackage.IRESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EclipseResourcesPackage.IRESOURCE__MARKERS:
				getMarkers().clear();
				return;
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				setParent((IContainer)null);
				return;
			case EclipseResourcesPackage.IRESOURCE__FULL_PATH:
				setFullPath((IPath)null);
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
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIEDS:
				return signifieds != null && !signifieds.isEmpty();
			case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS:
				return signifiers != null && !signifiers.isEmpty();
			case EclipseResourcesPackage.IRESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EclipseResourcesPackage.IRESOURCE__MARKERS:
				return markers != null && !markers.isEmpty();
			case EclipseResourcesPackage.IRESOURCE__PARENT:
				return basicGetParent() != null;
			case EclipseResourcesPackage.IRESOURCE__FULL_PATH:
				return fullPath != null;
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
				case EclipseResourcesPackage.IRESOURCE__SIGNIFIERS: return SemioticsPackage.SIGNIFIED__SIGNIFIERS;
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
				case SemioticsPackage.SIGNIFIED__SIGNIFIERS: return EclipseResourcesPackage.IRESOURCE__SIGNIFIERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EclipseResourcesPackage.IRESOURCE___GET_PROJECT:
				return getProject();
			case EclipseResourcesPackage.IRESOURCE___GET_WORKSPACE_ROOT:
				return getWorkspaceRoot();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //IResourceImpl
