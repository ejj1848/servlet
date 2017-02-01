package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Email extends BaseBO {
// region Properties
    private int emailId;
    private String emailAddress;
    private EntityType EmailType;

// endregion

//region Constructor
    public Email(){
        this.setEmailType(new EntityType());
    }

    public Email(String emailAddress){
        this.setEmailType(new EntityType());
        this.setEmailAddress(emailAddress);

    }
// endregion

// region Get/Set

    public int getEmailId() {
        return emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public EntityType getEmailType() {
        return EmailType;
    }

    public void setEmailType(EntityType emailType) {
        EmailType = emailType;
    }


// endregion



}
