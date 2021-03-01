package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", hypoteneuse=" + hypoteneuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 && Double.compare(triangle.width, width) == 0 && Double.compare(triangle.hypoteneuse, hypoteneuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, hypoteneuse);
    }
}
