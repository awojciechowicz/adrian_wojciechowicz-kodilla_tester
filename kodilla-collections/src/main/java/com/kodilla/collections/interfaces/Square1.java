package com.kodilla.collections.interfaces;

public class Square1 implements Shape {
    private double width;

    public Square1(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }
}
