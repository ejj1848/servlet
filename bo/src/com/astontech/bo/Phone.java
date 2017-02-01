package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Phone extends BaseBO {

    private int phoneId;
    private int areaCode;
    private int phoneNumber;
    private int phoneNumberPost;
    private int clientId;

    private EntityType PhoneType;
    private Client client;
    private Person person;




    public Phone(){
        this.PhoneType = new EntityType();
    }


    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public EntityType getPhoneType() {
        return PhoneType;
    }

    public void setPhoneType(EntityType phoneType) {
        PhoneType = phoneType;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumberPost() {
        return phoneNumberPost;
    }

    public void setPhoneNumberPost(int phoneNumberPost) {
        this.phoneNumberPost = phoneNumberPost;
    }

    public static boolean isNullOrEmpty(String s) {

        return s == null || s.length() == 0;
    }

    public String FullPhone(){
            return this.areaCode + "-" + this.phoneNumber;
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
