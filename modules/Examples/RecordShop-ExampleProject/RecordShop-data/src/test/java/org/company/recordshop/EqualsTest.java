package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.domain.Customer;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EqualsTest extends AbstractDaoTestCase {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void testEqualsObject() {
        Customer one = customerDao.add(new Customer("Karl", "Popper", new DateTime(), 1));
        Customer other = new Customer("Karl", "Popper", new DateTime(), 1);
        assertNotSame(one, other);
        assertFalse(one.equals(other));
        flush();
        clear();

        other = customerDao.retrieve(one.getId());
        assertNotSame(one, other);
        assertEquals(one, other);
    }
}
