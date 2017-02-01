package com.astontech.bo.interfaces;

/**
 * Created by ericjohn1 on 6/30/2016.
 */
public class Site implements ILocation {

    private int ConferenceRooms;
    private int Offices;
    private int Cubicles;
    private int TrainingDesks;
    private int CoffeeMachines;
    private String  SiteName;

// region get/set
    public int getConferenceRooms() {
        return ConferenceRooms;
    }

    public void setConferenceRooms(int conferenceRooms) {
        ConferenceRooms = conferenceRooms;
    }

    public int getOffices() {
        return Offices;
    }

    public void setOffices(int offices) {
        Offices = offices;
    }

    public int getCubicles() {
        return Cubicles;
    }

    public void setCubicles(int cubicles) {
        Cubicles = cubicles;
    }

    public int getTrainingDesks() {
        return TrainingDesks;
    }

    public void setTrainingDesks(int trainingDesks) {
        TrainingDesks = trainingDesks;
    }

    public int getCoffeeMachines() {
        return CoffeeMachines;
    }

    public void setCoffeeMachines(int coffeeMachines) {
        CoffeeMachines = coffeeMachines;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }
    //endregion


    @Override
    public int numberOfWorkSpaces(){
        return (this.Cubicles + this.Offices + this.TrainingDesks);
    }

    @Override
    public boolean canHaveMeetings(){
        if (this.ConferenceRooms > 0)
                return true;
        else
                return false;
    }

    @Override
    public String getLocationName(){
        return this.SiteName;
    }

    @Override
    public boolean hasCoffee(){
        if (this.CoffeeMachines >0)
            return true;
        else
            return false;
    }
}
