package com.kodilla.goodpatterns.challenges.onlinestore.CostumerData;

public class Costumer {

    private String name;
    private String surname;
    private String eMail;
    private CostumerAddress costumerAddress;

    public Costumer(String name, String surname, String eMail, CostumerAddress costumerAddress) {
        this.name = name;
        this.surname = surname;
        this.eMail = eMail;
        this.costumerAddress = costumerAddress;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String geteMail() {
        return eMail;
    }
    public CostumerAddress getCostumerAddress() {
        return costumerAddress;
    }
}
