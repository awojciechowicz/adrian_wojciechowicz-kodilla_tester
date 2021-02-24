package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car {
    private int speed = 0;

    public Volkswagen() {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
    }
}
