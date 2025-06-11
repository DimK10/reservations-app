package com.uniwa.service.impl;

import com.uniwa.core.dao.ITheaterPerformanceDAO;
import com.uniwa.core.dao.impl.TheaterPerformanceDAOImpl;
import com.uniwa.core.model.TheaterPerformance;
import com.uniwa.service.ITheaterPerformanceService;

// singleton
public class TheaterPerformanceServiceImpl implements ITheaterPerformanceService {
    private static ITheaterPerformanceService INSTANCE;

    private ITheaterPerformanceDAO theaterPerformanceDAO;

    public static ITheaterPerformanceService getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TheaterPerformanceServiceImpl();
        }

        return INSTANCE;
    }

    private TheaterPerformanceServiceImpl() {
        super();
        this.theaterPerformanceDAO = TheaterPerformanceDAOImpl.getInstance();
    }

    @Override
    public void saveTheaterPerformance(TheaterPerformance theaterPerformance) {
        this.theaterPerformanceDAO.saveTheaterPerformance(theaterPerformance);
    }
}
