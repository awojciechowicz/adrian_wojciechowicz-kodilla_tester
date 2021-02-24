package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int speed = 0;

    public Opel() {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 12;
    }

    @Override
    public void increaseSpeed(int acceleration) {
        speed += acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
    }
}
