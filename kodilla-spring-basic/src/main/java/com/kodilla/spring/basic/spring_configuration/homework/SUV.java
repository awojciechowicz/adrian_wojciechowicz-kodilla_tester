package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
    private boolean hasHeadlightsTurnedOn = false;

    @Override
    public boolean headLights(LocalTime localTime) {
        if (localTime.isAfter(LocalTime.of(19,59,59))  || localTime.isBefore(LocalTime.of(6,00,01)))
            hasHeadlightsTurnedOn = true;
        return hasHeadlightsTurnedOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
