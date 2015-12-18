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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.Aadl2Factory;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.ArrayDimension;
import org.osate.aadl2.ArraySize;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.ConnectedElement;
import org.osate.aadl2.ConnectionEnd;
import org.osate.aadl2.Context;
import org.osate.aadl2.DataImplementation;
import org.osate.aadl2.DataPort;
import org.osate.aadl2.DataSubcomponent;
import org.osate.aadl2.DataSubcomponentType;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.PortConnection;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.SystemImplementation;
import org.osate.aadl2.SystemSubcomponent;
import org.osate.aadl2.SystemSubcomponentType;
import org.osate.aadl2.SystemType;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval;

import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Behavior;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Class;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Connector;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.ConnectorEnd;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Constraint;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Element;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.LiteralInteger;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Package;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Port;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.PrimitiveType;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Property;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Region;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.State;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.StateMachine;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.Transition;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.BehaviorImpl;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.impl.PrimitiveTypeImpl;
import com.rockwellcollins.atc.sysml2aadl.ea21.UML.util.UMLSwitch;
import com.rockwellcollins.atc.sysml2aadl.AadlCreator.MapVarSpec;
import com.rockwellcollins.atc.sysml2aadl.AadlCreator.WrapperAObject;
import com.rockwellcollins.atc.sysml2aadl.Logger;

public class AadlLinker extends UMLSwitch<Object> {
	private final Map<Element, AObject> map;
	private final Map<Element, WrapperAObject> wrapperMap;
	public Map<String, List<MapVarSpec>> mapVars = new HashMap<String, List<MapVarSpec>>();

	public Map<String, String> mapContracts = new HashMap<>(); 
	private static final Object DONE = new Object();
	private Logger log; 
	//private Logger logwarn = new Logger(Logger.WARN);
	private Map<StateMachine, AObject> mapStateMachine;

	// Map SysML data type(s) to AADL annex data type(s)
	private static Map<String, String> variableDataTypesMap = new HashMap<String, String>();
	private static void initVariableDataTypesMap()
	{
		//                    SysML  ->  AADL annex
		//                    ---------  ----------
		variableDataTypesMap.put("Boolean", "bool");
		variableDataTypesMap.put("boolean", "bool");
		variableDataTypesMap.put("Integer", "int");
	}
	private static String TYPE_NOT_MAPPED_MESSAGE = "#####  failed to get variable data type  #####";
	
	public AadlLinker(Map<Element, AObject> map, Map<String, List<MapVarSpec>>mapVars, Map<String, String>mapContracts, Map<StateMachine, AObject>mapStateMachine, Logger log,
			Map<Element, WrapperAObject> wrapperMap) {
		this.map = map;
		this.mapVars = mapVars;
		this.mapContracts = mapContracts;
		this.mapStateMachine = mapStateMachine;
		this.wrapperMap = wrapperMap;
		this.log = log;
		
		
		initVariableDataTypesMap();
	}
	
	// Printing the AADL package information
	@Override
	public Object casePackage(Package ePackage) {
		AadlPackage aPackage = (AadlPackage) map.get(ePackage);
		for (Element e : ePackage.getPackagedElement()) {
			if (e instanceof Class) {
				Class eClass = (Class) e;
				if(wrapperMap.containsKey(eClass))
				{
					for(int i =1; i<=2; i++)
					{
						if (i==1)
						{
							Classifier aClassifier = (Classifier) wrapperMap.get(eClass).getcType();
							aPackage.getPublicSection().getOwnedClassifiers().add(aClassifier);
						}
						if (i==2)
						{
							Classifier aClassifier = (Classifier) wrapperMap.get(eClass).getcImpl();
							aPackage.getPublicSection().getOwnedClassifiers().add(aClassifier);
						}
					}
				} else
				{
					Classifier aClassifier = (Classifier) map.get(eClass);
					aPackage.getPublicSection().getOwnedClassifiers().add(aClassifier);
				}
				
				
			}
		}

		return DONE;
	}
	
	
	// Printing the AADL component types and implementations 
	@Override
	public Object caseClass(Class eClass) {
		
		if(!(eClass.eContainer() instanceof BehaviorImpl || eClass.eContainer().eContainer() instanceof BehaviorImpl))
		{
			ComponentClassifier acc = (ComponentClassifier) map.get(eClass);
			if(acc instanceof ComponentType) {
			ComponentType ast = (ComponentType) acc;
			for (Port ep : eClass.getOwnedPort()) {
				DataPort aDataPort = (DataPort) map.get(ep);
				if (acc instanceof SystemType) {
					((SystemType) ast).getOwnedDataPorts().add(aDataPort);
				}
			}
			
			// Merge contract with the components
			if(mapContracts.containsKey(ast.getName()))
			{
				String contract = ReadFile(mapContracts.get(ast.getName()), false);
				
				//Merge state machines with the components 
				if( mapStateMachine.containsValue(ast))
				{
					String stateDeclaration =  "\r\n " + generateStates(ast) + generateTransitions(ast) + "\r\n     " + "--Inserted from " + 
							mapContracts.get(ast.getName()) + "\r\n " + contract;
					createAgreeAnnex(stateDeclaration, ast);	
				}
				else
				{
					String withContractSeparationComment = "\r\n     " + "--Inserted from " + mapContracts.get(ast.getName()) + "\r\n " + contract;
					createAgreeAnnex(withContractSeparationComment, ast);
					//log.status(ast.getName() + " Component Type doesnt have a state machine");
				}
			}
					
			else{
					if( mapStateMachine.containsValue(ast))
					{
						String stateDeclaration = "\r\n " + generateStates(ast)+ generateTransitions(ast);
						createAgreeAnnex(stateDeclaration, ast);
					}
					
						//log.warn(ast.getName() + " ComponentType doesnt have a contract");
				}
			}
			
			if(wrapperMap.containsKey(eClass))
			{
				acc = (ComponentClassifier) wrapperMap.get(eClass).getcImpl();
				
			}
		
		if (acc instanceof ComponentImplementation) {
			ComponentImplementation aci = (ComponentImplementation) acc;
			ComponentType ast;
			
			if(wrapperMap.containsKey(eClass))
			{
				ast = (ComponentType) wrapperMap.get(eClass).getcType();
				
			} else
			{
				ast = (ComponentType) map.get(eClass.getImplements().getSupplier());
			}
				
			//ComponentType ast = (ComponentType) map.get(eClass.getImplements().getSupplier()); exisiting on
			aci.createOwnedRealization().setImplemented(ast);
			
			// Merge contract and state with the component implementations
			if(mapContracts.containsKey(aci.getName()))
			{
				String contract = ReadFile(mapContracts.get(aci.getName()), false);
				
				//Merge state machines with the components 
				if( mapStateMachine.containsValue(aci))
				{
					String stateDeclaration =  "\r\n " + generateStates(aci) + generateTransitions(aci) + "     --Inserted from " + 
							mapContracts.get(aci.getName()) + "\r\n " + contract;
					createAgreeAnnex(stateDeclaration, aci);
				}
				else
				{
					String withContractSeparationComment = "\r\n     " + "--Inserted from " + mapContracts.get(aci.getName()) + "\r\n " + contract;
					createAgreeAnnex(withContractSeparationComment, aci);
					//log.status(aci.getName() + " ComponentImplementation  doesnt have a state machine");
				}
			
			}	
			else
			{
				if( mapStateMachine.containsValue(aci))
				{
					String stateDeclaration = "\r\n " + generateStates(aci) + generateTransitions(aci);
					createAgreeAnnex(stateDeclaration, aci);
				}
				//log.status(aci.getName() + " ComponentImplementation  doesnt have a contract");
			}
						
				for (Property eProperty : eClass.getOwnedAttribute()) {

					if(!eProperty.getName().contains("local::"))
					{
					Subcomponent asub = (Subcomponent) map.get(eProperty);
					addSubcomponent(aci, asub);
					for (Connector con : eClass.getOwnedConnector()) {
						PortConnection apc = (PortConnection) map.get(con);
						aci.getOwnedPortConnections().add(apc);
					}
					}
				}
		}
		}
		
		return DONE;
	}

	
//===================================================================
//===========  Data structures
//===================================================================

	private final static String LINE_INDENT = "    ";
	
	//-------------------------------------------
	//----  ports
	//-------------------------------------------
	private class EnvSpec {
		List<String> outPorts;
		List<String> inPorts;
		List<String> bidirPorts;
		Map<String, String> variables;
		
		EnvSpec() {
			outPorts   = new ArrayList<String>();
			inPorts    = new ArrayList<String>();
			bidirPorts = new ArrayList<String>();
			variables  = new HashMap<String, String>();
		}
		private void addOutPort(String port)
		{
			outPorts.add(port);
		}
		private void addInPort(String port)
		{
			inPorts.add(port);
		}
		private void addBidirPort(String port)
		{
			bidirPorts.add(port);
		}
		private void addVariable(String name, String type)
		{
			variables.put(name, type);
		}
		private void clear()
		{
			this.outPorts.clear();
			this.inPorts.clear();
			this.bidirPorts.clear();
			this.variables.clear();
		}
	}
	
	private EnvSpec envSpec = new EnvSpec();
	
