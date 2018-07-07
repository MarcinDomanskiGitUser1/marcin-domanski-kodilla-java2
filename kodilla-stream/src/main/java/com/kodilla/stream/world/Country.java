package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String countryName;
    private final BigDecimal countryPeopleQuantity;

    public Country(final String countryName, final BigDecimal countryPeopleQuantity) {
        this.countryName = countryName;
        this.countryPeopleQuantity = countryPeopleQuantity;
    }

    public BigDecimal getCountryPeopleQuantity() {
        return countryPeopleQuantity;
    }
}
