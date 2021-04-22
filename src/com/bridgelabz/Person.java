package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * addd person class to get name and set name using getter and setter method
 */
public class Person {
   public String firstName;
    public String lastName;
    public String address;
    public String state;
    public String city;
    public String email;
    public int zip;
    public int phoneNo;

    /**
     * used constructor of a class
     * @param firstName
     * @param lastName
     * @param address
     * @param state
     * @param city
     * @param email
     * @param zip
     * @param phoneNo
     */
    public Person(String firstName, String lastName, String address, String state, String city, String email, int zip, int phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.email = email;
        this.zip = zip;
        this.phoneNo = phoneNo;
    }

    /**
     * used display method to display data on console to client
     */
    public  void display() {
        System.out.println(" first name :"+firstName);
        System.out.println("last name :"+lastName);
        System.out.println("address is :"+address);
        System.out.println("state is: :"+state);
        System.out.println("city :"+city);
        System.out.println("emai id is:"+email);
        System.out.println("zip :"+zip);
        System.out.println("phone no :"+phoneNo);
    }

    /**
     *
     * @return it is getter nd setter method of a person class
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     *
     * @return override tostring method.
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", zip=" + zip +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