	// get all ports (output, input, in_out) and variables
	private void initEnvSpec(ComponentClassifier cc)
	{
		ComponentType ct;
		
		if (cc instanceof ComponentImplementation || cc instanceof ComponentType) {
			if (cc instanceof ComponentImplementation)
				ct = ((ComponentImplementation) cc).getType();
			else
				ct = (ComponentType) cc;
			if (ct instanceof SystemType) {
				// get all of the ports
//				log.status("initEnvSpec:  cc: " + cc.getName());
				EList<DataPort> ports = ((SystemType)ct).getOwnedDataPorts();
				for (DataPort p: ports) {
					DirectionType pDir = p.getDirection();
					String pName = p.getName();
					if (pDir == DirectionType.IN) {
						envSpec.addInPort(pName);
					}
					else if (pDir == DirectionType.OUT) {
						envSpec.addOutPort(pName);
					}
					else { // DirectionType.IN_OUT
						envSpec.addBidirPort(pName);
					}
				}
			}
			
			// process the mapVars table of variables -> types
			// these variables are declared at the top state machine level
			List<MapVarSpec> mvsList = mapVars.get(ct.getName());
			if (mvsList != null) {
				for (MapVarSpec mvs: mvsList) {
					envSpec.addVariable(mvs.varName, mvs.varType);
					String mappedType = variableDataTypesMap.get(mvs.varType);
					boolean varFound = false;
					// if data type is ComponentType
					if (mappedType == null) {
						
						for (Map.Entry<Element, AObject> entry : map.entrySet())
						{
							if (entry.getValue() instanceof ComponentType)
							{
								ComponentType aadlObject = (ComponentType) (entry.getValue());
								if(aadlObject.getName()!=null)
								{
									String aadlObjectName = aadlObject.getName();
									if (aadlObjectName != null)
									{
										if(mvs.varType.equals(aadlObjectName))
										{
											AadlPackage pkg = EcoreUtil2.getContainerOfType(aadlObject, AadlPackage.class);		
											if (pkg != null)
											{
											mvs.varType = pkg.getName() +"::"+aadlObjectName;
											varFound = true;
											}
										}
									}
								}
							}
						}
						
						mappedType = mvs.varType;
						if (!varFound) {
							log.warn("Unexpected variable data type.  Variable: " + mvs.varName + "  Type: " + mvs.varType);
						}
					}
					allVarSpecs.add(mvs.varName, mappedType);
				}
			}
			
			if(cc instanceof ComponentImplementation)
			{
				String implementationName[] = cc.getName().split("\\.");
				mvsList = mapVars.get(implementationName[1]);
				if (mvsList != null) {
					for (MapVarSpec mvs: mvsList) {
						for (Map.Entry<Element, AObject> entry : map.entrySet())
						{
							// if data type is componentimplementation
							if (entry.getValue() instanceof ComponentImplementation)
							{
								ComponentImplementation aadlObject = (ComponentImplementation) (entry.getValue());
								if(aadlObject.getName()!=null)
								{
									String aadlObjectName = aadlObject.getName();
									String aadlObjectImplName[] = aadlObjectName.split("\\.");
									if (aadlObjectName.length()>=2)
									{
										if(mvs.varType.equals(aadlObjectImplName[1]))
										{
											AadlPackage pkg = EcoreUtil2.getContainerOfType(aadlObject, AadlPackage.class);		
											mvs.varType = pkg.getName() +"::"+aadlObjectName;	
										}
									}
								}
							}
						}
						envSpec.addVariable(mvs.varName, mvs.varType);
						
						String mappedType = variableDataTypesMap.get(mvs.varType);
						if (mappedType == null) {
							mappedType = mvs.varType;
							//log.warn("Unrecognized variable data type.  Variable: " + mvs.varName + "  Type: " + mvs.varType);
						}
						allVarSpecs.add(mvs.varName, mappedType);
					}
				}				
			}
		}
	}


	//-------------------------------------------
	// local variables: map object name -> type
	//-------------------------------------------
	
	// prefix used to create name for eq for handling variable state changes
	private static final String VAR_STATE_PREFIX = "Do_";
	
	// prefix used to create name for action for "no change"
	private static final String NO_CHANGE_PREFIX = "no_change_";
	
	private class VarSpec
	{
		String        type = new String();
		String        guardName = new String();
		List<String>  affectingStates = new ArrayList<String>();  // states that affect this variable
		List<String>  affectingTransitions = new ArrayList<String>();  // transitions that affect this variable
		
		VarSpec() {
		}
		
		VarSpec(String type) {
			this.type = type;
		}
		
		VarSpec(String type, String affectingState)
		{
			this.type = type;
			this.affectingStates.add(affectingState);
		}
		
		void addTransition(String affectingTrans) {
			if (!this.affectingTransitions.contains(affectingTrans)) {
				this.affectingTransitions.add(affectingTrans);
			}
		}
		
	}
	
	// class to manage map of local variables (name -> (type, affecting states))
	// affecting states may be empty
	private class AllVarSpecs
	{
		Map<String, VarSpec> allVars;
		
		AllVarSpecs() {
			allVars = new HashMap<String, VarSpec>();
		}
		
		void clear() {
			allVars.clear();
		}
		
		boolean containsVar(String name) {
			return allVars.get(name) != null;
		}

		void add(String name, String type) {
			if (allVars.get(name) != null) {
				if (allVars.get(name).type.isEmpty()) {
					// entry exists, no type
					log.status("AllVarSpecs: add type to entry.  var: " + name + "   type: " + type);
					allVars.get(name).type = type;
				}
				else if (!allVars.get(name).type.equals(type)) {
					// duplicate names, mismatching types
					log.error("AllVarSpecs: Duplicate variables of different types");
					log.error("    " + name + " : " + type);
					log.error("    " + name + " : " + allVars.get(name).type);
				}
				else {
					// entry for variable of this name and type already exists
					log.warn("AllVarSpecs: Duplicate add for variable");
					log.warn("    " + name + " : " + type);
				}
			}
			else {
				// no entry exists, ok to add
				allVars.put(name, new VarSpec(type));
			}
		}
		
		void add(String name, String type, String state) {
			if (allVars.get(name) != null) {
				if (!allVars.get(name).type.equals(type)) {
					// duplicate names, mismatching types
				}
				else {
					// entry for this variable exists, add state to existing list
					allVars.get(name).affectingStates.add(state);
				}
			}
			else {
				// no entry exists, ok to add
				allVars.put(name, new VarSpec(type, state));
			}
		}
		
		Iterator<Entry<String, VarSpec>> getIterator() {
			return allVars.entrySet().iterator();
		}
		
		void addGuard(String name, String guard) {
			allVars.get(name).guardName = guard;
		}
		
		String getGuard(String name) {
			return allVars.get(name).guardName;
		}
		
		void addTransition(String name, String transition) {
			if (allVars.get(name) == null) {
				allVars.put(name, new VarSpec());
			}
			allVars.get(name).addTransition(transition);
		}
		
	}
	private AllVarSpecs allVarSpecs = new AllVarSpecs();
	
	//-------------------------------------------
	// states
	//-------------------------------------------

	// prefix used to disambiguate states and ports
	private static final String STATE_PREFIX = "s_";
	private static final String STATE_MACHINE_PREFIX = "sm_"; 

	// keep the name of the top-level Start state
	private static String topLevelStart = new String();
	
	private class StateSpec	{
		String        type;   // State, Pseudostate, FinalState, StateMachine
		String        enclosingStateMachine;
		List<String>  entryActions       = new ArrayList<String>();
		List<String>  duringActions      = new ArrayList<String>();
		List<String>  outTransitions     = new ArrayList<String>();
		List<String>  inTransitions      = new ArrayList<String>();
		List<String>  affectedVars       = new ArrayList<String>();
		List<String>  affectedOutPorts   = new ArrayList<String>();
		List<String>  affectedBidirPorts = new ArrayList<String>();
		
		StateSpec(String type, String stateMachine)
		{
			this.type = type;
			this.enclosingStateMachine = stateMachine;
		}	
	}
	
	// map state name -> state info
	private Map<String, StateSpec> stateMap = new HashMap<String, StateSpec>();
	
	// map nested state machine name -> start state name
	private Map<String, String> nestedStartMap = new HashMap<String, String>();

	
	private boolean isOutPort(String obj)
	{
		return envSpec.outPorts.contains(obj);
	}
	
	private boolean isInPort(String obj)
	{
		return envSpec.inPorts.contains(obj);
	}
	
	private boolean isBidirPort(String obj)
	{
		return envSpec.bidirPorts.contains(obj);
	}
	
	private boolean isLocalVar(String obj)
	{
		return !(isOutPort(obj) || isInPort(obj) || isBidirPort(obj));
	}
	
	//-------------------------------------------
	// transitions
	//-------------------------------------------
	
	private class TransitionSpec {
		String name;
		String target;
		String guard;    // may be empty
		String effect;   // may be empty
		
		TransitionSpec(String name, String target, String guard, String effect) {
			this.name = name;
			this.target = target;
			this.guard = guard;
			this.effect = effect;
		}
	}
	
	// map source state -> transition "spec" (name, target, guard, effect)
	private Map<String, List<TransitionSpec>> transitionMap = new HashMap<String, List<TransitionSpec>>();

	private class TransitionAffectedObjs {
		List<String>  affectedVars       = new ArrayList<String>();
		List<String>  affectedOutPorts   = new ArrayList<String>();
		List<String>  affectedBidirPorts = new ArrayList<String>();
	}
	
	// map transition name -> transition affected objects (variables, output ports, bidirectional ports)
	private Map<String, TransitionAffectedObjs> transitionAffectedObjs = new HashMap<String, TransitionAffectedObjs>();
	
	// return the TransitionSpec for the specified transition
	private TransitionSpec getTransitionSpec(String currState, String currTrans)
	{
		List<TransitionSpec> tSpec = transitionMap.get(currState);
		
		for (TransitionSpec ts: tSpec) {
			if (ts.name.equals(currTrans)) {
				return ts;
			}
		}
		return null;
	}
	
