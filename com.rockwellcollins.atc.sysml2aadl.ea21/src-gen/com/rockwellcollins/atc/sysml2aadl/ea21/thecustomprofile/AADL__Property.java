/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AADL Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getAADL__Property <em>AADL Property</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Connector <em>Base Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage#getAADL__Property()
 * @model
 * @generated
 */
public interface AADL__Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property}.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getAllAADLProperty <em>All AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage#getAADL__Property_Base_Property()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getAllAADLProperty
	 * @model opposite="allAADLProperty"
	 * @generated
	 */
	EList<Property> getBase_Property();

	/**
	 * Returns the value of the '<em><b>AADL Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AADL Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AADL Property</em>' attribute.
	 * @see #setAADL__Property(String)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage#getAADL__Property_AADL__Property()
	 * @model
	 * @generated
	 */
	String getAADL__Property();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getAADL__Property <em>AADL Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AADL Property</em>' attribute.
	 * @see #getAADL__Property()
	 * @generated
	 */
	void setAADL__Property(String value);

	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector}.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getConnectionAADLProperty <em>Connection AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage#getAADL__Property_Base_Connector()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getConnectionAADLProperty
	 * @model opposite="ConnectionAADLProperty"
	 * @generated
	 */
	EList<Connector> getBase_Connector();

} // AADL__Property
