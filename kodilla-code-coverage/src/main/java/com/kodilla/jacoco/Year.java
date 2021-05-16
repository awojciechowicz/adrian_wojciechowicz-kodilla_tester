package com.kodilla.jacoco;

public class Year {
    int choseYear;

    public Year(int year) {
        this.choseYear = year;
    }

    public boolean isLeap() {
        if (this.choseYear % 4 == 0) {
            if (this.choseYear % 100 == 0) {
                if (this.choseYear % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}