/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RealizationImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RealizationImpl#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealizationImpl extends ElementImpl implements Realization {
	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class supplier;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class client;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.REALIZATION__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplier(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class newSupplier) {
		com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.REALIZATION__SUPPLIER, oldSupplier, supplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UMLPackage.REALIZATION__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClient(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class newClient, NotificationChain msgs) {
		com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class oldClient = client;
		client = newClient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UMLPackage.REALIZATION__CLIENT, oldClient, newClient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class newClient) {
		if (newClient != client) {
			NotificationChain msgs = null;
			if (client != null)
				msgs = ((InternalEObject)client).eInverseRemove(this, UMLPackage.CLASS__IMPLEMENTS, com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, msgs);
			if (newClient != null)
				msgs = ((InternalEObject)newClient).eInverseAdd(this, UMLPackage.CLASS__IMPLEMENTS, com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, msgs);
			msgs = basicSetClient(newClient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UMLPackage.REALIZATION__CLIENT, newClient, newClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.REALIZATION__CLIENT:
				if (client != null)
					msgs = ((InternalEObject)client).eInverseRemove(this, UMLPackage.CLASS__IMPLEMENTS, com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class.class, msgs);
				return basicSetClient((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)otherEnd, msgs);
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
			case UMLPackage.REALIZATION__CLIENT:
				return basicSetClient(null, msgs);
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
			case UMLPackage.REALIZATION__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case UMLPackage.REALIZATION__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
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
			case UMLPackage.REALIZATION__SUPPLIER:
				setSupplier((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)newValue);
				return;
			case UMLPackage.REALIZATION__CLIENT:
				setClient((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)newValue);
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
			case UMLPackage.REALIZATION__SUPPLIER:
				setSupplier((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)null);
				return;
			case UMLPackage.REALIZATION__CLIENT:
				setClient((com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class)null);
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
			case UMLPackage.REALIZATION__SUPPLIER:
				return supplier != null;
			case UMLPackage.REALIZATION__CLIENT:
				return client != null;
		}
		return super.eIsSet(featureID);
	}

} //RealizationImpl
