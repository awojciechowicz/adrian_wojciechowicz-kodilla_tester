package com.kodilla.abstracts.homework.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquilateralTriangleTestSuite {

    //Given
    EquilateralTriangle triangle = new EquilateralTriangle(5);

    @Test
    public void shouldCalculateArea() {
        //When
        double result = triangle.calculateArea();

        //Then
        assertEquals(15, result);
    }

    @Test
    public void shouldCalculatePerimeter() {
        //When
        double result = triangle.calculatePerimeter();

        //Then
        assertEquals(10.83, result,0.01);
    }

    @Test
    public void shouldRReturnSideLength() {
        //When
        double result = triangle.getSideLength();

        //Then
        assertEquals(5, result);
    }

}