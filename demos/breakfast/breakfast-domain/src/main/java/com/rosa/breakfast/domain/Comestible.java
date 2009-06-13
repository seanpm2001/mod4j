
/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in NewJavaBean.xpt at: Sat Jun 13 20:41:08 CEST 2009
 */
package com.rosa.breakfast.domain;

/**
 * Atricles of food.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Comestible extends ComestibleImplBase {

	/**
	 * Default no-argument constructor for Comestible 
	 */
	protected Comestible() {

	}

	/**
	 * Minimal constructor for Comestible
	 * @param name (String) 
	 * @param minimalQuantity (int) 
	 * @param price (float) 
	 */
	public Comestible(String name, int minimalQuantity, float price) {
		super(name, minimalQuantity, price);
	}

}