	// return the State name for the specified transition
	private String getTransitionTarget(String currTrans)
	{
		Iterator<Entry<String, List<TransitionSpec>>> iter = transitionMap.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, List<TransitionSpec>> entry = iter.next();
			List<TransitionSpec> tSpecs = entry.getValue();
			for (TransitionSpec spec: tSpecs) {
				if (spec.name.equals(currTrans)) {
					return spec.target;
				}
			}
		}
		return null;
	}
	
	private class FlattenedTransitionSpec
	{
		String        source;
		List<String>  transitions;
		String        concatName;
		String        target;
		
		FlattenedTransitionSpec(String source, List<String> trans, String ftName, String target)
		{
			this.source = source;
			this.transitions = trans;
			this.concatName = ftName;
			this.target = target;
		}
	}
	
	private List<FlattenedTransitionSpec> flattenedTransitionList = new ArrayList<FlattenedTransitionSpec>();
	
	
	//-------------------------------------------
	// helper methods for state processing
	//-------------------------------------------
	
	// generate the "eq" statement to declare local variables;
	private String declareLocalVariables(ComponentClassifier acc)
	{
		StringBuilder sb = new StringBuilder();
		Iterator<Entry<String, VarSpec>> iter = allVarSpecs.getIterator();
		while (iter.hasNext()) {
			Entry<String, VarSpec> entry = iter.next();
			sb.append(LINE_INDENT + "eq " + entry.getKey() + " : " + entry.getValue().type + ";\r\n");
			if(entry.getValue().type == null)
			{
				log.warn(entry.getKey() + " in " + acc.getName() + " doesnt have a type defined");
			}
		}
		sb.append("\r\n");
		return sb.toString();
	}
	
	// create a list of the behavior (entry or during) actions from the specified behavior
	private List<String> getBehaviorStatements(Behavior beh)
	{
		List<String> stmts = new ArrayList<String>();
		
		EList<Class> ops = beh.getOwnedOperation();
		for (Class op : ops) {
			EList<Constraint> cons = op.getBodyCondition();
			for (Constraint c: cons) {
				// may be more than one statement
				String[] statements = c.getSpecification().getBody().trim().split(";");
				for (String st: statements) {
					stmts.add(st);
				}
			}
		}
		return stmts;
	}
	
	// update the information about the specified State
	private void addToStateMapList(String stateName, String obj)
	{
		if (isLocalVar(obj)) {
			// obj is a local variable: update the list of affected variables for the State
			if (!stateMap.get(stateName).affectedVars.contains(obj)) {
				stateMap.get(stateName).affectedVars.add(obj);
			}
			// look up the data type of the variable
			String type = new String();
			if (envSpec.variables.containsKey(obj)) {
				type = envSpec.variables.get(obj);
				if (variableDataTypesMap.containsKey(type)) {
					type = variableDataTypesMap.get(type);
				}
				
			}
			else {
				type = TYPE_NOT_MAPPED_MESSAGE;
			}
			
			// add to "allVarSpecs" list
			allVarSpecs.add(obj, type, stateName);
		}
		else if (isOutPort(obj)) {
			// obj is an output port: update the list of output ports affected by the State
			if (!stateMap.get(stateName).affectedOutPorts.contains(obj)) {
				stateMap.get(stateName).affectedOutPorts.add(obj);
			}
		}
		else if (isBidirPort(obj)) {
			// obj is a bidirectional port: update the list of bidir ports affected by the State
			if (!stateMap.get(stateName).affectedBidirPorts.contains(obj)) {
				stateMap.get(stateName).affectedBidirPorts.add(obj);
			}
		}
	}

	// obtain the information for the specified State (with the specified name)
	private void processStateActions(State state, String stateName)
	{
		// process "entry" actions
		Behavior entBehav = state.getEntry();
		if (entBehav != null) {
			List<String> statements = getBehaviorStatements(entBehav);
			for (String stmt: statements) {
				stmt = stmt.trim();
				stateMap.get(stateName).entryActions.add(stmt);
				String[] tokens = stmt.split(":=");
				addToStateMapList(stateName, tokens[0].trim());
			}
		}
		
		// process "during" actions
		Behavior durBehav = state.getDoActivity();
		if (durBehav != null) {
			List<String> statements = getBehaviorStatements(durBehav);
			for (String stmt: statements) {
				stmt = stmt.trim();
				stateMap.get(stateName).duringActions.add(stmt);
				String[] tokens = stmt.split(":=");
				addToStateMapList(stateName, tokens[0].trim());
			}
		}
	}

	// update the StateMap for the specified State
	private void doStateMapProcessing(State st, StateMachine sm)
	{
		String sName = st.getName();
		String sType = st.eClass().getName();
		String smName = sm.getName();
		stateMap.put(sName, new StateSpec(sType, smName));
		processStateActions(st, sName);
	}
	
	// update the StateMap for the specified StateMachine
	private void doStateMapProcessing(StateMachine sm, StateMachine enclosingSM)
	{
		String smName = sm.getName();
		String smType = sm.eClass().getName();
		String encSMName = enclosingSM.getName();
		stateMap.put(smName, new StateSpec(smType, encSMName));
	}

	// return the disambiguated state name
	private String newStateName(State s)
	{
		return STATE_PREFIX + s.getName();
	}

	// return the disambiguated state machine name
	private String newStateName(StateMachine sm)
	{
		return STATE_MACHINE_PREFIX + sm.getName();
	}
	
	// recursive method to process all of the states in the specified StateMachine
	private void processStates(StateMachine sm, boolean isTopLevel)
	{
		// process states enclosed in region(s)
		EList<Region> regions = sm.getRegion();
		for (Region r: regions) {
			// process all states in the current region
			EList<State> rstates = r.getSubvertex();
			for (State rs: rstates) {
				boolean isStartState = rs.eClass().getName().equals("Pseudostate");
				// disambiguate states from port names by prepending prefix to state names
				if (!isStartState || (isStartState && isTopLevel)) {
					rs.setName(newStateName(rs));
					// keep the top-level start state
					if (isStartState && isTopLevel) {
						topLevelStart = rs.getName();  
					}
				}
				else {
					// "Start" state in nested state machine
					// disambiguate from top level Start state by appending state machine name
					rs.setName(newStateName(rs) + "_" + sm.getName());
					nestedStartMap.put(sm.getName(), rs.getName());
				}
				doStateMapProcessing(rs, sm);
			}
		}
		
		// process top level states
		EList<State> states = sm.getSubvertex();
		for (State s: states) {
			s.setName(newStateName(s));
			doStateMapProcessing(s, sm);
		}
		
		// process nested state machines
		EList<StateMachine> nested = sm.getNestedClassifier();
		for (StateMachine n: nested) {
			n.setName(newStateName(n));
			doStateMapProcessing(n, sm);
			// recurse for nested state machine
			processStates(n, false);
		}
		
	}

	// obtain the information about the specified transition
	private void processTrans(Transition t)
	{
		String tName = t.getName();
		String tSrc = t.getSource().getName();
		String tTgt = t.getTarget().getName();
		String tGuard;
		String tEffect;
		if (t.getGuard() != null) {
			tGuard = t.getGuard().getSpecification().getBody();
		}
		else {
			tGuard = "";
		}
		if (t.getEffect() != null) {
			tEffect = t.getEffect().getBody();
		}
		else {
			tEffect = "";
		}
		if (tName == null) {
			// unnamed transition: generate name from source, guard, and target
			// (include the guard, since there may be more than one transition
			//  between the source and target)
			// replace spaces because we may tokenize later
			tName = "AUTOGEN_" + tSrc + "_" + tGuard + "_" + tTgt;
			tName = tName.replace(' ', '_');
			log.warn("Unnamed transition found from source " + tSrc + " to target " + tTgt);
			log.warn("    This transition has been named " + tName);
		}
		TransitionSpec tSpec = new TransitionSpec(tName, tTgt, tGuard, tEffect);
		
		// update the TransitionMap
        if (!transitionMap.containsKey(tSrc)) {
        	List<TransitionSpec> tsList = new ArrayList<TransitionSpec>();
        	transitionMap.put(tSrc, tsList);
        }
       	transitionMap.get(tSrc).add(tSpec);
       	
       	// update the StateMap
       	stateMap.get(tSrc).outTransitions.add(tName);
       	stateMap.get(tTgt).inTransitions.add(tName);

		// process action(s) associated with this transition -- may be more than one statement
		if (!transitionAffectedObjs.containsKey(tName)) {
			transitionAffectedObjs.put(tName, new TransitionAffectedObjs());
		}
		if (!tEffect.isEmpty()) {
			String[] statements = tEffect.split(";");
			for (String st: statements) {
				st.trim();
				String[] tokens = st.split(":=");
				String lhs = tokens[0].trim();
				if (isLocalVar(lhs)) {
					transitionAffectedObjs.get(tName).affectedVars.add(lhs);
					allVarSpecs.addTransition(lhs, tName);
				}
				else if (isOutPort(lhs)) {
					transitionAffectedObjs.get(tName).affectedOutPorts.add(lhs);
				}
				else if (isBidirPort(lhs)) {
					transitionAffectedObjs.get(tName).affectedBidirPorts.add(lhs);
				}
			}
		}
	}

	// process all of the transitions in the specified Region
	private void processRegionTr(Region r)
	{
		EList<Transition> trans = r.getTransition();
		for (Transition t: trans) {
			processTrans(t);
		}
	}

	// recursive method to process all of the transitions in the specified StateMachine
	private void processTransitions(StateMachine sm)
	{
		EList<Transition> trans = sm.getTransition();
		for (Transition t: trans) {
			processTrans(t);
		}
		EList<Region> regions = sm.getRegion();
		for (Region r: regions) {
			 processRegionTr(r);
		}
		
		EList<StateMachine> nested = sm.getNestedClassifier();
		for (StateMachine n: nested) {
			processTransitions(n);
		}
	}


	// traverse the StateMachine to populate the data structures (State and Transition information)
	private void processStateMachine(ComponentClassifier cc, StateMachine sm)
	{
		// initialize data structures
		envSpec.clear();
		allVarSpecs.clear();
		topLevelStart = "";
		stateMap.clear();
		nestedStartMap.clear();
		transitionMap.clear();
		flattenedTransitionList.clear();

		log.status("");
		log.status("=======================================");

		// find ports and variables
		initEnvSpec(cc);
		
		// process the state machine states (to populate data structures)
		processStates(sm, true);

		// process the state machine transitions (to populate data structures)
		processTransitions(sm);

		// debug
//		log.status(envSpecString());
//		log.status("allVariables:");
//		log.status(allVariablesString());
//		log.status("nestedStartMap:");
//		log.status(nestedStartMapString());
//		log.status("transitionMap:");
//		log.status(transitionMapString());
//		log.status("transitionAffectedObjs:");
//		log.status(transitionAffectedObjsString());
//		log.status("stateMap:");
//		log.status(stateMapString());
	}
	
	
	
