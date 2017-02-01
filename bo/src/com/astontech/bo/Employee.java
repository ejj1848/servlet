package com.astontech.bo;

import java.util.Date;
import java.util.List;

/**
 * Created by ericjohn1 on 6/27/2016.
 */
public class Employee extends Person {

    //Parameters
    private int EmployeeId;
    private Date HireDate;
    private Date TermDate;
    private String FirstName;



    // Constructors

    public Employee(){}

    public Employee(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);

    }

    public Employee(int employeeId, String firstName){
        this.setFirstName(firstName);

    }

    public Employee (String lastName){
        this.setLastName(lastName);

    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }
    public int getEmployeeId()
    {
        return this.EmployeeId;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }
    public Date getHireDate(){return HireDate;}

    public void setTermDate(Date TermDate) { TermDate= TermDate;}
    public Date getTermDate(){return TermDate;}



}

