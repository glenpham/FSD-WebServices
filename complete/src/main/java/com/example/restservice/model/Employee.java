package com.example.restservice.model;

import com.example.restservice.service.EmployeeService;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private Address address;
    private String phoneNumber;

    public Employee(){

    }

    public Employee(int id, String fname, String lname, Address address, String phoneNumber) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", address=" + address +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