//===================================================================
//===========  State processing
//===================================================================

	// create a string comprising all of the nested states within the specified StateMachine, as an "or" expression
	private StringBuilder appendStatesEq(StateMachine sm, StringBuilder sb)
	{
		boolean first = true;

		// called for right-hand side of state eq statement to generate the boolean expression
		// append state names in the specified state machine (including nested states)
		EList<Region> regions = sm.getRegion();
		for (Region r: regions) {
			EList<State> rstates = r.getSubvertex();
			for (State rs: rstates) {
				if (!first) {
					sb.append(" or ");
				}
				sb.append(rs.getName());
				first = false;
			}
		}
		
		EList<State> states = sm.getSubvertex();
		for (State s: states) {
			if (!first) {
				sb.append(" or ");
			}
			sb.append(s.getName());
			first = false;
		}
		
		EList<StateMachine> nested = sm.getNestedClassifier();
		for (StateMachine n: nested) {
			if (!first) {
				sb.append(" or ");
			}
			first = false;
			sb.append(n.getName());
		}
		return sb;
	}
	
	private StringBuilder processRegionEq(Region r, StringBuilder sb)
	{
		EList<State> states = r.getSubvertex();
		for (State s: states) {
			sb = processStateEq(s, sb);
		}
		return sb;
	}
	
	private StringBuilder processStateEq(State s, StringBuilder sb)
	{
		sb.append(LINE_INDENT + "eq " + s.getName() + " : bool;" + "\r\n");
		return sb;
	}
	
	private StringBuilder processNestedEq(StateMachine sm, StringBuilder sb)
	{
		sb.append(LINE_INDENT + "eq " + sm.getName() + " : bool = ");
		sb = appendStatesEq(sm, sb);
		sb.append(";" + "\r\n");
		sb.append(generateStatesEq(sm));
		return sb;
	}

	// generate the "eq" statements for the states
	private String generateStatesEq(StateMachine sm)
	{
		StringBuilder sb = new StringBuilder();
		
		EList<Region> regions = sm.getRegion();
		for (Region r: regions) {
			sb = processRegionEq(r, sb);
		}
		
		EList<State> states = sm.getSubvertex();
		for (State s: states) {
			sb = processStateEq(s, sb);
		}

		EList<StateMachine> nested = sm.getNestedClassifier();
		for (StateMachine n: nested) {
			sb = processNestedEq(n, sb);
		}
	
		return sb.toString();
	}
	
	// generate the "guarantee/assert" statements for the states
	private String generateStatesGuarantee(StateMachine sm, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		EList<Region> regions = sm.getRegion();
		for (Region r: regions) {
			List<String> stateNames = new ArrayList<String>();
			EList<State> states = r.getSubvertex();
			for (State s: states) {
				stateNames.add(s.getName());
			}
			EList<StateMachine> nested = sm.getNestedClassifier();
			for (StateMachine n: nested) {
				stateNames.add(n.getName());
			}
			for (String sn: stateNames) {
				if(keyword.equals("guarantee"))
				{
					sb.append(LINE_INDENT + keyword + " \"" + sn + "\" : " + sn + " => not (");
				}
				if(keyword.equals("assert"))
				{
					sb.append(LINE_INDENT + keyword + " " + sn + " => not (");
				}
				
			    boolean first = true;
			    for (String sn2: stateNames) {
			    	if (sn2.equals(sn)) {
			    		continue;
			    	}
			    	if (!first) {
			    		sb.append(" or ");
			    	}
			    	sb.append(sn2);
			    	first = false;
			    }
			    sb.append(");");
				sb.append("\r\n");
			}
			for (StateMachine n: nested) {
				String nstr = generateStatesGuarantee(n, keyword);
				sb.append(nstr);
			}
		}
		
		return sb.toString();
	}
	
	
	// generate the state-dependent portion of the AADL annex
	public String generateStates(ComponentClassifier acc)
	{
		StringBuilder statesSB = new StringBuilder();

		for (Entry<StateMachine, AObject> entry : mapStateMachine.entrySet()) {
			
			if (entry.getValue().equals(acc)) {
				
				StateMachine sm = entry.getKey();
				
				processStateMachine(acc, sm);
				statesSB.append("\r\n");
				
				String strEq = generateStatesEq(sm);
				statesSB.append(strEq);
				statesSB.append("\r\n");
				
				String keyword = new String();
				// "guarantee" for types, "assert" for impls
				if (acc instanceof ComponentType) {
					keyword = "guarantee";
				}
				else {
					keyword = "assert";
				}

				String strGuar = generateStatesGuarantee(sm, keyword); 
				statesSB.append(strGuar);
				statesSB.append("\r\n");

			}
		}
				
		return statesSB.toString();
	}
	

