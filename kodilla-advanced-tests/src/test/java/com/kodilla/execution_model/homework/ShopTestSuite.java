package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order john = new Order(150, LocalDate.of(2021,01,05), "John");
    Order mike = new Order(20, LocalDate.of(2021,02,01), "Mike");
    Order billy = new Order(300, LocalDate.of(2021,03,22), "Billy");
    Order steve = new Order(50, LocalDate.of(2021,02,20), "Steve");

    @Test
    public void shouldAddOrders() {
        // When
        int result = shop.getSize();
        // Then
        assertEquals(4,result);
    }

    @Test
    public void shouldIgnoreTheSameOrder() {
        // Given
        shop.addOrder(mike);
        shop.addOrder(billy);
        // When
        int result = shop.getSize();
        // Then
        assertEquals(4,result);
    }

    @Test
    public void shouldGetOrdersBetweenTwoDates() {
        // When
        List<Order> result = shop.getOrdersBetweenDates(LocalDate.of(2021,02,01),
                LocalDate.of(2021,03,22));
        // Then
//        List<Order> expected = new ArrayList<>();
//        expected.add(mike);
//        expected.add(steve);
//        expected.add(billy);
//        assertEquals(expected,result);
        assertEquals(3,result.size());
    }

    @Test
    public void shouldGetOrdersBetweenTwoPrices() {
        // When
        List<Order> result = shop.getOrdersBetweenPrices(50,150);
        // Then
        assertEquals(2,result.size());
    }

    @Test
    public void shouldGetSumOfAllOrdersPrices() {
        // When
        double result = shop.getSumOfOrdersPrice();
        // Then
        assertEquals(520,result);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(john);
        shop.addOrder(mike);
        shop.addOrder(billy);
        shop.addOrder(steve);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}