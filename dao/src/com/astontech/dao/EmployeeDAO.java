package com.astontech.dao;

import com.astontech.bo.Employee;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface EmployeeDAO {

    //Get Methods
    public Employee getEmployeeById (int employeeId);

    public List<Employee> getEmployeeList();


    //Execute Methods

    public int insertPerson(Employee employee);
    public boolean updatePerson(Employee employee);
    public boolean deletePerson(int employeeId);

}
