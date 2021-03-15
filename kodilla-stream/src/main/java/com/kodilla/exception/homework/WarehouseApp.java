package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("15"));
        warehouse.addOrder(new Order("37"));
        warehouse.addOrder(new Order("43"));
        warehouse.addOrder(new Order("70"));
        warehouse.addOrder(new Order("100"));
        try {
            warehouse.getOrder("12");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order 12 does not exist");
        }
    }
}
