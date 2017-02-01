package com.astontech.dao.mysql;
import com.astontech.bo.Employee;
import com.astontech.dao.EmployeeDAO;
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
public class EmployeeDAOImpl extends MySql implements EmployeeDAO {

    @Override
    public Employee getEmployeeById(int employeeId) {
        Connect();
        Employee employee = null;
        try {
            String sp = "{call GetEmployee(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, employeeId);
            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                employee = HydrateObject(rs);
            }

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return employee;
    }

    @Override
    public List<Employee> getEmployeeList() {
        Connect();
        List<Employee> employeeList = new ArrayList<Employee>();
        try {
            String sp = "{call GetEmployee(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while (rs.next()) {
                // add person to list
                employeeList.add(HydrateObject(rs));
            }
        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return employeeList;
    }

    @Override
    public int insertPerson(Employee employee) {  Connect();
        int id = 0;
        try {

            String sp = "{call ExecEmployee(?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2, 0);
            cStmt.setDate(3, DateHelper.utilDateToSqlDate(employee.getHireDate()));
            cStmt.setDate(4, DateHelper.utilDateToSqlDate(employee.getTermDate()));
            cStmt.setString(5, employee.getFirstName());

            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id;
    }



        @Override
        public boolean updatePerson (Employee employee){
            Connect();
            int id = 0;
            try {

                String sp = "{call ExecEmployee(?,?,?,?,?)}";
                CallableStatement cStmt = connection.prepareCall(sp);

                cStmt.setInt(1, UPDATE);
                cStmt.setInt(2, employee.getEmployeeId());
                cStmt.setDate(3, DateHelper.utilDateToSqlDate(employee.getHireDate()));
                cStmt.setDate(4, DateHelper.utilDateToSqlDate(employee.getTermDate()));
                cStmt.setString(5, employee.getFirstName());

                ResultSet rs = cStmt.executeQuery();
                if (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (SQLException sqlEx) {
                logger.error(sqlEx);
            }

            return id > 0;

        }
        @Override
        public boolean deletePerson ( int employeeId){
            Connect();
            int id = 0;
            try {

                String sp = "{call ExecEmployee(?,?,?,?,?)}";
                CallableStatement cStmt = connection.prepareCall(sp);

                cStmt.setInt(1, UPDATE);
                cStmt.setInt(2, employeeId);
                cStmt.setDate(3, new Date(0));
                cStmt.setDate(4,  new Date(0));
                cStmt.setString(5,"");

                ResultSet rs = cStmt.executeQuery();
                if (rs.next()) {
                    id = rs.getInt(1);
                }
            } catch (SQLException sqlEx) {
                logger.error(sqlEx);
            }

            return id > 0;

        }

        private static Employee HydrateObject(ResultSet rs) throws SQLException{
            Employee employee = new Employee();

            employee.setEmployeeId(rs.getInt(1));
            employee.setHireDate(rs.getDate(2));
            employee.setTermDate(rs.getDate(3));
            employee.setFirstName(rs.getString(4));

            return employee;
        }
    }
