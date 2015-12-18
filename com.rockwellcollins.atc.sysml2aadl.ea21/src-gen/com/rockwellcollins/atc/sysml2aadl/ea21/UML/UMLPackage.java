/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.UML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLFactory
 * @model kind="package"
 * @generated
 */
public interface UMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/spec/UML/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UMLPackage eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ElementImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.NamedElementImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PACKAGED_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DATA = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BLOCK = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__FLOW_PORT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>AADL Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__AADL_PROPERTY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PackageImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PACKAGED_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.DifferentTypesImpl <em>Different Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.DifferentTypesImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getDifferentTypes()
	 * @generated
	 */
	int DIFFERENT_TYPES = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_TYPES__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Different Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_TYPES_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Different Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFFERENT_TYPES_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = DIFFERENT_TYPES__NAME;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_ATTRIBUTE = DIFFERENT_TYPES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PORT = DIFFERENT_TYPES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aadl Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__AADL_DATA = DIFFERENT_TYPES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPLEMENTS = DIFFERENT_TYPES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_CONNECTOR = DIFFERENT_TYPES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sysml Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SYSML_BLOCK = DIFFERENT_TYPES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_BEHAVIOR = DIFFERENT_TYPES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_RULE = DIFFERENT_TYPES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OWNED_PARAMETER = DIFFERENT_TYPES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Body Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__BODY_CONDITION = DIFFERENT_TYPES_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = DIFFERENT_TYPES_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = DIFFERENT_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aadl Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__AADL_PORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sysml Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__SYSML_PORT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__LOWER_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__UPPER_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__QUALIFIER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>All AADL Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ALL_AADL_PROPERTY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__LOWER_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__UPPER_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RealizationImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 7;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SUPPLIER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__CLIENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__END = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connection AADL Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CONNECTION_AADL_PROPERTY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorEndImpl <em>Connector End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorEndImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getConnectorEnd()
	 * @generated
	 */
	int CONNECTOR_END = 9;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END__ROLE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Connector End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_END_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionEndpointImpl <em>Transition Endpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionEndpointImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getTransitionEndpoint()
	 * @generated
	 */
	int TRANSITION_ENDPOINT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ENDPOINT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Transition Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ENDPOINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transition Endpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_ENDPOINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateMachineImpl <em>State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateMachineImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getStateMachine()
	 * @generated
	 */
	int STATE_MACHINE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NAME = TRANSITION_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__REGION = TRANSITION_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__NESTED_CLASSIFIER = TRANSITION_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__SUBVERTEX = TRANSITION_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE__TRANSITION = TRANSITION_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_FEATURE_COUNT = TRANSITION_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_MACHINE_OPERATION_COUNT = TRANSITION_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RegionImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Subvertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__SUBVERTEX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getState()
	 * @generated
	 */
	int STATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = TRANSITION_ENDPOINT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = TRANSITION_ENDPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = TRANSITION_ENDPOINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY = TRANSITION_ENDPOINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DO_ACTIVITY = TRANSITION_ENDPOINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = TRANSITION_ENDPOINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = TRANSITION_ENDPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PseudostateImpl <em>Pseudostate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PseudostateImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPseudostate()
	 * @generated
	 */
	int PSEUDOSTATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pseudostate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDOSTATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.FinalStateImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__INCOMING = STATE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__OUTGOING = STATE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__ENTRY = STATE__ENTRY;

	/**
	 * The feature id for the '<em><b>Do Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__DO_ACTIVITY = STATE__DO_ACTIVITY;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EFFECT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConstraintImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 17;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SPECIFICATION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueExpressionImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getOpaqueExpression()
	 * @generated
	 */
	int OPAQUE_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION__BODY = 0;

	/**
	 * The number of structural features of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Opaque Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.BehaviorImpl <em>Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.BehaviorImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getBehavior()
	 * @generated
	 */
	int BEHAVIOR = 19;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR__OWNED_OPERATION = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueBehaviorImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getOpaqueBehavior()
	 * @generated
	 */
	int OPAQUE_BEHAVIOR = 20;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR__BODY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Opaque Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_BEHAVIOR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PrimitiveTypeImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__NAME = DIFFERENT_TYPES__NAME;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GENERALIZATION = DIFFERENT_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DIFFERENT_TYPES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DIFFERENT_TYPES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.GeneralizationImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 23;

	/**
	 * The feature id for the '<em><b>General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__GENERAL = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.LiteralIntegerImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getLiteralInteger()
	 * @generated
	 */
	int LITERAL_INTEGER = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER__VALUE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_INTEGER_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getPackagedElement()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_PackagedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getPort()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getData()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getBlock()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Block();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getFlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getFlowPort()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_FlowPort();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getAADL__Property <em>AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>AADL Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Model#getAADL__Property()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_AADL__Property();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package#getPackagedElement()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_PackagedElement();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedAttribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedPort <em>Owned Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedPort()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedPort();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getAadlData <em>Aadl Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aadl Data</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getAadlData()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_AadlData();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getImplements()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Implements();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedConnector <em>Owned Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Connector</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedConnector()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedConnector();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getSysmlBlock <em>Sysml Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sysml Block</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getSysmlBlock()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SysmlBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedBehavior <em>Owned Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Behavior</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedBehavior()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedRule <em>Owned Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rule</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedRule()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedRule();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedParameter <em>Owned Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getOwnedParameter()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_OwnedParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getBodyCondition <em>Body Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body Condition</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class#getBodyCondition()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_BodyCondition();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Type();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getAadlPort <em>Aadl Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Aadl Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getAadlPort()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_AadlPort();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getSysmlPort <em>Sysml Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sysml Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getSysmlPort()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_SysmlPort();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lower Value</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getLowerValue()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_LowerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Value</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port#getUpperValue()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_UpperValue();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getQualifier()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Qualifier();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Type();

	/**
	 * Returns the meta object for the reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getAllAADLProperty <em>All AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All AADL Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getAllAADLProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_AllAADLProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getLowerValue <em>Lower Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lower Value</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getLowerValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_LowerValue();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getUpperValue <em>Upper Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Value</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property#getUpperValue()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_UpperValue();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getSupplier()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Supplier();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Realization#getClient()
	 * @see #getRealization()
	 * @generated
	 */
	EReference getRealization_Client();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getEnd()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_End();

	/**
	 * Returns the meta object for the reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getConnectionAADLProperty <em>Connection AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection AADL Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector#getConnectionAADLProperty()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ConnectionAADLProperty();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd <em>Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector End</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd
	 * @generated
	 */
	EClass getConnectorEnd();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd#getRole()
	 * @see #getConnectorEnd()
	 * @generated
	 */
	EReference getConnectorEnd_Role();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Machine</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine
	 * @generated
	 */
	EClass getStateMachine();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getRegion()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Region();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getNestedClassifier <em>Nested Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Classifier</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getNestedClassifier()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_NestedClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getSubvertex()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine#getTransition()
	 * @see #getStateMachine()
	 * @generated
	 */
	EReference getStateMachine_Transition();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region#getSubvertex <em>Subvertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subvertex</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region#getSubvertex()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Subvertex();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region#getTransition()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Transition();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for the containment reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getEntry()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getDoActivity <em>Do Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Do Activity</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.State#getDoActivity()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DoActivity();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Pseudostate <em>Pseudostate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudostate</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Pseudostate
	 * @generated
	 */
	EClass getPseudostate();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the containment reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition#getEffect()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Effect();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.TransitionEndpoint <em>Transition Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Endpoint</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.TransitionEndpoint
	 * @generated
	 */
	EClass getTransitionEndpoint();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Constraint#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Constraint#getSpecification()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Specification();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Expression</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueExpression
	 * @generated
	 */
	EClass getOpaqueExpression();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueExpression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueExpression#getBody()
	 * @see #getOpaqueExpression()
	 * @generated
	 */
	EAttribute getOpaqueExpression_Body();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Behavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Behavior
	 * @generated
	 */
	EClass getBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Behavior#getOwnedOperation <em>Owned Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Behavior#getOwnedOperation()
	 * @see #getBehavior()
	 * @generated
	 */
	EReference getBehavior_OwnedOperation();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueBehavior <em>Opaque Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Behavior</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueBehavior
	 * @generated
	 */
	EClass getOpaqueBehavior();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueBehavior#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.OpaqueBehavior#getBody()
	 * @see #getOpaqueBehavior()
	 * @generated
	 */
	EAttribute getOpaqueBehavior_Body();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.DifferentTypes <em>Different Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Different Types</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.DifferentTypes
	 * @generated
	 */
	EClass getDifferentTypes();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the containment reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generalization</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType#getGeneralization()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EReference getPrimitiveType_Generalization();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.Generalization#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>General</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.Generalization#getGeneral()
	 * @see #getGeneralization()
	 * @generated
	 */
	EAttribute getGeneralization_General();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Integer</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger
	 * @generated
	 */
	EClass getLiteralInteger();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger#getValue()
	 * @see #getLiteralInteger()
	 * @generated
	 */
	EAttribute getLiteralInteger_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLFactory getUMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ElementImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.NamedElementImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ModelImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PACKAGED_ELEMENT = eINSTANCE.getModel_PackagedElement();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PORT = eINSTANCE.getModel_Port();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DATA = eINSTANCE.getModel_Data();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__BLOCK = eINSTANCE.getModel_Block();

		/**
		 * The meta object literal for the '<em><b>Flow Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__FLOW_PORT = eINSTANCE.getModel_FlowPort();

		/**
		 * The meta object literal for the '<em><b>AADL Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__AADL_PROPERTY = eINSTANCE.getModel_AADL__Property();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PackageImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getPackage_PackagedElement();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ClassImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_ATTRIBUTE = eINSTANCE.getClass_OwnedAttribute();

		/**
		 * The meta object literal for the '<em><b>Owned Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_PORT = eINSTANCE.getClass_OwnedPort();

		/**
		 * The meta object literal for the '<em><b>Aadl Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__AADL_DATA = eINSTANCE.getClass_AadlData();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPLEMENTS = eINSTANCE.getClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Owned Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_CONNECTOR = eINSTANCE.getClass_OwnedConnector();

		/**
		 * The meta object literal for the '<em><b>Sysml Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SYSML_BLOCK = eINSTANCE.getClass_SysmlBlock();

		/**
		 * The meta object literal for the '<em><b>Owned Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_BEHAVIOR = eINSTANCE.getClass_OwnedBehavior();

		/**
		 * The meta object literal for the '<em><b>Owned Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_RULE = eINSTANCE.getClass_OwnedRule();

		/**
		 * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__OWNED_PARAMETER = eINSTANCE.getClass_OwnedParameter();

		/**
		 * The meta object literal for the '<em><b>Body Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__BODY_CONDITION = eINSTANCE.getClass_BodyCondition();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PortImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Aadl Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__AADL_PORT = eINSTANCE.getPort_AadlPort();

		/**
		 * The meta object literal for the '<em><b>Sysml Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__SYSML_PORT = eINSTANCE.getPort_SysmlPort();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__LOWER_VALUE = eINSTANCE.getPort_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__UPPER_VALUE = eINSTANCE.getPort_UpperValue();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PropertyImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__QUALIFIER = eINSTANCE.getProperty_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>All AADL Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__ALL_AADL_PROPERTY = eINSTANCE.getProperty_AllAADLProperty();

		/**
		 * The meta object literal for the '<em><b>Lower Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__LOWER_VALUE = eINSTANCE.getProperty_LowerValue();

		/**
		 * The meta object literal for the '<em><b>Upper Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__UPPER_VALUE = eINSTANCE.getProperty_UpperValue();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RealizationImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__SUPPLIER = eINSTANCE.getRealization_Supplier();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REALIZATION__CLIENT = eINSTANCE.getRealization_Client();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__END = eINSTANCE.getConnector_End();

		/**
		 * The meta object literal for the '<em><b>Connection AADL Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__CONNECTION_AADL_PROPERTY = eINSTANCE.getConnector_ConnectionAADLProperty();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorEndImpl <em>Connector End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConnectorEndImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getConnectorEnd()
		 * @generated
		 */
		EClass CONNECTOR_END = eINSTANCE.getConnectorEnd();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR_END__ROLE = eINSTANCE.getConnectorEnd_Role();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateMachineImpl <em>State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateMachineImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getStateMachine()
		 * @generated
		 */
		EClass STATE_MACHINE = eINSTANCE.getStateMachine();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

		/**
		 * The meta object literal for the '<em><b>Nested Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__NESTED_CLASSIFIER = eINSTANCE.getStateMachine_NestedClassifier();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__SUBVERTEX = eINSTANCE.getStateMachine_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_MACHINE__TRANSITION = eINSTANCE.getStateMachine_Transition();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.RegionImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Subvertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__SUBVERTEX = eINSTANCE.getRegion_Subvertex();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__TRANSITION = eINSTANCE.getRegion_Transition();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.StateImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY = eINSTANCE.getState_Entry();

		/**
		 * The meta object literal for the '<em><b>Do Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DO_ACTIVITY = eINSTANCE.getState_DoActivity();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PseudostateImpl <em>Pseudostate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PseudostateImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPseudostate()
		 * @generated
		 */
		EClass PSEUDOSTATE = eINSTANCE.getPseudostate();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.FinalStateImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EFFECT = eINSTANCE.getTransition_Effect();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionEndpointImpl <em>Transition Endpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.TransitionEndpointImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getTransitionEndpoint()
		 * @generated
		 */
		EClass TRANSITION_ENDPOINT = eINSTANCE.getTransitionEndpoint();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.ConstraintImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SPECIFICATION = eINSTANCE.getConstraint_Specification();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueExpressionImpl <em>Opaque Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueExpressionImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getOpaqueExpression()
		 * @generated
		 */
		EClass OPAQUE_EXPRESSION = eINSTANCE.getOpaqueExpression();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_EXPRESSION__BODY = eINSTANCE.getOpaqueExpression_Body();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.BehaviorImpl <em>Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.BehaviorImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getBehavior()
		 * @generated
		 */
		EClass BEHAVIOR = eINSTANCE.getBehavior();

		/**
		 * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR__OWNED_OPERATION = eINSTANCE.getBehavior_OwnedOperation();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueBehaviorImpl <em>Opaque Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.OpaqueBehaviorImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getOpaqueBehavior()
		 * @generated
		 */
		EClass OPAQUE_BEHAVIOR = eINSTANCE.getOpaqueBehavior();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_BEHAVIOR__BODY = eINSTANCE.getOpaqueBehavior_Body();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.DifferentTypesImpl <em>Different Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.DifferentTypesImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getDifferentTypes()
		 * @generated
		 */
		EClass DIFFERENT_TYPES = eINSTANCE.getDifferentTypes();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PrimitiveTypeImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE__GENERALIZATION = eINSTANCE.getPrimitiveType_Generalization();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.GeneralizationImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>General</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.LiteralIntegerImpl <em>Literal Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.LiteralIntegerImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl#getLiteralInteger()
		 * @generated
		 */
		EClass LITERAL_INTEGER = eINSTANCE.getLiteralInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_INTEGER__VALUE = eINSTANCE.getLiteralInteger_Value();

	}

} //UMLPackage
