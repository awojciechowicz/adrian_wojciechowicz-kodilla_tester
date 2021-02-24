package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Car opel = new Opel();
        Car ford = new Ford();
        Car volkswagen = new Volkswagen();

        doRace(opel);
        doRace(ford);
        doRace(volkswagen);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}
