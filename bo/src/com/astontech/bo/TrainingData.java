package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class TrainingData extends BaseBO {

    private int trainingDateId;
    private String trainingDataValue;
    private Date createDate;
    private String trainingName;

    private Training training;
    private EntityType entityType;
    private Employee employee;

    public TrainingData(){}

    public TrainingData(Date createDate){
        this.setCreateDate(createDate);
    }

    public int getTrainingDateId() {
        return trainingDateId;
    }

    public void setTrainingDateId(int trainingDateId) {
        this.trainingDateId = trainingDateId;
    }

    public String getTrainingDataValue() {
        return trainingDataValue;
    }

    public void setTrainingDataValue(String trainingDataValue) {
        this.trainingDataValue = trainingDataValue;
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

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
