package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FordTestSuite {

    @Test
    public void shouldReturn100() {
        //Given
        Ford ford = new Ford();
        ford.increaseSpeed(95);
        ford.increaseSpeed();
        ford.decreaseSpeed();

        //When
        int result = ford.getSpeed();

        //Then
        assertEquals(100,result);
    }

}