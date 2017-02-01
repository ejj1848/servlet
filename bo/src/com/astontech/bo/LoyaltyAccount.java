package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class LoyaltyAccount extends BaseBO {
    private int loyaltyAccountId;
    private String memberName;

    private LoyaltyCompany loyaltyCompany;
    private Employee employee;

    public LoyaltyAccount(){}

    public LoyaltyAccount(String memberName){
        this.setMemberName(memberName);
    }


    public int getLoyaltyAccountId() {
        return loyaltyAccountId;
    }

    public void setLoyaltyAccountId(int loyaltyAccountId) {
        this.loyaltyAccountId = loyaltyAccountId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public LoyaltyCompany getLoyaltyCompany() {
        return loyaltyCompany;
    }

    public void setLoyaltyCompany(LoyaltyCompany loyaltyCompany) {
        this.loyaltyCompany = loyaltyCompany;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
