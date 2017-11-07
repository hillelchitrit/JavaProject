package com.example.hc.javaproject.model.entities;

/**
 * Created by HC on 06/11/2017.
 */

public class Models {
    /***************Attributes*************/
    private int code;
    private String compagnyName;
    private String modelName;
    private double motorCapacity;
    private GearBox gearBox;
    private String placeAuto;
    private int value;
    private int nbDoors;



    /*************Constractor***************/
    public Models() {
        this.code = 0;
        this.compagnyName = null;
        this.modelName = null;
        this.motorCapacity = 0;
        this.gearBox = null;
        this.placeAuto = null;
        this.value = 0;
        this.nbDoors = 0;
    }

    public Models(int code, String compagnyName, String modelName, double motorCapacity, GearBox gearBox, String placeAuto, int value, int nbDoors) {
        this.code = code;
        this.compagnyName = compagnyName;
        this.modelName = modelName;
        this.motorCapacity = motorCapacity;
        this.gearBox = gearBox;
        this.placeAuto = placeAuto;
        this.value = value;
        this.nbDoors = nbDoors;
    }

    /************Get/Set******************/
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCompagnyName() {
        return compagnyName;
    }

    public void setCompagnyName(String compagnyName) {
        this.compagnyName = compagnyName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getMotorCapacity() {
        return motorCapacity;
    }

    public void setMotorCapacity(double motorCapacity) {
        this.motorCapacity = motorCapacity;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public String getPlaceAuto() {
        return placeAuto;
    }

    public void setPlaceAuto(String placeAuto) {
        this.placeAuto = placeAuto;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNbDoors() {
        return nbDoors;
    }

    public void setNbDoors(int nbDoors) {
        this.nbDoors = nbDoors;
    }
}
