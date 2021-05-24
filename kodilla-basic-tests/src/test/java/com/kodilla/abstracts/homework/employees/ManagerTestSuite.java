package com.kodilla.abstracts.homework.employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTestSuite {

    @Test
    public void shouldReturn100() {
        //Given
        Job job = new Manager(100, "performs risk management");

        //When
        double result = job.getSalary();

        //Then
        assertEquals(100, result);
    }

    @Test
    public void shouldReturnResponsibilities() {
        //Given
        Job job = new Manager(100, "performs risk management");

        //When
        String result = job.getResponsibilities();

        //Then
        assertEquals("performs risk management", result);
    }
}