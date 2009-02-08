/**
 * Initially generated by Mod4j Service DSL: LocalServiceImpl::LocalServiceImpl at: Sun Feb 08 17:10:30 CET 2009
 * from model CustomerServiceModel
 * Extension point: intended to be changed by hand.
 */
package org.company.recordshop.service;

import java.util.List;

import org.company.recordshop.business.CustomerServiceModelDomainService;
import org.company.recordshop.service.CustomerServiceModelLocalServiceImplBase;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.UniqueCustomerDto;
import org.company.recordshop.service.dto.StringDto;
import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.OrderDto;

import org.company.recordshop.service.dto.SimpleCustomerDto;

import org.company.recordshop.service.dto.OrderNumberAndDateDto;

import org.company.recordshop.service.dto.translators.SimpleCustomerDtoTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.FullCustomerDtoTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.OrderDtoTranslator;
import org.company.recordshop.domain.Order;

/**
 * @author Initially generated by Mod4j
 */
public class CustomerServiceModelLocalServiceImpl
		extends
			CustomerServiceModelLocalServiceImplBase {

	/** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
	 * @params [order]
	 * @return 
	 */
	public void voidreturn(OrderDto order) {

		// TODO Mod4j: implement this service method manually

	}

	/** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
	 * @params [order, customer]
	 * @return OrderDto
	 */
	public OrderDto addToOrdersa(OrderDto order, SimpleCustomerDto customer) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
	 * @params [cust]
	 * @return SimpleCustomerDto
	 */
	public SimpleCustomerDto findCustomerByUniqueKey(UniqueCustomerDto cust) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
	 * @params [name]
	 * @return SimpleCustomerList
	 */
	public List<SimpleCustomerDto> findCustomerByName(StringDto name) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

}
