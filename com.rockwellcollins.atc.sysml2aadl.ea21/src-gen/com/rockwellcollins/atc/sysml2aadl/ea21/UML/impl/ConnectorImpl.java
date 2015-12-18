/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorImpl#getConnectionAADLProperty <em>Connection AADL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends NamedElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> end;

	/**
	 * The cached value of the '{@link #getConnectionAADLProperty() <em>Connection AADL Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionAADLProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<AADL__Property> connectionAADLProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd() {
		if (end == null) {
			end = new EObjectContainmentEList<ConnectorEnd>(ConnectorEnd.class, this, UMLPackage.CONNECTOR__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AADL__Property> getConnectionAADLProperty() {
		if (connectionAADLProperty == null) {
			connectionAADLProperty = new EObjectWithInverseResolvingEList.ManyInverse<AADL__Property>(AADL__Property.class, this, UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY, ThecustomprofilePackage.AADL_PROPERTY__BASE_CONNECTOR);
		}
		return connectionAADLProperty;
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
			case UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionAADLProperty()).basicAdd(otherEnd, msgs);
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
			case UMLPackage.CONNECTOR__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
			case UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY:
				return ((InternalEList<?>)getConnectionAADLProperty()).basicRemove(otherEnd, msgs);
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
			case UMLPackage.CONNECTOR__END:
				return getEnd();
			case UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY:
				return getConnectionAADLProperty();
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
			case UMLPackage.CONNECTOR__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY:
				getConnectionAADLProperty().clear();
				getConnectionAADLProperty().addAll((Collection<? extends AADL__Property>)newValue);
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
			case UMLPackage.CONNECTOR__END:
				getEnd().clear();
				return;
			case UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY:
				getConnectionAADLProperty().clear();
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
			case UMLPackage.CONNECTOR__END:
				return end != null && !end.isEmpty();
			case UMLPackage.CONNECTOR__CONNECTION_AADL_PROPERTY:
				return connectionAADLProperty != null && !connectionAADLProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
