package com.astontech.bo;

import java.util.Date;
import java.util.List;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Client extends BaseBO {
    private int clientId;
    private String clientName;
    private Date createDate;
    private List<ClientContact> clientContacts;

    public Client() {
    }

    public Client(int clientId, String clientName) {
        this.clientId = clientId;
        this.clientName = clientName;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<ClientContact> getClientContacts() {
        return clientContacts;
    }

    public void setClientContacts(List<ClientContact> clientContacts) {
        this.clientContacts = clientContacts;
    }
}



