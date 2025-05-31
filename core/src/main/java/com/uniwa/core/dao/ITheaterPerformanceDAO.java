package com.uniwa.core.dao;

import com.uniwa.core.model.TheaterPerformance;

import java.util.ArrayList;
import java.util.List;

public interface ITheaterPerformanceDAO {

    List<TheaterPerformance> findAllTheaterPerformances();

    TheaterPerformance findTheaterById(Long id);

    void saveTheaterPerformance(TheaterPerformance theaterPerformance);

    TheaterPerformance updateTheaterPerformance(
           TheaterPerformance oldTheaterPerformance
           , TheaterPerformance newTheaterPerformance
   );

    void deleteTheaterPerformance(Long id);
}
