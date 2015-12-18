/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile;

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
 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofileFactory
 * @model kind="package"
 * @generated
 */
public interface ThecustomprofilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thecustomprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sparxsystems.com/profiles/thecustomprofile/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thecustomprofile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThecustomprofilePackage eINSTANCE = com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.ThecustomprofilePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl <em>AADL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.ThecustomprofilePackageImpl#getAADL__Property()
	 * @generated
	 */
	int AADL_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_PROPERTY__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>AADL Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_PROPERTY__AADL_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_PROPERTY__BASE_CONNECTOR = 2;

	/**
	 * The number of structural features of the '<em>AADL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>AADL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AADL_PROPERTY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property <em>AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AADL Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property
	 * @generated
	 */
	EClass getAADL__Property();

	/**
	 * Returns the meta object for the reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Property()
	 * @see #getAADL__Property()
	 * @generated
	 */
	EReference getAADL__Property_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getAADL__Property <em>AADL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AADL Property</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getAADL__Property()
	 * @see #getAADL__Property()
	 * @generated
	 */
	EAttribute getAADL__Property_AADL__Property();

	/**
	 * Returns the meta object for the reference list '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Connector</em>'.
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property#getBase_Connector()
	 * @see #getAADL__Property()
	 * @generated
	 */
	EReference getAADL__Property_Base_Connector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThecustomprofileFactory getThecustomprofileFactory();

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
		 * The meta object literal for the '{@link com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl <em>AADL Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.AADL__PropertyImpl
		 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.ThecustomprofilePackageImpl#getAADL__Property()
		 * @generated
		 */
		EClass AADL_PROPERTY = eINSTANCE.getAADL__Property();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL_PROPERTY__BASE_PROPERTY = eINSTANCE.getAADL__Property_Base_Property();

		/**
		 * The meta object literal for the '<em><b>AADL Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AADL_PROPERTY__AADL_PROPERTY = eINSTANCE.getAADL__Property_AADL__Property();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AADL_PROPERTY__BASE_CONNECTOR = eINSTANCE.getAADL__Property_Base_Connector();

	}

} //ThecustomprofilePackage
