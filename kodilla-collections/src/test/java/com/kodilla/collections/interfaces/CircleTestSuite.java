package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTestSuite {

    @Test
    public void shouldCalculateArea() {
        //Given
        Shape circle = new Circle(5);

        //When
        double result = circle.getArea();

        //Then
        assertEquals(78.54,result,0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        //Given
        Shape circle = new Circle(5);

        //When
        double result = circle.getPerimeter();

        //Then
        assertEquals(31.42,result,0.01);
    }

}