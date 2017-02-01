package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class ClientContact extends Client {
    private int clientContactId;
    private Client client;
    private EntityType ClientType;
    private Person person;



    public ClientContact(){}

    public ClientContact(int clientContactId, int clientId, int personId, int entityTypeId) {
        this.clientContactId = clientContactId;


    }

    public int getClientContactId() {
        return clientContactId;
    }

    public void setClientContactId(int clientContactId) {
        this.clientContactId = clientContactId;
    }



    public EntityType getClientType() {
        return ClientType;
    }

    public void setClientType(EntityType clientType) {
        ClientType = clientType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
