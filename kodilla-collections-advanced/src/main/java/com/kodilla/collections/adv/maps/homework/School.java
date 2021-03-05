package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    List<String> pupils = new ArrayList<>();

    public School(String name, String... pupils) {
        this.name = name;
        for (String pupil : pupils) {
            this.pupils.add(pupil);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getPupils() {
        return pupils;
    }
}
