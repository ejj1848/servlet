package com.astontech.dao;

import com.astontech.bo.Email;

import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public interface EmailDAO {

    //get
    public Email getEmailById (int emailId);
    public List<Email> getEmailList();

    //execute

    public int insertEmail (Email email);
    public boolean updateEmail (Email email);
    public boolean deleteEmail (int emailId);
}
