package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampWidth;
    private double stampHeight;
    private boolean isStamped;

    public Stamp(String stampName, double stampWidth, double stampHeight, boolean isStamped) {
        this.stampName = stampName;
        this.stampWidth = stampWidth;
        this.stampHeight = stampHeight;
        this.isStamped = isStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampWidth() {
        return stampWidth;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public boolean isStamped() {
        return isStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampWidth=" + stampWidth +
                ", stampHeight=" + stampHeight +
                ", isStamped=" + isStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampWidth, stampWidth) == 0 && Double.compare(stamp.stampHeight, stampHeight) == 0 && isStamped == stamp.isStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampWidth, stampHeight, isStamped);
    }
}
