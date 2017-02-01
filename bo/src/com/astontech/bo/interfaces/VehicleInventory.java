package com.astontech.bo.interfaces;

/**
 * Created by ericjohn1 on 7/1/2016.
 */
    public class VehicleInventory implements ICarUsefulness {

    private int Seats;
    public String DriveType;
    public int TowingCapacity;
    public int MPG;

    //region Get/Set
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
        if(this.DriveType == "4wd")
        return true;
        else
        return false;}

     @Override
     public int towingCapacity(){
           return this.TowingCapacity;
        }

    @Override
    public int milesPerGallon(){
        return this.MPG;
    }

    @Override
    public String vehicleMake() {
        return null;
    }

    @Override
    public String vehicleModel() {
        return null;
    }

}












