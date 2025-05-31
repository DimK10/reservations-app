package com.uniwa.core.dao;

import com.uniwa.core.model.BaseEntity;

import java.util.List;

// TODO add BaseEntity
public abstract class GenericDAO <T extends BaseEntity, ID> {

    private final Class<T> entityType;

    protected GenericDAO(Class<T> entityType) {
        this.entityType = entityType;
    }

    protected List<T> findAll() {
        // todo add implementation with serialization process
        return null;
    }
    protected T findById(ID id) {
        // todo add implementation with serialization process
        return null;
    }
    protected void save(T entity) {
        // todo add implementation with serialization process
    }
    protected T update(T oldEntity, T newEntity) {
        // todo add implementation with serialization process
        return null;
    }
    protected void delete(ID id) {
        // todo add implementation with serialization process
    }
}
