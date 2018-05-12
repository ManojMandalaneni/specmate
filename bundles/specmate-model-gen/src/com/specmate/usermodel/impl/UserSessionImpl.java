/**
 */
package com.specmate.usermodel.impl;

import com.specmate.usermodel.AccessRights;
import com.specmate.usermodel.UserSession;
import com.specmate.usermodel.UsermodelPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.specmate.usermodel.impl.UserSessionImpl#getToken <em>Token</em>}</li>
 *   <li>{@link com.specmate.usermodel.impl.UserSessionImpl#getAllowedPathPattern <em>Allowed Path Pattern</em>}</li>
 *   <li>{@link com.specmate.usermodel.impl.UserSessionImpl#getLastActive <em>Last Active</em>}</li>
 *   <li>{@link com.specmate.usermodel.impl.UserSessionImpl#getAccessRights <em>Access Rights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSessionImpl extends CDOObjectImpl implements UserSession {
	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAllowedPathPattern() <em>Allowed Path Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedPathPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_PATH_PATTERN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastActive() <em>Last Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastActive()
	 * @generated
	 * @ordered
	 */
	protected static final long LAST_ACTIVE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getAccessRights() <em>Access Rights</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessRights()
	 * @generated
	 * @ordered
	 */
	protected static final AccessRights ACCESS_RIGHTS_EDEFAULT = AccessRights.NONE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsermodelPackage.Literals.USER_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return (String)eDynamicGet(UsermodelPackage.USER_SESSION__TOKEN, UsermodelPackage.Literals.USER_SESSION__TOKEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		eDynamicSet(UsermodelPackage.USER_SESSION__TOKEN, UsermodelPackage.Literals.USER_SESSION__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedPathPattern() {
		return (String)eDynamicGet(UsermodelPackage.USER_SESSION__ALLOWED_PATH_PATTERN, UsermodelPackage.Literals.USER_SESSION__ALLOWED_PATH_PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedPathPattern(String newAllowedPathPattern) {
		eDynamicSet(UsermodelPackage.USER_SESSION__ALLOWED_PATH_PATTERN, UsermodelPackage.Literals.USER_SESSION__ALLOWED_PATH_PATTERN, newAllowedPathPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastActive() {
		return (Long)eDynamicGet(UsermodelPackage.USER_SESSION__LAST_ACTIVE, UsermodelPackage.Literals.USER_SESSION__LAST_ACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastActive(long newLastActive) {
		eDynamicSet(UsermodelPackage.USER_SESSION__LAST_ACTIVE, UsermodelPackage.Literals.USER_SESSION__LAST_ACTIVE, newLastActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessRights getAccessRights() {
		return (AccessRights)eDynamicGet(UsermodelPackage.USER_SESSION__ACCESS_RIGHTS, UsermodelPackage.Literals.USER_SESSION__ACCESS_RIGHTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessRights(AccessRights newAccessRights) {
		eDynamicSet(UsermodelPackage.USER_SESSION__ACCESS_RIGHTS, UsermodelPackage.Literals.USER_SESSION__ACCESS_RIGHTS, newAccessRights);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsermodelPackage.USER_SESSION__TOKEN:
				return getToken();
			case UsermodelPackage.USER_SESSION__ALLOWED_PATH_PATTERN:
				return getAllowedPathPattern();
			case UsermodelPackage.USER_SESSION__LAST_ACTIVE:
				return getLastActive();
			case UsermodelPackage.USER_SESSION__ACCESS_RIGHTS:
				return getAccessRights();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsermodelPackage.USER_SESSION__TOKEN:
				setToken((String)newValue);
				return;
			case UsermodelPackage.USER_SESSION__ALLOWED_PATH_PATTERN:
				setAllowedPathPattern((String)newValue);
				return;
			case UsermodelPackage.USER_SESSION__LAST_ACTIVE:
				setLastActive((Long)newValue);
				return;
			case UsermodelPackage.USER_SESSION__ACCESS_RIGHTS:
				setAccessRights((AccessRights)newValue);
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
			case UsermodelPackage.USER_SESSION__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case UsermodelPackage.USER_SESSION__ALLOWED_PATH_PATTERN:
				setAllowedPathPattern(ALLOWED_PATH_PATTERN_EDEFAULT);
				return;
			case UsermodelPackage.USER_SESSION__LAST_ACTIVE:
				setLastActive(LAST_ACTIVE_EDEFAULT);
				return;
			case UsermodelPackage.USER_SESSION__ACCESS_RIGHTS:
				setAccessRights(ACCESS_RIGHTS_EDEFAULT);
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
			case UsermodelPackage.USER_SESSION__TOKEN:
				return TOKEN_EDEFAULT == null ? getToken() != null : !TOKEN_EDEFAULT.equals(getToken());
			case UsermodelPackage.USER_SESSION__ALLOWED_PATH_PATTERN:
				return ALLOWED_PATH_PATTERN_EDEFAULT == null ? getAllowedPathPattern() != null : !ALLOWED_PATH_PATTERN_EDEFAULT.equals(getAllowedPathPattern());
			case UsermodelPackage.USER_SESSION__LAST_ACTIVE:
				return getLastActive() != LAST_ACTIVE_EDEFAULT;
			case UsermodelPackage.USER_SESSION__ACCESS_RIGHTS:
				return getAccessRights() != ACCESS_RIGHTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //UserSessionImpl
