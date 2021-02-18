package com.kodilla.abstracts.homework;

public class Disk extends Shape{
    private double radius;
    public static final double PI = 3.141592;

    public Disk(int radius) {
        super("disk");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}
