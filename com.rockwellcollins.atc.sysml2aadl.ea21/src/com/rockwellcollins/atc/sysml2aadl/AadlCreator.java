/*
Copyright (c) 2015, Rockwell Collins.
Developed with the sponsorship of Defense Advanced Research Projects Agency (DARPA).

Permission is hereby granted, free of charge, to any person obtaining a copy of this data, 
including any software or models in source or binary form, as well as any drawings, specifications, 
and documentation (collectively "the Data"), to deal in the Data without restriction, including
without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
and/or sell copies of the Data, and to permit persons to whom the Data is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or 
substantial portions of the Data.

THE DATA IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
IN NO EVENT SHALL THE AUTHORS, SPONSORS, DEVELOPERS, CONTRIBUTORS, OR COPYRIGHT HOLDERS BE LIABLE 
FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, 
ARISING FROM, OUT OF OR IN CONNECTION WITH THE DATA OR THE USE OR OTHER DEALINGS IN THE DATA.
*/

package com.rockwellcollins.atc.sysml2aadl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.Aadl2Factory;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Comment;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.EnumerationType;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.MetaclassReference;
import org.osate.aadl2.PortConnection;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.PropertyExpression;
import org.osate.aadl2.PropertySet;
import org.osate.aadl2.PropertyValue;
import org.osate.aadl2.StructuralFeature;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;










import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Element;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.BehaviorImpl;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.util.UMLSwitch;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.DifferentTypes;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector;
import com.rockwellcollins.atc.sysml2aadl.ea21.thecustomprofile.AADL__Property;

public class AadlCreator extends UMLSwitch<Object> {
	
	private final Map<Element, AObject> map = new HashMap<>();
	private final Map<Element, WrapperAObject> wrapperMap = new HashMap<Element, WrapperAObject>();
	public class MapVarSpec {
		String varName;
		String varType;
		
		MapVarSpec(String name, String type) {
			this.varName = name;
			this.varType = type;
		}
	}
	public Map<String, List<MapVarSpec>> mapVars = new HashMap<String, List<MapVarSpec>>();

	private static final Object DONE = new Object();
	private static final Aadl2Factory f = Aadl2Factory.eINSTANCE;
	public Map<String, String> mapContracts = new HashMap<>();
	public Map<StateMachine, AObject> mapStateMachine = new HashMap<>(); //store statemachine
	private String contractsFilename;
	private String inputFilename;
	private Logger log;
	public boolean typeHasImpl = false;
	public boolean fillWrapperMapType = false;
	public AadlCreator(String inputFilename, String contractsFilename, Logger log) {
		this.inputFilename = inputFilename;
		this.contractsFilename = contractsFilename;
		this.log = log;
	
	}
	int intConnectioncount = 0;

	class WrapperAObject {
	    public WrapperAObject(AObject cType, AObject cImpl) {
	       this.cType = cType;
	       this.cImpl = cImpl;
	    }

	    public AObject getcType(){ return this.cType;}
	    public AObject getcImpl(){ return this.cImpl;}

	    private AObject cType;
	    private AObject cImpl;
	}

	
	public Map<Element, AObject> getMap() {
		return map;
	}
	
	public Map<String, List<MapVarSpec>> getVarsMap() {
		return mapVars;
	}
	
	public Map<String, String> getContractsMap() {
		return mapContracts;
	}
	//get statemachine info
	public Map<StateMachine, AObject> getStateMachineMap() {
		return mapStateMachine;
	}
	
	public Map<Element, WrapperAObject> getWrapperMap() {
		return wrapperMap;
	}
	

	@Override
	public Object casePackage(Package ep) {
		AadlPackage ap = f.createAadlPackage();
		ap.setName(ep.getName());
		ap.setOwnedPublicSection(f.createPublicPackageSection());
		ap.setOwnedPrivateSection(f.createPrivatePackageSection());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String locationPlusTime = "SysML Source: " + inputFilename + "\r\n" + "-- " + "Created: " + timeStamp;
		Comment comment = ap.createOwnedComment();
		comment.setBody(locationPlusTime);
		map.put(ep, ap);
		return DONE;
	}

