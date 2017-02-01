package com.astontech.bo;

import javax.print.attribute.standard.Chromaticity;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Address extends BaseBO {

    private int AddressId;
    private Client client;
    private Person person;
    private EntityType AddressType;
    private String AddressNumber;
    private String  Street;
    private String  StreetTwo;
    private String  City;

    public Address(){

    this.AddressType = new EntityType();
    }


//region Get/Set

    public int getAddressId() {
        return AddressId;
    }

    public void setAddressId(int addressId) {
        AddressId = addressId;
    }



    public EntityType getAddressType() {
        return AddressType;
    }

    public void setAddressType(EntityType addressType) {
        AddressType = addressType;
    }

    public String getAddressNumber() {
        return AddressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        AddressNumber = addressNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getStreetTwo() {
        return StreetTwo;
    }

    public void setStreetTwo(String streetTwo) {
        StreetTwo = streetTwo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
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


//endregion






}

