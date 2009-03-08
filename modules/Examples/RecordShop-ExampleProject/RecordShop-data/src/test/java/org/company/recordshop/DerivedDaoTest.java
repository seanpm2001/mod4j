package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.data.DerivedDao;
import org.company.recordshop.domain.Derived;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DerivedDaoTest extends AbstractDaoTestCase {

    @Autowired
    private DerivedDao dao;

    Derived read;

    @Before
    public void setUp() {
        Derived derived = dao.add(new Derived());
        flush();
        clear();
        read = dao.retrieve(derived.getId());
    }

    @Test
    public void testGetFirst() {
        assertEquals("first", read.getFirst());
    }

    @Test
    public void testGetSecondo() {
        assertTrue(read.isSecondo());
    }

    @Test
    public void testGetThird() {
        assertEquals(new DateTime(1), read.getThird());
    }

    @Test
    public void testGetFourth() {
        assertEquals(4, read.getFourth());
    }

    @Test
    public void testGetFifth() {
        assertEquals(5.0F, read.getFifth(), 0.000001);
    }
    @Test
    public void testSetFirst() {
        read.setFirst("first");
    }

    @Test
    public void testSetSecondo() {
        read.setSecondo(true);
    }

    @Test
    public void testSetThird() {
        read.setThird(new DateTime());
    }

    @Test
    public void testSetFourth() {
        read.setFourth(4);
    }

    @Test
    public void testSetFifth() {
        read.setFifth(5.0F);
    }
}
