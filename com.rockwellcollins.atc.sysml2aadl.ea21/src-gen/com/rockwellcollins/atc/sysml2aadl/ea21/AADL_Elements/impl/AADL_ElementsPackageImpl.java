/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsFactory;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.data;
import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.port;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl.ThecustomprofilePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AADL_ElementsPackageImpl extends EPackageImpl implements AADL_ElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AADL_ElementsPackageImpl() {
		super(eNS_URI, AADL_ElementsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AADL_ElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AADL_ElementsPackage init() {
		if (isInited) return (AADL_ElementsPackage)EPackage.Registry.INSTANCE.getEPackage(AADL_ElementsPackage.eNS_URI);

		// Obtain or create and register package
		AADL_ElementsPackageImpl theAADL_ElementsPackage = (AADL_ElementsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AADL_ElementsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AADL_ElementsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UMLPackageImpl theUMLPackage = (UMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI) instanceof UMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI) : UMLPackage.eINSTANCE);
		SysMLPackageImpl theSysMLPackage = (SysMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI) instanceof SysMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI) : SysMLPackage.eINSTANCE);
		ThecustomprofilePackageImpl theThecustomprofilePackage = (ThecustomprofilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThecustomprofilePackage.eNS_URI) instanceof ThecustomprofilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThecustomprofilePackage.eNS_URI) : ThecustomprofilePackage.eINSTANCE);

		// Create package meta-data objects
		theAADL_ElementsPackage.createPackageContents();
		theUMLPackage.createPackageContents();
		theSysMLPackage.createPackageContents();
		theThecustomprofilePackage.createPackageContents();

		// Initialize created meta-data
		theAADL_ElementsPackage.initializePackageContents();
		theUMLPackage.initializePackageContents();
		theSysMLPackage.initializePackageContents();
		theThecustomprofilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAADL_ElementsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AADL_ElementsPackage.eNS_URI, theAADL_ElementsPackage);
		return theAADL_ElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getport() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getport_Direction() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getport_Base_Port() {
		return (EReference)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdata() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdata_Base_Class() {
		return (EReference)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AADL_ElementsFactory getAADL_ElementsFactory() {
		return (AADL_ElementsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__DIRECTION);
		createEReference(portEClass, PORT__BASE_PORT);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__BASE_CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(portEClass, port.class, "port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getport_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getport_Base_Port(), theUMLPackage.getPort(), theUMLPackage.getPort_AadlPort(), "base_Port", null, 0, 1, port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, data.class, "data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdata_Base_Class(), theUMLPackage.getClass_(), theUMLPackage.getClass_AadlData(), "base_Class", null, 0, 1, data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AADL_ElementsPackageImpl
