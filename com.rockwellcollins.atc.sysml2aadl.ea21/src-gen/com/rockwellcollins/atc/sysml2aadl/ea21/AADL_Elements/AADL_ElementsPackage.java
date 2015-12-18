/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements;

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
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsFactory
 * @model kind="package"
 * @generated
 */
public interface AADL_ElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AADL_Elements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sparxsystems.com/profiles/AADL_Elements/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AADL_Elements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AADL_ElementsPackage eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.portImpl <em>port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.portImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl#getport()
	 * @generated
	 */
	int PORT = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = 1;

	/**
	 * The number of structural features of the '<em>port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.dataImpl <em>data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.dataImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl#getdata()
	 * @generated
	 */
	int DATA = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port <em>port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port
	 * @generated
	 */
	EClass getport();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getDirection()
	 * @see #getport()
	 * @generated
	 */
	EAttribute getport_Direction();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port#getBase_Port()
	 * @see #getport()
	 * @generated
	 */
	EReference getport_Base_Port();

	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data <em>data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>data</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data
	 * @generated
	 */
	EClass getdata();

	/**
	 * Returns the meta object for the reference '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data#getBase_Class()
	 * @see #getdata()
	 * @generated
	 */
	EReference getdata_Base_Class();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AADL_ElementsFactory getAADL_ElementsFactory();

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
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.portImpl <em>port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.portImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl#getport()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getport();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getport_Direction();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BASE_PORT = eINSTANCE.getport_Base_Port();

		/**
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.dataImpl <em>data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.dataImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl#getdata()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getdata();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__BASE_CLASS = eINSTANCE.getdata_Base_Class();

	}

} //AADL_ElementsPackage
