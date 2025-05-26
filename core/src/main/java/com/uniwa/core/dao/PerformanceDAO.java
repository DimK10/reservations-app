package com.uniwa.core.dao;

import com.uniwa.core.model.Performance;

import java.util.ArrayList;
import java.util.List;

public class PerformanceDAO implements GenericDAO<Performance, Long>{
    @Override
    public List<Performance> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Performance findById(Long aLong) {
        return new Performance();
    }

    @Override
    public void save(Class<Performance> entity) {

    }

    @Override
    public Performance update(Performance entity) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
