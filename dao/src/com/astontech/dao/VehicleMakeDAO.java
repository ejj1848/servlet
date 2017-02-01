package com.astontech.dao;

import com.astontech.bo.VehicleMake;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface VehicleMakeDAO {

    //get
    public VehicleMake getVehicleMakeById (int vehicleMakeId);
    public List<VehicleMake> getVehicleMakeList();

    //execute
    public int insertVehicleMake (VehicleMake vehicleMake);
    public boolean updateVehicleMake (VehicleMake vehicleMake);
    public boolean deleteVehicleMake (int vehicleMakeId);
}
