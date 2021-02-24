package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarsApplication {
    private static int acceleration;

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
            cars[i].increaseSpeed(acceleration);
        }

        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarBrand = random.nextInt(3);
        acceleration = random.nextInt(151);
        if (drawnCarBrand == 0)
            return new Opel();
        else if (drawnCarBrand == 1)
            return new Ford();
        else
            return new Volkswagen();
    }
}
