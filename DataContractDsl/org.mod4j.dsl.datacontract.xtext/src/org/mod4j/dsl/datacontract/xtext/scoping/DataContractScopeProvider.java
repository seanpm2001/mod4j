/*
 * generated by Xtext
 */
	/*******************************************************************************
	 * Copyright (c) 2009 Ordina and committers to Mod4j
	 * All rights reserved. This program and the accompanying materials
	 * are made available under the terms of the Eclipse Public License v1.0
	 * which accompanies this distribution, and is available at
	 * http://www.eclipse.org/legal/epl-v10.html
	 *
	 * Contributors:
	 *     Ordina - initial implementation
	 *******************************************************************************/
package org.mod4j.dsl.datacontract.xtext.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopedElement;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.ScopedElement;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.mod4j.crossx.broker.CrossxEnvironment;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.BusinessClassDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.DataContractModel;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.Dto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.EnumerationDto;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ExternalReference;
import org.mod4j.dsl.datacontract.mm.DataContractDsl.ListDto;
import org.mod4j.eclipse.util.EclipseUtil;

public class DataContractScopeProvider extends AbstractDeclarativeScopeProvider {

	/**
	 * Return the scopes for the baseDto of a ListDto: all but itself.
	 */
    public IScope scope_ListDto_baseDto	(ListDto context, 	EReference reference)
	{
		List<IScopedElement> scopedElements = new ArrayList<IScopedElement>();
		DataContractModel model = context.getDatacontractModel();
		
		for (Dto dto : model.getDtos() ) {
			if( dto != context ){
				IScopedElement scopedElement = ScopedElement.create(dto.getName() , dto);
				scopedElements.add(scopedElement);
			}
		}
		return new SimpleScope(scopedElements);
	}

    public IScope scope_BusinessClassDto_base(BusinessClassDto context, EReference reference)
	{
		List<IScopedElement> scopedElements = new ArrayList<IScopedElement>();
		List<ExternalReference> baseproposals = Proposals.getBusinessClassBaseProposals(context);
		
		for (ExternalReference ref : baseproposals ) {
			IScopedElement scopedElement = ScopedElement.create(ref.getName() , ref);
			scopedElements.add(scopedElement);
		}
		return new SimpleScope(scopedElements);
	}
//
//	/* proposals for EnumerationDto::base */
//	List[Proposal] completeEnumerationDto_base(emf::EObject ctx, String prefix) :
//	    getEnumerationBaseProposals(ctx).collect(p |  newProposal( p) );
    public IScope scope_EnumerationDto_base(EnumerationDto context, EReference reference)
	{
		List<IScopedElement> scopedElements = new ArrayList<IScopedElement>();
		List<ExternalReference> baseproposals = Proposals.getEnumerationBaseProposals(context);
		
		for (ExternalReference ref : baseproposals ) {
			IScopedElement scopedElement = ScopedElement.create(ref.getName() , ref);
			scopedElements.add(scopedElement);
		}
		return new SimpleScope(scopedElements);
	}
//
//	// GET RID OF ALL THE DESCRIPTION PROPOSALS
//	/* proposals for Feature DataContractModel::description */
//	List[Proposal] completeDataContractModel_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature DtoProperty::description */
//	List[Proposal] completeDtoProperty_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature ExternalReference::description */
//	List[Proposal] completeExternalReference_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature ListDto::description */
//	List[Proposal] completeListDto_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature CustomDto::description */
//	List[Proposal] completeCustomDto_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature BusinessClassDto::description */
//	List[Proposal] completeBusinessClassDto_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature EnumerationDto::description */
//	List[Proposal] completeEnumerationDto_description(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature DtoDateTimeProperty::dataType 
//	   NOT GENERATED BY XTEXT< added to avoid error messages (not found) */
//	List[Proposal] completeDtoDateTimeProperty_dataType(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature DtoBooleanProperty::name 
//	   NOT GENERATED BY XTEXT< added to avoid error messages (not found) */
//	List[Proposal] completeDtoBooleanProperty_dataType(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature DtoStringProperty::name 
//	   NOT GENERATED BY XTEXT< added to avoid error messages (not found) */
//	List[Proposal] completeDtoStringProperty_dataType(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature DtoDecimalProperty::name 
//	   NOT GENERATED BY XTEXT< added to avoid error messages (not found) */
//	List[Proposal] completeDtoDecimalProperty_dataType(emf::EObject ctx, String prefix) :
//		{};
//
//	/* proposals for Feature DtoIntegerProperty::name 
//	   NOT GENERATED BY XTEXT< added to avoid error messages (not found) */
//	List[Proposal] completeDtoIntegerProperty_dataType(emf::EObject ctx, String prefix) :
//		{};
//
//
//
//	/** Filter out all proiposals that end with Description. 
//	 *  This eliminates the descritions from all proposals.
//	 *  Also put a space at the end of all proposals
//	 *  Leave out the default BusinessClassPropertyReferenceName propsal
//	 */
//	List[Proposal] sortProposals(List[Proposal] proposalsToSort):
//		proposalsToSort.select( p | p.label != "BusinessClassPropertyReferenceName")
//	    .reject(p | p.label.endsWith("Description"))
//	    .select(p | (! p.toInsert.endsWith(" ") ? p.setToInsert(p.toInsert + " ") : null)->true)
//		;
		
}
