/*
* generated by Xtext
*/
package org.mod4j.dsl.presentation.xtext.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.mod4j.dsl.presentation.xtext.services.PresentationGrammarAccess;

public class PresentationParser extends AbstractContentAssistParser {
	
	@Inject
	private PresentationGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationLexer createLexer(CharStream stream) {
		return new org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationLexer(stream);
	}
	
	@Override
	protected org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser createParser() {
		org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser result = new org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				{
					put(grammarAccess.getModelElementWithContextAccess().getAlternatives(), "rule__ModelElementWithContext__Alternatives");
					put(grammarAccess.getUIModelElementAccess().getAlternatives(), "rule__UIModelElement__Alternatives");
					put(grammarAccess.getDialogueAccess().getAlternatives(), "rule__Dialogue__Alternatives");
					put(grammarAccess.getContentFormAccess().getAlternatives_7_1(), "rule__ContentForm__Alternatives_7_1");
					put(grammarAccess.getCompoundDialogueAccess().getAlternatives(), "rule__CompoundDialogue__Alternatives");
					put(grammarAccess.getCompoundDialogueAccess().getAlternatives_0_5_1(), "rule__CompoundDialogue__Alternatives_0_5_1");
					put(grammarAccess.getCollectionDialogueAccess().getAlternatives_6_1(), "rule__CollectionDialogue__Alternatives_6_1");
					put(grammarAccess.getMasterDetailAccess().getAlternatives_5_1(), "rule__MasterDetail__Alternatives_5_1");
					put(grammarAccess.getProcessAccess().getAlternatives(), "rule__Process__Alternatives");
					put(grammarAccess.getFormElementAccess().getAlternatives_5_1(), "rule__FormElement__Alternatives_5_1");
					put(grammarAccess.getDialogueCallAccess().getAlternatives_0(), "rule__DialogueCall__Alternatives_0");
					put(grammarAccess.getProcessCallAccess().getAlternatives_0(), "rule__ProcessCall__Alternatives_0");
					put(grammarAccess.getLinkAccess().getAlternatives(), "rule__Link__Alternatives");
					put(grammarAccess.getUIModelElementCallAccess().getAlternatives(), "rule__UIModelElementCall__Alternatives");
					put(grammarAccess.getProcessTypeAccess().getAlternatives(), "rule__ProcessType__Alternatives");
					put(grammarAccess.getPresentationModelAccess().getGroup(), "rule__PresentationModel__Group__0");
					put(grammarAccess.getExternalReferenceAccess().getGroup(), "rule__ExternalReference__Group__0");
					put(grammarAccess.getContentFormAccess().getGroup(), "rule__ContentForm__Group__0");
					put(grammarAccess.getContentFormAccess().getGroup_7(), "rule__ContentForm__Group_7__0");
					put(grammarAccess.getContentFormAccess().getGroup_9(), "rule__ContentForm__Group_9__0");
					put(grammarAccess.getContentFormAccess().getGroup_9_2(), "rule__ContentForm__Group_9_2__0");
					put(grammarAccess.getContentFormAccess().getGroup_10(), "rule__ContentForm__Group_10__0");
					put(grammarAccess.getContentFormAccess().getGroup_10_2(), "rule__ContentForm__Group_10_2__0");
					put(grammarAccess.getSimpleProcessAccess().getGroup(), "rule__SimpleProcess__Group__0");
					put(grammarAccess.getSimpleProcessAccess().getGroup_2(), "rule__SimpleProcess__Group_2__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0(), "rule__CompoundDialogue__Group_0__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_5(), "rule__CompoundDialogue__Group_0_5__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_6(), "rule__CompoundDialogue__Group_0_6__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_6_2(), "rule__CompoundDialogue__Group_0_6_2__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_7(), "rule__CompoundDialogue__Group_0_7__0");
					put(grammarAccess.getCompoundDialogueAccess().getGroup_0_7_2(), "rule__CompoundDialogue__Group_0_7_2__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup(), "rule__CollectionDialogue__Group__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_6(), "rule__CollectionDialogue__Group_6__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_7(), "rule__CollectionDialogue__Group_7__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_7_2(), "rule__CollectionDialogue__Group_7_2__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_8(), "rule__CollectionDialogue__Group_8__0");
					put(grammarAccess.getCollectionDialogueAccess().getGroup_8_2(), "rule__CollectionDialogue__Group_8_2__0");
					put(grammarAccess.getMasterDetailAccess().getGroup(), "rule__MasterDetail__Group__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_5(), "rule__MasterDetail__Group_5__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_12(), "rule__MasterDetail__Group_12__0");
					put(grammarAccess.getMasterDetailAccess().getGroup_12_2(), "rule__MasterDetail__Group_12_2__0");
					put(grammarAccess.getAutomatedProcessAccess().getGroup(), "rule__AutomatedProcess__Group__0");
					put(grammarAccess.getAutomatedProcessAccess().getGroup_6(), "rule__AutomatedProcess__Group_6__0");
					put(grammarAccess.getAutomatedProcessAccess().getGroup_6_2(), "rule__AutomatedProcess__Group_6_2__0");
					put(grammarAccess.getInteractiveProcessAccess().getGroup(), "rule__InteractiveProcess__Group__0");
					put(grammarAccess.getInteractiveProcessAccess().getGroup_6(), "rule__InteractiveProcess__Group_6__0");
					put(grammarAccess.getInteractiveProcessAccess().getGroup_6_2(), "rule__InteractiveProcess__Group_6_2__0");
					put(grammarAccess.getFormElementAccess().getGroup(), "rule__FormElement__Group__0");
					put(grammarAccess.getFormElementAccess().getGroup_5(), "rule__FormElement__Group_5__0");
					put(grammarAccess.getDialogueCallAccess().getGroup(), "rule__DialogueCall__Group__0");
					put(grammarAccess.getDialogueCallAccess().getGroup_1(), "rule__DialogueCall__Group_1__0");
					put(grammarAccess.getLinkedDialogueCallAccess().getGroup(), "rule__LinkedDialogueCall__Group__0");
					put(grammarAccess.getProcessCallAccess().getGroup(), "rule__ProcessCall__Group__0");
					put(grammarAccess.getProcessCallAccess().getGroup_1(), "rule__ProcessCall__Group_1__0");
					put(grammarAccess.getLinkedProcessCallAccess().getGroup(), "rule__LinkedProcessCall__Group__0");
					put(grammarAccess.getLinkRefAccess().getGroup(), "rule__LinkRef__Group__0");
					put(grammarAccess.getLinkServiceAccess().getGroup(), "rule__LinkService__Group__0");
					put(grammarAccess.getLinkStepAccess().getGroup(), "rule__LinkStep__Group__0");
					put(grammarAccess.getLinkPathAccess().getGroup(), "rule__LinkPath__Group__0");
					put(grammarAccess.getUIModelElementCallAccess().getGroup_0(), "rule__UIModelElementCall__Group_0__0");
					put(grammarAccess.getUIModelElementCallAccess().getGroup_1(), "rule__UIModelElementCall__Group_1__0");
					put(grammarAccess.getPresentationModelAccess().getDescriptionAssignment_0(), "rule__PresentationModel__DescriptionAssignment_0");
					put(grammarAccess.getPresentationModelAccess().getNameAssignment_2(), "rule__PresentationModel__NameAssignment_2");
					put(grammarAccess.getPresentationModelAccess().getExternalReferencesAssignment_4(), "rule__PresentationModel__ExternalReferencesAssignment_4");
					put(grammarAccess.getPresentationModelAccess().getElementsAssignment_5(), "rule__PresentationModel__ElementsAssignment_5");
					put(grammarAccess.getExternalReferenceAccess().getModelNameAssignment_1(), "rule__ExternalReference__ModelNameAssignment_1");
					put(grammarAccess.getExternalReferenceAccess().getNameAssignment_3(), "rule__ExternalReference__NameAssignment_3");
					put(grammarAccess.getContentFormAccess().getDescriptionAssignment_0(), "rule__ContentForm__DescriptionAssignment_0");
					put(grammarAccess.getContentFormAccess().getNameAssignment_2(), "rule__ContentForm__NameAssignment_2");
					put(grammarAccess.getContentFormAccess().getIsCollectionAssignment_4(), "rule__ContentForm__IsCollectionAssignment_4");
					put(grammarAccess.getContentFormAccess().getContextRefAssignment_5(), "rule__ContentForm__ContextRefAssignment_5");
					put(grammarAccess.getContentFormAccess().getReadonlyAssignment_7_1_0(), "rule__ContentForm__ReadonlyAssignment_7_1_0");
					put(grammarAccess.getContentFormAccess().getFormElementsAssignment_8(), "rule__ContentForm__FormElementsAssignment_8");
					put(grammarAccess.getContentFormAccess().getActionsAssignment_9_2_0(), "rule__ContentForm__ActionsAssignment_9_2_0");
					put(grammarAccess.getContentFormAccess().getProcessesAssignment_10_2_0(), "rule__ContentForm__ProcessesAssignment_10_2_0");
					put(grammarAccess.getSimpleProcessAccess().getNameAssignment_0(), "rule__SimpleProcess__NameAssignment_0");
					put(grammarAccess.getSimpleProcessAccess().getTypeAssignment_1(), "rule__SimpleProcess__TypeAssignment_1");
					put(grammarAccess.getSimpleProcessAccess().getDialogueAssignment_2_1(), "rule__SimpleProcess__DialogueAssignment_2_1");
					put(grammarAccess.getCompoundDialogueAccess().getDescriptionAssignment_0_0(), "rule__CompoundDialogue__DescriptionAssignment_0_0");
					put(grammarAccess.getCompoundDialogueAccess().getNameAssignment_0_2(), "rule__CompoundDialogue__NameAssignment_0_2");
					put(grammarAccess.getCompoundDialogueAccess().getContextRefAssignment_0_4(), "rule__CompoundDialogue__ContextRefAssignment_0_4");
					put(grammarAccess.getCompoundDialogueAccess().getReadonlyAssignment_0_5_1_0(), "rule__CompoundDialogue__ReadonlyAssignment_0_5_1_0");
					put(grammarAccess.getCompoundDialogueAccess().getDialoguesAssignment_0_6_2_0(), "rule__CompoundDialogue__DialoguesAssignment_0_6_2_0");
					put(grammarAccess.getCompoundDialogueAccess().getProcessesAssignment_0_7_2_0(), "rule__CompoundDialogue__ProcessesAssignment_0_7_2_0");
					put(grammarAccess.getCollectionDialogueAccess().getDescriptionAssignment_0(), "rule__CollectionDialogue__DescriptionAssignment_0");
					put(grammarAccess.getCollectionDialogueAccess().getNameAssignment_2(), "rule__CollectionDialogue__NameAssignment_2");
					put(grammarAccess.getCollectionDialogueAccess().getContextRefAssignment_4(), "rule__CollectionDialogue__ContextRefAssignment_4");
					put(grammarAccess.getCollectionDialogueAccess().getReadonlyAssignment_6_1_0(), "rule__CollectionDialogue__ReadonlyAssignment_6_1_0");
					put(grammarAccess.getCollectionDialogueAccess().getDialoguesAssignment_7_2_0(), "rule__CollectionDialogue__DialoguesAssignment_7_2_0");
					put(grammarAccess.getCollectionDialogueAccess().getProcessesAssignment_8_2_0(), "rule__CollectionDialogue__ProcessesAssignment_8_2_0");
					put(grammarAccess.getMasterDetailAccess().getDescriptionAssignment_0(), "rule__MasterDetail__DescriptionAssignment_0");
					put(grammarAccess.getMasterDetailAccess().getNameAssignment_2(), "rule__MasterDetail__NameAssignment_2");
					put(grammarAccess.getMasterDetailAccess().getContextRefAssignment_4(), "rule__MasterDetail__ContextRefAssignment_4");
					put(grammarAccess.getMasterDetailAccess().getReadonlyAssignment_5_1_0(), "rule__MasterDetail__ReadonlyAssignment_5_1_0");
					put(grammarAccess.getMasterDetailAccess().getMasterAssignment_7(), "rule__MasterDetail__MasterAssignment_7");
					put(grammarAccess.getMasterDetailAccess().getDetailAssignment_10(), "rule__MasterDetail__DetailAssignment_10");
					put(grammarAccess.getMasterDetailAccess().getProcessesAssignment_12_2_0(), "rule__MasterDetail__ProcessesAssignment_12_2_0");
					put(grammarAccess.getAutomatedProcessAccess().getDescriptionAssignment_0(), "rule__AutomatedProcess__DescriptionAssignment_0");
					put(grammarAccess.getAutomatedProcessAccess().getNameAssignment_2(), "rule__AutomatedProcess__NameAssignment_2");
					put(grammarAccess.getAutomatedProcessAccess().getContextRefAssignment_4(), "rule__AutomatedProcess__ContextRefAssignment_4");
					put(grammarAccess.getAutomatedProcessAccess().getTypeAssignment_5(), "rule__AutomatedProcess__TypeAssignment_5");
					put(grammarAccess.getAutomatedProcessAccess().getProcessElementsAssignment_6_2_0(), "rule__AutomatedProcess__ProcessElementsAssignment_6_2_0");
					put(grammarAccess.getInteractiveProcessAccess().getDescriptionAssignment_0(), "rule__InteractiveProcess__DescriptionAssignment_0");
					put(grammarAccess.getInteractiveProcessAccess().getNameAssignment_2(), "rule__InteractiveProcess__NameAssignment_2");
					put(grammarAccess.getInteractiveProcessAccess().getContextRefAssignment_4(), "rule__InteractiveProcess__ContextRefAssignment_4");
					put(grammarAccess.getInteractiveProcessAccess().getTypeAssignment_5(), "rule__InteractiveProcess__TypeAssignment_5");
					put(grammarAccess.getInteractiveProcessAccess().getProcessElementsAssignment_6_2_0(), "rule__InteractiveProcess__ProcessElementsAssignment_6_2_0");
					put(grammarAccess.getFormElementAccess().getDescriptionAssignment_0(), "rule__FormElement__DescriptionAssignment_0");
					put(grammarAccess.getFormElementAccess().getReferencesAssignment_2(), "rule__FormElement__ReferencesAssignment_2");
					put(grammarAccess.getFormElementAccess().getLabelAssignment_4(), "rule__FormElement__LabelAssignment_4");
					put(grammarAccess.getFormElementAccess().getReadonlyAssignment_5_1_0(), "rule__FormElement__ReadonlyAssignment_5_1_0");
					put(grammarAccess.getDialogueCallAccess().getAliasAssignment_1_1(), "rule__DialogueCall__AliasAssignment_1_1");
					put(grammarAccess.getLinkedDialogueCallAccess().getLinkAssignment_0(), "rule__LinkedDialogueCall__LinkAssignment_0");
					put(grammarAccess.getLinkedDialogueCallAccess().getNameAssignment_2(), "rule__LinkedDialogueCall__NameAssignment_2");
					put(grammarAccess.getDirectDialogueCallAccess().getNameAssignment(), "rule__DirectDialogueCall__NameAssignment");
					put(grammarAccess.getProcessCallAccess().getAliasAssignment_1_1(), "rule__ProcessCall__AliasAssignment_1_1");
					put(grammarAccess.getLinkedProcessCallAccess().getLinkAssignment_0(), "rule__LinkedProcessCall__LinkAssignment_0");
					put(grammarAccess.getLinkedProcessCallAccess().getNameAssignment_2(), "rule__LinkedProcessCall__NameAssignment_2");
					put(grammarAccess.getDirectProcessCallAccess().getNameAssignment(), "rule__DirectProcessCall__NameAssignment");
					put(grammarAccess.getLinkRefAccess().getNameAssignment_1(), "rule__LinkRef__NameAssignment_1");
					put(grammarAccess.getLinkServiceAccess().getServiceNameAssignment_1(), "rule__LinkService__ServiceNameAssignment_1");
					put(grammarAccess.getLinkServiceAccess().getServiceMethodAssignment_3(), "rule__LinkService__ServiceMethodAssignment_3");
					put(grammarAccess.getLinkStepAccess().getDescriptionAssignment_0(), "rule__LinkStep__DescriptionAssignment_0");
					put(grammarAccess.getLinkStepAccess().getNameAssignment_2(), "rule__LinkStep__NameAssignment_2");
					put(grammarAccess.getLinkStepAccess().getContextRefAssignment_4(), "rule__LinkStep__ContextRefAssignment_4");
					put(grammarAccess.getLinkStepAccess().getReferenceAssignment_6(), "rule__LinkStep__ReferenceAssignment_6");
					put(grammarAccess.getLinkPathAccess().getDescriptionAssignment_0(), "rule__LinkPath__DescriptionAssignment_0");
					put(grammarAccess.getLinkPathAccess().getNameAssignment_2(), "rule__LinkPath__NameAssignment_2");
					put(grammarAccess.getLinkPathAccess().getContextRefAssignment_4(), "rule__LinkPath__ContextRefAssignment_4");
					put(grammarAccess.getDtoPropertyReferenceAccess().getNameAssignment(), "rule__DtoPropertyReference__NameAssignment");
					put(grammarAccess.getAssociationRoleReferenceAccess().getNameAssignment(), "rule__AssociationRoleReference__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser typedParser = (org.mod4j.dsl.presentation.xtext.contentassist.antlr.internal.InternalPresentationParser) parser;
			typedParser.entryRulePresentationModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PresentationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PresentationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
