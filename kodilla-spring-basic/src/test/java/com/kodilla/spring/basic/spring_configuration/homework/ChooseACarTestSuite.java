package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
public class ChooseACarTestSuite {

    @Test
    public void shouldReturnRightCarWithHeadLightsONDependsOnActualTime() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla/spring/basic");
        ChooseACar chooseACarBean = context.getBean(ChooseACar.class);
        boolean headLightsOn = false;
        // When
        if (LocalTime.now().isBefore(LocalTime.of(6,00,01)) || LocalTime.now().isAfter(LocalTime.of(19,59,59))) {
            headLightsOn = true;
        }
        List<String> possibleCars = Arrays.asList("The chosen car is: Cabrio and its headlight is on: " + headLightsOn,
                "The chosen car is: SUV and its headlight is on: " + headLightsOn,
                "The chosen car is: Sedan and its headlight is on: " + headLightsOn);
        // Then
        String message = chooseACarBean.randomCar();
        System.out.println(message);
        Assertions.assertTrue(possibleCars.contains(message));
    }

}