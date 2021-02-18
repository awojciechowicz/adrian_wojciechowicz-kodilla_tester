package com.kodilla.abstracts.homework;

public class EquilateralTriangle extends Shape{
    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        super("equilateral triangle");
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return 3 * sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt(3) / 4 * sideLength * sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }
}
