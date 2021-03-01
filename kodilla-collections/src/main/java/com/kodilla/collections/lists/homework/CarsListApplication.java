package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Opel());
        cars.add(new Volkswagen());
        cars.add(new Ford());


        System.out.println("Collection size before remove: " + cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(1);
        cars.remove(new Opel());
        System.out.println("Collection size after remove: " + cars.size());

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
