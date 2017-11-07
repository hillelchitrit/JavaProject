package com.example.hc.javaproject.model.entities;

/**
 * Created by HC on 05/11/2017.
 */

public class Branch {
    /************Attributes***********/
    private Adresse adresse;
    private int parkingPlace;
    private int branchNumber;


    /************Constractor**********/
    public Branch() {
        this.adresse = null;
        this.parkingPlace = 0;
        this.branchNumber = 0;
    }

    public Branch(Adresse adresse, int parkingPlace, int branchNumber) {
        this.adresse = adresse;
        this.parkingPlace = parkingPlace;
        this.branchNumber = branchNumber;
    }

    /*************Get/Set*************/
    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public int getParkingPlace() {
        return parkingPlace;
    }

    public void setParkingPlace(int parkingPlace) {
        this.parkingPlace = parkingPlace;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }
}
