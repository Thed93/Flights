package com.gridnine.testing.service;


import com.gridnine.testing.entity.Flight;

import java.util.List;



public interface FlightFilterBuilder {

    List<Flight> build();

    FlightFilterBuilder filterDepartureBeforeNow();

    FlightFilterBuilder filterArrivalBeforeDeparture();

    FlightFilterBuilder filterSumTimeOnGroundMoreThanTwoHours();
}