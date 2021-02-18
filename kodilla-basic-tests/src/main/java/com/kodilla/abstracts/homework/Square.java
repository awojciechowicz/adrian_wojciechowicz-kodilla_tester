package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double length;

    public Square(int length) {
        super("sqaure");
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return 4 * length;
    }

    @Override
    public double calculatePerimeter() {
        return length * length;
    }

    public double getLength() {
        return length;
    }
}