//===================================================================
//===========  Transition processing
//===================================================================

	// recursive helper for getAllOutgoingTransitions
	private void getAllOutgoingTransitionsRecursive(String sm, StateMachine topSM, List<String> outTrans)
	{
		if (sm.equals(topSM.getName())) {
			// reached the outermost state machine
			return;
		}

		// get the transitions out of the current state machine
		List<TransitionSpec> tSpecs = transitionMap.get(sm);
		
		// add the transitions to the list
		for (TransitionSpec ts: tSpecs) {
			outTrans.add(ts.name);
			// recurse to find any additional enclosing state machines with outgoing transitions
			getAllOutgoingTransitionsRecursive(stateMap.get(ts.target).enclosingStateMachine, topSM, outTrans);
		}
	}
	
	// get the list of outgoing transitions from any enclosing state machines
	private List<String> getAllOutgoingTransitions(String sm, StateMachine topSM)
	{
		List<String> outTrans = new ArrayList<String>();
		
		getAllOutgoingTransitionsRecursive(sm, topSM, outTrans);
		return outTrans;
	}
	
	
	// replace "QS_Properties::foo" with "Get_Property(this, QS_Properties::foo)"
	private String handlePropertyLookup(String guard)
	{
		final String Property_Key = "Properties::";
		
		if (guard.contains(Property_Key)) {
			StringBuilder newGuard = new StringBuilder();
			String[] guardTokens = guard.trim().split("\\s+");
			for (String tok: guardTokens) {
				if (tok.contains(Property_Key)) {
					tok = "Get_Property(this, " + tok + ")";
				}
				newGuard.append(" " + tok);
			}
			return newGuard.toString();
		}
		// no change necessary
		return guard;
	}
	
	// if guard (or effect) includes a local variable, wrap the variable with "pre( )"
	private String wrapIfLocalVariable(String guard)
	{
		String tmpGuard = guard;
		
		String[] tokens = guard.split("[ ,()<>+-/*//]");
		for (String t: tokens) {
			if (allVarSpecs.containsVar(t)) {
				tmpGuard = guard.replaceAll(t, "pre(" + t + ")");
			}
		}
		return tmpGuard;
	}

	// helper to create a list of flattened transitions
	private void followTransition2(String state, List<String> flatTrans, String s)
	{
//		log.status("followTransition2  state: " + state + "  s: <" + s + ">");
		List<TransitionSpec> trans = transitionMap.get(state);
		if (trans != null) {
			for (TransitionSpec ts : trans) {
				String tgt = ts.target;
//				log.status("      " + ts.name + " --> " + tgt);
				followTransition(tgt, false, flatTrans, s + " " + ts.name);
			}
		}
	}
	
	// recursive method to create a list of flattened transitions
	private void followTransition(String state, boolean isTop, List<String> flatTrans, String s)
	{
//		log.status("followTransition   state: " + state + "  s: <" + s + ">");
		if (!isTop && stateMap.get(state).type.equals("State")) {
//			log.status("   =====  terminate  " + s);
			flatTrans.add(s);
			return;
		}
		if (!isTop && stateMap.get(state).type.equals("StateMachine")) {
			// continue at start state for nested state machine
			String newStart = nestedStartMap.get(state);
//			log.status("   nested start: " + newStart);
			followTransition(newStart, false, flatTrans, s);
			return;
		}
		followTransition2(state, flatTrans, s);
	}
	
	// populate the flattenedTransitionList data structure
	private void generateFlattenedTransitions(StateMachine topSM)
	{
		List<String> flatTrans = new ArrayList<String>();

		// iterate through each State in the StateMap
		Iterator<Entry<String, StateSpec>> stateIter = stateMap.entrySet().iterator();
		while (stateIter.hasNext()) {
			// produce a list of strings, in which each string represents a flattened transition
			// each string is of the format: "start_state: transition_1 transition_2 ..."
			// so we can split on the colon to get the start state and split on spaces to get the transitions
			Entry<String, StateSpec> stateEntry = stateIter.next();
			String currState = stateEntry.getKey();
			boolean isTopStart = stateMap.get(currState).type.equals("Pseudostate") &&
								 stateMap.get(currState).enclosingStateMachine.equals(topSM.getName());
			boolean isState = stateEntry.getValue().type.equals("State");
			boolean isStateMachine = stateEntry.getValue().type.equals("StateMachine");
			String str = new String();
			if (isTopStart || isState || isStateMachine) {
				str = currState + ":";
//				log.status("");
//				log.status("start at state: " + currState + "   (" + stateEntry.getValue().type + ")");
				followTransition(currState, true, flatTrans, str);
			}
		}

		// populate the flattenedTransitionList data structure from the strings collected above
		for (String ft: flatTrans) {
			// get the source state
			String[] tokens = ft.trim().split(":");
			String src = tokens[0].trim();
			// get the list of transitions
			String[] transitions = tokens[1].trim().split("\\s+");
			StringBuilder ftName = new StringBuilder();
			// create the "name" of the flattened transition, using transition names conjoined with underscores
			boolean first = true;
			for (String tr: transitions) {
				if (!first) {
					ftName.append("_");
				}
				first = false;
				ftName.append(tr.trim());
			}
			// get the target state
			String tgt = getTransitionTarget(transitions[transitions.length - 1]);
			// add to the list
			flattenedTransitionList.add(new FlattenedTransitionSpec(src, Arrays.asList(transitions), ftName.toString(), tgt));
		}
	}
	
	// recursive method to generate a list of all outgoing transitions (including from nested state machines)
	// exclude transitions in the "transitions" list
	private void getOutgoingTransitionsRecursive(String state, StateMachine topSM, List<String> transitions, List<String> outTrans)
	{
		if (state.equals(topSM.getName())) {
			// reached the outermost state machine
			return;
		}

		String currSM = stateMap.get(state).enclosingStateMachine;
		String currType = stateMap.get(state).type;
		if (!currType.equals("StateMachine") && currSM.equals(topSM.getName())) {
			// current state is NOT a state machine and we have reached the outermost state machine
			return;
		}
		
		// get the transitions out of the current state machine
		List<TransitionSpec> tSpecs;
		if (currType.equals("StateMachine")) {
			tSpecs = transitionMap.get(state);
		}
		else {
			tSpecs = transitionMap.get(currSM);
		}
		
		// add the transitions to the list
		for (TransitionSpec ts: tSpecs) {
			// omit any transitions found in transList, since they are on the flattened transition path
			if (!transitions.contains(ts.name)) {
				outTrans.add(ts.name);
			}
			// recurse to find any additional enclosing state machines with outgoing transitions
			getOutgoingTransitionsRecursive(stateMap.get(ts.target).enclosingStateMachine, topSM, transitions, outTrans);
		}
	}
	
	// return a list of all outgoing transitions from the specified state, excluding those in the "transitions" list
	private List<String> getOutgoingTransitions(String state, StateMachine topSM, List<String> transitions)
	{
		List<String> outTrans = new ArrayList<String>();
		
		// get the list of outgoing transitions from any enclosing state machines
		// these transitions have a higher precedence than transitions in the enclosed state machine
		getOutgoingTransitionsRecursive(state, topSM, transitions, outTrans);
		return outTrans;
	}
	
	// generate the guard statement for the specified (flattened) transition
	private String generateTransitionGuard(String ftName, List<String> transitions, String currState, StateMachine topSM)
	{
		StringBuilder sb = new StringBuilder();
		
		// the "eq" is a bool, initially "false" with a precondition based on the beginning state
		sb.append(LINE_INDENT + "eq ");
		sb.append(ftName);
		sb.append(": bool = (false -> (pre(" + currState + ")");

		// add "not (<T>)" for transitions exiting nested state machines
		if (!stateMap.get(currState).enclosingStateMachine.equals(topSM.getName())) {
			// currState is in a nested state machine, so find all outgoing transitions from enclosing state machines
			List<String> outTrans = getOutgoingTransitions(currState, topSM, transitions);
			if (!outTrans.isEmpty()) {
				// outgoing transitions of higher precedence have been found
				sb.append(" and not (");
				boolean first = true;
				for (String ot: outTrans) {
					if (!first) {
						sb.append(" or ");
					}
					sb.append(ot);
					first = false;
				}
				sb.append(")");
			}
		}
											
		for (String tr : transitions) {
			
			// get the info for the current transition
			String currTrans = tr;
			TransitionSpec tSpec = getTransitionSpec(currState, currTrans);

			// output guard for this transition
			// Note: guard may be empty for the transition from the Start state in nested state machine
			if (!tSpec.guard.isEmpty()) {
				
				// get the guard for the current transition
				String currGuard = tSpec.guard;
				
				// replace "QS_Properties::foo" with "Get_Property(this, QS_Properties::foo)"
				currGuard = handlePropertyLookup(currGuard);

				// expressions containing local variables must be wrapped with "pre( )"
				currGuard = wrapIfLocalVariable(currGuard);
				sb.append(" and " + currGuard);

			}
			
			// advance to the next state in the flattened transition
			currState = tSpec.target;
			if (stateMap.get(currState).type.equals("StateMachine")) {
				// if the target is a nested state machine, proceed to its start state
				currState = nestedStartMap.get(currState);
			}
			
		}
		sb.append("));\r\n");
		//sb.append("));");
		
		return sb.toString();
	}

	// generate the action statement(s) for the specified (flattened) transition
	private String generateTransitionActions(String ftName, List<String> transitions, String currState, StateMachine topSM, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		// generate action for next state
		sb.append(LINE_INDENT + keyword);
		String lastTrans = transitions.get(transitions.size() - 1);
		String nextState = getTransitionTarget(lastTrans);
		if(keyword.equals("guarantee"))
		{
			sb.append(" \"" + ftName + "_next_state" + "\"" + " : " + ftName + " => " + nextState + ";" + "\r\n");
			//sb.append("\r\n");
		}
		
		if(keyword.equals("assert"))
		{
			sb.append(" " + ftName + " " + " => " + nextState + ";" + "\r\n");
			//sb.append("\r\n");
		}
		
		// conditionally generate action(s) for affected variables
		List<String> entActs = stateMap.get(nextState).entryActions;
		if (entActs != null) {
			for (String ent: entActs) {
				String[] tokens = ent.split(":=");
				String objName = tokens[0].trim();
				String rhs1 = wrapIfLocalVariable(tokens[1].trim());
				String rhs2 = handlePropertyLookup(rhs1);
				if (rhs2.split(" ").length > 1) {
					rhs2 = "(" + rhs2 + ")";
				}
				if(keyword.equals("guarantee")) {
					sb.append(LINE_INDENT + keyword + " \"" + ftName + "_" + objName + "\"" + " : " + ftName + " => (" + objName + " = " + rhs2 + ");" + "\r\n");
				} else {
				    // Temporary removal of assertion name since they're invalid in OSATE 2.1.0
					sb.append(LINE_INDENT + keyword + " " + ftName + " => (" + objName + " = " + rhs2 + ");" + "\r\n");
				};
				//sb.append("\r\n");
			}
		}		

		for (String trans: transitions) {
			TransitionSpec tSpec = getTransitionSpec(currState, trans);
			if ((tSpec != null) && !tSpec.effect.isEmpty()) {
				String[] effects = tSpec.effect.split(";");
				for (String effect: effects) {
					String[] tokens = effect.split(":=");
					String objName = tokens[0].trim();
					String rhs1 = wrapIfLocalVariable(tokens[1].trim());
					String rhs2 = handlePropertyLookup(rhs1);
					if (rhs2.split(" ").length > 1) {
						rhs2 = "(" + rhs2 + ")";
					}
					if(keyword.equals("guarantee")) {
						sb.append(LINE_INDENT + keyword + " \"" + ftName + "_" + objName + "\"" + " : " + ftName + " => (" + objName + " = " + rhs2 + ");" + "\r\n");
					} else {
					    // Temporary removal of assertion name since they're invalid in OSATE 2.1.0
						sb.append(LINE_INDENT + keyword + " " + ftName + " => (" + objName + " = " + rhs2 + ");" + "\r\n");
					};
					//sb.append("\r\n");
				}
			}
		}

		return sb.toString();
	}

	// generate the "eq" guard and "guarantee/assert" action statements for all of the flattened transitions
	private String generateTransitionGuardsAndActions(StateMachine topSM, String keyword)
	{
		StringBuilder transSB = new StringBuilder();
		
		Iterator<FlattenedTransitionSpec> iter = flattenedTransitionList.iterator();
		while (iter.hasNext()) {
			FlattenedTransitionSpec ftSpec = iter.next();
	
			// generate the "eq" guard
			String transGuardStr = generateTransitionGuard(ftSpec.concatName, ftSpec.transitions, ftSpec.source, topSM);
			transSB.append(transGuardStr);
			transSB.append("\r\n");
			
			// generate "guarantee" actions (for ComponentType) or "assert" actions (for ComponentImplementation)
			String transActionStr = generateTransitionActions(ftSpec.concatName, ftSpec.transitions, ftSpec.source, topSM, keyword);			
			transSB.append(transActionStr);
			transSB.append("\r\n");
			
		}
		//transSB.append("\r\n");

		return transSB.toString();
	}

	// generate the "eq" guard and "guarantee/assert" action statements for all of the local variables
	private String generateTransitionStmtsForLocalVariables(StateMachine topSM, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		// get the list of states which affect local variables
		Iterator<Entry<String, StateSpec>> iter = stateMap.entrySet().iterator();
		if (!iter.hasNext()) {
		}
		while (iter.hasNext()) {
			Entry<String, StateSpec> entry = iter.next();
			String currState = entry.getKey();
			
			// generate for all states which affect local variables
			if (!entry.getValue().affectedVars.isEmpty()) {
						
				String newGuard = VAR_STATE_PREFIX + currState;
				// generate the "eq" for the state -- initially false, precondition of current state
				sb.append(LINE_INDENT + "eq " + newGuard + " : bool = (false -> pre(" + currState + ")");
				
				// generate "not <T>" for outgoing transitions if we're in a nested state machine
				List<String> nestedOutTrans = getAllOutgoingTransitions(stateMap.get(currState).enclosingStateMachine, topSM);
				if (!nestedOutTrans.isEmpty()) {
					sb.append(" and not (");
					boolean first = true;
					for (String ot: nestedOutTrans) {
						if (!first) {
							sb.append(" or ");
						}
						sb.append(ot);
						first = false;
					}
					sb.append(")");
				}
				
				// generate "not <T>" for outgoing transitions from the current state
				List<String> outTrans = stateMap.get(currState).outTransitions;
				if (!outTrans.isEmpty()) {
					sb.append(" and not (");
					boolean first = true;
					for (String ot: outTrans) {
						if (!first) {
							sb.append(" or ");
						}
						sb.append(ot);
						first = false;
					}
					sb.append(")");

				}
				sb.append(");\r\n");
				//sb.append("\r\n");
				
				// generate "next state" action
				if(keyword.equals("guarantee")) {
					sb.append(LINE_INDENT + keyword + " \"" + newGuard + "_next_state" + "\"" + " : " + newGuard + " => " + currState + ";\r\n");
				} else {
					// Temporary removal of assertion name since they're invalid in OSATE 2.1.0
					sb.append(LINE_INDENT + keyword + " " + newGuard + " => " + currState + ";\r\n");
					};	
				//sb.append("\r\n");
				
				// conditionally generate action(s) for affected variables
				List<String> durActs = stateMap.get(currState).duringActions;
				if (durActs != null) {
					for (String dur: durActs) {
						String[] tokens = dur.split(":=");
						String objName = tokens[0].trim();
						String rhs1 = wrapIfLocalVariable(tokens[1].trim());
						String rhs2 = handlePropertyLookup(rhs1);
						if(keyword.equals("guarantee")) {
							sb.append(LINE_INDENT + keyword + " \"" + newGuard + "_" + objName + "\"" + " : " + newGuard + " => (" + objName + " = " + rhs2 + ");" + "\r\n");
						} else {
							// Temporary removal of assertion name since they're invalid in OSATE 2.1.0
							sb.append(LINE_INDENT + keyword + " " + newGuard + " => (" + objName + " = " + rhs2 + ");" + "\r\n");	
						};	
						//sb.append("\r\n");
						
						// store the name for later use when generating "no change" actions
						allVarSpecs.addGuard(objName, newGuard);
					}
				}		
				sb.append("\r\n");
			}
		}
		
		return sb.toString();
	}

	// generate the "guarantee/assert" actions for "no change" to each of the local variables
	private String generateNoChangeActionsLocalVars(StateMachine sm, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		// process local variables
		Iterator<Entry<String, VarSpec>> varIter = allVarSpecs.getIterator();
		while (varIter.hasNext()) {
			Entry<String, VarSpec> entry = varIter.next();
			String varName = entry.getKey();

			String currName = NO_CHANGE_PREFIX + varName;
			
			// guarantee|assert "curr_name" : true -> (not <incoming transitions> or Do_<varName> state) => (<var> = pre(<var>));
			if(keyword.equals("guarantee")) {				
				sb.append(LINE_INDENT + keyword + " \"" + currName + "\"" + " : " + "true -> (not (");
			}
			
			if(keyword.equals("assert"))
			{
				sb.append(LINE_INDENT + keyword + " true -> (not (");
			}

			// append incoming transitions
			boolean first = true;
			List<String> affStates = entry.getValue().affectingStates;
			List<String> affTrans = entry.getValue().affectingTransitions;

			for (String state: affStates) {
				// find all flattened transitions terminating in the current state
				for (FlattenedTransitionSpec ftSpec: flattenedTransitionList) {
					if (ftSpec.target.equals(state)) {
						if (!first) {
							sb.append(" or ");
						}
						sb.append(ftSpec.concatName);
						first = false;
					}
				}
				if (!first) {
					sb.append(" or ");
				}
				sb.append(allVarSpecs.getGuard(varName));
				first = false;
			}
			
			for (String trans: affTrans) {
				// find all transitions that affect this variable as an effect
				if (!first) {
					sb.append(" or ");
				}
				sb.append(trans);
				first = false;
			}
			
			// action is <var> = pre<var>
			sb.append(") => (" + varName + " = pre(" + varName + ")));\r\n");
			//sb.append("\r\n");
		}
		
		return sb.toString();
	}
	
	// generate the "guarantee/assert" actions for "no change" to each of the output ports
	private String generateNoChangeActionsOutPorts(StateMachine sm, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		for (String oPort : envSpec.outPorts) {
			// get the list of flattened transitions that terminate in states which change this port
			List<String> transitions = new ArrayList<String>();
			Iterator<Entry<String, StateSpec>> iter = stateMap.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<String, StateSpec> entry = iter.next();
				if (entry.getValue().affectedOutPorts.contains(oPort)) {
					String state = entry.getKey();
					// get the list of flattened transitions that terminate in an affecting state
					for (FlattenedTransitionSpec ftSpec: flattenedTransitionList) {
						if (ftSpec.target.equals(state)) {
							transitions.add(ftSpec.concatName);
						}
					}
				}
			}
			
			// add to the list of transitions any transitions that change this port as an action
			Iterator<Entry<String, TransitionAffectedObjs>> iterTr = transitionAffectedObjs.entrySet().iterator();
			while (iterTr.hasNext()) {
				Entry<String, TransitionAffectedObjs> entry = iterTr.next();
				if (entry.getValue().affectedOutPorts.contains(oPort)) {
					transitions.add(entry.getKey());
				}
			}
			
			String currName = NO_CHANGE_PREFIX + oPort;

			// guarantee|assert "curr_name" : true -> (not <incoming transitions>) => (<port> = pre(<port>));
			if(keyword.equals("guarantee"))
			{
				sb.append(LINE_INDENT + keyword + " \"" + currName + "\"" + " : " + "true -> (not (");
			}
			if(keyword.equals("assert"))
			{
				sb.append(LINE_INDENT + keyword + " true -> (not (");
			}
			
			
			// append incoming transitions
			boolean first = true;
			for (String ft: transitions) {
				if (!first) {
					sb.append(" or ");
				}
				sb.append(ft);
				first = false;
			}
			
			// action is <port> = pre<port>
			sb.append(") => (" + oPort + " = pre(" + oPort + ")));\r\n");
			//sb.append("\r\n");
		}
		
		return sb.toString();
	}

	// generate the "guarantee/assert" actions for "no change" to each of the output ports
	private String generateNoChangeActionsBidirPorts(StateMachine sm, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		for (String bdPort : envSpec.bidirPorts) {
			// get the list of flattened transitions that terminate in states which change this port
			List<String> transitions = new ArrayList<String>();
			Iterator<Entry<String, StateSpec>> iter = stateMap.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<String, StateSpec> entry = iter.next();
				if (entry.getValue().affectedOutPorts.contains(bdPort)) {
					String state = entry.getKey();
					// get the list of flattened transitions that terminate in an affecting state
					for (FlattenedTransitionSpec ftSpec: flattenedTransitionList) {
						if (ftSpec.target.equals(state)) {
							transitions.add(ftSpec.concatName);
						}
					}
				}
			}
			
			String currName = NO_CHANGE_PREFIX + bdPort;

			// guarantee|assert "curr_name" : true -> (not <incoming transitions>) => (<port> = pre(<port>));
			if(keyword.equals("guarantee"))
			{
				sb.append(LINE_INDENT + keyword + " \"" + currName + "\"" + " : " + "true -> (not (");
			}
			if(keyword.equals("assert"))
			{
				sb.append(LINE_INDENT + keyword + " true -> (not (");
			}
			
			// append incoming transitions
			boolean first = true;
			for (String ft: transitions) {
				if (!first) {
					sb.append(" or ");
				}
				sb.append(ft);
				first = false;
			}
			
			// action is <port> = pre<port>
			sb.append(") => (" + bdPort + " = pre(" + bdPort + ")));\r\n");
			//sb.append("\r\n");
		}
		
		return sb.toString();
	}

	// generate the "guarantee/assert" actions resulting in no state change
	private String generateNoStateChangeAction(StateMachine sm, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		String currName = NO_CHANGE_PREFIX + "state";

		// guarantee|assert "curr_name" : true -> (not <incoming transitions>) => (<port> = pre(<port>));
		if(keyword.equals("guarantee"))
		{
			sb.append(LINE_INDENT + keyword + " \"" + currName + "\"" + " : " + "true -> (not (");
		}
		if(keyword.equals("assert"))
		{
			sb.append(LINE_INDENT + keyword + " true -> (not (");
		}
		
		// append all flattened transitions
		boolean first = true;
		for (FlattenedTransitionSpec ftSpec: flattenedTransitionList) {
			if (!first) {
				sb.append(" or ");
			}
			sb.append(ftSpec.concatName);
			first = false;
		}
		
		// append all local variable guard names
		Iterator<Entry<String, VarSpec>> varIter = allVarSpecs.getIterator();
		while (varIter.hasNext()) {
			Entry<String, VarSpec> entry = varIter.next();
			String guardName = entry.getValue().guardName;
			if (!guardName.isEmpty()) {
				if (!first) {
					sb.append(" or ");
				}
				sb.append(entry.getValue().guardName);
				first = false;
			}
		}
		
		sb.append(") => ");
		sb.append("\r\n");
		
		// action is (for all states: <state> = pre<state>)
		Iterator<Entry<String, StateSpec>> stateIter = stateMap.entrySet().iterator();
		while (stateIter.hasNext()) {
			Entry<String, StateSpec> entry = stateIter.next();
			String stateName = entry.getKey();
			sb.append(LINE_INDENT + "             (" + stateName + " = pre(" + stateName + "))");
			if (stateIter.hasNext()) {
				sb.append(" and");
				sb.append("\r\n");
			}
		}
		sb.append(");");
		//sb.append("\r\n");
		
		return sb.toString();
	}

	// generate all of the statements for "no change" to local variables, out/bidir ports, and state
	private String generateNoChangeActions(StateMachine sm, String keyword)
	{
		StringBuilder sb = new StringBuilder();
		
		// process local variables
		String ncLocalVars = generateNoChangeActionsLocalVars(sm, keyword);
		sb.append(ncLocalVars);
		
		// process output ports
		String ncOutPorts = generateNoChangeActionsOutPorts(sm, keyword);
		sb.append(ncOutPorts);
		
		// process bidirectional ports
		String ncBidirPorts = generateNoChangeActionsBidirPorts(sm, keyword);
		sb.append(ncBidirPorts);
		
		// handle "no state change" condition
		String noStateChange = generateNoStateChangeAction(sm, keyword);
		sb.append(noStateChange);

		sb.append("\r\n");
		return sb.toString();
	}

	// generate the "valid state" lemma of the AADL annex
	private String generateValidState(String keyword) {
		StringBuilder sb = new StringBuilder();

		sb.append(LINE_INDENT + keyword + " \"valid_state\" : ");

		String topSM = stateMap.get(topLevelStart).enclosingStateMachine;
		Iterator<Entry<String, StateSpec>> iter = stateMap.entrySet().iterator();
		boolean first = true;
		while (iter.hasNext()) {
			Entry<String, StateSpec> entry = iter.next();
			String encSM = entry.getValue().enclosingStateMachine;
			if (topSM.equals(encSM)) {
				if (!first) {
					sb.append(" or ");
				}
				sb.append(entry.getKey());
				first = false;
			}
		}
		sb.append(";\r\n");
		sb.append("\r\n");
		return sb.toString();
	}

	// generate the transition-dependent portion of the AADL annex
	public String generateTransitions(ComponentClassifier acc)
	{
		StringBuilder transSB = new StringBuilder();
		
		for (Entry<StateMachine, AObject> entry : mapStateMachine.entrySet()) {

			if (entry.getValue().equals(acc)) {

				String keyword = new String();
				// "guarantee" for types, "assert" for impls
				if (acc instanceof ComponentType) {
					keyword = "guarantee";
				}
				else {
					keyword = "assert";
				}

				StateMachine sm = entry.getKey();

				// generate "eq" statements for local variables
				String locals = declareLocalVariables(acc);
				transSB.append(locals);
				
				// generate initial state "guarantee|assert" action
				if (!topLevelStart.isEmpty()) {
					if(keyword.equals("guarantee"))
					{
						transSB.append(LINE_INDENT + keyword + " \"Initial_State\" : " + topLevelStart + " -> true;\r\n");
					}
					if(keyword.equals("assert"))
					{
						transSB.append(LINE_INDENT + keyword + " " + topLevelStart + " -> true;\r\n");
					}
					
					transSB.append("\r\n");
					//transSB.append("\r\n");
				}

				// construct a list of all flattened transitions
				generateFlattenedTransitions(sm);
				// debug
//				log.status("flattened transitions:");
//				log.status(flattenedTransitionListString());
				
				// generate "eq" guard and "guarantee/assert" action statements for transitions
				String guards = generateTransitionGuardsAndActions(entry.getKey(), keyword);
				transSB.append(guards);
				
				// generate "eq" guard and "guarantee/assert" action statements for local variables
				String genLocals = generateTransitionStmtsForLocalVariables(sm, keyword);
				transSB.append(genLocals);
				
				// generate "guarantee/assert" action statements for "no change"
				String noChange = generateNoChangeActions(sm, keyword);
				transSB.append(noChange);
				
				// generate "valid state" guarantee/lemma
				String vsKeyword;
				if (acc instanceof ComponentType) {
					vsKeyword = "guarantee";
				}
				else {
					vsKeyword = "lemma";
				}
				String validState = generateValidState(vsKeyword);
				transSB.append(validState);
			}
		}
		return transSB.toString();
	}
	

