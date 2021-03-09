package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Denver", "Berlin"));
        flights.add(new Flight("Chicago", "Barcelona"));
        flights.add(new Flight("Barcelona", "Denver"));
        flights.add(new Flight("New York", "Paris"));
        flights.add(new Flight("Chicago", "Rome"));
        flights.add(new Flight("Paris", "Berlin"));
        flights.add(new Flight("Denver", "Prague"));
        flights.add(new Flight("Paris", "Denver"));
        return flights;
    }
}
