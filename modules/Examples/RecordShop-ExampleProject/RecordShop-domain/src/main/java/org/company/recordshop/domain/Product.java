
/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in NewJavaBean.xpt at: Sun Mar 15 15:06:43 CET 2009
 */
package org.company.recordshop.domain;

/**
 * 
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Product extends ProductImplBase {

	/**
	 * Default no-argument constructor for Product 
	 */
	protected Product() {

	}

	/**
	 * Minimal constructor for Product
	 * @param productNumnber (String) 
	 * @param price (int) 
	 * @param orderable (boolean) 
	 */
	public Product(String productNumnber, int price, boolean orderable) {
		super(productNumnber, price, orderable);
	}

}
