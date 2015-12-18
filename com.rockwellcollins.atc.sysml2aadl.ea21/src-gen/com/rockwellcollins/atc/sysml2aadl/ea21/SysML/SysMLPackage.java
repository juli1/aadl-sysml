/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.SysML;

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
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLFactory
 * @model kind="package"
 * @generated
 */
public interface SysMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SysML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sparxsystems.com/profiles/SysML1.3/1.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SysML1.3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SysMLPackage eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.blockImpl <em>block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.blockImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl#getblock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.FlowPortImpl <em>Flow Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.FlowPortImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl#getFlowPort()
	 * @generated
	 */
	int FLOW_PORT = 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT__BASE_PORT = 1;

	/**
	 * The number of structural features of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_PORT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block <em>block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>block</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block
	 * @generated
	 */
	EClass getblock();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block#getBase_Class()
	 * @see #getblock()
	 * @generated
	 */
	EReference getblock_Base_Class();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort <em>Flow Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort
	 * @generated
	 */
	EClass getFlowPort();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort#getDirection()
	 * @see #getFlowPort()
	 * @generated
	 */
	EAttribute getFlowPort_Direction();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort#getBase_Port()
	 * @see #getFlowPort()
	 * @generated
	 */
	EReference getFlowPort_Base_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SysMLFactory getSysMLFactory();

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
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.blockImpl <em>block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.blockImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl#getblock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getblock();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BASE_CLASS = eINSTANCE.getblock_Base_Class();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.FlowPortImpl <em>Flow Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.FlowPortImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl#getFlowPort()
		 * @generated
		 */
		EClass FLOW_PORT = eINSTANCE.getFlowPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_PORT__DIRECTION = eINSTANCE.getFlowPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_PORT__BASE_PORT = eINSTANCE.getFlowPort_Base_Port();

	}

} //SysMLPackage
