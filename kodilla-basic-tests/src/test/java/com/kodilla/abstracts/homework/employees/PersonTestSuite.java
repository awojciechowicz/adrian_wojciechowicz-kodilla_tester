package com.kodilla.abstracts.homework.employees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    //Given
    Person person = new Person("Peter",25,new Tester(150,"writes tests"));


    @Test
    public void shouldReturnName() {
        //When
        String result = person.getFirstName();

        //Then
        assertEquals("Peter", result);
    }

    @Test
    public void shouldReturnAge() {
        //When
        int result = person.getAge();

        //Then
        assertEquals(25, result);
    }

    @Test
    public void shouldReturnJob() {
        //When
        double result = person.getJob().getSalary();

        //Then
        assertEquals(150, result);
    }

}