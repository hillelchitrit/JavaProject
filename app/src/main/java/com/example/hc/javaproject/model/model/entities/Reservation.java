package com.example.hc.javaproject.model.entities;

/**
 * Created by HC on 06/11/2017.
 */

public class Reservation {
    /************Attributes*************/
    private int numberClient;
    private boolean isReserved;
    private int idCar;
    private String beginRental;
    private String endRental;
    private int startKm;
    private int endKm;
    private double priceFinal;
    private int idReservation;
    private boolean isFilled;
    private double numberLiterFilled;



    public Reservation(int numberClient, boolean isReserved, int idCar, String beginRental,
                       String endRental, int startKm, int endKm, double priceFinal,
                       int idReservation,boolean isFilled,double numberLiterFilled) {
        this.numberClient = numberClient;
        this.isReserved = isReserved;
        this.idCar = idCar;
        this.beginRental = beginRental;
        this.endRental = endRental;
        this.startKm = startKm;
        this.endKm = endKm;
        this.priceFinal = priceFinal;
        this.idReservation = idReservation;
        this.isFilled=isFilled;
        this.numberLiterFilled=numberLiterFilled;

    }

    public Reservation() {
        this.numberClient = 0;
        this.isReserved = true;
        this.idCar = 0;
        this.beginRental = null;
        this.endRental = null;
        this.startKm = 0;
        this.endKm = 0;
        this.priceFinal = 0;
        this.idReservation = 0;
        this.isFilled=false;
        this.numberLiterFilled=0;
    }

    /*************Get/Set**************/
    public int getNumberClient() {
        return numberClient;
    }

    public void setNumberClient(int numberClient) {
        this.numberClient = numberClient;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getBeginRental() {
        return beginRental;
    }

    public void setBeginRental(String beginRental) {
        this.beginRental = beginRental;
    }

    public String getEndRental() {
        return endRental;
    }

    public void setEndRental(String endRental) {
        this.endRental = endRental;
    }

    public int getStartKm() {
        return startKm;
    }

    public void setStartKm(int startKm) {
        this.startKm = startKm;
    }

    public int getEndKm() {
        return endKm;
    }

    public void setEndKm(int endKm) {
        this.endKm = endKm;
    }

    public double getPriceFinal() {
        return priceFinal;
    }

    public void setPriceFinal(double priceFinal) {
        this.priceFinal = priceFinal;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public double getNumberLiterFilled() {
        return numberLiterFilled;
    }

    public void setNumberLiterFilled(double numberLiterFilled) {
        this.numberLiterFilled = numberLiterFilled;
    }

    /**************Methods**********/
   public double numberLiterFilled(){
       if(isFilled)
           return getNumberLiterFilled();
       else
           return 0;
   }
}
