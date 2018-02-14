package com.kodilla.good.patterns.airlines;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlight {

    private Map<Integer, Flights> getMapOfFlights() {

        Map<Integer, Flights> flights = new HashMap<>();

        Flights f1 = new Flights(new Airports("Warsaw"), new Airports("Oslo"));
        Flights f2 = new Flights(new Airports("Oslo"), new Airports("Amsterdam"));
        Flights f3 = new Flights(new Airports("Warsaw"), new Airports("Paris"));
        Flights f4 = new Flights(new Airports("Berlin"), new Airports("Porto"));
        Flights f5 = new Flights(new Airports("Paris"), new Airports("Porto"));

        flights.put(1, f1);
        flights.put(2, f2);
        flights.put(3, f3);
        flights.put(4, f4);
        flights.put(5, f5);

        return flights;
    }

    public List<Airports> listOfArrivalAirports (Airports departurePort) {
        System.out.println("From " + departurePort + " you can fly to ");
        return getMapOfFlights().values().stream()
                .filter(city -> city.getDepartureAirport().equals(departurePort))
                .map(city -> city.arrivalAirport)
                .collect(Collectors.toList());
    }

    public List<Airports> listOfDepartureAirports (Airports arrivalPort) {
        System.out.println("To " + arrivalPort + " you can fly from ");
        return getMapOfFlights().values().stream()
                .filter(city -> city.getArrivalAirport().equals(arrivalPort))
                .map(city -> city.departureAirport)
                .collect(Collectors.toList());
    }

    public List<Airports> listOfViaAirports (Airports departurePort, Airports viaPort, Airports arrivalPort) {
        System.out.println("You can fly to " + arrivalPort + " from " + departurePort + " via ");
        return getMapOfFlights().values().stream()
            .filter(city -> city.getDepartureAirport().equals(departurePort) && city.getArrivalAirport().equals(viaPort) || city.getDepartureAirport().equals(viaPort) && city.getArrivalAirport().equals(arrivalPort))
            .map(city -> city.arrivalAirport)
            .collect(Collectors.toList());
    }
}
