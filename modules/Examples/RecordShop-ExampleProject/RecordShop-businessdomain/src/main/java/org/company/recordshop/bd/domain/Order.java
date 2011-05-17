
/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in NewJavaBean.xpt at: Wed Jun 10 13:31:29 CEST 2009
 */
package org.company.recordshop.bd.domain;


/**
 * An Order represents the agreement between a Customer and the RecordShop about one or more purchased Records.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public class Order extends OrderImplBase {

	/**
	 * Default no-argument constructor for Order 
	 */
	protected Order() {

	}

	/**
	 * Minimal constructor for Order
	 * @param orderNumber (String) A number to identify the Order
	 */
	public Order(String orderNumber) {
		super(orderNumber);
	}

	protected Order(Long id) {
	    super(id);
    }

    /*
	 * (non-Javadoc)
     * @see org.company.recordshop.domain.OrderImplBase#getTotalAmount()
     */
    @Override
    public Double getTotalAmount() {
       Double totalAmount = 0D;
       for (OrderLine line : getOrderLines()){
           totalAmount += line.getLineAmount();
       }
       return totalAmount;
    }

	/**
	 * @param totalAmount (Float) The total amount of the Order. Its value is derived from the summation of the OrderLine amounts
	 */
	public void setTotalAmount(final Float totalAmount) {
		 throw new UnsupportedOperationException("Not implemented");
	}

}
