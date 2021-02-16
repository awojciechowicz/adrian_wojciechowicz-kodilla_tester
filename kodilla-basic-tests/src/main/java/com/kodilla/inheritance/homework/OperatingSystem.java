package com.kodilla.inheritance.homework;

import java.util.Optional;

public class OperatingSystem {
    private int releaseYear;

    public void turnOn() {
        System.out.println("PC ist now ON.");
    }

    public void turnOff() {
        System.out.println("PC ist now OFF.");
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
        System.out.println("This System was released on " + releaseYear + ".");
    }
}
