/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.FlowPort;
import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLFactory;
import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage;
import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.block;

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
public class SysMLPackageImpl extends EPackageImpl implements SysMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowPortEClass = null;

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
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SysMLPackageImpl() {
		super(eNS_URI, SysMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SysMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SysMLPackage init() {
		if (isInited) return (SysMLPackage)EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI);

		// Obtain or create and register package
		SysMLPackageImpl theSysMLPackage = (SysMLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SysMLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SysMLPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UMLPackageImpl theUMLPackage = (UMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI) instanceof UMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI) : UMLPackage.eINSTANCE);
		AADL_ElementsPackageImpl theAADL_ElementsPackage = (AADL_ElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AADL_ElementsPackage.eNS_URI) instanceof AADL_ElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AADL_ElementsPackage.eNS_URI) : AADL_ElementsPackage.eINSTANCE);
		ThecustomprofilePackageImpl theThecustomprofilePackage = (ThecustomprofilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThecustomprofilePackage.eNS_URI) instanceof ThecustomprofilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThecustomprofilePackage.eNS_URI) : ThecustomprofilePackage.eINSTANCE);

		// Create package meta-data objects
		theSysMLPackage.createPackageContents();
		theUMLPackage.createPackageContents();
		theAADL_ElementsPackage.createPackageContents();
		theThecustomprofilePackage.createPackageContents();

		// Initialize created meta-data
		theSysMLPackage.initializePackageContents();
		theUMLPackage.initializePackageContents();
		theAADL_ElementsPackage.initializePackageContents();
		theThecustomprofilePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysMLPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SysMLPackage.eNS_URI, theSysMLPackage);
		return theSysMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getblock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getblock_Base_Class() {
		return (EReference)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowPort() {
		return flowPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowPort_Direction() {
		return (EAttribute)flowPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowPort_Base_Port() {
		return (EReference)flowPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysMLFactory getSysMLFactory() {
		return (SysMLFactory)getEFactoryInstance();
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
		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__BASE_CLASS);

		flowPortEClass = createEClass(FLOW_PORT);
		createEAttribute(flowPortEClass, FLOW_PORT__DIRECTION);
		createEReference(flowPortEClass, FLOW_PORT__BASE_PORT);
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
		initEClass(blockEClass, block.class, "block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getblock_Base_Class(), theUMLPackage.getClass_(), theUMLPackage.getClass_SysmlBlock(), "base_Class", null, 0, 1, block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowPortEClass, FlowPort.class, "FlowPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowPort_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlowPort_Base_Port(), theUMLPackage.getPort(), theUMLPackage.getPort_SysmlPort(), "base_Port", null, 0, 1, FlowPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SysMLPackageImpl
