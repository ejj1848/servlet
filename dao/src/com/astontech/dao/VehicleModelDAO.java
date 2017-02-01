package com.astontech.dao;

import com.astontech.bo.Vehicle;
import com.astontech.bo.VehicleModel;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface VehicleModelDAO {

    //get
    public VehicleModel getVehicleModelById (int vehicleModelId);
    public List<VehicleModel> getVehicleModelList ();

    //execute
    public int insertVehicleModel (VehicleModel vehicleModel);
    public boolean updateVehicleModel (VehicleModel vehicleModel);
    public boolean deleteVehicleModel (int vehicleModelId);

}
