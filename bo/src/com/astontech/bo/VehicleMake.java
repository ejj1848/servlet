package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class VehicleMake extends BaseBO {

    private int vehicleMakeId;
    private String vehicleMakeName;
    private Date createDate;

    public VehicleMake(){};

    public VehicleMake(String vehicleMakeName)
    {this.setVehicleMakeName(vehicleMakeName);}

    public int getVehicleMakeId() {
        return vehicleMakeId;
    }

    public void setVehicleMakeId(int vehicleMakeId) {
        this.vehicleMakeId = vehicleMakeId;
    }

    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    public void setVehicleMakeName(String vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
