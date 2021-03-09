package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindDepartures() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Denver");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Denver", "Berlin"));
        expectedList.add(new Flight("Denver", "Prague"));
        assertEquals(result, expectedList);
    }

    @Test
    public void testFindArrivals() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("Berlin");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Denver", "Berlin"));
        expectedList.add(new Flight("Paris", "Berlin"));
        assertEquals(result, expectedList);
    }

}