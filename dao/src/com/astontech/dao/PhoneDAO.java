package com.astontech.dao;

import com.astontech.bo.Phone;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface PhoneDAO {

    // get methods
    public Phone getPhoneById (int phoneId);

    public List<Phone> getPhoneList();

    //set methods

    public int insertPhone(Phone phone);
    public boolean updatePhone(Phone phone);
    public boolean deletePhone(int phoneId);
}
