package com.kodilla.inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTestSuite {

    @Test
    public void shouldReturnNumberOfWheels() {
        //Given
        Car car = new Car(4,5);

        //When
        int result = car.getWheels();

        //Then
        assertEquals(4,result);
    }

    @Test
    public void shouldReturnNumberOfSeats() {
        //Given
        Car car = new Car(4,5);

        //When
        int result = car.getSeats();

        //Then
        assertEquals(5,result);
    }

}