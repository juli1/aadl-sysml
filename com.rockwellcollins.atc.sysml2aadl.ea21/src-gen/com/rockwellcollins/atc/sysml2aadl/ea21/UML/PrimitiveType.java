/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPrimitiveType()
 * @model
 * @generated
 */
public interface PrimitiveType extends DifferentTypes {
	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference.
	 * @see #setGeneralization(Generalization)
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getPrimitiveType_Generalization()
	 * @model containment="true"
	 * @generated
	 */
	Generalization getGeneralization();

	/**
	 * Sets the value of the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType#getGeneralization <em>Generalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' containment reference.
	 * @see #getGeneralization()
	 * @generated
	 */
	void setGeneralization(Generalization value);

} // PrimitiveType
