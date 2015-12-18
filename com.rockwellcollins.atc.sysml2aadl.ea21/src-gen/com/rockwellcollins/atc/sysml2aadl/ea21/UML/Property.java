/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getType <em>Type</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getAllAADLProperty <em>All AADL Property</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getUpperValue <em>Upper Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getProperty_Qualifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getQualifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DifferentTypes)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getProperty_Type()
	 * @model
	 * @generated
	 */
	DifferentTypes getType();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DifferentTypes value);

	/**
	 * Returns the value of the '<em><b>All AADL Property</b></em>' reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property}.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All AADL Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All AADL Property</em>' reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getProperty_AllAADLProperty()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Property
	 * @model opposite="base_Property"
	 * @generated
	 */
	EList<AADL__Property> getAllAADLProperty();

	/**
	 * Returns the value of the '<em><b>Lower Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Value</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getProperty_LowerValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralInteger> getLowerValue();

	/**
	 * Returns the value of the '<em><b>Upper Value</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Value</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getProperty_UpperValue()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiteralInteger> getUpperValue();

} // Property
