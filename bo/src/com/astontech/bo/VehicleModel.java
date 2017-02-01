package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class VehicleModel extends VehicleMake {

    private int vehicleModelId;
    private String vehicleModelName;
    private int vehicleMakeId;


    private VehicleMake vehicleMake;
    public VehicleModel(){};

    public VehicleModel(String vehicleModelName)
    {this.setVehicleModelName(vehicleModelName);}

    public VehicleModel(VehicleMake vehicleMake, String vehicleModelName) {
        this.vehicleMake = vehicleMake;
        this.vehicleModelName = vehicleModelName;
    }

    public int getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(int vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }

    public int getVehicleMakeId() {
        return vehicleMakeId;
    }

    public void setVehicleMakeId(int vehicleMakeId) {
        this.vehicleMakeId = vehicleMakeId;
    }


    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public VehicleMake getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(VehicleMake vehicleMake) {
        this.vehicleMake = vehicleMake;
    }


}