	@Override
	public Object caseClass(Class ec) {
		
		//Classes like operations in a state was being created as Component Types or Impls to prevent that
		if(!(ec.eContainer() instanceof BehaviorImpl || ec.eContainer().eContainer() instanceof BehaviorImpl))
		{
				ComponentClassifier acc = createComponentClassifier(ec);
				acc.setName(getName(ec));
				f.createProperty();
				f.createPropertyAssociation();
				
				if (typeHasImpl)
				{
					if (acc instanceof ComponentImplementation)
					{
						wrapperMap.put(ec, new WrapperAObject(null,acc));
					}
				}
				
				if (fillWrapperMapType)
				{
					fillWrapperMapType = false;
					if (acc instanceof ComponentType)
					{
						WrapperAObject WrapperInstance = wrapperMap.get(ec);
						AObject cImpl = WrapperInstance.cImpl;
						wrapperMap.put(ec, new WrapperAObject(acc,cImpl));	
					}
					
				}
				map.put(ec, acc);
			
				if (ec.getOwnedBehavior()!= null)
				{
					createStateMachine(ec.getOwnedBehavior(), acc);
				}

		
			}
		
		//Handling local Variables
		if (ec.getOwnedAttribute() != null)
		{
			
			for (Property ep: ec.getOwnedAttribute())
			{
				if(ep.getName().contains("local::"))
				{
					String[] localVariableName = ep.getName().split("::");
					if (!mapVars.containsKey(ec.getName())) {
					mapVars.put(ec.getName(), new ArrayList<MapVarSpec>());
				}
				mapVars.get(ec.getName()).add(new MapVarSpec(localVariableName[1], ep.getType().getName()));

				}
			}
		}
		
		if (typeHasImpl)
		{
			typeHasImpl = false;
			fillWrapperMapType = true;
			caseClass(ec);
		}
		
			
		return DONE;
	}

	private String getName(Class ec) {
		if (ec.getImplements() != null) {
			Class base = ec.getImplements().getSupplier();
			return base.getName() + "." + ec.getName();
		}
		
		if(typeHasImpl)
		{
			String cImplName = ec.getName() + "."+ec.getName()+"_impl";
			return cImplName;
		}
		return ec.getName();
	}

	/* This method checks for component type or implementation */
	public ComponentClassifier createComponentClassifier(Class ec) {
		if (ec.getImplements() != null) { 
			return createComponentImplementation(ec);
		} 
		/*CType has CImpl without realization*/
		if(ec.getOwnedConnector().size() != 0 && !fillWrapperMapType) 
		{
			typeHasImpl = true;
			return createComponentImplementation(ec);
		}
			
		return createComponentType(ec);
		
	}

	/* This method creates component type based on the type of the component */
	private ComponentClassifier createComponentType(Class ec) {

		if (ec.getAadlData() != null) {
			return f.createDataType();
		}
		/** Saving contract information for component type**/
		
		saveContractInfo(ec, ec.getName());
		
		/* Generate SysML blocks as System Types "right now not needed as if its not data its by default system" */
		if(ec.getSysmlBlock() !=null)
		{
			return f.createSystemType();
		}
		
		return f.createSystemType();
	}

	/*
	 * This method creates implementation type for a component based on the type
	 * of the component
	 */
	private ComponentClassifier createComponentImplementation(Class ec) {

		String ctciName;
		if (ec.getAadlData() != null) {
			return f.createDataImplementation();
			
		}
		if(!typeHasImpl)
		{
			ctciName =  ec.getImplements().getSupplier().getName()  + "." + ec.getName();
		} else
		{
			ctciName = ec.getName() + "." +ec.getName() +"_Impl";
		}
				
		// save contract info for componentImpl
		saveContractInfo(ec, ctciName);
		
		/*  Generate SysML blocks as System Implementations "right now not needed as if its not data its by default system"	 */
		if(ec.getSysmlBlock() != null)
		{
			return f.createSystemImplementation();
		}
		
			return f.createSystemImplementation();
	}

