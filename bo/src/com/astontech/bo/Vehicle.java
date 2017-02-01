package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Vehicle extends VehicleModel implements Comparable {


    private int vehicleId;
    private int year;
    private String licensePlate;
    private String vin;
    private String color;
    private int vehicleModelId;


    public Vehicle(){}


    //region get/set

    public int getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(int vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



   //region custom methods
    public static boolean isNullOrEmpty(String s) {

        return s == null || s.length() == 0;}

    public String Color () {
        if (isNullOrEmpty(this.color))
            return "No Values Set";

        else {
            return this.color;
        }

    }
    //endregion
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

