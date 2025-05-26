package com.uniwa.service;

import com.uniwa.core.dao.PerformanceDAO;
import com.uniwa.core.model.Performance;

public class PerformanceService {

    public Performance findPerformanceById(Long Id) {
        PerformanceDAO performanceDAO = new PerformanceDAO();
        return performanceDAO.findById(Id);
    }
}