	@Override
	public Object casePort(Port ep) {
		DataPort adp = f.createDataPort(); 
		String aadlDirection = null;
		adp.setName(ep.getName());
		if (ep.getAadlPort()!=null){
			aadlDirection = ep.getAadlPort().getDirection(); //getting ports developed using AADL profile in SysML

		}			
		if (ep.getSysmlPort()!=null){
			aadlDirection = ep.getSysmlPort().getDirection();// getting SysML ports
		}
			if (aadlDirection == null)
			{
				adp.setOut(false);
				adp.setIn(false);
			}
			else	
			{
				if(aadlDirection.equals("in") )
				{
					adp.setIn(true);
					adp.setOut(false);
				}
					if(aadlDirection.equals("out"))
				{
						adp.setOut(true);
						adp.setIn(false);
				}
				}   
				
		map.put(ep, adp);
		return DONE;
	}

	@Override
	public Object caseProperty(Property eProperty) {
	
		if(!(eProperty.getName().contains("local::")))	
		{
		Subcomponent asub = createSubcomponent(eProperty.getType());
		
		if (asub == null)
		{
			log.warn( eProperty + " The property is not associated with a specified Component Type");
		}
		//PropertyType aPType = createOwnedPropertyType();
		asub.setName(eProperty.getName());		
		buildProperty(eProperty, asub);
		map.put(eProperty, asub);
		}
		return DONE;
	}
	
	public void buildProperty(Property eProperty, Subcomponent asub)
	{
		if(eProperty.getAllAADLProperty().size()>0)
		{
			final PropertySet propertySet = Aadl2Factory.eINSTANCE.createPropertySet();
			
				for(AADL__Property aadlProperty: eProperty.getAllAADLProperty())
				{
						String [] splitSysMLPropertyDeclaration = aadlProperty.getAADL__Property().split(",");
						for( String aProperty: splitSysMLPropertyDeclaration)
						{
							
							String [] splitEachProperty = aProperty.split("::");
							
							if(!splitEachProperty[0].isEmpty())
							{							
								propertySet.setName(splitEachProperty[0]);
							}else
							{
								log.warn(eProperty.getName() +  " the format for AADL property set is not specified correctly");
							}
							final org.osate.aadl2.Property property = propertySet.createOwnedProperty();
							// Required to avoid errors regarding type applicability		 
							final MetaclassReference mcReference = (MetaclassReference) property.createAppliesTo(Aadl2Factory.eINSTANCE.getAadl2Package().getMetaclassReference());
							mcReference.getMetaclassNames().add("all");
							if(!splitEachProperty[1].isEmpty())
							{
							property.setName(splitEachProperty[1]);
							}else
							{
								log.warn(eProperty.getName() +  " the format for AADL property within a property set is not specified correctly");
							}
							
							// Create a property association
							if(!splitEachProperty[2].isEmpty())
							{
								asub.setPropertyValue(property, returnPropertyValue(splitEachProperty[2]));
							}else
							{
								log.warn(eProperty.getName() +  " the format for AADL property value within a property set is not specified correctly");
							}
						}
					}
			}
		
	}
	
	
	// returns the appropriate type of value for a property
	public PropertyValue returnPropertyValue(String sProperty)
	{
		if(sProperty.startsWith("\""))
		{
			return PropertyUtils.createStringValue(sProperty);
		} else if(sProperty.contains("True") || sProperty.contains("true")||sProperty.contains("False") || sProperty.contains("false")   )
		{
			boolean booleanValue = Boolean.parseBoolean(sProperty);
			return PropertyUtils.createTrueFalseValue(booleanValue);
		} else if(sProperty.contains("."))
		{
			double dblRealValue = Double.parseDouble(sProperty);
			return PropertyUtils.createRealValue(dblRealValue);
		} 
				
		log.warn(sProperty +  " is not supported yet as a data type it is being translated as a String");
		return PropertyUtils.createStringValue(sProperty);
	}
	

