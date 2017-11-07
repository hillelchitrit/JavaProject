package com.example.hc.javaproject.model.entities;

/**
 * Created by HC on 06/11/2017.
 */

public class Car {
    /**********Attributes********/
    private  Branch parkBranch;
    private Models modelCar;
    private int km;
    private int idCar;


    /*************Constractor*********/
    public Car() {
        this.parkBranch = null;
        this.modelCar = null;
        this.km = 0;
        idCar = 0;
    }

    public Car(Branch parkBranch, Models modelCar, int km, int idCars) {
        this.parkBranch = parkBranch;
        this.modelCar = modelCar;
        this.km = km;
        idCar = idCars;
    }

    /**************Get/Set*************/
    public int getIdCars() {
        return idCar;
    }

    public void setIdCars(int idCars) {
        idCar = idCars;
    }

    public Branch getParkBranch() {
        return parkBranch;
    }

    public void setParkBranch(Branch parkBranch) {
        this.parkBranch = parkBranch;
    }

    public Models getModelCar() {
        return modelCar;
    }

    public void setModelCar(Models modelCar) {
        this.modelCar = modelCar;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}

