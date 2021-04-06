package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class ChooseACar {
    private Car car;
    private Season season;
    private LocalTime actualTime;
    enum Season {
        SUMMER,
        WINTER,
        AUTUMN,
        SPRING
    }


    @Bean
    public String randomCar() {
        Random random = new Random();
        int seasonNumber = random.nextInt(4);
        switch (seasonNumber) {
            case 0:
                season = Season.SUMMER;
                car = new Cabrio();
                break;
            case 1:
                season = Season.WINTER;
                car = new SUV();
                break;
            case 2:
                season = Season.AUTUMN;
                car = new Sedan();
                break;
            case 3:
                season = Season.SPRING;
                car = new Sedan();
                break;
        }
        actualTime = LocalTime.now();
        return "The chosen car is: " + car.getCarType() + " and its headlight is on: " + car.headLights(actualTime);
    }
}
