package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private final String countryName;
    private final BigDecimal countryQuantity;

    public Country(String countryName, BigDecimal countryQuantity) {
        this.countryName = countryName;
        this.countryQuantity = countryQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getCountryQuantity() {
        return countryQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(countryName);
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryQuantity=" + countryQuantity +
                '}';
    }
}


