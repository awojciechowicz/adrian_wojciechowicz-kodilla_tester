package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolPrincipalMap = new HashMap<>();
        School kennedy = new School("Kennedy High School","Sandra Bullock", "Jennifer Lopez", "Mark Twain", "Jessica Parker");
        School washington = new School("Washington High School","Jessic Biel", "Katie Holmes", "Kirk Douglas");
        School johnsson = new School("Johnsson High School", "Angelina Jolie", "Jennifer Love-Hewitt");

        Principal kennedyPrincipal = new Principal("James", "Jonnes");
        Principal washingtonPrincipal = new Principal("Kenneth", "Marks");
        Principal johnssonPrincipal = new Principal("Steve", "Krisford");

        schoolPrincipalMap.put(kennedyPrincipal, kennedy);
        schoolPrincipalMap.put(washingtonPrincipal, washington);
        schoolPrincipalMap.put(johnssonPrincipal, johnsson);

        for (Map.Entry<Principal, School> schoolEntry : schoolPrincipalMap.entrySet()) {
            System.out.println(schoolEntry.getKey().getFirstName() + " " + schoolEntry.getKey().getLastName()
                    + " is the principal of the " + schoolEntry.getValue().getName() + " where are studying "
                    + schoolEntry.getValue().getPupils().size() + " students.");
        }
    }
}
