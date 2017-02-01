package com.astontech.bo;

import common.helpers.StringHelper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ericjohn1 on 6/27/2016.
 */
public class Person extends BaseBO implements Serializable {
    //region Properties
    //PersonId
    private int PersonId;
    //Title
    private String Title;
    //FirstName
    private String FirstName;
    // Middle
    private String MiddleName;
    //LastName
    private String LastName;
    //DisplayFirstName
    private String DisplayFirstName;
    //Gender
    private String Gender;

    private Date BirthDate;

    private transient String SSN;

    private List<Email>Emails;


    //endregion

    //region Constructors
    public Person() {
        this.Emails = new ArrayList<>();
    }



    //endregion

    //region Get/Set

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int personId) {
        PersonId = personId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getDisplayFirstName() {
        return DisplayFirstName;
    }

    public void setDisplayFirstName(String displayFirstName) {
        DisplayFirstName = displayFirstName;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public List<Email> getEmails() {
        return Emails;
    }

    public void setEmails(List<Email> emails) {
        Emails = emails;
    }

    public String getGender() {
        return this.Gender;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }
    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }


// endregion

    //region Custom Methods
    public String ToString(){

        return "PersonID ="+ this.PersonId+ "FullName ="+ this.GetFullName()+" DOB = " +this.getBirthDate() + "SSN: "+ this.SSN;
    }

    public String GetFullName() {
        if (StringHelper.isNullOrEmpty(this.FirstName) && StringHelper.isNullOrEmpty(this.LastName))
            return "No Name Set";
        else {
            if (StringHelper.isNullOrEmpty(this.FirstName))
                return this.getLastName();
            else if (StringHelper.isNullOrEmpty(this.LastName))
                return this.FirstName;
            else
                return this.FirstName + " " + this.LastName;
        }
    }

}