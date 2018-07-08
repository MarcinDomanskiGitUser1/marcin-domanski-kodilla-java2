package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public final List <Continent> continentList = new ArrayList<>();

    public void addContinent (Continent continent) {
        continentList.add(continent);
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public BigDecimal getWorldPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getCountryPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
