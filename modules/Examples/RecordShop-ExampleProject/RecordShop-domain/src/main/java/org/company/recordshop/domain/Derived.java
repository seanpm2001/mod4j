/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in NewJavaBean.xpt at: Sat Mar 07 22:00:59 CET 2009
 */
package org.company.recordshop.domain;

import org.joda.time.DateTime;

/**
 * Test derived attributes
 * 
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Derived extends DerivedImplBase {

    /**
     * Minimal constructor for Derived
     */
    public Derived() {
        super();
    }

    /**
     * @return first (String)
     */
    public String getFirst() {
        return "first";
    }

    /**
     * 
     * @return secondo (boolean)
     */
    public boolean isSecondo() {
        return true;
    }

    /**
     * @return third (DateTime)
     */
    public DateTime getThird() {
        return new DateTime(1);
    }

    /**
     * @return fourth (int)
     */
    public int getFourth() {
        return 4;
    }

    /**
     * @return fifth (float)
     */
    public float getFifth() {
        return 5.0F;
    }

    /**
     * @param first
     *            (String)
     */
    public void setFirst(final String first) {
    }

    /**
     * @param secondo
     *            (boolean)
     */
    public void setSecondo(final boolean secondo) {
    }

    /**
     * @param third
     *            (DateTime)
     */
    public void setThird(final DateTime third) {
    }

    /**
     * @param fourth
     *            (int)
     */
    public void setFourth(final int fourth) {
    }

    /**
     * @param fifth
     *            (float)
     */
    public void setFifth(final float fifth) {
    }

}
