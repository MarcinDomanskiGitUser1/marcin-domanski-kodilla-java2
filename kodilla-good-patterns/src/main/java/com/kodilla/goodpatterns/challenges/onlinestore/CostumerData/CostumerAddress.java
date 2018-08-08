package com.kodilla.goodpatterns.challenges.onlinestore.CostumerData;

public class CostumerAddress {

    private String street;
    private String houseNumber;
    private String city;
    private String postCode;

    public CostumerAddress(String street, String houseNumber, String city, String postCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }
    public String getHouseNumber() {
        return houseNumber;
    }
    public String getCity() {
        return city;
    }
    public String getPostCode() {
        return postCode;
    }
}
