package com.uniwa.core.dao;

import com.uniwa.core.model.BaseEntity;

import java.util.List;

// TODO add BaseEntity
interface GenericDAO <T extends BaseEntity, ID> {

    List<T> findAll();
    T findById(ID id);
    void save(Class<T> entity);
    T update(T entity);
    void delete(ID id);
}
