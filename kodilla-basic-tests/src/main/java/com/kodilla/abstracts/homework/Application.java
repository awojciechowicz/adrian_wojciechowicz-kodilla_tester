package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(7);
        System.out.println("The perimeter of a " + square.getName() + " whose four sides have length " + square.getLength() + " is " + square.calculatePerimeter() + ".");
        System.out.println("The area of a " + square.getName() + " whose four sides have length " + square.getLength() + " is " + square.calculateArea() + ".");

        Disk disk = new Disk(2);
        System.out.println("The perimeter of a " + disk.getName() + " whose radius have length " + disk.getRadius() + " is " + disk.calculatePerimeter() + ".");
        System.out.println("The area of a " + disk.getName() + " whose radius have length " + disk.getRadius() + " is " + disk.calculateArea() + ".");

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(3);
        System.out.println("The perimeter of an " + equilateralTriangle.getName() + " whose radius have length " + equilateralTriangle.getSideLength() + " is " + equilateralTriangle.calculatePerimeter() + ".");
        System.out.println("The area of an " + equilateralTriangle.getName() + " whose radius have length " + equilateralTriangle.getSideLength() + " is " + equilateralTriangle.calculateArea() + ".");
    }
}
