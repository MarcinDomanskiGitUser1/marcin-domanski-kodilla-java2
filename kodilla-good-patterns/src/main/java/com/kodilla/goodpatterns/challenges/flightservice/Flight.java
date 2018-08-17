package com.kodilla.goodpatterns.challenges.flightservice;

public final class  Flight {

    private final String arrivalAirport;
    private final String departureAirport;

    public Flight(final String departureAirport, final String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!arrivalAirport.equals(flight.arrivalAirport)) return false;
        return departureAirport.equals(flight.departureAirport);
    }

    @Override
    public int hashCode() {
        int result = arrivalAirport.hashCode();
        result = 31 * result + departureAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight {" +
                "departureAirport ='" + departureAirport + '\'' +
                ", arrivalAirport ='" + arrivalAirport + '\'' +
                '}';
    }
}
