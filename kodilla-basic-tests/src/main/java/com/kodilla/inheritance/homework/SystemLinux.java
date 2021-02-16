package com.kodilla.inheritance.homework;

public class SystemLinux extends OperatingSystem{
    public SystemLinux(int releaseYear) {
        super(releaseYear);
        System.out.println("This System is Linux.");
    }
}
