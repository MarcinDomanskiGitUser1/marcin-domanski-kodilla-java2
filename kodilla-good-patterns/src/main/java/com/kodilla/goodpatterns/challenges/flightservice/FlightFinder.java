package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.String.format;

public class FlightFinder {

    public void findDepartureAirports(String departureAirport, Map<Integer, Flight> availableFlights) {
        System.out.println();
        System.out.println("Available flights from: " + departureAirport);
        availableFlights.values().stream()
                    .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                    .forEach(System.out::println);

    }

    public void findArrivalAirports(String arrivalAirport, Map<Integer, Flight> availableFlights) {
        System.out.println();
        System.out.println("Available flights to: " + arrivalAirport);
        availableFlights.values().stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findIndirectFlights(String departureAirport, String arrivalAirport, Map<Integer, Flight> availableFlights) {
        System.out.println();
        System.out.println("Available flights from " + departureAirport + " to " + arrivalAirport + " with indirect airport.");
                List <Flight> list1 = availableFlights.values().stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

                List <Flight> list2 = availableFlights.values().stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        for (Flight newList1 : list1) {
            for (Flight newList2 : list2) {
                if (newList1.getArrivalAirport().equals(newList2.getDepartureAirport())) {
                    System.out.println("Flight " + newList1.getDepartureAirport() + " "+ newList1.getArrivalAirport() + " and flight " + newList2.getDepartureAirport() + " " + newList2.getArrivalAirport());
                }
            }
        }
    }
}
