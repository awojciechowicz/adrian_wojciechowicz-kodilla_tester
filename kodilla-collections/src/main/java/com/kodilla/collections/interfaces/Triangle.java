package com.kodilla.collections.interfaces;

public class Triangle implements Shape{
    private double height;
    private double width;
    private double hypoteneuse;

    public Triangle(double height, double base, double hypoteneuse) {
        this.width = base;
        this.height = height;
        this.hypoteneuse = hypoteneuse;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public double getPerimeter() {
        return width + height + hypoteneuse;
    }
}
