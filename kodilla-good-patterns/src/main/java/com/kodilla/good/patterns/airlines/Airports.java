package com.kodilla.good.patterns.airlines;

import java.util.*;

public class Airports {
    String airport;

    public Airports(String airport) {
        this.airport = airport;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airports airports = (Airports) o;
        return Objects.equals(airport, airports.airport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(airport);
    }

    public List<String> airports () {
        List<String> airports = new ArrayList<>();

        airports.add("Warsaw");
        airports.add("Berlin");
        airports.add("Porto");
        airports.add("Barcelona");
        airports.add("Reikjavik");
        airports.add("Oslo");
        airports.add("Amsterdam");
        airports.add("Paris");

        return airports;
    }

    @Override
    public String toString() {
        return airport;
    }
}
