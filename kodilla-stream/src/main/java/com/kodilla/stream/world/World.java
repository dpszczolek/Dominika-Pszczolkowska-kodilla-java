package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private Set<Continent> continentsInTheWorld = new HashSet<>();

    public Set<Continent> getContinentsInTheWorld () {
        return continentsInTheWorld;
    }
    public void addContinents (Continent continent) {
        continentsInTheWorld.add(continent);
    }
    public BigDecimal getPeopleQuantity() {
        return continentsInTheWorld.stream()
                .flatMap(population -> population.getCountriesOnAContinent().stream())
                .map(Country::getCountryQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}
