package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double orderPrice;
    private LocalDate orderDate;
    private String orderUser;

    public Order(double orderPrice, LocalDate orderDate, String orderUser) {
        this.orderPrice = orderPrice;
        this.orderDate = orderDate;
        this.orderUser = orderUser;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getOrderUser() {
        return orderUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderPrice=" + orderPrice +
                ", orderDate=" + orderDate +
                ", orderUser='" + orderUser + '\'' +
                '}';
    }
}
