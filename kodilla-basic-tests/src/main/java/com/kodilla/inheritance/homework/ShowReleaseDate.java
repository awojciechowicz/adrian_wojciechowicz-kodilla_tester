package com.kodilla.inheritance.homework;

public class ShowReleaseDate {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1960);
        operatingSystem.turnOn();

        SystemLinux systemLinux = new SystemLinux(1991);
        systemLinux.turnOff();

        SystemWindows systemWindows = new SystemWindows(1985);
        systemWindows.turnOn();
    }
}
