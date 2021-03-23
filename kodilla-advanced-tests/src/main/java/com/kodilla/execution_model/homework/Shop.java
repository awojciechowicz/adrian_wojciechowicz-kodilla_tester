package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersBetweenDates(LocalDate startDate, LocalDate endDate) {
        return orders
                .stream()
                .filter(u -> u.getOrderDate().isAfter(startDate.minusDays(1)) && u.getOrderDate().isBefore(endDate.plusDays(1)))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersBetweenPrices(double startPrice, double endPrice) {
        return orders
                .stream()
                .filter(u -> u.getOrderPrice() >= startPrice && u.getOrderPrice() <= endPrice)
                .collect(Collectors.toList());
    }

    public int getSize() {
        return orders.size();
    }

    public double getSumOfOrdersPrice() {
        double sum = 0;
        for (Order order:
             orders) {
            sum += order.getOrderPrice();
        }
        return sum;
    }
}

