/**
 */
package com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.impl;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.AADL_ElementsPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.AADL_Elements.impl.AADL_ElementsPackageImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.SysMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.SysML.impl.SysMLPackageImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.UMLPackage;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.UMLPackageImpl;

import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofileFactory;
import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage;

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
public class ThecustomprofilePackageImpl extends EPackageImpl implements ThecustomprofilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aadL__PropertyEClass = null;

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
	 * @see com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.ThecustomprofilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThecustomprofilePackageImpl() {
		super(eNS_URI, ThecustomprofileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ThecustomprofilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThecustomprofilePackage init() {
		if (isInited) return (ThecustomprofilePackage)EPackage.Registry.INSTANCE.getEPackage(ThecustomprofilePackage.eNS_URI);

		// Obtain or create and register package
		ThecustomprofilePackageImpl theThecustomprofilePackage = (ThecustomprofilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThecustomprofilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThecustomprofilePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		UMLPackageImpl theUMLPackage = (UMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI) instanceof UMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI) : UMLPackage.eINSTANCE);
		AADL_ElementsPackageImpl theAADL_ElementsPackage = (AADL_ElementsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AADL_ElementsPackage.eNS_URI) instanceof AADL_ElementsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AADL_ElementsPackage.eNS_URI) : AADL_ElementsPackage.eINSTANCE);
		SysMLPackageImpl theSysMLPackage = (SysMLPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI) instanceof SysMLPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SysMLPackage.eNS_URI) : SysMLPackage.eINSTANCE);

		// Create package meta-data objects
		theThecustomprofilePackage.createPackageContents();
		theUMLPackage.createPackageContents();
		theAADL_ElementsPackage.createPackageContents();
		theSysMLPackage.createPackageContents();

		// Initialize created meta-data
		theThecustomprofilePackage.initializePackageContents();
		theUMLPackage.initializePackageContents();
		theAADL_ElementsPackage.initializePackageContents();
		theSysMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThecustomprofilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThecustomprofilePackage.eNS_URI, theThecustomprofilePackage);
		return theThecustomprofilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAADL__Property() {
		return aadL__PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAADL__Property_Base_Property() {
		return (EReference)aadL__PropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAADL__Property_AADL__Property() {
		return (EAttribute)aadL__PropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAADL__Property_Base_Connector() {
		return (EReference)aadL__PropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThecustomprofileFactory getThecustomprofileFactory() {
		return (ThecustomprofileFactory)getEFactoryInstance();
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
		aadL__PropertyEClass = createEClass(AADL_PROPERTY);
		createEReference(aadL__PropertyEClass, AADL_PROPERTY__BASE_PROPERTY);
		createEAttribute(aadL__PropertyEClass, AADL_PROPERTY__AADL_PROPERTY);
		createEReference(aadL__PropertyEClass, AADL_PROPERTY__BASE_CONNECTOR);
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
		initEClass(aadL__PropertyEClass, AADL__Property.class, "AADL__Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAADL__Property_Base_Property(), theUMLPackage.getProperty(), theUMLPackage.getProperty_AllAADLProperty(), "base_Property", null, 0, -1, AADL__Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAADL__Property_AADL__Property(), ecorePackage.getEString(), "AADL__Property", null, 0, 1, AADL__Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAADL__Property_Base_Connector(), theUMLPackage.getConnector(), theUMLPackage.getConnector_ConnectionAADLProperty(), "base_Connector", null, 0, -1, AADL__Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ThecustomprofilePackageImpl
