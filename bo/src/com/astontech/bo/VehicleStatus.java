package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class VehicleStatus extends BaseBO {


    private String notes;
    private Date createDate;

    private VehicleStatus vehicleStatus;
    private Vehicle vehicle;
    private EntityType entityType;

    public VehicleStatus(){};

    public VehicleStatus(int vehicleId)
    {this.setVehicle(vehicle);}



    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    public String Details (){
        return "Vehicle"+ " " + this.vehicle +":" + " " + this.notes;

    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }
}
