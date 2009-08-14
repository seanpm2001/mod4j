package org.company.recordshop;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.data.OrderDao;
import org.company.recordshop.data.OrderLineDao;
import org.company.recordshop.domain.Order;
import org.company.recordshop.domain.OrderLine;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Johan Vogelzang
 */
public class CompositeAssociationTest extends AbstractDaoTestCase {

    @Autowired
    private OrderDao orderDao;
    
    @Autowired
    private OrderLineDao orderLineDao;

    private Order order = new Order("1111");
    private OrderLine orderline01 = new OrderLine(1, "orderline01");
    private OrderLine orderline02 = new OrderLine(2, "orderline02");
    private OrderLine orderline03 = new OrderLine(3, "orderline03");
    
    @Test
    public void cascadeDelete4Composite(){

       Order savedOrder = orderDao.add(order);
       orderLineDao.add(orderline01);
       orderLineDao.add(orderline02);
       orderLineDao.add(orderline03);

       order.addToOrderLines(orderline01);
       order.addToOrderLines(orderline02);
       order.addToOrderLines(orderline03);
       
       orderDao.update(savedOrder);
       flush();
       
       assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Order_TABLE"));
       assertEquals(3, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Order_Line_TABLE"));
       
       orderDao.delete(savedOrder);
       flush();
       
       assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Order_TABLE"));
       assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Order_Line_TABLE"));
    }
}
