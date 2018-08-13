package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.Map;

public class FlightFinder {

    public void findDepartureAirport(String departureAirport, Map<Integer, Flight> availableFlights) {
        System.out.println();
        System.out.println("Available flights from: " + departureAirport);
        availableFlights.values().stream()
                    .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                    .forEach(System.out::println);

    }

    public void findArrivalAirport(String arrivalAirport, Map<Integer, Flight> availableFlights) {
        System.out.println();
        System.out.println("Available flights to: " + arrivalAirport);
        availableFlights.values().stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findAcrossAirport(String acrossAirport, Map<Integer, Flight> availableFlights) {
        System.out.println();
        System.out.println("Available flights across: " + acrossAirport);
        availableFlights.values().stream()
                .filter(entry -> entry.getAcrossAirport().equals(acrossAirport))
                .forEach(System.out::println);
    }

}
