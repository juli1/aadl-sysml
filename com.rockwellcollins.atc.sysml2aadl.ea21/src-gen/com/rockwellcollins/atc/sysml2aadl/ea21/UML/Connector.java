/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getEnd <em>End</em>}</li>
 *   <li>{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getConnectionAADLProperty <em>Connection AADL Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends NamedElement {
	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getConnector_End()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>Connection AADL Property</b></em>' reference list.
	 * The list contents are of type {@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property}.
	 * It is bidirectional and its opposite is '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection AADL Property</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection AADL Property</em>' reference list.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage#getConnector_ConnectionAADLProperty()
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Connector
	 * @model opposite="base_Connector"
	 * @generated
	 */
	EList<AADL__Property> getConnectionAADLProperty();

} // Connector
