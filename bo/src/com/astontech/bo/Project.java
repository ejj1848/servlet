package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Project {
    private int projectId;
    private int rate;
    private Date startDate;
    private Date endDate;
    private String projectName;

    private Client client;
    private EntityType ProjectType;

    public Project(String projectName){
        this.setProjectType(new EntityType());
        this.setProjectName(projectName);}

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public EntityType getProjectType() {
        return ProjectType;
    }

    public void setProjectType(EntityType projectType) {
        ProjectType = projectType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
