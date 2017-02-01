package com.astontech.dao.mysql;

import com.astontech.bo.Vehicle;
import com.astontech.bo.VehicleMake;
import com.astontech.bo.VehicleModel;
import com.astontech.dao.VehicleDAO;
import com.astontech.dao.VehicleMakeDAO;
import com.astontech.dao.VehicleModelDAO;
import common.helpers.DateHelper;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public class VehicleDAOImpl extends MySql implements VehicleDAO {

    @Override
    public Vehicle getVehicleById(int vehicleId) {
        Connect();
        Vehicle vehicle = null;

        try {
            String sp = "{call GetVehicle (?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, vehicleId);
            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                vehicle = HydrateObject(rs);
            }

            connection.close();

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return vehicle;

    }

    @Override
    public List<Vehicle> getVehicleList() {

        Connect();
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        try {
            String sp = "{call GetVehicle(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while (rs.next()) {
                // add person to list
                vehicleList.add(HydrateObject(rs));
            }

            connection.close();

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return vehicleList;
    }

    @Override
    public int insertVehicle(Vehicle vehicle) {
       Connect();
       int id = 0;
        try{
            String sp = "{call ExecVehicle(?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setInt(3, vehicle.getYear());
            cStmt.setString(4,vehicle.getLicensePlate());
            cStmt.setString(5, vehicle.getVin());
            cStmt.setString(6, vehicle.getColor());
            cStmt.setInt(7, vehicle.getVehicleModelId());


            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            connection.close();

        }   catch (SQLException sqlEx){
            logger.error(sqlEx);
        }

        return id;
        }


    @Override
    public boolean updateVehicle(Vehicle vehicle) {
        Connect();
        int id = 0;
        try{
            String sp = "{call ExecVehicle(?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, UPDATE);
            cStmt.setInt(2, vehicle.getVehicleId());
            cStmt.setInt(3, vehicle.getYear());
            cStmt.setString(4,vehicle.getLicensePlate());
            cStmt.setString(5, vehicle.getVin());
            cStmt.setString(6, vehicle.getColor());
            cStmt.setInt(7, vehicle.getVehicleModelId());


            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            connection.close();

        }   catch (SQLException sqlEx){
            logger.error(sqlEx);
        }

        return id > 0;
    }

    @Override
    public boolean deleteVehicle(int vehicleId) {
        Connect();
        int id = 0;
        try{
            String sp = "{call ExecVehicle(?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, DELETE);
            cStmt.setInt(2, vehicleId);
            cStmt.setInt(3, 0);
            cStmt.setString(4,"");
            cStmt.setString(5,"");
            cStmt.setString(6,"");
            cStmt.setInt(7, 0);

            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }

            connection.close();

        }   catch (SQLException sqlEx){
            logger.error(sqlEx);
        }

        return id > 0;
    }

    private Vehicle HydrateObject(ResultSet rs) throws SQLException {

        Vehicle vehicle = new Vehicle();
        VehicleMake make;
        VehicleModel model;

        try {
            vehicle.setVehicleId(rs.getInt(1));
            vehicle.setYear(rs.getInt(2));
            vehicle.setLicensePlate(rs.getString(3));
            vehicle.setVin(rs.getString(4));
            vehicle.setColor(rs.getString(5));
            vehicle.setVehicleModelId(rs.getInt(6));

            model = new VehicleModelDAOImpl().getVehicleModelById(vehicle.getVehicleModelId());
            vehicle.setVehicleModelName(model.getVehicleModelName());
            make = new VehicleMakeDAOImpl().getVehicleMakeById(model.getVehicleMakeId());
            model.setVehicleMakeName(make.getVehicleMakeName());

            vehicle.setVehicleMakeId(model.getVehicleMakeId());
            vehicle.setVehicleMakeName(model.getVehicleMakeName());

            } catch (Exception ex) {
        }
        return vehicle;
    }
}
