package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.Map;

import static com.kodilla.goodpatterns.challenges.flightservice.Flights.getAvailableFlights;

public class App {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> availableFlights = getAvailableFlights();

        String selectedDepartureAirport = "Wrocław";
        flightFinder.findDepartureAirport(selectedDepartureAirport, availableFlights);

        String selectedArrivalAirport = "Białystok";
        flightFinder.findArrivalAirport(selectedArrivalAirport, availableFlights);

        String selectedAcrossAirport = "Częstochowa";
        flightFinder.findAcrossAirport(selectedAcrossAirport, availableFlights);
    }
}
