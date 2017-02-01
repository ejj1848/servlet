package com.astontech.bo;

import java.util.Date;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class ReviewData extends BaseBO {

    private int reviewDataId;
    private String reviewDataValue;
    private Date createDate;

    private Review review;
    private EntityType entityType;

    public ReviewData(){}

    public int getReviewDataId() {
        return reviewDataId;
    }

    public void setReviewDataId(int reviewDataId) {
        this.reviewDataId = reviewDataId;
    }

    public String getReviewDataValue() {
        return reviewDataValue;
    }

    public void setReviewDataValue(String reviewDataValue) {
        this.reviewDataValue = reviewDataValue;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }
}
