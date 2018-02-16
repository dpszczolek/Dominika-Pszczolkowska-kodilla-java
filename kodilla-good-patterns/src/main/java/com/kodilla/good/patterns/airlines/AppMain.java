package com.kodilla.good.patterns.airlines;

public class AppMain {
    public static void main(String[] args) {

        Airports departurePort = new Airports("Warsaw");
        Airports arrivalPort = new Airports("Porto");
        Airports viaPort = new Airports("Paris");

        FindFlight findFlight = new FindFlight();

        System.out.println(findFlight.listOfArrivalAirports(departurePort));
        System.out.println(findFlight.listOfDepartureAirports(arrivalPort));
        System.out.println(findFlight.listOfViaAirports(departurePort, viaPort, arrivalPort));
    }
}
