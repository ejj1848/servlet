package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class LoyaltyCompany {

    private int loyaltyCompanyId;
    private  EntityType LoyaltyType;
    private String companyName;



    public LoyaltyCompany(String companyName){
        this.setLoyaltyType(new EntityType());
        this.setCompanyName(companyName);}

    public int getLoyaltyCompanyId() {
        return loyaltyCompanyId;
    }

    public void setLoyaltyCompanyId(int loyaltyCompanyId) {
        this.loyaltyCompanyId = loyaltyCompanyId;
    }



    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String FullLoyalty(){
        return this.companyName +" "+ this.loyaltyCompanyId;
    }

    public EntityType getLoyaltyType() {
        return LoyaltyType;
    }

    public void setLoyaltyType(EntityType loyaltyType) {
        LoyaltyType = loyaltyType;
    }
// endregion


}
