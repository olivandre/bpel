/**
 * <copyright>
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 * </copyright>
 *
 * $Id: BPELPackage.java,v 1.29 2007/04/20 23:31:44 mchmielewski Exp $
 */
package org.eclipse.bpel.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.wst.wsdl.WSDLPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.bpel.model.BPELFactory
 * @model kind="package"
 * @generated
 */
public interface BPELPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/wsbpel/2.0/process/executable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpws";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPELPackage eINSTANCE = org.eclipse.bpel.model.impl.BPELPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ProcessImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.PartnerLinkImpl <em>Partner Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.PartnerLinkImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getPartnerLink()
	 * @generated
	 */
	int PARTNER_LINK = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.FaultHandlerImpl <em>Fault Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.FaultHandlerImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getFaultHandler()
	 * @generated
	 */
	int FAULT_HANDLER = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ActivityImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CorrelationSetImpl <em>Correlation Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CorrelationSetImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCorrelationSet()
	 * @generated
	 */
	int CORRELATION_SET = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.PartnerActivityImpl <em>Partner Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.PartnerActivityImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getPartnerActivity()
	 * @generated
	 */
	int PARTNER_ACTIVITY = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.InvokeImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.LinkImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CatchImpl <em>Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CatchImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCatch()
	 * @generated
	 */
	int CATCH = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ReplyImpl <em>Reply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ReplyImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getReply()
	 * @generated
	 */
	int REPLY = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ReceiveImpl <em>Receive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ReceiveImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getReceive()
	 * @generated
	 */
	int RECEIVE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ThrowImpl <em>Throw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ThrowImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getThrow()
	 * @generated
	 */
	int THROW = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.WaitImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.EmptyImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.SequenceImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.WhileImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.PickImpl <em>Pick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.PickImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getPick()
	 * @generated
	 */
	int PICK = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.FlowImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.OnAlarmImpl <em>On Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.OnAlarmImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getOnAlarm()
	 * @generated
	 */
	int ON_ALARM = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.AssignImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CopyImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ExtensionImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 22;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ScopeImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 23;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CompensateImpl <em>Compensate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CompensateImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCompensate()
	 * @generated
	 */
	int COMPENSATE = 24;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CompensationHandlerImpl <em>Compensation Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CompensationHandlerImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCompensationHandler()
	 * @generated
	 */
	int COMPENSATION_HANDLER = 25;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ToImpl <em>To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ToImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getTo()
	 * @generated
	 */
	int TO = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.FromImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.OnMessageImpl <em>On Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.OnMessageImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getOnMessage()
	 * @generated
	 */
	int ON_MESSAGE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ExpressionImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.BooleanExpressionImpl <em>Boolean Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.BooleanExpressionImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getBooleanExpression()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CorrelationImpl <em>Correlation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CorrelationImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCorrelation()
	 * @generated
	 */
	int CORRELATION = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.EventHandlerImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.SourceImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.TargetImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.PartnerLinksImpl <em>Partner Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.PartnerLinksImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getPartnerLinks()
	 * @generated
	 */
	int PARTNER_LINKS = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.VariablesImpl <em>Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.VariablesImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getVariables()
	 * @generated
	 */
	int VARIABLES = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CorrelationSetsImpl <em>Correlation Sets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CorrelationSetsImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCorrelationSets()
	 * @generated
	 */
	int CORRELATION_SETS = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.LinksImpl <em>Links</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.LinksImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getLinks()
	 * @generated
	 */
	int LINKS = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CatchAllImpl <em>Catch All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CatchAllImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCatchAll()
	 * @generated
	 */
	int CATCH_ALL = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CorrelationsImpl <em>Correlations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CorrelationsImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCorrelations()
	 * @generated
	 */
	int CORRELATIONS = 40;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.VariableImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 41;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.UnknownExtensibilityAttributeImpl <em>Unknown Extensibility Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.UnknownExtensibilityAttributeImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getUnknownExtensibilityAttribute()
	 * @generated
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE = 42;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.OnEventImpl <em>On Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.OnEventImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getOnEvent()
	 * @generated
	 */
	int ON_EVENT = 43;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ImportImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 44;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.RethrowImpl <em>Rethrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.RethrowImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getRethrow()
	 * @generated
	 */
	int RETHROW = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ConditionImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 46;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.TargetsImpl <em>Targets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.TargetsImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getTargets()
	 * @generated
	 */
	int TARGETS = 47;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.SourcesImpl <em>Sources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.SourcesImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getSources()
	 * @generated
	 */
	int SOURCES = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.QueryImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ServiceRefImpl <em>Service Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ServiceRefImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getServiceRef()
	 * @generated
	 */
	int SERVICE_REF = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ExitImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ExtensionsImpl <em>Extensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ExtensionsImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getExtensions()
	 * @generated
	 */
	int EXTENSIONS = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ExtensionActivityImpl <em>Extension Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ExtensionActivityImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getExtensionActivity()
	 * @generated
	 */
	int EXTENSION_ACTIVITY = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.FromPartImpl <em>From Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.FromPartImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getFromPart()
	 * @generated
	 */
	int FROM_PART = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ToPartImpl <em>To Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ToPartImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getToPart()
	 * @generated
	 */
	int TO_PART = 54;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.OpaqueActivityImpl <em>Opaque Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.OpaqueActivityImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getOpaqueActivity()
	 * @generated
	 */
	int OPAQUE_ACTIVITY = 55;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ForEachImpl <em>For Each</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ForEachImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getForEach()
	 * @generated
	 */
	int FOR_EACH = 56;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.RepeatUntilImpl <em>Repeat Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.RepeatUntilImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getRepeatUntil()
	 * @generated
	 */
	int REPEAT_UNTIL = 57;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.TerminationHandlerImpl <em>Termination Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.TerminationHandlerImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getTerminationHandler()
	 * @generated
	 */
	int TERMINATION_HANDLER = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.IfImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getIf()
	 * @generated
	 */
	int IF = 60;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ElseIfImpl <em>Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ElseIfImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getElseIf()
	 * @generated
	 */
	int ELSE_IF = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ElseImpl <em>Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ElseImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getElse()
	 * @generated
	 */
	int ELSE = 62;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CompletionConditionImpl <em>Completion Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CompletionConditionImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCompletionCondition()
	 * @generated
	 */
	int COMPLETION_CONDITION = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.BranchesImpl <em>Branches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.BranchesImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getBranches()
	 * @generated
	 */
	int BRANCHES = 64;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ExtensibleElementImpl <em>Extensible Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ExtensibleElementImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getExtensibleElement()
	 * @generated
	 */
	int EXTENSIBLE_ELEMENT = 65;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT = WSDLPackage.EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__ELEMENT = WSDLPackage.EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS = WSDLPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT__DOCUMENTATION = WSDLPackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Extensible Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIBLE_ELEMENT_FEATURE_COUNT = WSDLPackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TARGET_NAMESPACE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QUERY_LANGUAGE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXPRESSION_LANGUAGE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPRESS_JOIN_FAILURE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variable Access Serializable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLE_ACCESS_SERIALIZABLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARTNER_LINKS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VARIABLES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FAULT_HANDLERS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EVENT_HANDLERS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CORRELATION_SETS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPORTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXTENSIONS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EXIT_ON_STANDARD_FAULT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MESSAGE_EXCHANGES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>My Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__MY_ROLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__PARTNER_ROLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partner Link Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__PARTNER_LINK_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Initialize Partner Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK__INITIALIZE_PARTNER_ROLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Partner Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINK_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__CATCH = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Catch All</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER__CATCH_ALL = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Fault Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_HANDLER_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUPPRESS_JOIN_FAILURE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TARGETS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SOURCES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET__PROPERTIES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Correlation Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SET_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__PARTNER_LINK = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__CORRELATIONS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__PORT_TYPE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY__OPERATION = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Partner Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__DOCUMENTATION_ELEMENT = PARTNER_ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__ELEMENT = PARTNER_ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__EEXTENSIBILITY_ELEMENTS = PARTNER_ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__DOCUMENTATION = PARTNER_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAME = PARTNER_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SUPPRESS_JOIN_FAILURE = PARTNER_ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TARGETS = PARTNER_ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__SOURCES = PARTNER_ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PARTNER_LINK = PARTNER_ACTIVITY__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__CORRELATIONS = PARTNER_ACTIVITY__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PORT_TYPE = PARTNER_ACTIVITY__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__OPERATION = PARTNER_ACTIVITY__OPERATION;

	/**
	 * The feature id for the '<em><b>Output Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__OUTPUT_VARIABLE = PARTNER_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__INPUT_VARIABLE = PARTNER_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__COMPENSATION_HANDLER = PARTNER_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FAULT_HANDLER = PARTNER_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>To Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TO_PART = PARTNER_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FROM_PART = PARTNER_ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = PARTNER_ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGETS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_VARIABLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fault Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_MESSAGE_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fault Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH__FAULT_ELEMENT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__DOCUMENTATION_ELEMENT = PARTNER_ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__ELEMENT = PARTNER_ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__EEXTENSIBILITY_ELEMENTS = PARTNER_ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__DOCUMENTATION = PARTNER_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__NAME = PARTNER_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__SUPPRESS_JOIN_FAILURE = PARTNER_ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__TARGETS = PARTNER_ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__SOURCES = PARTNER_ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__PARTNER_LINK = PARTNER_ACTIVITY__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__CORRELATIONS = PARTNER_ACTIVITY__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__PORT_TYPE = PARTNER_ACTIVITY__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__OPERATION = PARTNER_ACTIVITY__OPERATION;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__FAULT_NAME = PARTNER_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__VARIABLE = PARTNER_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY__TO_PART = PARTNER_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLY_FEATURE_COUNT = PARTNER_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__DOCUMENTATION_ELEMENT = PARTNER_ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__ELEMENT = PARTNER_ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__EEXTENSIBILITY_ELEMENTS = PARTNER_ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__DOCUMENTATION = PARTNER_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__NAME = PARTNER_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__SUPPRESS_JOIN_FAILURE = PARTNER_ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__TARGETS = PARTNER_ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__SOURCES = PARTNER_ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__PARTNER_LINK = PARTNER_ACTIVITY__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__CORRELATIONS = PARTNER_ACTIVITY__CORRELATIONS;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__PORT_TYPE = PARTNER_ACTIVITY__PORT_TYPE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__OPERATION = PARTNER_ACTIVITY__OPERATION;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__CREATE_INSTANCE = PARTNER_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__VARIABLE = PARTNER_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE__FROM_PART = PARTNER_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Receive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_FEATURE_COUNT = PARTNER_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The number of structural features of the the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Fault Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FAULT_NAME = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW__FAULT_VARIABLE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Throw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__FOR = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__UNTIL = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The number of structural features of the the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__ACTIVITY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__CONDITION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Create Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__CREATE_INSTANCE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__MESSAGES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK__ALARM = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Pick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PICK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__LINKS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__COMPLETION_CONDITION = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__FOR = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__UNTIL = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repeat Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM__REPEAT_EVERY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>On Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_ALARM_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__COPY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Validate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__VALIDATE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__TO = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__FROM = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Keep Src Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__KEEP_SRC_ELEMENT_NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Missing From Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__IGNORE_MISSING_FROM_DATA = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAMESPACE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__MUST_UNDERSTAND = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Isolated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ISOLATED = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__FAULT_HANDLERS = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Compensation Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__COMPENSATION_HANDLER = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ACTIVITY = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__VARIABLES = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CORRELATION_SETS = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Event Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EVENT_HANDLERS = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Partner Links</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PARTNER_LINKS = ACTIVITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Termination Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TERMINATION_HANDLER = ACTIVITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Message Exchanges</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MESSAGE_EXCHANGES = ACTIVITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exit On Standard Fault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__EXIT_ON_STANDARD_FAULT = ACTIVITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The number of structural features of the the '<em>Compensate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_HANDLER__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_HANDLER__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_HANDLER__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_HANDLER__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_HANDLER__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Compensation Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATION_HANDLER_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__VARIABLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PART = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PARTNER_LINK = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__PROPERTY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__QUERY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__DOCUMENTATION_ELEMENT = TO__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ELEMENT = TO__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__EEXTENSIBILITY_ELEMENTS = TO__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__DOCUMENTATION = TO__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__VARIABLE = TO__VARIABLE;

	/**
	 * The feature id for the '<em><b>Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PART = TO__PART;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PARTNER_LINK = TO__PARTNER_LINK;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__PROPERTY = TO__PROPERTY;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__QUERY = TO__QUERY;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__OPAQUE = TO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ENDPOINT_REFERENCE = TO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__LITERAL = TO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unsafe Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__UNSAFE_LITERAL = TO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__EXPRESSION = TO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__SERVICE_REF = TO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__TYPE = TO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = TO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__VARIABLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__PORT_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__PARTNER_LINK = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__CORRELATIONS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__OPERATION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE__FROM_PART = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the the '<em>On Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_MESSAGE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DOCUMENTATION_ELEMENT = WSDLPackage.EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ELEMENT = WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__REQUIRED = WSDLPackage.EXTENSIBILITY_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ELEMENT_TYPE = WSDLPackage.EXTENSIBILITY_ELEMENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__BODY = WSDLPackage.EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_LANGUAGE = WSDLPackage.EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__OPAQUE = WSDLPackage.EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = WSDLPackage.EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__DOCUMENTATION_ELEMENT = EXPRESSION__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ELEMENT = EXPRESSION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__REQUIRED = EXPRESSION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__ELEMENT_TYPE = EXPRESSION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The number of structural features of the the '<em>Boolean Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Initiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__INITIATE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__PATTERN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION__SET = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Correlation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ALARM = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__EVENTS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LINK = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TRANSITION_CONDITION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__LINK = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Partner Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_LINKS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLES_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Correlation Sets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATION_SETS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Links</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Catch All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_ALL_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Correlations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRELATIONS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MESSAGE_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>XSD Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__XSD_ELEMENT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FROM = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE__DOCUMENTATION_ELEMENT = WSDLPackage.UNKNOWN_EXTENSIBILITY_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE__ELEMENT = WSDLPackage.UNKNOWN_EXTENSIBILITY_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE__REQUIRED = WSDLPackage.UNKNOWN_EXTENSIBILITY_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE__ELEMENT_TYPE = WSDLPackage.UNKNOWN_EXTENSIBILITY_ELEMENT__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE__CHILDREN = WSDLPackage.UNKNOWN_EXTENSIBILITY_ELEMENT__CHILDREN;

	/**
	 * The number of structural features of the the '<em>Unknown Extensibility Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_EXTENSIBILITY_ATTRIBUTE_FEATURE_COUNT = WSDLPackage.UNKNOWN_EXTENSIBILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__VARIABLE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__PARTNER_LINK = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__CORRELATIONS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__OPERATION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__PORT_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Message Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__MESSAGE_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>From Part</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__FROM_PART = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Correlation Sets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT__CORRELATION_SETS = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the the '<em>On Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EVENT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__NAMESPACE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__LOCATION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_TYPE = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The number of structural features of the the '<em>Rethrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETHROW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DOCUMENTATION_ELEMENT = EXPRESSION__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELEMENT = EXPRESSION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__REQUIRED = EXPRESSION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELEMENT_TYPE = EXPRESSION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The number of structural features of the the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Join Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS__JOIN_CONDITION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Targets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Sources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCES_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__DOCUMENTATION_ELEMENT = WSDLPackage.WSDL_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__ELEMENT = WSDLPackage.WSDL_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__VALUE = WSDLPackage.WSDL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__QUERY_LANGUAGE = WSDLPackage.WSDL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = WSDLPackage.WSDL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__DOCUMENTATION_ELEMENT = WSDLPackage.EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__ELEMENT = WSDLPackage.EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__EEXTENSIBILITY_ELEMENTS = WSDLPackage.EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Reference Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__REFERENCE_SCHEME = WSDLPackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF__VALUE = WSDLPackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Service Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_REF_FEATURE_COUNT = WSDLPackage.EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Extensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The number of structural features of the the '<em>Extension Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__PART = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART__TO = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>From Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_PART_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__PART = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART__FROM = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>To Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_PART_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The number of structural features of the the '<em>Opaque Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ACTIVITY_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Start Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__START_COUNTER_VALUE = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final Counter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__FINAL_COUNTER_VALUE = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__PARALLEL = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Counter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COUNTER_NAME = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__COMPLETION_CONDITION = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH__ACTIVITY = ACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the the '<em>For Each</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_EACH_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__ACTIVITY = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL__CONDITION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Repeat Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_UNTIL_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HANDLER__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HANDLER__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HANDLER__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HANDLER__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HANDLER__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Termination Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINATION_HANDLER_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.ValidateImpl <em>Validate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.ValidateImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getValidate()
	 * @generated
	 */
	int VALIDATE = 59;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE__VARIABLES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Validate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__CONDITION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE_IF = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELSE = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ACTIVITY = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__CONDITION = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the the '<em>Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE__ACTIVITY = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION__BRANCHES = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Completion Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETION_CONDITION_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__DOCUMENTATION_ELEMENT = EXPRESSION__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ELEMENT = EXPRESSION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__REQUIRED = EXPRESSION__REQUIRED;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__ELEMENT_TYPE = EXPRESSION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__BODY = EXPRESSION__BODY;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__EXPRESSION_LANGUAGE = EXPRESSION__EXPRESSION_LANGUAGE;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__OPAQUE = EXPRESSION__OPAQUE;

	/**
	 * The feature id for the '<em><b>Count Completed Branches Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES__COUNT_COMPLETED_BRANCHES_ONLY = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Branches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCHES_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.DocumentationImpl <em>Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.DocumentationImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getDocumentation()
	 * @generated
	 */
	int DOCUMENTATION = 66;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__LANG = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION__VALUE = 2;

	/**
	 * The number of structural features of the the '<em>Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.MessageExchangesImpl <em>Message Exchanges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.MessageExchangesImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getMessageExchanges()
	 * @generated
	 */
	int MESSAGE_EXCHANGES = 67;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES__CHILDREN = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Message Exchanges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGES_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.MessageExchangeImpl <em>Message Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.MessageExchangeImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getMessageExchange()
	 * @generated
	 */
	int MESSAGE_EXCHANGE = 68;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__DOCUMENTATION_ELEMENT = EXTENSIBLE_ELEMENT__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__ELEMENT = EXTENSIBLE_ELEMENT__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__EEXTENSIBILITY_ELEMENTS = EXTENSIBLE_ELEMENT__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__DOCUMENTATION = EXTENSIBLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE__NAME = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Message Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_EXCHANGE_FEATURE_COUNT = EXTENSIBLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.impl.CompensateScopeImpl <em>Compensate Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.impl.CompensateScopeImpl
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCompensateScope()
	 * @generated
	 */
	int COMPENSATE_SCOPE = 69;

	/**
	 * The feature id for the '<em><b>Documentation Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__DOCUMENTATION_ELEMENT = ACTIVITY__DOCUMENTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__ELEMENT = ACTIVITY__ELEMENT;

	/**
	 * The feature id for the '<em><b>EExtensibility Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__EEXTENSIBILITY_ELEMENTS = ACTIVITY__EEXTENSIBILITY_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__DOCUMENTATION = ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Suppress Join Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__SUPPRESS_JOIN_FAILURE = ACTIVITY__SUPPRESS_JOIN_FAILURE;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__TARGETS = ACTIVITY__TARGETS;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__SOURCES = ACTIVITY__SOURCES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE__TARGET = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the the '<em>Compensate Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPENSATE_SCOPE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.CorrelationPattern <em>Correlation Pattern</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.CorrelationPattern
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getCorrelationPattern()
	 * @generated
	 */
	int CORRELATION_PATTERN = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.bpel.model.EndpointReferenceRole <em>Endpoint Reference Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.bpel.model.EndpointReferenceRole
	 * @see org.eclipse.bpel.model.impl.BPELPackageImpl#getEndpointReferenceRole()
	 * @generated
	 */
	int ENDPOINT_REFERENCE_ROLE = 71;


	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.eclipse.bpel.model.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.Process#getName()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.eclipse.bpel.model.Process#getTargetNamespace()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.eclipse.bpel.model.Process#getQueryLanguage()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_QueryLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.eclipse.bpel.model.Process#getExpressionLanguage()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.eclipse.bpel.model.Process#getSuppressJoinFailure()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_SuppressJoinFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getVariableAccessSerializable <em>Variable Access Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Access Serializable</em>'.
	 * @see org.eclipse.bpel.model.Process#getVariableAccessSerializable()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_VariableAccessSerializable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getPartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Links</em>'.
	 * @see org.eclipse.bpel.model.Process#getPartnerLinks()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_PartnerLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.eclipse.bpel.model.Process#getVariables()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Process#getActivity()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.eclipse.bpel.model.Process#getFaultHandlers()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see org.eclipse.bpel.model.Process#getExtensions()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Process#getExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.eclipse.bpel.model.Process#getExitOnStandardFault()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_ExitOnStandardFault();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Process#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Exchanges</em>'.
	 * @see org.eclipse.bpel.model.Process#getMessageExchanges()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_MessageExchanges();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.eclipse.bpel.model.Process#getEventHandlers()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Process#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel.model.Process#getCorrelationSets()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Process#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.bpel.model.Process#getImports()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.PartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel.model.PartnerLink
	 * @generated
	 */
	EClass getPartnerLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.PartnerLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.PartnerLink#getName()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.PartnerLink#getMyRole <em>My Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>My Role</em>'.
	 * @see org.eclipse.bpel.model.PartnerLink#getMyRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EReference getPartnerLink_MyRole();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.PartnerLink#getPartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Role</em>'.
	 * @see org.eclipse.bpel.model.PartnerLink#getPartnerRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EReference getPartnerLink_PartnerRole();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.PartnerLink#getPartnerLinkType <em>Partner Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Link Type</em>'.
	 * @see org.eclipse.bpel.model.PartnerLink#getPartnerLinkType()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EReference getPartnerLink_PartnerLinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.PartnerLink#getInitializePartnerRole <em>Initialize Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialize Partner Role</em>'.
	 * @see org.eclipse.bpel.model.PartnerLink#getInitializePartnerRole()
	 * @see #getPartnerLink()
	 * @generated
	 */
	EAttribute getPartnerLink_InitializePartnerRole();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.FaultHandler <em>Fault Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault Handler</em>'.
	 * @see org.eclipse.bpel.model.FaultHandler
	 * @generated
	 */
	EClass getFaultHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.FaultHandler#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch</em>'.
	 * @see org.eclipse.bpel.model.FaultHandler#getCatch()
	 * @see #getFaultHandler()
	 * @generated
	 */
	EReference getFaultHandler_Catch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.FaultHandler#getCatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch All</em>'.
	 * @see org.eclipse.bpel.model.FaultHandler#getCatchAll()
	 * @see #getFaultHandler()
	 * @generated
	 */
	EReference getFaultHandler_CatchAll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Activity#getSuppressJoinFailure <em>Suppress Join Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suppress Join Failure</em>'.
	 * @see org.eclipse.bpel.model.Activity#getSuppressJoinFailure()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_SuppressJoinFailure();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Activity#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targets</em>'.
	 * @see org.eclipse.bpel.model.Activity#getTargets()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Targets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Activity#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sources</em>'.
	 * @see org.eclipse.bpel.model.Activity#getSources()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Sources();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.CorrelationSet <em>Correlation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Set</em>'.
	 * @see org.eclipse.bpel.model.CorrelationSet
	 * @generated
	 */
	EClass getCorrelationSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.CorrelationSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.CorrelationSet#getName()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EAttribute getCorrelationSet_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.CorrelationSet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see org.eclipse.bpel.model.CorrelationSet#getProperties()
	 * @see #getCorrelationSet()
	 * @generated
	 */
	EReference getCorrelationSet_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see org.eclipse.bpel.model.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Invoke#getOutputVariable <em>Output Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Variable</em>'.
	 * @see org.eclipse.bpel.model.Invoke#getOutputVariable()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_OutputVariable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Invoke#getInputVariable <em>Input Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Variable</em>'.
	 * @see org.eclipse.bpel.model.Invoke#getInputVariable()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_InputVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Invoke#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.eclipse.bpel.model.Invoke#getCompensationHandler()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Invoke#getFaultHandler <em>Fault Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handler</em>'.
	 * @see org.eclipse.bpel.model.Invoke#getFaultHandler()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_FaultHandler();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Invoke#getToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Part</em>'.
	 * @see org.eclipse.bpel.model.Invoke#getToPart()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_ToPart();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Invoke#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Part</em>'.
	 * @see org.eclipse.bpel.model.Invoke#getFromPart()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_FromPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.eclipse.bpel.model.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Link#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.Link#getName()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Link#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see org.eclipse.bpel.model.Link#getSources()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Sources();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Link#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.eclipse.bpel.model.Link#getTargets()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Targets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Catch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch</em>'.
	 * @see org.eclipse.bpel.model.Catch
	 * @generated
	 */
	EClass getCatch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Catch#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.eclipse.bpel.model.Catch#getFaultName()
	 * @see #getCatch()
	 * @generated
	 */
	EAttribute getCatch_FaultName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Catch#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Variable</em>'.
	 * @see org.eclipse.bpel.model.Catch#getFaultVariable()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_FaultVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Catch#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Catch#getActivity()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_Activity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Catch#getFaultMessageType <em>Fault Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault Message Type</em>'.
	 * @see org.eclipse.bpel.model.Catch#getFaultMessageType()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_FaultMessageType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Catch#getFaultElement <em>Fault Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault Element</em>'.
	 * @see org.eclipse.bpel.model.Catch#getFaultElement()
	 * @see #getCatch()
	 * @generated
	 */
	EReference getCatch_FaultElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Reply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reply</em>'.
	 * @see org.eclipse.bpel.model.Reply
	 * @generated
	 */
	EClass getReply();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Reply#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.eclipse.bpel.model.Reply#getFaultName()
	 * @see #getReply()
	 * @generated
	 */
	EAttribute getReply_FaultName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Reply#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.bpel.model.Reply#getVariable()
	 * @see #getReply()
	 * @generated
	 */
	EReference getReply_Variable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Reply#getToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Part</em>'.
	 * @see org.eclipse.bpel.model.Reply#getToPart()
	 * @see #getReply()
	 * @generated
	 */
	EReference getReply_ToPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.PartnerActivity <em>Partner Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Activity</em>'.
	 * @see org.eclipse.bpel.model.PartnerActivity
	 * @generated
	 */
	EClass getPartnerActivity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.PartnerActivity#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel.model.PartnerActivity#getPartnerLink()
	 * @see #getPartnerActivity()
	 * @generated
	 */
	EReference getPartnerActivity_PartnerLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.PartnerActivity#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel.model.PartnerActivity#getCorrelations()
	 * @see #getPartnerActivity()
	 * @generated
	 */
	EReference getPartnerActivity_Correlations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.PartnerActivity#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.eclipse.bpel.model.PartnerActivity#getPortType()
	 * @see #getPartnerActivity()
	 * @generated
	 */
	EReference getPartnerActivity_PortType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.PartnerActivity#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.bpel.model.PartnerActivity#getOperation()
	 * @see #getPartnerActivity()
	 * @generated
	 */
	EReference getPartnerActivity_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Receive <em>Receive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive</em>'.
	 * @see org.eclipse.bpel.model.Receive
	 * @generated
	 */
	EClass getReceive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Receive#getCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.eclipse.bpel.model.Receive#getCreateInstance()
	 * @see #getReceive()
	 * @generated
	 */
	EAttribute getReceive_CreateInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Receive#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.bpel.model.Receive#getVariable()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_Variable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Receive#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Part</em>'.
	 * @see org.eclipse.bpel.model.Receive#getFromPart()
	 * @see #getReceive()
	 * @generated
	 */
	EReference getReceive_FromPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Throw <em>Throw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throw</em>'.
	 * @see org.eclipse.bpel.model.Throw
	 * @generated
	 */
	EClass getThrow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Throw#getFaultName <em>Fault Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fault Name</em>'.
	 * @see org.eclipse.bpel.model.Throw#getFaultName()
	 * @see #getThrow()
	 * @generated
	 */
	EAttribute getThrow_FaultName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Throw#getFaultVariable <em>Fault Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fault Variable</em>'.
	 * @see org.eclipse.bpel.model.Throw#getFaultVariable()
	 * @see #getThrow()
	 * @generated
	 */
	EReference getThrow_FaultVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see org.eclipse.bpel.model.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Wait#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.eclipse.bpel.model.Wait#getFor()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Wait#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.eclipse.bpel.model.Wait#getUntil()
	 * @see #getWait()
	 * @generated
	 */
	EReference getWait_Until();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see org.eclipse.bpel.model.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see org.eclipse.bpel.model.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Sequence#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.eclipse.bpel.model.Sequence#getActivities()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Activities();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see org.eclipse.bpel.model.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.While#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.While#getActivity()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.While#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel.model.While#getCondition()
	 * @see #getWhile()
	 * @generated
	 */
	EReference getWhile_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Pick <em>Pick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pick</em>'.
	 * @see org.eclipse.bpel.model.Pick
	 * @generated
	 */
	EClass getPick();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Pick#getCreateInstance <em>Create Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Instance</em>'.
	 * @see org.eclipse.bpel.model.Pick#getCreateInstance()
	 * @see #getPick()
	 * @generated
	 */
	EAttribute getPick_CreateInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Pick#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see org.eclipse.bpel.model.Pick#getMessages()
	 * @see #getPick()
	 * @generated
	 */
	EReference getPick_Messages();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Pick#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm</em>'.
	 * @see org.eclipse.bpel.model.Pick#getAlarm()
	 * @see #getPick()
	 * @generated
	 */
	EReference getPick_Alarm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.eclipse.bpel.model.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Flow#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see org.eclipse.bpel.model.Flow#getActivities()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Activities();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Flow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Links</em>'.
	 * @see org.eclipse.bpel.model.Flow#getLinks()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Links();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Flow#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.eclipse.bpel.model.Flow#getCompletionCondition()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_CompletionCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.OnAlarm <em>On Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Alarm</em>'.
	 * @see org.eclipse.bpel.model.OnAlarm
	 * @generated
	 */
	EClass getOnAlarm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnAlarm#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.OnAlarm#getActivity()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnAlarm#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.eclipse.bpel.model.OnAlarm#getFor()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnAlarm#getUntil <em>Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Until</em>'.
	 * @see org.eclipse.bpel.model.OnAlarm#getUntil()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_Until();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnAlarm#getRepeatEvery <em>Repeat Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repeat Every</em>'.
	 * @see org.eclipse.bpel.model.OnAlarm#getRepeatEvery()
	 * @see #getOnAlarm()
	 * @generated
	 */
	EReference getOnAlarm_RepeatEvery();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see org.eclipse.bpel.model.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Assign#getCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Copy</em>'.
	 * @see org.eclipse.bpel.model.Assign#getCopy()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Copy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Assign#getValidate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validate</em>'.
	 * @see org.eclipse.bpel.model.Assign#getValidate()
	 * @see #getAssign()
	 * @generated
	 */
	EAttribute getAssign_Validate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see org.eclipse.bpel.model.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Copy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.eclipse.bpel.model.Copy#getTo()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_To();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Copy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.eclipse.bpel.model.Copy#getFrom()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_From();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Copy#getKeepSrcElementName <em>Keep Src Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Src Element Name</em>'.
	 * @see org.eclipse.bpel.model.Copy#getKeepSrcElementName()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_KeepSrcElementName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Copy#getIgnoreMissingFromData <em>Ignore Missing From Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Missing From Data</em>'.
	 * @see org.eclipse.bpel.model.Copy#getIgnoreMissingFromData()
	 * @see #getCopy()
	 * @generated
	 */
	EAttribute getCopy_IgnoreMissingFromData();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.eclipse.bpel.model.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Extension#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.bpel.model.Extension#getNamespace()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Extension#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.eclipse.bpel.model.Extension#getMustUnderstand()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_MustUnderstand();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see org.eclipse.bpel.model.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Scope#getIsolated <em>Isolated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolated</em>'.
	 * @see org.eclipse.bpel.model.Scope#getIsolated()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Isolated();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getFaultHandlers <em>Fault Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault Handlers</em>'.
	 * @see org.eclipse.bpel.model.Scope#getFaultHandlers()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_FaultHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getCompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensation Handler</em>'.
	 * @see org.eclipse.bpel.model.Scope#getCompensationHandler()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Scope#getActivity()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variables</em>'.
	 * @see org.eclipse.bpel.model.Scope#getVariables()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel.model.Scope#getCorrelationSets()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_CorrelationSets();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getEventHandlers <em>Event Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Handlers</em>'.
	 * @see org.eclipse.bpel.model.Scope#getEventHandlers()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_EventHandlers();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getPartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Links</em>'.
	 * @see org.eclipse.bpel.model.Scope#getPartnerLinks()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_PartnerLinks();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Scope#getTerminationHandler <em>Termination Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Termination Handler</em>'.
	 * @see org.eclipse.bpel.model.Scope#getTerminationHandler()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_TerminationHandler();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Scope#getMessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Exchanges</em>'.
	 * @see org.eclipse.bpel.model.Scope#getMessageExchanges()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_MessageExchanges();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Scope#getExitOnStandardFault <em>Exit On Standard Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit On Standard Fault</em>'.
	 * @see org.eclipse.bpel.model.Scope#getExitOnStandardFault()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_ExitOnStandardFault();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Compensate <em>Compensate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate</em>'.
	 * @see org.eclipse.bpel.model.Compensate
	 * @generated
	 */
	EClass getCompensate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.CompensationHandler <em>Compensation Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensation Handler</em>'.
	 * @see org.eclipse.bpel.model.CompensationHandler
	 * @generated
	 */
	EClass getCompensationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.CompensationHandler#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.CompensationHandler#getActivity()
	 * @see #getCompensationHandler()
	 * @generated
	 */
	EReference getCompensationHandler_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.To <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To</em>'.
	 * @see org.eclipse.bpel.model.To
	 * @generated
	 */
	EClass getTo();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.To#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.bpel.model.To#getVariable()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Variable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.To#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part</em>'.
	 * @see org.eclipse.bpel.model.To#getPart()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Part();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.To#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel.model.To#getPartnerLink()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_PartnerLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.To#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see org.eclipse.bpel.model.To#getProperty()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.To#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see org.eclipse.bpel.model.To#getQuery()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Query();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see org.eclipse.bpel.model.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.From#getOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.bpel.model.From#getOpaque()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Opaque();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.From#getEndpointReference <em>Endpoint Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint Reference</em>'.
	 * @see org.eclipse.bpel.model.From#getEndpointReference()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_EndpointReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.From#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.eclipse.bpel.model.From#getLiteral()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.From#getUnsafeLiteral <em>Unsafe Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unsafe Literal</em>'.
	 * @see org.eclipse.bpel.model.From#getUnsafeLiteral()
	 * @see #getFrom()
	 * @generated
	 */
	EAttribute getFrom_UnsafeLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.From#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.bpel.model.From#getExpression()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.From#getServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Ref</em>'.
	 * @see org.eclipse.bpel.model.From#getServiceRef()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_ServiceRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.From#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.bpel.model.From#getType()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.OnMessage <em>On Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Message</em>'.
	 * @see org.eclipse.bpel.model.OnMessage
	 * @generated
	 */
	EClass getOnMessage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnMessage#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getVariable()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnMessage#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getActivity()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Activity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnMessage#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getPortType()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_PortType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnMessage#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getPartnerLink()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_PartnerLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnMessage#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getCorrelations()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Correlations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnMessage#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getOperation()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_Operation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.OnMessage#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Part</em>'.
	 * @see org.eclipse.bpel.model.OnMessage#getFromPart()
	 * @see #getOnMessage()
	 * @generated
	 */
	EReference getOnMessage_FromPart();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.eclipse.bpel.model.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Expression#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.bpel.model.Expression#getBody()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Expression#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.eclipse.bpel.model.Expression#getExpressionLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Expression#getOpaque <em>Opaque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opaque</em>'.
	 * @see org.eclipse.bpel.model.Expression#getOpaque()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Opaque();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Expression</em>'.
	 * @see org.eclipse.bpel.model.BooleanExpression
	 * @generated
	 */
	EClass getBooleanExpression();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Correlation <em>Correlation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation</em>'.
	 * @see org.eclipse.bpel.model.Correlation
	 * @generated
	 */
	EClass getCorrelation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Correlation#getInitiate <em>Initiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiate</em>'.
	 * @see org.eclipse.bpel.model.Correlation#getInitiate()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Initiate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Correlation#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.eclipse.bpel.model.Correlation#getPattern()
	 * @see #getCorrelation()
	 * @generated
	 */
	EAttribute getCorrelation_Pattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Correlation#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set</em>'.
	 * @see org.eclipse.bpel.model.Correlation#getSet()
	 * @see #getCorrelation()
	 * @generated
	 */
	EReference getCorrelation_Set();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see org.eclipse.bpel.model.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.EventHandler#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm</em>'.
	 * @see org.eclipse.bpel.model.EventHandler#getAlarm()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Alarm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.EventHandler#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.eclipse.bpel.model.EventHandler#getEvents()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Events();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.eclipse.bpel.model.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Source#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.eclipse.bpel.model.Source#getLink()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Link();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Source#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Source#getActivity()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Source#getTransitionCondition <em>Transition Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition Condition</em>'.
	 * @see org.eclipse.bpel.model.Source#getTransitionCondition()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_TransitionCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see org.eclipse.bpel.model.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Target#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link</em>'.
	 * @see org.eclipse.bpel.model.Target#getLink()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Link();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Target#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Target#getActivity()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.PartnerLinks <em>Partner Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner Links</em>'.
	 * @see org.eclipse.bpel.model.PartnerLinks
	 * @generated
	 */
	EClass getPartnerLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.PartnerLinks#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.PartnerLinks#getChildren()
	 * @see #getPartnerLinks()
	 * @generated
	 */
	EReference getPartnerLinks_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Variables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variables</em>'.
	 * @see org.eclipse.bpel.model.Variables
	 * @generated
	 */
	EClass getVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Variables#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.Variables#getChildren()
	 * @see #getVariables()
	 * @generated
	 */
	EReference getVariables_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.CorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel.model.CorrelationSets
	 * @generated
	 */
	EClass getCorrelationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.CorrelationSets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.CorrelationSets#getChildren()
	 * @see #getCorrelationSets()
	 * @generated
	 */
	EReference getCorrelationSets_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Links <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Links</em>'.
	 * @see org.eclipse.bpel.model.Links
	 * @generated
	 */
	EClass getLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Links#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.Links#getChildren()
	 * @see #getLinks()
	 * @generated
	 */
	EReference getLinks_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.CatchAll <em>Catch All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch All</em>'.
	 * @see org.eclipse.bpel.model.CatchAll
	 * @generated
	 */
	EClass getCatchAll();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.CatchAll#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.CatchAll#getActivity()
	 * @see #getCatchAll()
	 * @generated
	 */
	EReference getCatchAll_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Correlations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correlations</em>'.
	 * @see org.eclipse.bpel.model.Correlations
	 * @generated
	 */
	EClass getCorrelations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Correlations#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.Correlations#getChildren()
	 * @see #getCorrelations()
	 * @generated
	 */
	EReference getCorrelations_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.eclipse.bpel.model.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Variable#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see org.eclipse.bpel.model.Variable#getMessageType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_MessageType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Variable#getXSDElement <em>XSD Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>XSD Element</em>'.
	 * @see org.eclipse.bpel.model.Variable#getXSDElement()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_XSDElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.bpel.model.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.Variable#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.bpel.model.Variable#getFrom()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.UnknownExtensibilityAttribute <em>Unknown Extensibility Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Extensibility Attribute</em>'.
	 * @see org.eclipse.bpel.model.UnknownExtensibilityAttribute
	 * @generated
	 */
	EClass getUnknownExtensibilityAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.OnEvent <em>On Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Event</em>'.
	 * @see org.eclipse.bpel.model.OnEvent
	 * @generated
	 */
	EClass getOnEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnEvent#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getActivity()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnEvent#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getVariable()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_Variable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnEvent#getPartnerLink <em>Partner Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner Link</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getPartnerLink()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_PartnerLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnEvent#getCorrelations <em>Correlations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlations</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getCorrelations()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_Correlations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnEvent#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getOperation()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnEvent#getPortType <em>Port Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Type</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getPortType()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_PortType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.OnEvent#getMessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message Type</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getMessageType()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_MessageType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.OnEvent#getFromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Part</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getFromPart()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_FromPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.OnEvent#getCorrelationSets <em>Correlation Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Sets</em>'.
	 * @see org.eclipse.bpel.model.OnEvent#getCorrelationSets()
	 * @see #getOnEvent()
	 * @generated
	 */
	EReference getOnEvent_CorrelationSets();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.bpel.model.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Import#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.eclipse.bpel.model.Import#getNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Import#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.bpel.model.Import#getLocation()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Import#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.eclipse.bpel.model.Import#getImportType()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Rethrow <em>Rethrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rethrow</em>'.
	 * @see org.eclipse.bpel.model.Rethrow
	 * @generated
	 */
	EClass getRethrow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.eclipse.bpel.model.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Targets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Targets</em>'.
	 * @see org.eclipse.bpel.model.Targets
	 * @generated
	 */
	EClass getTargets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Targets#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.Targets#getChildren()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Targets#getJoinCondition <em>Join Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Condition</em>'.
	 * @see org.eclipse.bpel.model.Targets#getJoinCondition()
	 * @see #getTargets()
	 * @generated
	 */
	EReference getTargets_JoinCondition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Sources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sources</em>'.
	 * @see org.eclipse.bpel.model.Sources
	 * @generated
	 */
	EClass getSources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Sources#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.Sources#getChildren()
	 * @see #getSources()
	 * @generated
	 */
	EReference getSources_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see org.eclipse.bpel.model.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Query#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpel.model.Query#getValue()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Query#getQueryLanguage <em>Query Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Language</em>'.
	 * @see org.eclipse.bpel.model.Query#getQueryLanguage()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_QueryLanguage();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.ServiceRef <em>Service Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Ref</em>'.
	 * @see org.eclipse.bpel.model.ServiceRef
	 * @generated
	 */
	EClass getServiceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.ServiceRef#getReferenceScheme <em>Reference Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Scheme</em>'.
	 * @see org.eclipse.bpel.model.ServiceRef#getReferenceScheme()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_ReferenceScheme();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.ServiceRef#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpel.model.ServiceRef#getValue()
	 * @see #getServiceRef()
	 * @generated
	 */
	EAttribute getServiceRef_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see org.eclipse.bpel.model.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Extensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions</em>'.
	 * @see org.eclipse.bpel.model.Extensions
	 * @generated
	 */
	EClass getExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.Extensions#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.Extensions#getChildren()
	 * @see #getExtensions()
	 * @generated
	 */
	EReference getExtensions_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.ExtensionActivity <em>Extension Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Activity</em>'.
	 * @see org.eclipse.bpel.model.ExtensionActivity
	 * @generated
	 */
	EClass getExtensionActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.FromPart <em>From Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Part</em>'.
	 * @see org.eclipse.bpel.model.FromPart
	 * @generated
	 */
	EClass getFromPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.FromPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.bpel.model.FromPart#getPart()
	 * @see #getFromPart()
	 * @generated
	 */
	EAttribute getFromPart_Part();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.FromPart#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.bpel.model.FromPart#getTo()
	 * @see #getFromPart()
	 * @generated
	 */
	EReference getFromPart_To();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.ToPart <em>To Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To Part</em>'.
	 * @see org.eclipse.bpel.model.ToPart
	 * @generated
	 */
	EClass getToPart();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.ToPart#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see org.eclipse.bpel.model.ToPart#getPart()
	 * @see #getToPart()
	 * @generated
	 */
	EAttribute getToPart_Part();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.ToPart#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.bpel.model.ToPart#getFrom()
	 * @see #getToPart()
	 * @generated
	 */
	EReference getToPart_From();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.OpaqueActivity <em>Opaque Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Activity</em>'.
	 * @see org.eclipse.bpel.model.OpaqueActivity
	 * @generated
	 */
	EClass getOpaqueActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.ForEach <em>For Each</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Each</em>'.
	 * @see org.eclipse.bpel.model.ForEach
	 * @generated
	 */
	EClass getForEach();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ForEach#getStartCounterValue <em>Start Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Counter Value</em>'.
	 * @see org.eclipse.bpel.model.ForEach#getStartCounterValue()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_StartCounterValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ForEach#getFinalCounterValue <em>Final Counter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Final Counter Value</em>'.
	 * @see org.eclipse.bpel.model.ForEach#getFinalCounterValue()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_FinalCounterValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.ForEach#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel</em>'.
	 * @see org.eclipse.bpel.model.ForEach#getParallel()
	 * @see #getForEach()
	 * @generated
	 */
	EAttribute getForEach_Parallel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ForEach#getCounterName <em>Counter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter Name</em>'.
	 * @see org.eclipse.bpel.model.ForEach#getCounterName()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_CounterName();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ForEach#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.eclipse.bpel.model.ForEach#getCompletionCondition()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_CompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ForEach#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.ForEach#getActivity()
	 * @see #getForEach()
	 * @generated
	 */
	EReference getForEach_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.RepeatUntil <em>Repeat Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Until</em>'.
	 * @see org.eclipse.bpel.model.RepeatUntil
	 * @generated
	 */
	EClass getRepeatUntil();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.RepeatUntil#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.RepeatUntil#getActivity()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.RepeatUntil#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel.model.RepeatUntil#getCondition()
	 * @see #getRepeatUntil()
	 * @generated
	 */
	EReference getRepeatUntil_Condition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.TerminationHandler <em>Termination Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Termination Handler</em>'.
	 * @see org.eclipse.bpel.model.TerminationHandler
	 * @generated
	 */
	EClass getTerminationHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.TerminationHandler#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.TerminationHandler#getActivity()
	 * @see #getTerminationHandler()
	 * @generated
	 */
	EReference getTerminationHandler_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see org.eclipse.bpel.model.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.If#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel.model.If#getCondition()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.bpel.model.If#getElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else If</em>'.
	 * @see org.eclipse.bpel.model.If#getElseIf()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_ElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.If#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclipse.bpel.model.If#getElse()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Else();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.If#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.If#getActivity()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.ElseIf <em>Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If</em>'.
	 * @see org.eclipse.bpel.model.ElseIf
	 * @generated
	 */
	EClass getElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ElseIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.eclipse.bpel.model.ElseIf#getCondition()
	 * @see #getElseIf()
	 * @generated
	 */
	EReference getElseIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ElseIf#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.ElseIf#getActivity()
	 * @see #getElseIf()
	 * @generated
	 */
	EReference getElseIf_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Else <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else</em>'.
	 * @see org.eclipse.bpel.model.Else
	 * @generated
	 */
	EClass getElse();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.Else#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.eclipse.bpel.model.Else#getActivity()
	 * @see #getElse()
	 * @generated
	 */
	EReference getElse_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.CompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completion Condition</em>'.
	 * @see org.eclipse.bpel.model.CompletionCondition
	 * @generated
	 */
	EClass getCompletionCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.CompletionCondition#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Branches</em>'.
	 * @see org.eclipse.bpel.model.CompletionCondition#getBranches()
	 * @see #getCompletionCondition()
	 * @generated
	 */
	EReference getCompletionCondition_Branches();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Branches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branches</em>'.
	 * @see org.eclipse.bpel.model.Branches
	 * @generated
	 */
	EClass getBranches();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Branches#getCountCompletedBranchesOnly <em>Count Completed Branches Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count Completed Branches Only</em>'.
	 * @see org.eclipse.bpel.model.Branches#getCountCompletedBranchesOnly()
	 * @see #getBranches()
	 * @generated
	 */
	EAttribute getBranches_CountCompletedBranchesOnly();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensible Element</em>'.
	 * @see org.eclipse.bpel.model.ExtensibleElement
	 * @generated
	 */
	EClass getExtensibleElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.bpel.model.ExtensibleElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.eclipse.bpel.model.ExtensibleElement#getDocumentation()
	 * @see #getExtensibleElement()
	 * @generated
	 */
	EReference getExtensibleElement_Documentation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Validate <em>Validate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validate</em>'.
	 * @see org.eclipse.bpel.model.Validate
	 * @generated
	 */
	EClass getValidate();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.Validate#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.eclipse.bpel.model.Validate#getVariables()
	 * @see #getValidate()
	 * @generated
	 */
	EReference getValidate_Variables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.Documentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentation</em>'.
	 * @see org.eclipse.bpel.model.Documentation
	 * @generated
	 */
	EClass getDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Documentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.bpel.model.Documentation#getLang()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Documentation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.bpel.model.Documentation#getSource()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.Documentation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.bpel.model.Documentation#getValue()
	 * @see #getDocumentation()
	 * @generated
	 */
	EAttribute getDocumentation_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.MessageExchanges <em>Message Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchanges</em>'.
	 * @see org.eclipse.bpel.model.MessageExchanges
	 * @generated
	 */
	EClass getMessageExchanges();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.bpel.model.MessageExchanges#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.eclipse.bpel.model.MessageExchanges#getChildren()
	 * @see #getMessageExchanges()
	 * @generated
	 */
	EReference getMessageExchanges_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.MessageExchange <em>Message Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Exchange</em>'.
	 * @see org.eclipse.bpel.model.MessageExchange
	 * @generated
	 */
	EClass getMessageExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.bpel.model.MessageExchange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.bpel.model.MessageExchange#getName()
	 * @see #getMessageExchange()
	 * @generated
	 */
	EAttribute getMessageExchange_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.bpel.model.CompensateScope <em>Compensate Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compensate Scope</em>'.
	 * @see org.eclipse.bpel.model.CompensateScope
	 * @generated
	 */
	EClass getCompensateScope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.bpel.model.CompensateScope#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.bpel.model.CompensateScope#getTarget()
	 * @see #getCompensateScope()
	 * @generated
	 */
	EReference getCompensateScope_Target();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel.model.CorrelationPattern <em>Correlation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Correlation Pattern</em>'.
	 * @see org.eclipse.bpel.model.CorrelationPattern
	 * @generated
	 */
	EEnum getCorrelationPattern();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.bpel.model.EndpointReferenceRole <em>Endpoint Reference Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endpoint Reference Role</em>'.
	 * @see org.eclipse.bpel.model.EndpointReferenceRole
	 * @generated
	 */
	EEnum getEndpointReferenceRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPELFactory getBPELFactory();

} //BPELPackage
