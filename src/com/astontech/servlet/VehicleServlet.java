package com.astontech.servlet;

import com.astontech.bo.Vehicle;
import com.astontech.bo.VehicleMake;
import com.astontech.bo.VehicleModel;
import com.astontech.dao.VehicleDAO;
import com.astontech.dao.VehicleMakeDAO;
import com.astontech.dao.VehicleModelDAO;
import com.astontech.dao.mysql.VehicleDAOImpl;
import com.astontech.dao.mysql.VehicleMakeDAOImpl;
import com.astontech.dao.mysql.VehicleModelDAOImpl;
import common.helpers.DateHelper;
import common.helpers.ServletHelper;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ericjohn1 on 7/22/2016.
 */
public class VehicleServlet extends javax.servlet.http.HttpServlet {

    final static Logger logger = Logger.getLogger(VehicleServlet.class);
    private static VehicleDAO vehicleDAO = new VehicleDAOImpl();
    private static VehicleMakeDAO vehicleMakeDAO = new VehicleMakeDAOImpl();
    private static VehicleModelDAO vehicleModelDAO = new VehicleModelDAOImpl();


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
       // form data appears in the message body. value post will submit data to be Created, Deleted or Updated

       // 2 forms, insert/submit and update
        switch (request.getParameter("formName")) {

               case "submitVehicle": // Insert vehicle jsp form value
                submitVehicle(request);
                break;

               case "updateVehicle":
                    updateVehicle(request); // Update vehicle jsp form value ....todo: else if for button value
                    break;

               default:
                    break;
            }
            request.setAttribute("vehicleList", vehicleDAO.getVehicleList());
            request.setAttribute("selectVehicleModel", vehicleModelDAO.getVehicleModelList());
            request.setAttribute("selectVehicleMake", vehicleMakeDAO.getVehicleMakeList());
            request.getRequestDispatcher("./vehicle.jsp").forward(request, response);

        }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        // appended parameters are part of the URL , allows the form to access the lists/data

        request.setAttribute("vehicleList",vehicleDAO.getVehicleList());
        request.setAttribute("selectVehicleModel",vehicleModelDAO.getVehicleModelList());
        request.setAttribute("selectVehicleMake",vehicleMakeDAO.getVehicleMakeList());
        request.getRequestDispatcher("./vehicle.jsp").forward(request,response);
    }

    private static void submitVehicle(HttpServletRequest request){
        logger.info("Form #1 - Form Name="+ request.getParameter("formName"));
        ServletHelper.logRequestParams(request);

        Vehicle addVehicle = new Vehicle();  // create new Vehicle Object
        requestToVehicle(request,addVehicle);

        vehicleDAO.insertVehicle(addVehicle); // new dao Impl of insert the new vehicle object

        logger.info(addVehicle.toString());

        vehicleToRequest(request,addVehicle); // will persist information to send to request in the JSP
    }

    private static void updateVehicle(HttpServletRequest request){
        logger.info("Form #2 - Form Name=" + request.getParameter("formName"));
        ServletHelper.logRequestParams(request);


        Vehicle updateVehicle = vehicleDAO.getVehicleById(Integer.parseInt(request.getParameter("vehicleId")));
        requestToVehicle(request, updateVehicle);

        logger.info(updateVehicle.toString());
        if(request.getParameter("button").equals("updateVehicle")) {
            if (vehicleDAO.updateVehicle(updateVehicle))
                request.setAttribute("updateSuccessful", "Vehicle has been updated in the DB");
            else
                request.setAttribute("updateSuccessful", "Failure on Update");

        }
        else if(request.getParameter("button").equals("deleteVehicle")){
            if (vehicleDAO.deleteVehicle(updateVehicle.getVehicleId()))
                request.setAttribute("deleteSuccessful", "Vehicle has been deleted");
            else
                request.setAttribute("deleteSuccessful", " Error Deleting");

        }else
            System.out.println("Nothing Here: Voidness of the Mind");
    }

    private static void requestToVehicle(HttpServletRequest request, Vehicle vehicle) {
        // request object into a Vehicle Object
        vehicle.setYear(Integer.parseInt(request.getParameter("year")));
        vehicle.setLicensePlate(request.getParameter("licensePlate"));
        vehicle.setVin(request.getParameter("vin"));
        vehicle.setColor(request.getParameter("color"));
        vehicle.setVehicleModelId(Integer.parseInt(request.getParameter("selectVehicleModel")));
        vehicle.setVehicleMakeId(Integer.parseInt(request.getParameter("selectVehicleMake")));
    }

    private static void vehicleToRequest(HttpServletRequest request,Vehicle vehicle){
        // Vehicle object into a request
        request.setAttribute("year",vehicle.getYear());
        request.setAttribute("licensePlate", vehicle.getLicensePlate());
        request.setAttribute("vin", vehicle.getVin());
        request.setAttribute("color", vehicle.getColor());
        request.setAttribute("vehicleModelId", vehicle.getVehicleModelId());
        request.setAttribute("vehicleModel", vehicle.getVehicleModelName());
        request.setAttribute("vehicleMakeId",vehicle.getVehicleMakeId());
        request.setAttribute("vehicleMake", vehicle.getVehicleMakeName());
    }

}
