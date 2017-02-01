package com.astontech.dao;

import com.astontech.bo.Vehicle;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface VehicleDAO {

    //get
    public Vehicle getVehicleById (int vehicleId);
    public List<Vehicle> getVehicleList();

    //execute
    public int insertVehicle (Vehicle vehicle);
    public boolean updateVehicle (Vehicle vehicle);
    public boolean deleteVehicle (int vehicleId);

}
