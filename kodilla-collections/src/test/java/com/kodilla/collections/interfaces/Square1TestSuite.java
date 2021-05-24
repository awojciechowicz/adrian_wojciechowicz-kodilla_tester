package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Square1TestSuite {

    @Test
    public void shouldCalculateArea() {
        //Given
        Square1 square = new Square1(5);

        //When
        double result = square.getArea();

        //Then
        assertEquals(25,result);
    }

    @Test
    public void shouldCalculatePerimeter() {
        //Given
        Square1 square = new Square1(5);

        //When
        double result = square.getPerimeter();

        //Then
        assertEquals(20,result);
    }
}