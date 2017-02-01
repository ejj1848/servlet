package com.astontech.bo;

/**
 * Created by ericjohn1 on 6/28/2016.
 */
public class Entity extends BaseBO {

    private int entityId;
    private String entityName;

    public Entity(){}

    public Entity(String entityName) {
        this.entityName = entityName;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
}