	private Subcomponent createSubcomponent(DifferentTypes type) {

		if (type instanceof Class)
		{
		if (((Class) type).getAadlData() != null) {
			return f.createDataSubcomponent(); 
		}
		}
		return f.createSystemSubcomponent(); 

	}

	@Override
	public Object caseConnector(Connector eConnector) {
 
		PortConnection apc = f.createPortConnection();
		
		if(eConnector.getName() == null)
		{
			
			String connectionName = "C" + Integer.toString(intConnectioncount);
			apc.setName(connectionName);
			intConnectioncount++;
			//eConnector.setName("C" + i);
			log.warn("Connection between port " + eConnector.getEnd().get(0).getRole().getName() + " and " + eConnector.getEnd().get(1).getRole().getName()
					+ " in " + EcoreUtil2.getContainerOfType(eConnector, Package.class).getName() + " doesnt have a name");
		
		}
		apc.setName(eConnector.getName());
		apc.setSource(f.createConnectedElement());
		apc.setDestination(f.createConnectedElement());
		buildConnectionProperty(eConnector,apc);
		map.put(eConnector, apc);
		return DONE;
	}
	
	// Handling connection patterns in properties
	public void buildConnectionProperty(Connector eProperty, StructuralFeature aCon)
	{
		if(eProperty.getConnectionAADLProperty().size()>0)
		{
			final PropertySet propertySet = Aadl2Factory.eINSTANCE.createPropertySet();
			
				for(AADL__Property aadlProperty: eProperty.getConnectionAADLProperty())
				{
						String [] splitSysMLPropertyDeclaration = aadlProperty.getAADL__Property().split(",");
						
						for( String aProperty: splitSysMLPropertyDeclaration)
						{			
							String [] splitEachProperty = aProperty.split("::");
							
							if (splitEachProperty.length == 2)
							{
								if (splitEachProperty[0].equals("Connection_Pattern"))
								{
									propertySet.setName("Communication_Properties");
								}
								final org.osate.aadl2.Property property = propertySet.createOwnedProperty();
								// Required to avoid errors regarding type applicability		 
								final MetaclassReference mcReference = (MetaclassReference) property.createAppliesTo(Aadl2Factory.eINSTANCE.getAadl2Package().getMetaclassReference());
								mcReference.getMetaclassNames().add("all");
								
								if(!splitEachProperty[0].isEmpty())
								{
								property.setName(splitEachProperty[0]);
								}else
								{
									log.warn(eProperty.getName() +  " the format for AADL property within a property set is not specified correctly");
								}
								
								// Create a property association
								if(!splitEachProperty[1].isEmpty())
								{
									associateConnection(propertySet, property, splitEachProperty[1], aCon);
									
								}else
								{
									log.warn(eProperty.getName() +  " the format for AADL property value within a property set is not specified correctly");
								}
							} else
							{
								if(!splitEachProperty[0].isEmpty())
								{							
								propertySet.setName(splitEachProperty[0]);
								}else
								{
								log.warn(eProperty.getName() +  " the format for AADL property set is not specified correctly");
								}
							final org.osate.aadl2.Property property = propertySet.createOwnedProperty();
							// Required to avoid errors regarding type applicability		 
							final MetaclassReference mcReference = (MetaclassReference) property.createAppliesTo(Aadl2Factory.eINSTANCE.getAadl2Package().getMetaclassReference());
							mcReference.getMetaclassNames().add("all");
							if(!splitEachProperty[1].isEmpty())
							{
							property.setName(splitEachProperty[1]);
							}else
							{
								log.warn(eProperty.getName() +  " the format for AADL property within a property set is not specified correctly");
							}
							
							// Create a property association
							if(!splitEachProperty[2].isEmpty())
							{
								aCon.setPropertyValue(property, returnPropertyValue(splitEachProperty[2]));
							}else
							{
								log.warn(eProperty.getName() +  " the format for AADL property value within a property set is not specified correctly");
							}
							}
						}
					}
				}
		}
	
