package com.kodilla.goodpatterns.challenges.flightservice;

public final class  Flight {

    private final String arrivalAirport;
    private final String acrossAirport;
    private final String departureAirport;

    public Flight(final String arrivalAirport, final String acrossAirport, final String departureAirport) {
        this.arrivalAirport = arrivalAirport;
        this.acrossAirport = acrossAirport;
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public String getAcrossAirport() {
        return acrossAirport;
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
        if (!acrossAirport.equals(flight.acrossAirport)) return false;
        return departureAirport.equals(flight.departureAirport);
    }

    @Override
    public int hashCode() {
        int result = arrivalAirport.hashCode();
        result = 31 * result + acrossAirport.hashCode();
        result = 31 * result + departureAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arrivalAirport='" + arrivalAirport + '\'' +
                ", acrossAirport='" + acrossAirport + '\'' +
                ", departureAirport='" + departureAirport + '\'' +
                '}';
    }
}
