package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> mapOfAvailableAirports = new HashMap<String, Boolean>();
        mapOfAvailableAirports.put("Lodz", false);
        mapOfAvailableAirports.put("Wroclaw", false);
        mapOfAvailableAirports.put("Poznan", true);
        mapOfAvailableAirports.put("Gdynia", true);

        if ((!mapOfAvailableAirports.containsKey(flight.getArrivalAirport())))
            throw new RouteNotFoundException("Flight not found");
        else {
            if (mapOfAvailableAirports.get(flight.getArrivalAirport()))
                System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available ");
            else
                System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is not available ");
        }
    }
}
