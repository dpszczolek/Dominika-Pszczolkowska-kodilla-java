package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final String continent;
    private final Set<Country> countriesOnAContinent = new HashSet<>();

    public Continent(String continent) {
        this.continent = continent;
    }
    public Set<Country> getCountriesOnAContinent () {
        return countriesOnAContinent;
    }
    public void addCountries (Country country) {
        countriesOnAContinent.add(country);
    }
    public BigDecimal getCountriesQuantityInOneContinent() {
        return countriesOnAContinent.stream()
                .map(population -> population.getCountryQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
