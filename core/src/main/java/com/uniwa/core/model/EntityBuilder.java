package com.uniwa.core.model;

public abstract class EntityBuilder<T extends BaseEntity, B extends EntityBuilder<T, B>> implements Buildable<T> {
    protected abstract B self();
    
    public abstract T build();
}