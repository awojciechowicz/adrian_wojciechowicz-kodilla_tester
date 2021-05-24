package com.kodilla.abstracts.homework.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTestSuite {

    //Given
    Square square = new Square(5);

    @Test
    public void shouldCalculateArea() {
        //When
        double result = square.calculateArea();

        //Then
        assertEquals(20,result);
    }

    @Test
    public void shouldCalculatePerimeter() {
        //When
        double result = square.calculatePerimeter();

        //Then
        assertEquals(25,result);
    }

    @Test
    public void shouldReturnSideLength() {
        //When
        double result = square.getLength();

        //Then
        assertEquals(5,result);
    }
}