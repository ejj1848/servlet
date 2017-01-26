<%--
  Created by IntelliJ IDEA.
  User: ericjohn1
  Date: 7/22/2016
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <link rel="stylesheet" href="../../static/css/site.css">
    <title> Vehicle Lab </title>
</head>
<body>
    <div class="border">
        <form name="addVehicle" action="./vehicle" method="post">
            <input type="hidden" name="formName" value = "submitVehicle"/>

            <select title="FirstPart" name="selectVehicleMake">

                <option value='0'>(Select Vehicle Make)</option>

                <c:forEach var="vehicleMake" items="${selectVehicleMake}">

                    <option value="${vehicleMake.vehicleMakeId}">${vehicleMake.vehicleMakeName}</option>

                </c:forEach>
            </select>
            <br><br>

            <select title="vehicleModel" name="selectVehicleModel">

                <option value='0'>(Select Vehicle Model)</option>

                <c:forEach var="vehicleModel" items="${selectVehicleModel}">

                 <option value="${vehicleModel.vehicleModelId}">${vehicleModel.vehicleModelName}</option>

                </c:forEach>
            </select>

            <div>
            Plate: <input type="text" name="licensePlate" value= "${licensePlate}" placeholder="License Plate"/>
            </div>
            <div>
             VIN:  <input type="text" name ="vin" value= "${VIN}" placeholder="VIN"/>
            </div>
            <div>
             Year: <input type="text" name ="year" value= "${year}" placeholder="Year"/>
            </div>
            <tr>
             Color: <input type="text" name ="color" value= "${color}" placeholder="Color"/>
            </tr>

            <tr><button type="submit" value = "submitVehicle">  Add Vehicle </button></tr>

        </form>
    </div>

    ${updateSuccessful}
    ${deleteSuccessful}

    <div class = "update">
        <c:forEach var= "vehicle" items="${vehicleList}">
            <form name="updateVehicle" action="./vehicle" method="post">
            <input type="hidden" name="formName" value ="updateVehicle"/>
            <input type="hidden" name="vehicleId" value = "${vehicle.vehicleId}"/>
            <table>

                <tr>
                    <th> Plate </th>
                    <th> VIN </th>
                    <th> Year </th>
                    <th> Color </th>
                    <th> Make </th>
                    <th> Model </th>
                </tr>
                <tr>
                <td> <input type="text" name="licensePlate" value= "${vehicle.licensePlate}" placeholder="Plate"/></td>

                <td> <input type="text" name ="vin"value= "${vehicle.vin}" placeholder="VIN"/></td>

                <td> <input type="text" name ="year"value= "${vehicle.year}" placeholder="Year"/></td>

                <td> <input type="text" name ="color" value= "${vehicle.color}"placeholder="Color"/></td>

                <td>
                    <select name="selectVehicleMake">

                        <option>(Select Vehicle Make)</option>

                        <c:forEach var="vehicleMake" items="${selectVehicleMake}">
                            <c:choose>
                                <c:when test="${vehicleMake.vehicleMakeId == vehicle.vehicleMakeId}">
                                    <option selected value="${vehicleMake.vehicleMakeId}">${vehicleMake.vehicleMakeName}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value="${vehicleMake.vehicleMakeId}">${vehicleMake.vehicleMakeName}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>

                    </select>

                </td>
                <td>    <select title="vehicleModel" name="selectVehicleModel">

                    <option>(Select Vehicle Model)</option>

                    <c:forEach var= "vehicleModel" items="${selectVehicleModel}">

                        <c:choose>
                            <c:when test="${vehicleModel.vehicleModelId == vehicle.vehicleModelId}">
                                <option selected value="${vehicleModel.vehicleModelId}">${vehicleModel.vehicleModelName}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${vehicleModel.vehicleModelId}">${vehicleModel.vehicleModelName}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </select>
                </td>

                    <td> <button type="submit" name ="button" value="updateVehicle"> Update </button> </td>

                    <td> <button type="submit" name="button" value="deleteVehicle"> Delete </button>  </td>
                </tr>
            </form>
            </c:forEach>
            </table>
        </div>
</body>
</html>
