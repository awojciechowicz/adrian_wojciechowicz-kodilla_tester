package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ShapeListApplication {
    public static void main(String[] args) {
        List<Square1> shapes = new ArrayList<>();
        shapes.add(new Square1(10.0));
        shapes.add(new Square1(5.0));
        shapes.add(new Square1(1.0));

        for (Square1 square1 : shapes) {
            if (square1.getArea() > 20)
                System.out.println(square1 + ", area: " + square1.getArea());
        }

//        for (int n = 0; n < shapes.size(); n++) {
//            Square1 square = shapes.get(n);
//            if (square.getArea() > 20)
//                System.out.println(square + ", area: " + square.getArea());
//        }
    }
}
