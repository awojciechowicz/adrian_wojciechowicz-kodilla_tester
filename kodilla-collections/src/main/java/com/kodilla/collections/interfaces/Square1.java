package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Square1{" +
                "width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square1 square1 = (Square1) o;
        return Double.compare(square1.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width);
    }
}
