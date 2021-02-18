package com.kodilla.abstracts.homework.geometry;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
