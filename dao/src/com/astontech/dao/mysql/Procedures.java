package com.astontech.dao.mysql;

/**
 * Created by ericjohn1 on 7/10/2016.
 */
public class Procedures {

   final static String getEmail = "{call GetEmail(?,?)}";

   final static String execEmail = "{call ExecEmail(?,?,?)}";

   final static String getEmployee = "{call GetEmployee(?,?)}";

   final static String execEmployee = "{call ExecEmployee(?,?,?,?,?)}";

   final static String getPerson = "{call GetPerson(?,?)}";

   final static String execPerson = "{call ExecPerson(?,?,?,?,?,?,?)}";

   final static String getPhone = "{call GetPhone(?,?)}";

   final static String execPhone = "{call ExecPhone(?,?,?,?,?)}";

   final static String getVehicle = "{call GetVehicle(?,?)}";

   final static String execVehicle = "{call ExecVehicle(?,?,?,?,?,?,?,?,?)}";

   final static String getVehicleMake = "{call GetVehicleMake (?,?)}";

   final static String execVehicleMake = "{call ExecVehicleMake(?,?,?)}";

   final static String getGetVehicleModel = "{call GetVehicleModel(?,?)}";

   final static String getExecVehicleModel= "{call ExecVehicleModel(?,?,?)}";

}
