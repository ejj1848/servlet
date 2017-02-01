package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Training extends BaseBO {

    private int trainingDateId;
    private String trainingDateValue;
    private Date createDate;
    private String trainingName;

    private Training training;
    private EntityType entityType;
    private Employee employee;

    public Training() {
    }


    public int getTrainingDateId() {
        return trainingDateId;
    }

    public void setTrainingDateId(int trainingDateId) {
        this.trainingDateId = trainingDateId;
    }

    public String getTrainingDateValue() {
        return trainingDateValue;
    }

    public void setTrainingDateValue(String trainingDateValue) {
        this.trainingDateValue = trainingDateValue;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }
}

