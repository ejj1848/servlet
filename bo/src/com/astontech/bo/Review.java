package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Review extends BaseBO {
    private int reviewId;
    private Employee employee;
    private String reviewName;
    private Date reviewDate;

    public Review(){}

    public Review(String reviewName){
        this.setReviewName(reviewName);
    }


    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
