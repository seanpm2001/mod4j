/*
* generated by Xtext
*/
package org.mod4j.dsl.presentation.xtext.contentassist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;
import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.dsl.presentation.mm.PresentationDsl.ExternalReference;
import org.mod4j.dsl.presentation.xtext.scoping.PresentationProposals;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class PresentationProposalProvider extends AbstractPresentationProposalProvider {

    /**
     * Get rid of the "Name - ID" default proposals
     */
    @Override
    protected boolean doCreateIdProposals(){
        return false;
    }

    /**
     * Get rid of the "Description" default proposals
     */
    @Override
    protected boolean doCreateStringProposals(){
        return false;
    }

    /**
     * collect the DtoProperties belonging to the Dto in the context of the given FormElement
     */
    @Override public void completeDtoPropertyReference_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> propoals = PresentationProposals.getFormElementReferenceProposals(model);
        for (String name : propoals) {
            propose(name, context, acceptor);
        }
    }

    @Override public void completeDirectDialogueCall_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> propoals = PresentationProposals.getDirectDialogueCallProposals(model, Collections.EMPTY_LIST);
        for (String name : propoals) {
            propose(name, context, acceptor);
        }
    }
    
    @Override public void completeExternalReference_ModelName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<ModelInfo> models = CrossxBroker.findAllModels( Arrays.asList("PresentationDsl", "DataContractDsl") );
        for (ModelInfo foundModel : models) {
            propose(foundModel.getModelname(), context, acceptor);
        }
    }

    @Override public void completeExternalReference_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        ExternalReference externalReference = (ExternalReference)model;
        List<Symbol> symbols = CrossxBroker.findAllFromModel(externalReference.getModelName(), Arrays.asList("Dto", "Dialogue", "Process", "Link"));
        for (Symbol symbol : symbols) {
            propose(symbol.getName(), context, acceptor);
        }
    }
    
    @Override public void completeAssociationRoleReference_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getLinkStepReferencesProposals(model);
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }
    
    @Override public void completeLinkRef_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getLinkReferenceProposals(model);
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }

    @Override public void complete_DirectDialogueCall(EObject model, org.eclipse.xtext.RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getDirectDialogueCallProposals(model, new ArrayList<String>());        
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }
    
    @Override public void complete_LinkedDialogueCall(EObject model, org.eclipse.xtext.RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getLinkedDialogueCallProposals(model, new ArrayList<String>());        
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }

    @Override public void completeLinkedDialogueCall_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getLinkedDialogueCallProposals(model, new ArrayList<String>());        
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }
    
    @Override public void completeDirectProcessCall_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getProcessCallProposals(model, new ArrayList<String>());        
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }

    @Override public void completeLinkedProcessCall_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        List<String> names = PresentationProposals.getLinkedProcessCallProposals(model, new ArrayList<String>());        
        for (String name : names) {
            propose(name, context, acceptor);
        }
    }
    
    /** Create and register the proposal
     * 
     * @param name
     * @param context
     * @param acceptor
     */
    public void propose(String name, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
        String proposal = name;
        proposal = getValueConverter().toString(proposal, "reference");
        ICompletionProposal completionProposal = createCompletionProposal(proposal, context);
        acceptor.accept(completionProposal);
    }
    
}
