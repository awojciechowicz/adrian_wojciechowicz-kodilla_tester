package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("The Penny Black", 3, 4, true));
        stamps.add(new Stamp("Inverted Swan", 5, 4, false));
        stamps.add(new Stamp("Red Mercury", 6, 5, true));
        stamps.add(new Stamp("Hawaiian Missionaries", 4, 3, false));
        stamps.add(new Stamp("Inverted Swan", 5, 4, false));
        stamps.add(new Stamp("The Penny Black", 3, 4, true));
        stamps.add(new Stamp("Red Mercury", 6, 5, true));

        System.out.println("Collection size: " + stamps.size());

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
