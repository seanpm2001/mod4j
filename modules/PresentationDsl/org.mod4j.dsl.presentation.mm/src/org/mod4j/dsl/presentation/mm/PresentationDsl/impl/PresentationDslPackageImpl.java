/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mod4j.dsl.presentation.mm.PresentationDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AbstractProcess;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Application;
import org.mod4j.dsl.presentation.mm.PresentationDsl.AssociationRoleReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CollectionDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.CompoundDialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ContentForm;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DataProperty;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Dialogue;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DialogueReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoPropertyReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.DtoReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Expression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExpressionType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.Form;
import org.mod4j.dsl.presentation.mm.PresentationDsl.FormElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.MasterDetail;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElement;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ModelElementWithContext;
import org.mod4j.dsl.presentation.mm.PresentationDsl.NavigationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.OperationExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslFactory;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage;
import org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationModel;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessCall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ProcessType;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ServiceReference;
import org.mod4j.dsl.presentation.mm.PresentationDsl.StandardExpression;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UICall;
import org.mod4j.dsl.presentation.mm.PresentationDsl.UIModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PresentationDslPackageImpl extends EPackageImpl implements PresentationDslPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationRoleReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass contentFormEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compoundDialogueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass collectionDialogueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dialogueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dialogueCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoPropertyReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass externalReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass masterDetailEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelElementWithContextEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass modelElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass presentationModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uiModelElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uiCallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass navigationExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass standardExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractProcessEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dialogueReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDialogueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dtoReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum expressionTypeEEnum = null;

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
     * @see org.mod4j.dsl.presentation.mm.PresentationDsl.PresentationDslPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private PresentationDslPackageImpl() {
        super(eNS_URI, PresentationDslFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link PresentationDslPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static PresentationDslPackage init() {
        if (isInited) return (PresentationDslPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationDslPackage.eNS_URI);

        // Obtain or create and register package
        PresentationDslPackageImpl thePresentationDslPackage = (PresentationDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PresentationDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PresentationDslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        thePresentationDslPackage.createPackageContents();

        // Initialize created meta-data
        thePresentationDslPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thePresentationDslPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(PresentationDslPackage.eNS_URI, thePresentationDslPackage);
        return thePresentationDslPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociationRoleReference() {
        return associationRoleReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContentForm() {
        return contentFormEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContentForm_FormElements() {
        return (EReference)contentFormEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getContentForm_Actions() {
        return (EReference)contentFormEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompoundDialogue() {
        return compoundDialogueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCompoundDialogue_Dialogues() {
        return (EReference)compoundDialogueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCollectionDialogue() {
        return collectionDialogueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataProperty() {
        return dataPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataProperty_DataType() {
        return (EAttribute)dataPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataProperty_IsEnumeration() {
        return (EAttribute)dataPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataProperty_FormElement() {
        return (EReference)dataPropertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDialogue() {
        return dialogueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDialogue_Readonly() {
        return (EAttribute)dialogueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDialogue_Processes() {
        return (EReference)dialogueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDialogueCall() {
        return dialogueCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDialogueCall_CompoundDialogue() {
        return (EReference)dialogueCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDialogueCall_ReferredDialogue() {
        return (EReference)dialogueCallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoPropertyReference() {
        return dtoPropertyReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExternalReference() {
        return externalReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExternalReference_ModelName() {
        return (EAttribute)externalReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormElement() {
        return formElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormElement_References() {
        return (EReference)formElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFormElement_Readonly() {
        return (EAttribute)formElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormElement_Form() {
        return (EReference)formElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFormElement_Label() {
        return (EAttribute)formElementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFormElement_DataProperty() {
        return (EReference)formElementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMasterDetail() {
        return masterDetailEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMasterDetail_Master() {
        return (EReference)masterDetailEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMasterDetail_Detail() {
        return (EReference)masterDetailEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelElementWithContext() {
        return modelElementWithContextEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelElementWithContext_ContextRef() {
        return (EReference)modelElementWithContextEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getModelElementWithContext_PresentationModel() {
        return (EReference)modelElementWithContextEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelElementWithContext_CollectionContext() {
        return (EAttribute)modelElementWithContextEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getModelElement() {
        return modelElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelElement_Name() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getModelElement_Description() {
        return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPresentationModel() {
        return presentationModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresentationModel_Elements() {
        return (EReference)presentationModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresentationModel_ExternalReferences() {
        return (EReference)presentationModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPresentationModel_Start() {
        return (EReference)presentationModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_ProcessElements() {
        return (EReference)processEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_ContentForm() {
        return (EReference)processEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_Link() {
        return (EReference)processEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessCall() {
        return processCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessCall_OwningDialogue() {
        return (EReference)processCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessCall_ReferredProcess() {
        return (EReference)processCallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUIModelElement() {
        return uiModelElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUICall() {
        return uiCallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUICall_Process() {
        return (EReference)uiCallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUICall_Condition() {
        return (EReference)uiCallEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUICall_Label() {
        return (EAttribute)uiCallEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUICall_Arguments() {
        return (EReference)uiCallEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUICall_ContextExp() {
        return (EReference)uiCallEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceExpression() {
        return serviceExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getServiceExpression_ServiceName() {
        return (EAttribute)serviceExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getServiceExpression_ServiceMethod() {
        return (EAttribute)serviceExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNavigationExpression() {
        return navigationExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNavigationExpression_References() {
        return (EReference)navigationExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNavigationExpression_Composition() {
        return (EAttribute)navigationExpressionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExpression() {
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStandardExpression() {
        return standardExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStandardExpression_Type() {
        return (EAttribute)standardExpressionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperationExpression() {
        return operationExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getApplication() {
        return applicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getApplication_StartProcesses() {
        return (EReference)applicationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessReference() {
        return processReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractProcess() {
        return abstractProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractProcess_Type() {
        return (EAttribute)abstractProcessEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractProcess_Label() {
        return (EAttribute)abstractProcessEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDialogueReference() {
        return dialogueReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDialogue() {
        return abstractDialogueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDtoReference() {
        return dtoReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceReference() {
        return serviceReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessType() {
        return processTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getExpressionType() {
        return expressionTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PresentationDslFactory getPresentationDslFactory() {
        return (PresentationDslFactory)getEFactoryInstance();
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
        associationRoleReferenceEClass = createEClass(ASSOCIATION_ROLE_REFERENCE);

        contentFormEClass = createEClass(CONTENT_FORM);
        createEReference(contentFormEClass, CONTENT_FORM__FORM_ELEMENTS);
        createEReference(contentFormEClass, CONTENT_FORM__ACTIONS);

        compoundDialogueEClass = createEClass(COMPOUND_DIALOGUE);
        createEReference(compoundDialogueEClass, COMPOUND_DIALOGUE__DIALOGUES);

        collectionDialogueEClass = createEClass(COLLECTION_DIALOGUE);

        dataPropertyEClass = createEClass(DATA_PROPERTY);
        createEAttribute(dataPropertyEClass, DATA_PROPERTY__DATA_TYPE);
        createEAttribute(dataPropertyEClass, DATA_PROPERTY__IS_ENUMERATION);
        createEReference(dataPropertyEClass, DATA_PROPERTY__FORM_ELEMENT);

        dialogueEClass = createEClass(DIALOGUE);
        createEAttribute(dialogueEClass, DIALOGUE__READONLY);
        createEReference(dialogueEClass, DIALOGUE__PROCESSES);

        dialogueCallEClass = createEClass(DIALOGUE_CALL);
        createEReference(dialogueCallEClass, DIALOGUE_CALL__COMPOUND_DIALOGUE);
        createEReference(dialogueCallEClass, DIALOGUE_CALL__REFERRED_DIALOGUE);

        dtoPropertyReferenceEClass = createEClass(DTO_PROPERTY_REFERENCE);

        externalReferenceEClass = createEClass(EXTERNAL_REFERENCE);
        createEAttribute(externalReferenceEClass, EXTERNAL_REFERENCE__MODEL_NAME);

        formElementEClass = createEClass(FORM_ELEMENT);
        createEReference(formElementEClass, FORM_ELEMENT__REFERENCES);
        createEAttribute(formElementEClass, FORM_ELEMENT__READONLY);
        createEReference(formElementEClass, FORM_ELEMENT__FORM);
        createEAttribute(formElementEClass, FORM_ELEMENT__LABEL);
        createEReference(formElementEClass, FORM_ELEMENT__DATA_PROPERTY);

        masterDetailEClass = createEClass(MASTER_DETAIL);
        createEReference(masterDetailEClass, MASTER_DETAIL__MASTER);
        createEReference(masterDetailEClass, MASTER_DETAIL__DETAIL);

        modelElementWithContextEClass = createEClass(MODEL_ELEMENT_WITH_CONTEXT);
        createEReference(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__CONTEXT_REF);
        createEReference(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__PRESENTATION_MODEL);
        createEAttribute(modelElementWithContextEClass, MODEL_ELEMENT_WITH_CONTEXT__COLLECTION_CONTEXT);

        modelElementEClass = createEClass(MODEL_ELEMENT);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__NAME);
        createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);

        presentationModelEClass = createEClass(PRESENTATION_MODEL);
        createEReference(presentationModelEClass, PRESENTATION_MODEL__ELEMENTS);
        createEReference(presentationModelEClass, PRESENTATION_MODEL__EXTERNAL_REFERENCES);
        createEReference(presentationModelEClass, PRESENTATION_MODEL__START);

        processEClass = createEClass(PROCESS);
        createEReference(processEClass, PROCESS__PROCESS_ELEMENTS);
        createEReference(processEClass, PROCESS__CONTENT_FORM);
        createEReference(processEClass, PROCESS__LINK);

        processCallEClass = createEClass(PROCESS_CALL);
        createEReference(processCallEClass, PROCESS_CALL__OWNING_DIALOGUE);
        createEReference(processCallEClass, PROCESS_CALL__REFERRED_PROCESS);

        uiModelElementEClass = createEClass(UI_MODEL_ELEMENT);

        uiCallEClass = createEClass(UI_CALL);
        createEReference(uiCallEClass, UI_CALL__PROCESS);
        createEReference(uiCallEClass, UI_CALL__CONDITION);
        createEAttribute(uiCallEClass, UI_CALL__LABEL);
        createEReference(uiCallEClass, UI_CALL__ARGUMENTS);
        createEReference(uiCallEClass, UI_CALL__CONTEXT_EXP);

        serviceExpressionEClass = createEClass(SERVICE_EXPRESSION);
        createEAttribute(serviceExpressionEClass, SERVICE_EXPRESSION__SERVICE_NAME);
        createEAttribute(serviceExpressionEClass, SERVICE_EXPRESSION__SERVICE_METHOD);

        navigationExpressionEClass = createEClass(NAVIGATION_EXPRESSION);
        createEReference(navigationExpressionEClass, NAVIGATION_EXPRESSION__REFERENCES);
        createEAttribute(navigationExpressionEClass, NAVIGATION_EXPRESSION__COMPOSITION);

        expressionEClass = createEClass(EXPRESSION);

        standardExpressionEClass = createEClass(STANDARD_EXPRESSION);
        createEAttribute(standardExpressionEClass, STANDARD_EXPRESSION__TYPE);

        operationExpressionEClass = createEClass(OPERATION_EXPRESSION);

        applicationEClass = createEClass(APPLICATION);
        createEReference(applicationEClass, APPLICATION__START_PROCESSES);

        processReferenceEClass = createEClass(PROCESS_REFERENCE);

        abstractProcessEClass = createEClass(ABSTRACT_PROCESS);
        createEAttribute(abstractProcessEClass, ABSTRACT_PROCESS__TYPE);
        createEAttribute(abstractProcessEClass, ABSTRACT_PROCESS__LABEL);

        dialogueReferenceEClass = createEClass(DIALOGUE_REFERENCE);

        abstractDialogueEClass = createEClass(ABSTRACT_DIALOGUE);

        dtoReferenceEClass = createEClass(DTO_REFERENCE);

        serviceReferenceEClass = createEClass(SERVICE_REFERENCE);

        // Create enums
        processTypeEEnum = createEEnum(PROCESS_TYPE);
        expressionTypeEEnum = createEEnum(EXPRESSION_TYPE);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        associationRoleReferenceEClass.getESuperTypes().add(this.getModelElement());
        contentFormEClass.getESuperTypes().add(this.getDialogue());
        compoundDialogueEClass.getESuperTypes().add(this.getDialogue());
        collectionDialogueEClass.getESuperTypes().add(this.getCompoundDialogue());
        dataPropertyEClass.getESuperTypes().add(this.getModelElement());
        dialogueEClass.getESuperTypes().add(this.getAbstractDialogue());
        dialogueCallEClass.getESuperTypes().add(this.getUICall());
        dtoPropertyReferenceEClass.getESuperTypes().add(this.getModelElement());
        externalReferenceEClass.getESuperTypes().add(this.getModelElement());
        formElementEClass.getESuperTypes().add(this.getModelElement());
        masterDetailEClass.getESuperTypes().add(this.getCompoundDialogue());
        modelElementWithContextEClass.getESuperTypes().add(this.getModelElement());
        presentationModelEClass.getESuperTypes().add(this.getModelElement());
        processEClass.getESuperTypes().add(this.getAbstractProcess());
        processCallEClass.getESuperTypes().add(this.getUICall());
        uiModelElementEClass.getESuperTypes().add(this.getModelElementWithContext());
        uiCallEClass.getESuperTypes().add(this.getModelElement());
        serviceExpressionEClass.getESuperTypes().add(this.getExpression());
        navigationExpressionEClass.getESuperTypes().add(this.getExpression());
        expressionEClass.getESuperTypes().add(this.getModelElement());
        standardExpressionEClass.getESuperTypes().add(this.getExpression());
        operationExpressionEClass.getESuperTypes().add(this.getExpression());
        applicationEClass.getESuperTypes().add(this.getModelElement());
        processReferenceEClass.getESuperTypes().add(this.getAbstractProcess());
        processReferenceEClass.getESuperTypes().add(this.getExternalReference());
        abstractProcessEClass.getESuperTypes().add(this.getUIModelElement());
        dialogueReferenceEClass.getESuperTypes().add(this.getAbstractDialogue());
        dialogueReferenceEClass.getESuperTypes().add(this.getExternalReference());
        abstractDialogueEClass.getESuperTypes().add(this.getUIModelElement());
        dtoReferenceEClass.getESuperTypes().add(this.getExternalReference());
        serviceReferenceEClass.getESuperTypes().add(this.getExternalReference());

        // Initialize classes and features; add operations and parameters
        initEClass(associationRoleReferenceEClass, AssociationRoleReference.class, "AssociationRoleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(contentFormEClass, ContentForm.class, "ContentForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getContentForm_FormElements(), this.getFormElement(), this.getFormElement_Form(), "formElements", null, 0, -1, ContentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getContentForm_Actions(), this.getProcess(), this.getProcess_ContentForm(), "actions", null, 0, -1, ContentForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(compoundDialogueEClass, CompoundDialogue.class, "CompoundDialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCompoundDialogue_Dialogues(), this.getDialogueCall(), this.getDialogueCall_CompoundDialogue(), "dialogues", null, 0, -1, CompoundDialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(collectionDialogueEClass, CollectionDialogue.class, "CollectionDialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataProperty_DataType(), ecorePackage.getEString(), "dataType", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDataProperty_IsEnumeration(), ecorePackage.getEBoolean(), "isEnumeration", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataProperty_FormElement(), this.getFormElement(), this.getFormElement_DataProperty(), "formElement", null, 0, 1, DataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dialogueEClass, Dialogue.class, "Dialogue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDialogue_Readonly(), ecorePackage.getEBoolean(), "readonly", "false", 0, 1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDialogue_Processes(), this.getProcessCall(), this.getProcessCall_OwningDialogue(), "processes", null, 0, -1, Dialogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dialogueCallEClass, DialogueCall.class, "DialogueCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDialogueCall_CompoundDialogue(), this.getCompoundDialogue(), this.getCompoundDialogue_Dialogues(), "compoundDialogue", null, 0, 1, DialogueCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDialogueCall_ReferredDialogue(), this.getAbstractDialogue(), null, "referredDialogue", null, 0, 1, DialogueCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dtoPropertyReferenceEClass, DtoPropertyReference.class, "DtoPropertyReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(externalReferenceEClass, ExternalReference.class, "ExternalReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExternalReference_ModelName(), ecorePackage.getEString(), "modelName", null, 0, 1, ExternalReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(formElementEClass, FormElement.class, "FormElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFormElement_References(), this.getDtoPropertyReference(), null, "references", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFormElement_Readonly(), ecorePackage.getEBoolean(), "readonly", "false", 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFormElement_Form(), this.getContentForm(), this.getContentForm_FormElements(), "form", null, 1, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFormElement_Label(), ecorePackage.getEString(), "label", "", 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFormElement_DataProperty(), this.getDataProperty(), this.getDataProperty_FormElement(), "dataProperty", null, 0, 1, FormElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(masterDetailEClass, MasterDetail.class, "MasterDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMasterDetail_Master(), this.getDialogueCall(), null, "master", null, 1, 1, MasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMasterDetail_Detail(), this.getDialogueCall(), null, "detail", null, 1, 1, MasterDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementWithContextEClass, ModelElementWithContext.class, "ModelElementWithContext", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getModelElementWithContext_ContextRef(), this.getDtoReference(), null, "contextRef", null, 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getModelElementWithContext_PresentationModel(), this.getPresentationModel(), this.getPresentationModel_Elements(), "presentationModel", null, 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElementWithContext_CollectionContext(), ecorePackage.getEBoolean(), "collectionContext", "false", 0, 1, ModelElementWithContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getModelElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(presentationModelEClass, PresentationModel.class, "PresentationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPresentationModel_Elements(), this.getModelElementWithContext(), this.getModelElementWithContext_PresentationModel(), "elements", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPresentationModel_ExternalReferences(), this.getExternalReference(), null, "externalReferences", null, 0, -1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPresentationModel_Start(), this.getApplication(), null, "start", null, 0, 1, PresentationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processEClass, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcess_ProcessElements(), this.getUICall(), this.getUICall_Process(), "processElements", null, 0, -1, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_ContentForm(), this.getContentForm(), this.getContentForm_Actions(), "contentForm", null, 0, 1, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcess_Link(), this.getAssociationRoleReference(), null, "link", null, 0, 1, org.mod4j.dsl.presentation.mm.PresentationDsl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processCallEClass, ProcessCall.class, "ProcessCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessCall_OwningDialogue(), this.getDialogue(), this.getDialogue_Processes(), "owningDialogue", null, 0, 1, ProcessCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessCall_ReferredProcess(), this.getAbstractProcess(), null, "referredProcess", null, 0, 1, ProcessCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(uiModelElementEClass, UIModelElement.class, "UIModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(uiCallEClass, UICall.class, "UICall", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUICall_Process(), this.getProcess(), this.getProcess_ProcessElements(), "process", null, 0, 1, UICall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUICall_Condition(), this.getExpression(), null, "condition", null, 0, 1, UICall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUICall_Label(), ecorePackage.getEString(), "label", null, 0, 1, UICall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUICall_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, UICall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getUICall_ContextExp(), this.getExpression(), null, "contextExp", null, 0, 1, UICall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(uiCallEClass, this.getProcessCall(), "asProcessCall", 0, 1, IS_UNIQUE, IS_ORDERED);

        addEOperation(uiCallEClass, this.getDialogueCall(), "asDialogueCall", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(serviceExpressionEClass, ServiceExpression.class, "ServiceExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getServiceExpression_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, ServiceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getServiceExpression_ServiceMethod(), ecorePackage.getEString(), "serviceMethod", null, 0, 1, ServiceExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(navigationExpressionEClass, NavigationExpression.class, "NavigationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNavigationExpression_References(), this.getAssociationRoleReference(), null, "references", null, 0, -1, NavigationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNavigationExpression_Composition(), ecorePackage.getEBoolean(), "composition", "false", 0, 1, NavigationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(standardExpressionEClass, StandardExpression.class, "StandardExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStandardExpression_Type(), this.getExpressionType(), "type", "NONE", 0, 1, StandardExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(operationExpressionEClass, OperationExpression.class, "OperationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplication_StartProcesses(), this.getProcessCall(), null, "startProcesses", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processReferenceEClass, ProcessReference.class, "ProcessReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractProcessEClass, AbstractProcess.class, "AbstractProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractProcess_Type(), this.getProcessType(), "type", "CUSTOM", 0, 1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractProcess_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        addEOperation(abstractProcessEClass, ecorePackage.getEBoolean(), "isInteractive", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(dialogueReferenceEClass, DialogueReference.class, "DialogueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractDialogueEClass, AbstractDialogue.class, "AbstractDialogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dtoReferenceEClass, DtoReference.class, "DtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(serviceReferenceEClass, ServiceReference.class, "ServiceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(processTypeEEnum, ProcessType.class, "ProcessType");
        addEEnumLiteral(processTypeEEnum, ProcessType.NEW);
        addEEnumLiteral(processTypeEEnum, ProcessType.SAVE);
        addEEnumLiteral(processTypeEEnum, ProcessType.EDIT);
        addEEnumLiteral(processTypeEEnum, ProcessType.DELETE);
        addEEnumLiteral(processTypeEEnum, ProcessType.CUSTOM);
        addEEnumLiteral(processTypeEEnum, ProcessType.CANCEL);
        addEEnumLiteral(processTypeEEnum, ProcessType.ADDTO);
        addEEnumLiteral(processTypeEEnum, ProcessType.REMOVEFROM);
        addEEnumLiteral(processTypeEEnum, ProcessType.LINK);

        initEEnum(expressionTypeEEnum, ExpressionType.class, "ExpressionType");
        addEEnumLiteral(expressionTypeEEnum, ExpressionType.ALL);
        addEEnumLiteral(expressionTypeEEnum, ExpressionType.NONE);
        addEEnumLiteral(expressionTypeEEnum, ExpressionType.FIND);
        addEEnumLiteral(expressionTypeEEnum, ExpressionType.SELECTION);

        // Create resource
        createResource(eNS_URI);
    }

} //PresentationDslPackageImpl
