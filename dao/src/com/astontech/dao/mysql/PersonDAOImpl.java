package com.astontech.dao.mysql;

import com.astontech.bo.Person;
import com.astontech.dao.PersonDAO;
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
public class PersonDAOImpl extends MySql implements PersonDAO {

    @Override
    public Person getPersonById(int personId) {
        Connect();
        Person person = null; // not instansiated if no records returned we dont want to use memory
        try {
            String sp = "{call GetPerson(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, personId);
            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                person = HydrateObject(rs);
            }

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return person;
    }

    @Override
        public List<Person> getPersonList() {
        Connect();
        List<Person> personList = new ArrayList<Person>();
        try {
            String sp = "{call GetPerson(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1,GET_COLLECTION);
            cStmt.setInt(2,0);
            ResultSet rs = cStmt.executeQuery();

            while(rs.next()){
                // add person to list
            personList.add(HydrateObject(rs));
            }
        }

        catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return personList;

    }

    @Override
    public int insertPerson(Person person) {
        Connect();
        int id = 0;
        try {
            //call ExecPerson(10,personId, firstName, middleName, lastName, birthDate, SSN);
            String sp = "{call ExecPerson(?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, INSERT);
            cStmt.setInt(2,0);
            cStmt.setString(3, person.getFirstName());
            cStmt.setString(4, person.getMiddleName());
            cStmt.setString(5, person.getLastName());
            cStmt.setDate(6, DateHelper.utilDateToSqlDate(person.getBirthDate()));
            cStmt.setString(7, person.getSSN());

            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        }   catch (SQLException sqlEx){
                logger.error(sqlEx);
            }

        return id;
    }

    @Override
    public boolean updatePerson(Person person) {
        Connect();
        int id = 0;
        try {
            //call ExecPerson(10,personId, firstName, middleName, lastName, birthDate, SSN);
            String sp = "{call ExecPerson(?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, UPDATE);
            cStmt.setInt(2,person.getPersonId());
            cStmt.setString(3, person.getFirstName());
            cStmt.setString(4, person.getMiddleName());
            cStmt.setString(5, person.getLastName());
            cStmt.setDate(6, DateHelper.utilDateToSqlDate(person.getBirthDate()));
            cStmt.setString(7, person.getSSN());

            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        }   catch (SQLException sqlEx){
            logger.error(sqlEx);
        }

        return id > 0;
    }

    @Override
    public boolean deletePerson(int personId) {
        Connect();
        int id = 0;
        try {
            //call ExecPerson(10,personId, firstName, middleName, lastName, birthDate, SSN);
            String sp = "{call ExecPerson(?,?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, DELETE);
            cStmt.setInt(2,personId);
            cStmt.setString(3, "");
            cStmt.setString(4, "");
            cStmt.setString(5,"");
            cStmt.setDate(6,new Date(0));
            cStmt.setString(7, "");

            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        }   catch (SQLException sqlEx){
            logger.error(sqlEx);
        }

        return id > 0;
    }

    private static Person HydrateObject(ResultSet rs) throws SQLException{

          /*
                    a.PersonId              index 1     INT
					a.FirstName,            index 2     Varchar
					a.MiddleName,           index 3     *
					a.LastName,             index 4     *
					a.BirthDate,            index 5     DateTime
					a.SocialSecurityNumber  index 6     VarChar
                    */
        //  hydrating an object
                    Person person = new Person();

                    person.setPersonId(rs.getInt(1));
                    person.setFirstName(rs.getString(2));
                    person.setMiddleName(rs.getString(3));
                    person.setLastName(rs.getString(4));
                    person.setBirthDate(rs.getDate(5));
                    person.setSSN(rs.getString(6));

            return person;
        }
    }








