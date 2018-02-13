package com.kodilla.good.patterns.airlines;

import java.util.Objects;

public class Flights {
    Airports departureAirport, arrivalAirport;

    public Flights (Airports departureAirport, Airports arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airports getDepartureAirport() {
        return departureAirport;
    }

    public Airports getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return departureAirport == flights.departureAirport &&
                arrivalAirport == flights.arrivalAirport;
    }

    @Override
    public int hashCode() {

        return Objects.hash(departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flights{" +
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                '}';
    }
}