//===================================================================
//===========  Utilities
//===================================================================

	
	private void addSubcomponent(ComponentImplementation aci, Subcomponent asub) {
		
		if (aci instanceof SystemImplementation) {
			SystemImplementation asi = (SystemImplementation) aci;
			if (asub instanceof SystemSubcomponent) {
				asi.getOwnedSystemSubcomponents()
						.add((SystemSubcomponent) asub);
				
				return;
			}
		}

		if (aci instanceof DataImplementation) {
			DataImplementation adi = (DataImplementation) aci;
			if (asub instanceof DataSubcomponent) {
				adi.getOwnedDataSubcomponents().add((DataSubcomponent) asub);
			
				return;
		}	
		}
		
		if (!(aci  instanceof SystemImplementation) ||!(aci  instanceof DataImplementation))
		{
			//log.info("Variable attribute in implementation");
			//log.warn("Variable Name IGNORED...AS ITS ON STATE NOT ON IMPL in implementation");
		}
		//throw new IllegalArgumentException("Cannot add subcomponent " + asub
			//	+ " to " + aci);
	}
	
	
	@Override
	public Object casePort(Port ep) {
		DataPort aDataPort = (DataPort) map.get(ep);
		if (ep.getUpperValue().size()!=0)
		{
			EList<LiteralInteger> liUpperValue = ep.getUpperValue();
			for (LiteralInteger lIUV: liUpperValue)
			{
				if (lIUV.getValue()>1)
				{
						ArrayDimension aDim = aDataPort.createArrayDimension(); 
						ArraySize aSize = aDim.createSize();
						aSize.setSize(lIUV.getValue());
				}
			}
		}	
		if (ep.getType() != null) {
						
			if (ep.getType() instanceof PrimitiveTypeImpl) {

				PrimitiveType portType = (PrimitiveType) ep.getType();
				if (ep.getType().eIsProxy()) {
					org.eclipse.emf.common.util.URI uri = ((org.eclipse.emf.ecore.InternalEObject) portType)
							.eProxyURI();
					Classifier dst = EMFIndexRetrieval.getClassifierInWorkspace(OsateResourceUtil.getResourceSet(), "Base_Types::" + uri.fragment());
					aDataPort.setDataFeatureClassifier((DataSubcomponentType) dst);
				}
			} else
			{
			aDataPort.setDataFeatureClassifier((DataSubcomponentType) map
					.get(ep.getType()));
			}

		}
		
//		Feature value;
//		aDataPort.setRefined(value);
		
		return DONE;
	}
	
	// Getting types for subcomponents within implementation
	@Override
	public Object caseProperty(Property eProperty)
	{
		if(!eProperty.getName().contains("local::"))
		{
		Subcomponent asub = (Subcomponent) map.get(eProperty);
		if (asub instanceof SystemSubcomponent)
		{
			SystemSubcomponent aSystemSub = (SystemSubcomponent) asub;
			SystemSubcomponentType aSubType = (SystemSubcomponentType) map.get(eProperty.getType());
			// Check for component impl in component type
			if(wrapperMap.containsKey(eProperty.getType()))
			{
				aSubType = (SystemSubcomponentType) wrapperMap.get(eProperty.getType()).getcImpl();
				
			}
			aSystemSub.setSystemSubcomponentType(aSubType);
			if (eProperty.getUpperValue().size()!=0)
			{
				EList<LiteralInteger> liUpperValue = eProperty.getUpperValue();
				for (LiteralInteger lIUV: liUpperValue)
				{
					if (lIUV.getValue()>1)
					{
							ArrayDimension aDim = asub.createArrayDimension(); 
							ArraySize aSize = aDim.createSize();
							aSize.setSize(lIUV.getValue());
					}
				}
			}	
		}
		if (asub instanceof DataSubcomponent)
		{
			DataSubcomponent aDataSub = (DataSubcomponent) asub;
			DataSubcomponentType aSubType = (DataSubcomponentType) map.get(eProperty.getType());
			// Check for component impl in component type
			if(wrapperMap.containsKey(eProperty.getType()))
			{
				aSubType = (DataSubcomponentType) wrapperMap.get(eProperty.getType()).getcImpl();
				
			}
			aDataSub.setDataSubcomponentType(aSubType);
			if (eProperty.getUpperValue().size()!=0)
			{
				EList<LiteralInteger> liUpperValue = eProperty.getUpperValue();
				for (LiteralInteger lIUV: liUpperValue)
				{
					if (lIUV.getValue()>1)
					{
							ArrayDimension aDim = asub.createArrayDimension(); 
							ArraySize aSize = aDim.createSize();
							aSize.setSize(lIUV.getValue());
					}
				}
			}	
		}
		}
		
		return DONE;
	}
	
	

	//Setting UML ports to AADL ports and realizing the connections
	@Override
	public Object caseConnector(Connector eConnector)
	{
		PortConnection apc = (PortConnection) map.get(eConnector); 
		setConnectionEnd(apc.getSource(), eConnector.getEnd().get(0));
		setConnectionEnd(apc.getDestination(), eConnector.getEnd().get(1));
		return DONE;
	}
	
	
	private void setConnectionEnd(ConnectedElement ace, ConnectorEnd ece) {
		
		ace.setContext(getContext(ece.getRole()));
		ace.setConnectionEnd(getConnectionEnd(ece.getRole()));
		
	}
	
	// Get the context for the connection. Context is the Component or Subcomponent the port is in for the connection 
	private Context getContext(Port ePort) {
		
		if (ePort.eContainer() instanceof Class)
		{
			return null;
		}
		if (ePort.eContainer() instanceof Property)
		{
			return (Subcomponent) map.get(ePort.eContainer());
			
		}
		
		throw new IllegalArgumentException(); 
	}
	

	private ConnectionEnd getConnectionEnd(Port ePort) {
		
		if (ePort.eContainer() instanceof Class)
		{
			Class eClass = (Class) ePort.eContainer();
			Class eClassType;
			
			if(wrapperMap.containsKey(eClass))
			{
				eClassType = eClass;
			} else
			{
				eClassType = eClass.getImplements().getSupplier();
			}
			
			
			Port ePortType = getPortByName(eClassType.getOwnedPort(), ePort.getName());
			return (DataPort) map.get(ePortType);// could be cast to ConnectionEnd for generic implementation
		}
		
		if ((ePort.eContainer() instanceof Property) && ((Property) ePort.eContainer()).getType() instanceof Class)
		{
			
			Property eProperty = (Property) ePort.eContainer();
			
				Class eClassType = (Class) eProperty.getType();
			
			 //doesnt handle if subcomponent is an implementation
			Port ePortType = getPortByName(eClassType.getOwnedPort(), ePort.getName());
			
			return (DataPort) map.get(ePortType);// could be cast to ConnectionEnd for generic implementation
		}
		throw new IllegalArgumentException();// add relevant exception statements
	}

	private Port getPortByName(EList<Port> ePorts, String name) {
				
		for(Port ePort: ePorts)
		{
			if(ePort.getName().equals(name))
			{
				return ePort;
			}
		}
		
		throw new IllegalArgumentException();// add relevant exception statements 
	}
	
	public String ReadFile(String path, boolean warn) {
		String text = "";
		try {
			File f = new File(path);
			BufferedReader input =  new BufferedReader(new FileReader(f));
			String nl = System.getProperty("line.separator");
			String line = null;
			while ((line = input.readLine()) != null) {
				text = text + line + nl;
			}
			input.close();
		} catch (IOException e) {
			if (warn) log.warn("No file found for " + path);
		} catch (Exception e) {
			log.error("Exception " + e.toString());
		}
		return text;
	}
	
	private void createAgreeAnnex(String contract, ComponentClassifier cc)
	{
	
		String atx = "";
		if (contract != null && !contract.isEmpty()) atx += contract;


		if (!atx.isEmpty()) {
			log.status("Creating Agree Annex for " + cc.getName());
			DefaultAnnexSubclause asc = Aadl2Factory.eINSTANCE.createDefaultAnnexSubclause();
			cc.getOwnedAnnexSubclauses().add(asc);
			asc.setName("agree");
			asc.setSourceText("{** " + atx + " **}");
		}
	}
	
	
