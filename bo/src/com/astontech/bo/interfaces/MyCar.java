package com.astontech.bo.interfaces;

/**
 * Created by ericjohn1 on 7/5/2016.
 */
public class MyCar implements ICarUsefulness {

    private String Make;
    private String Model;
    private int Seats;
    private String DriveType;
    private int TowingCapacity;
    private int MPG;


    //region get/set


    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int seats) {
        Seats = seats;
    }

    public String getDriveType() {
        return DriveType;
    }

    public void setDriveType(String driveType) {
        DriveType = driveType;
    }

    public int getTowingCapacity() {
        return TowingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        TowingCapacity = towingCapacity;
    }

    public int getMPG() {
        return MPG;
    }

    public void setMPG(int MPG) {
        this.MPG = MPG;
    }
    //endregion


    @Override
    public int numberOfSeats() {
        return this.Seats;
    }

    @Override
    public boolean fourWheelDrive() {
       if (this.DriveType == "4wd")
           return true;
       else
           return false;
    }

    @Override
    public int towingCapacity() {
        return this.TowingCapacity;
    }

    @Override
    public int milesPerGallon() {
        return MPG;
    }

    @Override
    public String vehicleMake() {
        return this.Make;
    }

    @Override
    public String vehicleModel() {
        return this.Model;
    }

}
