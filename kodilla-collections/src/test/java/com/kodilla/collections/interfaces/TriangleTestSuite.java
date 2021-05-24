package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTestSuite {

    @Test
    public void shouldCalculateArea() {
        //Given
        Triangle triangle = new Triangle(3,4,5);

        //When
        double result = triangle.getArea();

        //Then
        assertEquals(6,result);
    }

    @Test
    public void shouldCalculatePerimeter() {
        //Given
        Triangle triangle = new Triangle(3,4,5);

        //When
        double result = triangle.getPerimeter();

        //Then
        assertEquals(12,result);
    }

}