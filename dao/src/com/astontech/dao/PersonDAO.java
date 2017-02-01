package com.astontech.dao;

import com.astontech.bo.Person;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface PersonDAO {

    // Get Methods

    public Person getPersonById(int personId);

    public List<Person> getPersonList();

    // Execute Methods

    public int insertPerson(Person person);
    public boolean updatePerson(Person person);
    public boolean deletePerson(int personId);

}
