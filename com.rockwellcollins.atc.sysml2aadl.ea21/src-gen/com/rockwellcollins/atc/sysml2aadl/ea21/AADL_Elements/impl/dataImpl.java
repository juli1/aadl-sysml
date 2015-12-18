/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.dataImpl#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dataImpl extends MinimalEObjectImpl.Container implements data {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AADL_ElementsPackage.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AADL_ElementsPackage.DATA__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase_Class(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class newBase_Class, NotificationChain msgs) {
		com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AADL_ElementsPackage.DATA__BASE_CLASS, oldBase_Class, newBase_Class);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class newBase_Class) {
		if (newBase_Class != base_Class) {
			NotificationChain msgs = null;
			if (base_Class != null)
				msgs = ((InternalEObject)base_Class).eInverseRemove(this, UMLPackage.CLASS__AADL_DATA, com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, msgs);
			if (newBase_Class != null)
				msgs = ((InternalEObject)newBase_Class).eInverseAdd(this, UMLPackage.CLASS__AADL_DATA, com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, msgs);
			msgs = basicSetBase_Class(newBase_Class, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AADL_ElementsPackage.DATA__BASE_CLASS, newBase_Class, newBase_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AADL_ElementsPackage.DATA__BASE_CLASS:
				if (base_Class != null)
					msgs = ((InternalEObject)base_Class).eInverseRemove(this, UMLPackage.CLASS__AADL_DATA, com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, msgs);
				return basicSetBase_Class((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)otherEnd, msgs);
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
			case AADL_ElementsPackage.DATA__BASE_CLASS:
				return basicSetBase_Class(null, msgs);
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
			case AADL_ElementsPackage.DATA__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
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
			case AADL_ElementsPackage.DATA__BASE_CLASS:
				setBase_Class((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)newValue);
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
			case AADL_ElementsPackage.DATA__BASE_CLASS:
				setBase_Class((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)null);
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
			case AADL_ElementsPackage.DATA__BASE_CLASS:
				return base_Class != null;
		}
		return super.eIsSet(featureID);
	}

} //dataImpl
