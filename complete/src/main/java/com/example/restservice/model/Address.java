package com.example.restservice.model;

public class Address {
    private int streetNum;
    private String street;
    private String codePostal;

    public Address(){

    }

    public Address(int streetNum, String street, String codePostal) {
        this.streetNum = streetNum;
        this.street = street;
        this.codePostal = codePostal;
    }

    public int getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(int streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetNum=" + streetNum +
                ", street='" + street + '\'' +
                ", codePostal='" + codePostal + '\'' +
                '}';
    }
}
