package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 4;
        int squareResult = calculator.sqare(a);
        assertEquals(16,squareResult);
        int b = -5;
        squareResult = calculator.sqare(b);
        assertEquals(25,squareResult);
        int c = 0;
        squareResult = calculator.sqare(c);
        assertEquals(0,squareResult);
    }
}
