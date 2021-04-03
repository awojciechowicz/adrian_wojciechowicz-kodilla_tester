package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void shouldReturnResultOfAddition() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla/spring/basic");
        Calculator bean = context.getBean(Calculator.class);
        double addition = bean.add(5.2,2.3);
        assertEquals(7.5, addition, 0.01);
    }

    @Test
    public void shouldReturnResultOfSubtraction() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla/spring/basic");
        Calculator bean = context.getBean(Calculator.class);
        double subtraction = bean.subtract(5.2,2.3);
        assertEquals(2.9, subtraction, 0.01);
    }

    @Test
    public void shouldReturnResultOfMultiplication() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla/spring/basic");
        Calculator bean = context.getBean(Calculator.class);
        double multiplication = bean.multiply(5.2,2.3);
        assertEquals(11.96, multiplication, 0.01);
    }

    @Test
    public void shouldReturnResultOfDivision() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com/kodilla/spring/basic");
        Calculator bean = context.getBean(Calculator.class);
        double division = bean.divide(5.2,2.3);
        assertEquals(2.26, division, 0.01);
    }
}