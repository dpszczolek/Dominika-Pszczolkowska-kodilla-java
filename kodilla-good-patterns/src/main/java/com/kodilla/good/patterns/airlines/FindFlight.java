package com.kodilla.good.patterns.airlines;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlight {

    public Map<Integer, Flights> getMapOfFlights() {
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

    public static void main(String[] args) {

        Airports port1 = new Airports("Warsaw");
        Airports port2 = new Airports("Porto");
        Airports port3 = new Airports("Paris");

        FindFlight findFlight = new FindFlight();

        List<Airports> listOfArrivalAirports = findFlight.getMapOfFlights().values().stream()
                .filter(city -> city.departureAirport.equals(port1))
                .map(city -> city.arrivalAirport)
                .collect(Collectors.toList());

        if (listOfArrivalAirports == null) {
            System.out.println("There are no flights from " + port1);
        } else {
            System.out.println("From " + port1 + " you can fly to " + listOfArrivalAirports);
        }

        List<Airports> listOfDepartureAirports = findFlight.getMapOfFlights().values().stream()
                .filter(city -> city.arrivalAirport.equals(port2))
                .map(city -> city.departureAirport)
                .collect(Collectors.toList());

        if (listOfDepartureAirports == null) {
            System.out.println("There are no flights to " + port2);
        } else {
            System.out.println("To " + port2 + " you can fly from " + listOfDepartureAirports);
        }

        List<Airports> listOfViaAirports = findFlight.getMapOfFlights().values().stream()
                .filter(city -> city.departureAirport.equals(port1) || city.arrivalAirport.equals(port2))
                .filter(city -> city.arrivalAirport.equals(port3))
                .map(city -> city.arrivalAirport)
                .collect(Collectors.toList());

        if (listOfViaAirports == null) {
            System.out.println("There is no possible flight via " + port3);
        } else {
            System.out.println("You can fly to " + port2 + " from " + port1 + " via " + listOfViaAirports);
        }

    }
}
