package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.Map;

public class FlightFinder {

    public void findDepartureAirport(String departureAirport, Map<Integer, Flight> availableFlights) {
        System.out.println("Available flights from: " + departureAirport);
        availableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport())
                .forEach(System.out::println);
    }

    public void findArrivalAirport(String arrivalAirport, Map<Integer, Flight> availableFlights) {
        System.out.println("Available flights to: " + arrivalAirport);
        availableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getArrivalAirport())
                .forEach(System.out::println);
    }

    public void findAcrossAirport(Flight flight, Map<Integer, Flight> availableFlights) {
        System.out.println("Available flights from: " + getDepartureAirport() + " across " + getAcrossAirport() + " to: " + getArrivalAirport());
        availableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getAcrossAirport())
                .forEach(System.out::println);
    }

}
