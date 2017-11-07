package com.example.hc.javaproject.model.entities;

/**
 * Created by HC on 05/11/2017.
 */

public class Client {
    /*************Attributes****************/
    private String firstName;
    private String lastName;
    private int id;
    private int phone;
    private String mail;
    private int creditCard;

    /*************constractor**********/
    public Client(String firstName, String lastName, int id, int phone, String mail, int creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phone = phone;
        this.mail = mail;
        this.creditCard = creditCard;
    }
    public Client() {
        this.firstName = "";
        this.lastName = "";
        this.id = 0;
        this.phone = 0;
        this.mail = "";
        this.creditCard = 0;
    }


    /**************Get/Set**************/
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }
}
