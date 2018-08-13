package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.HashMap;
import java.util.Map;

public class Flights {

    public static Map<Integer, Flight> getAvailableFlights() {

        Map<Integer, Flight> availableFlights = new HashMap<>();
        availableFlights.put(2456, new Flight("Białystok", "Warszawa", "Lublin"));
        availableFlights.put(1282, new Flight("Lublin", "no stop","Poznań"));
        availableFlights.put(4785, new Flight("Szczecin", "no stop", "Wrocław"));
        availableFlights.put(1254, new Flight("Kraków", "Częstochowa", "Wrocław"));

        return availableFlights;
    }
}
