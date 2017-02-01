package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */

    public class EntityType extends BaseBO{

   //region PROPERTIES


    private int entityTypeId;
    private String entityTypeName;
   //endregion

   //region Constructors

    public EntityType(){}
    public EntityType(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }


   // endregion

   //region Get/Set



    public int getEntityTypeId() {
        return entityTypeId;
    }

    public void setEntityTypeId(int entityTypeId) {
        this.entityTypeId = entityTypeId;
    }

    public String getEntityTypeName() {
        return entityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
    }
//endregion

    public String test_method(){
        return "sub method";
    }

}


