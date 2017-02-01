package com.astontech.dao.mysql;

import com.astontech.bo.Phone;
import com.astontech.dao.PhoneDAO;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ericjohn1 on 7/7/2016.
 */
public class PhoneDAOImpl extends MySql implements PhoneDAO{


    @Override
    public Phone getPhoneById(int phoneId) {
        Connect();
        Phone phone = null; // not instansiated if no records returned we dont want to use memory
        try {
            String sp = "{call GetPhone(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_BY_ID);
            cStmt.setInt(2, phoneId);
            ResultSet rs = cStmt.executeQuery();

            if (rs.next()) {
                phone = HydrateObject(rs);
            }

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return phone;
    }


    @Override

        public List<Phone> getPhoneList() {

        Connect();
        List<Phone> phoneList = new ArrayList<Phone>();

        try {
            String sp = "{call GetPhone(?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, GET_COLLECTION);
            cStmt.setInt(2, 0);
            ResultSet rs = cStmt.executeQuery();

            while (rs.next()) {
                // add phone to list
                phoneList.add(HydrateObject(rs));
            }
        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return phoneList;
    }
    @Override
    public int insertPhone(Phone phone){
    Connect();
    int id = 0;
    try {
        String sp = "{call ExecPhone(?,?,?,?,?,?)}";
        CallableStatement cStmt = connection.prepareCall(sp);

        cStmt.setInt(1, INSERT);
        cStmt.setInt(2,0);
        cStmt.setInt(3,phone.getClientId());
        cStmt.setInt(4, phone.getAreaCode());
        cStmt.setInt(5, phone.getPhoneNumber());
        cStmt.setInt(6, phone.getPhoneNumberPost());

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
    public boolean updatePhone(Phone phone) {
        Connect();
        int id = 0;
        try {
            String sp = "{call ExecPhone(?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, UPDATE);
            cStmt.setInt(2, phone.getPhoneId());
            cStmt.setInt(3, phone.getClientId());
            cStmt.setInt(4, phone.getAreaCode());
            cStmt.setInt(5, phone.getPhoneNumber());
            cStmt.setInt(6, phone.getPhoneNumberPost());

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
    public boolean deletePhone(int phoneId) {Connect();
        int id = 0;
        try {
            String sp = "{call ExecPhone(?,?,?,?,?,?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, DELETE);
            cStmt.setInt(2, phoneId);
            cStmt.setInt(3,0);
            cStmt.setInt(4,0);
            cStmt.setInt(5,0);
            cStmt.setInt(6,0);

            ResultSet rs = cStmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return id > 0;

    }
    private static Phone HydrateObject(ResultSet rs) throws SQLException{

        Phone phone = new Phone();

        phone.setPhoneId(rs.getInt(1));
        phone.setClientId(rs.getInt(2));
        phone.setAreaCode(rs.getInt(3));
        phone.setPhoneNumber(rs.getInt(4));
        phone.setPhoneNumberPost(rs.getInt(5));

        return phone;

    }
}
