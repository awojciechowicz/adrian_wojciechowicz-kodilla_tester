package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolkswagenTestSuite {

    @Test
    public void shouldReturn90() {
        //Given
        Car volkswagen = new Volkswagen();
        volkswagen.increaseSpeed(80);
        volkswagen.increaseSpeed();
        volkswagen.decreaseSpeed();

        //When
        int result = volkswagen.getSpeed();

        //Then
        assertEquals(90,result);
    }

}