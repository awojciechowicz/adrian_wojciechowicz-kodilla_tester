package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

public interface Car {

    public boolean headLights(LocalTime localTime);

    public String getCarType();


}
