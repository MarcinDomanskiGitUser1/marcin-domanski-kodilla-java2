package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.Map;

import static com.kodilla.goodpatterns.challenges.flightservice.Flights.getAvailableFlights;

public class App {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        Map<Integer, Flight> availableFlights = getAvailableFlights();

        String selectedDepartureAirport = "Lublin";
        flightFinder.findDepartureAirports(selectedDepartureAirport, availableFlights);

        String selectedArrivalAirport = "Poznań";
        flightFinder.findArrivalAirports(selectedArrivalAirport, availableFlights);

        String selectedDepartureAirportWithAcross = "Kraków";
        String selectedArrivalAirportWithAcross = "Wrocław";

        flightFinder.findIndirectFlights(selectedDepartureAirportWithAcross, selectedArrivalAirportWithAcross, availableFlights);
    }
}
