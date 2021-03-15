package com.kodilla.exception.homework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Warehouse {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
//        List<Order> result = orders
        return orders
                .stream()
                .filter(u -> u.getNumber().equals(number))
//                .collect(Collectors.toList());
//        if (result.size() > 0)
//            return result.get(0);
//        else
//            throw new OrderDoesntExistException();
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
