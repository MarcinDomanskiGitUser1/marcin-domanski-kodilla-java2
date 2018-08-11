package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        String selectedDepartureAirport = "Lublin";

        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> availableFlights = new HashMap<>();

        flightFinder.findDepartureAirport(selectedDepartureAirport, availableFlights);


    }
}
