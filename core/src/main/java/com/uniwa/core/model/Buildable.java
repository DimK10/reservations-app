package com.uniwa.core.model;

public interface Buildable<T extends BaseEntity> {

    public T build();

}
