package com.uniwa.core.dao.impl;

import com.uniwa.core.dao.GenericDAO;
import com.uniwa.core.dao.ITheaterPerformanceDAO;
import com.uniwa.core.model.TheaterPerformance;

import java.util.List;

// Singleton
public class TheaterPerformanceDAOImpl extends GenericDAO<TheaterPerformance, Long> implements ITheaterPerformanceDAO {

    private static ITheaterPerformanceDAO INSTANCE;

    public static ITheaterPerformanceDAO getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TheaterPerformanceDAOImpl();
        }

        return INSTANCE;
    }

    private TheaterPerformanceDAOImpl() {
        super(TheaterPerformance.class);
    }

    @Override
    public List<TheaterPerformance> findAllTheaterPerformances() {
        return findAll();
    }

    @Override
    public TheaterPerformance findTheaterById(Long id) {
        return findById(id);
    }

    @Override
    public void saveTheaterPerformance(TheaterPerformance theaterPerformance) {
        save(theaterPerformance);
    }

    @Override
    public TheaterPerformance updateTheaterPerformance(TheaterPerformance oldTheaterPerformance, TheaterPerformance newTheaterPerformance) {
        return update(oldTheaterPerformance, newTheaterPerformance);
    }

    @Override
    public void deleteTheaterPerformance(Long id) {
        delete(id);
    }
}
