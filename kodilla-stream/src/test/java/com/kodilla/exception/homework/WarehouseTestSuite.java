package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
    @Test(expected = OrderDoesntExistException.class)
    public void testDoesOrderExist_withExeption() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("15"));
        // when
        Order order = warehouse.getOrder("12");
        // then
        assertEquals(order, new Order("12"));
    }
}