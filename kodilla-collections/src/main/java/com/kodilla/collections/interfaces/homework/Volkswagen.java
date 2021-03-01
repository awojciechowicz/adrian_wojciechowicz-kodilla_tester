package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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
    public void increaseSpeed(int acceleration) {
        speed += acceleration;
    }

    @Override
    public void increaseSpeed() {
        speed += 15;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volkswagen that = (Volkswagen) o;
        return speed == that.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
