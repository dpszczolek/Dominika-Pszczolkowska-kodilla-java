package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    Map<String, Boolean> possibleFlights = new HashMap<String, Boolean>();

    public FindFlight(Flight flight) {
        possibleFlights.put("Berlin", true);
        possibleFlights.put("Porto", true);
        possibleFlights.put("Bangkok", false);
        possibleFlights.put("Rome", true);
        possibleFlights.put("London", false);
    }

    public static void main(String[] args) throws RouteNotFoundException {
        Flight example = new Flight("Warsaw", "Berlin");
        FindFlight findFlight = new FindFlight(example);
        Boolean value = findFlight.possibleFlights.get(example.arrivalAirport);
        if (value.equals(true)) {
            System.out.println("Your flight is possible");
        } else {
            try {
                throw new RouteNotFoundException();
            } catch (RouteNotFoundException e) {
                System.out.println("You can't fly to " + example.arrivalAirport + ".");
            } finally {
                System.out.println("Your search has completed.");
            }
        }
    }
}