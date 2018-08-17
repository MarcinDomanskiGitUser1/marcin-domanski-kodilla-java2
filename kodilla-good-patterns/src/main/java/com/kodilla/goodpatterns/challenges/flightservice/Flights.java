package com.kodilla.goodpatterns.challenges.flightservice;

import java.util.HashMap;
import java.util.Map;

public class Flights {

    public static Map<Integer, Flight> getAvailableFlights() {

        final Map<Integer, Flight> availableFlights = new HashMap<>();
        availableFlights.put(2456, new Flight("Białystok",  "Lublin"));
        availableFlights.put(1282, new Flight("Lublin", "Poznań"));
        availableFlights.put(4785, new Flight("Szczecin", "Wrocław"));
        availableFlights.put(4268, new Flight("Kraków", "Częstochowa"));
        availableFlights.put(1254, new Flight("Częstochowa", "Wrocław"));

        return new HashMap<Integer, Flight>(availableFlights);
    }
}
