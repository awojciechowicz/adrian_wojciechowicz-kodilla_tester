package com.kodilla.abstracts.homework.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiskTestSuite {

    //Given
    Disk disk = new Disk(5);

    @Test
    public void shouldCalculateDiskArea() {
        //When
        double result = disk.calculateArea();

        //Then
        assertEquals(78.54,result,0.01);
    }

    @Test
    public void shouldCalculateDiskPerimeter() {
        //When
        double result = disk.calculatePerimeter();

        //Then
        assertEquals(31.42,result,0.01);
    }

    @Test
    public void shouldReturnRadius() {
        //When
        double result = disk.getRadius();

        //Then
        assertEquals(5,result);
    }
}