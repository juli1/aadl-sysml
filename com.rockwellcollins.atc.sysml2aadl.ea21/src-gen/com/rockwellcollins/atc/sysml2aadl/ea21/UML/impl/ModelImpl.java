/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort;
import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl#getData <em>Data</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl#getFlowPort <em>Flow Port</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl#getAADL__Property <em>AADL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends NamedElementImpl implements Model {
	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package> packagedElement;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<port> port;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<data> data;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<block> block;

	/**
	 * The cached value of the '{@link #getFlowPort() <em>Flow Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowPort()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowPort> flowPort;

	/**
	 * The cached value of the '{@link #getAADL__Property() <em>AADL Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAADL__Property()
	 * @generated
	 * @ordered
	 */
	protected EList<AADL__Property> aadL__Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package>(com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package.class, this, UMLPackage.MODEL__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<port> getPort() {
		if (port == null) {
			port = new EObjectContainmentEList<port>(port.class, this, UMLPackage.MODEL__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<data>(data.class, this, UMLPackage.MODEL__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<block> getBlock() {
		if (block == null) {
			block = new EObjectContainmentEList<block>(block.class, this, UMLPackage.MODEL__BLOCK);
		}
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowPort> getFlowPort() {
		if (flowPort == null) {
			flowPort = new EObjectContainmentEList<FlowPort>(FlowPort.class, this, UMLPackage.MODEL__FLOW_PORT);
		}
		return flowPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AADL__Property> getAADL__Property() {
		if (aadL__Property == null) {
			aadL__Property = new EObjectContainmentEList<AADL__Property>(AADL__Property.class, this, UMLPackage.MODEL__AADL_PROPERTY);
		}
		return aadL__Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UMLPackage.MODEL__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
			case UMLPackage.MODEL__PORT:
				return ((InternalEList<?>)getPort()).basicRemove(otherEnd, msgs);
			case UMLPackage.MODEL__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case UMLPackage.MODEL__BLOCK:
				return ((InternalEList<?>)getBlock()).basicRemove(otherEnd, msgs);
			case UMLPackage.MODEL__FLOW_PORT:
				return ((InternalEList<?>)getFlowPort()).basicRemove(otherEnd, msgs);
			case UMLPackage.MODEL__AADL_PROPERTY:
				return ((InternalEList<?>)getAADL__Property()).basicRemove(otherEnd, msgs);
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
			case UMLPackage.MODEL__PACKAGED_ELEMENT:
				return getPackagedElement();
			case UMLPackage.MODEL__PORT:
				return getPort();
			case UMLPackage.MODEL__DATA:
				return getData();
			case UMLPackage.MODEL__BLOCK:
				return getBlock();
			case UMLPackage.MODEL__FLOW_PORT:
				return getFlowPort();
			case UMLPackage.MODEL__AADL_PROPERTY:
				return getAADL__Property();
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
			case UMLPackage.MODEL__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package>)newValue);
				return;
			case UMLPackage.MODEL__PORT:
				getPort().clear();
				getPort().addAll((Collection<? extends port>)newValue);
				return;
			case UMLPackage.MODEL__DATA:
				getData().clear();
				getData().addAll((Collection<? extends data>)newValue);
				return;
			case UMLPackage.MODEL__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends block>)newValue);
				return;
			case UMLPackage.MODEL__FLOW_PORT:
				getFlowPort().clear();
				getFlowPort().addAll((Collection<? extends FlowPort>)newValue);
				return;
			case UMLPackage.MODEL__AADL_PROPERTY:
				getAADL__Property().clear();
				getAADL__Property().addAll((Collection<? extends AADL__Property>)newValue);
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
			case UMLPackage.MODEL__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case UMLPackage.MODEL__PORT:
				getPort().clear();
				return;
			case UMLPackage.MODEL__DATA:
				getData().clear();
				return;
			case UMLPackage.MODEL__BLOCK:
				getBlock().clear();
				return;
			case UMLPackage.MODEL__FLOW_PORT:
				getFlowPort().clear();
				return;
			case UMLPackage.MODEL__AADL_PROPERTY:
				getAADL__Property().clear();
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
			case UMLPackage.MODEL__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case UMLPackage.MODEL__PORT:
				return port != null && !port.isEmpty();
			case UMLPackage.MODEL__DATA:
				return data != null && !data.isEmpty();
			case UMLPackage.MODEL__BLOCK:
				return block != null && !block.isEmpty();
			case UMLPackage.MODEL__FLOW_PORT:
				return flowPort != null && !flowPort.isEmpty();
			case UMLPackage.MODEL__AADL_PROPERTY:
				return aadL__Property != null && !aadL__Property.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