//===================================================================
//===========  Debug Utilities
//===========  (for printing data structures to console via logger) 
//===================================================================
	
	// create a string representation of the envSpec data structure (for debug)
//	private String envSpecString()
//	{
//		StringBuilder sb = new StringBuilder();
//		sb.append("Ports:\r\n");
//
//		sb.append("   out ports:" + "\r\n");
//		if (!envSpec.outPorts.isEmpty()) {
//			for (String outP: envSpec.outPorts) {
//				sb.append("      " + outP + "\r\n");
//			}
//		}
//		else {
//			sb.append("      <none>\r\n");
//		}
//		
//		sb.append("   in ports:" + "\r\n");
//		if (!envSpec.inPorts.isEmpty()) {
//			for (String inP: envSpec.inPorts) {
//				sb.append("      " + inP + "\r\n");
//			}
//		}
//		else {
//			sb.append("      <none>\r\n");
//		}
//
//		sb.append("   bidir ports:" + "\r\n");
//		if (!envSpec.bidirPorts.isEmpty()) {
//			for (String biP: envSpec.bidirPorts) {
//				sb.append("      " + biP + "\r\n");
//			}
//		}
//		else {
//			sb.append("      <none>\r\n");
//		}
//
//		sb.append("   variables:" + "\r\n");
//		Iterator<Entry<String, String>> iter = envSpec.variables.entrySet().iterator();
//		while (iter.hasNext()) {
//			Entry<String, String> entry = iter.next();
//			sb.append("      " + entry.getKey() + " : " + entry.getValue()); 
//		}
//
//		return sb.toString();
//	}
//	
//	// create a string representation of the allVariables data structure (for debug)
//	private String allVariablesString()
//	{
//		StringBuilder sb = new StringBuilder();
//		Iterator<Entry<String, VarSpec>> iter = allVarSpecs.getIterator();
//		while (iter.hasNext()) {
//			Entry<String, VarSpec> entry = iter.next();
//			sb.append("   " + entry.getKey() + " : " + entry.getValue().type + "\r\n");
//			sb.append("           states: " + Arrays.toString(entry.getValue().affectingStates.toArray()) + "\r\n");
//			sb.append("           transitions: " + Arrays.toString(entry.getValue().affectingTransitions.toArray()) + "\r\n");
//		}
//		return sb.toString();
//	}
//	
//	// create a string representation of the stateMap data structure (for debug)
//	private String stateMapString() {
//		// for printing
//		StringBuilder sb = new StringBuilder();
//		Iterator<Entry<String, StateSpec>> iter = stateMap.entrySet().iterator();
//		while (iter.hasNext()) {
//			Entry<String, StateSpec> entry = iter.next();
//			sb.append("   state: " + entry.getKey() + "\r\n");
//			sb.append("      type: " + entry.getValue().type + "\r\n");
//			sb.append("      enclosing state machine: " + entry.getValue().enclosingStateMachine + "\r\n");
//			
//			sb.append("      entry actions:\r\n");
//			if (entry.getValue().entryActions != null && !entry.getValue().entryActions.isEmpty()) {
//				for (String ea: entry.getValue().entryActions) {
//					sb.append("         " + ea + "\r\n");
//				}
//			}
//			else {
//				sb.append("         <none>\r\n");
//			}
//			
//			sb.append("      during actions:\r\n");
//			if (entry.getValue().duringActions != null && !entry.getValue().duringActions.isEmpty()) {
//				for (String da: entry.getValue().duringActions) {
//					sb.append("         " + da + "\r\n");
//				}
//			}
//			else {
//				sb.append("         <none>\r\n");
//			}
//			
//			sb.append("      outgoing transitions:\r\n");
//			if (entry.getValue().outTransitions != null && !entry.getValue().outTransitions.isEmpty()) {
//				for (String ot: entry.getValue().outTransitions) {
//					sb.append("         " + ot + "\r\n");
//				}
//			}
//			else {
//				sb.append("         <none>\r\n");
//			}
//			
//			sb.append("      incoming transitions:\r\n");
//			if (entry.getValue().inTransitions != null && !entry.getValue().inTransitions.isEmpty()) {
//				for (String it: entry.getValue().inTransitions) {
//					sb.append("         " + it + "\r\n");
//				}
//			}
//			else {
//				sb.append("         <none>\r\n");
//			}
//			
//			sb.append("      affected objects:\r\n");
//			boolean noObjects = true;
//			if (entry.getValue().affectedVars != null && !entry.getValue().affectedVars.isEmpty()) {
//				for (String ao: entry.getValue().affectedVars) {
//					sb.append("         var    : " + ao + "\r\n");
//				}
//				noObjects = false;
//			}
//			if (entry.getValue().affectedOutPorts != null && !entry.getValue().affectedOutPorts.isEmpty()) {
//				for (String op: entry.getValue().affectedOutPorts) {
//					sb.append("         outP   : " + op + "\r\n");
//				}
//				noObjects = false;
//			}
//			if (entry.getValue().affectedBidirPorts != null && !entry.getValue().affectedBidirPorts.isEmpty()) {
//				for (String bp: entry.getValue().affectedBidirPorts) {
//					sb.append("         bidirP : " + bp + "\r\n");
//				}
//				noObjects = false;				
//			}
//			if (noObjects) {
//				sb.append("         <none>\r\n");
//			}
//		}
//		return sb.toString();		
//	}
//	
//	// create a string representation of the nestedStartMap data structure (for debug)
//	private String nestedStartMapString()
//	{
//		// for printing
//		StringBuilder sb = new StringBuilder();
//		Iterator<Entry<String, String>> iter = nestedStartMap.entrySet().iterator();
//		while (iter.hasNext()) {
//			Entry<String, String> entry = iter.next();
//			sb.append("    " + entry.getKey() + " --> start state: " + entry.getValue() + "\r\n");
//		}
//		return sb.toString();
//	}
//	
//	// create a string representation of the transitionMap data structure (for debug)
//	private String transitionMapString()
//	{
//		// for printing
//		StringBuilder sb = new StringBuilder();
//		Iterator<Entry<String, List<TransitionSpec>>> iter = transitionMap.entrySet().iterator();
//		while (iter.hasNext()) {
//		    Entry<String, List<TransitionSpec>> entry = iter.next();
//		    sb.append("    " + entry.getKey() + "\r\n");
//		    List<TransitionSpec> tSpecs = entry.getValue();
//		    for (TransitionSpec spec: tSpecs) {
//		    	sb.append("        name: " + spec.name + "  tgt: " + spec.target + "  guard: " + spec.guard + "  effect: " + spec.effect + "\r\n");
//		    }
//		}
//		return sb.toString();
//	}
//	
//	// create a string representation of the transitionAffectedObjs data structure (for debug)
//	private String transitionAffectedObjsString()
//	{
//		// for printing
//		StringBuilder sb = new StringBuilder();
//		Iterator<Entry<String, TransitionAffectedObjs>> iter = transitionAffectedObjs.entrySet().iterator();
//		while (iter.hasNext()) {
//			Entry<String, TransitionAffectedObjs> entry = iter.next();
//			sb.append("    " + entry.getKey() + "\r\n");
//			boolean noObjects = true;
//			TransitionAffectedObjs affectedObjs = entry.getValue();
//			if (affectedObjs.affectedVars != null && !affectedObjs.affectedVars.isEmpty()) {
//				for (String ao: affectedObjs.affectedVars) {
//					sb.append("         var    : " + ao + "\r\n");
//				}
//				noObjects = false;
//			}
//			if (affectedObjs.affectedOutPorts != null && !affectedObjs.affectedOutPorts.isEmpty()) {
//				for (String op: affectedObjs.affectedOutPorts) {
//					sb.append("         outP   : " + op + "\r\n");
//				}
//				noObjects = false;
//			}
//			if (affectedObjs.affectedBidirPorts != null && !affectedObjs.affectedBidirPorts.isEmpty()) {
//				for (String bp: affectedObjs.affectedBidirPorts) {
//					sb.append("         bidirP : " + bp + "\r\n");
//				}
//				noObjects = false;				
//			}
//			if (noObjects) {
//				sb.append("         <none>\r\n");
//			}
//		}
//		return sb.toString();
//	}
//
//	// create a string representation of the flattenedTransitionList data structure (for debug)
//	private String flattenedTransitionListString()
//	{
//		// for printing
//		StringBuilder sb = new StringBuilder();
//		for (FlattenedTransitionSpec ftSpec: flattenedTransitionList) {
//			sb.append("    flattenedName: " + ftSpec.concatName + "\r\n");
//			sb.append("        source: " + ftSpec.source + "\r\n");
//			sb.append("        target: " + ftSpec.target + "\r\n");
//			sb.append("        transitions: " + Arrays.toString(ftSpec.transitions.toArray()) + "\r\n");
//		}
//		return sb.toString();
//	}

}