	public void associateConnection(org.osate.aadl2.PropertySet propertySet, org.osate.aadl2.Property property, String connectionPropertyValue, StructuralFeature aCon)
	{
		
		final EnumerationType supportedConnectionPatterns = (EnumerationType) propertySet.createOwnedPropertyType(Aadl2Factory.eINSTANCE.getAadl2Package().getEnumerationType());
		supportedConnectionPatterns.setName("Supported_Connection_Patterns");
		 org.osate.aadl2.EnumerationLiteral oneToOne = supportedConnectionPatterns.createOwnedLiteral();
		oneToOne.setName("One_To_One");	
		org.osate.aadl2.EnumerationLiteral oneToAll = supportedConnectionPatterns.createOwnedLiteral();
		oneToAll.setName("One_To_All");	
		org.osate.aadl2.EnumerationLiteral allToAll = supportedConnectionPatterns.createOwnedLiteral();
		allToAll.setName("All_To_All");
		org.osate.aadl2.EnumerationLiteral allToOne = supportedConnectionPatterns.createOwnedLiteral();
		allToOne.setName("All_To_One");
		org.osate.aadl2.EnumerationLiteral next = supportedConnectionPatterns.createOwnedLiteral();
		next.setName("Next");
		org.osate.aadl2.EnumerationLiteral previous = supportedConnectionPatterns.createOwnedLiteral();
		previous.setName("Previous");
		org.osate.aadl2.EnumerationLiteral cyclicNext = supportedConnectionPatterns.createOwnedLiteral();
		cyclicNext.setName("Cyclic_Next");
		org.osate.aadl2.EnumerationLiteral cyclicPrevious = supportedConnectionPatterns.createOwnedLiteral();
		cyclicPrevious.setName("Cyclic_Previous");
		final List<PropertyExpression> outerListElements = new ArrayList<>();								
		
		if(connectionPropertyValue.equals("One_To_One"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(oneToOne));// based on sysml property connection pattern
			outerListElements.add(innerListValue);	
			aCon.setPropertyValue(property, outerListElements);
		} else if(connectionPropertyValue.equals("One_To_All"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(oneToAll));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		} else if(connectionPropertyValue.equals("All_To_All"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(allToAll));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		} else if(connectionPropertyValue.equals("All_To_One"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(allToOne));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		} else if(connectionPropertyValue.equals("Next"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(next));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		}else if(connectionPropertyValue.equals("Previous"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(previous));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		}else if(connectionPropertyValue.equals("Cyclic_Next"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(cyclicNext));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		}else if(connectionPropertyValue.equals("Cyclic_Previous"))
		{
			final ListValue innerListValue = Aadl2Factory.eINSTANCE.createListValue();
			innerListValue.getOwnedListElements().add(PropertyUtils.createEnumValue(cyclicPrevious));// based on sysml property connection pattern
			outerListElements.add(innerListValue);
			aCon.setPropertyValue(property, outerListElements);
		} else
		{
			log.warn("Unrecognized Connection Pattern "+ connectionPropertyValue);
		}
		
	}
	
	
	/*Save state machine information*/
	public void createStateMachine(EList<StateMachine> eSMList, ComponentClassifier acc){
		for (StateMachine eSM: eSMList)
		{
			mapStateMachine.put(eSM, acc);
		}
	}
		
 
	public void saveContractInfo(Class ec, String ecName) {

		String filenameSeparator = ".";
		Package ep = EcoreUtil2.getContainerOfType(ec, Package.class);
		
			String fullFilename = contractsFilename + "\\" + ep.getName()
				+ filenameSeparator + ecName + ".txt";
		
		File f = new File(fullFilename);
		if (f.exists()) {
			
				mapContracts.put(ecName, fullFilename);
			
		}
		
	}

}
