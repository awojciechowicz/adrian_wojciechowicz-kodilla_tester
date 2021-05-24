package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpelTestSuite {

    @Test
    public void shouldReturn90() {
        //Given
        Opel opel = new Opel();
        opel.increaseSpeed(83);
        opel.increaseSpeed();
        opel.decreaseSpeed();

        //When
        int result = opel.getSpeed();

        //Then
        assertEquals(90,result);
    }

}