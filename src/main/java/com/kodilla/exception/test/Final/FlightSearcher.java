package com.kodilla.exception.test.Final;

import java.util.ArrayList;
import java.util.List;

public class FlightSearcher {
    private int flightsNumber = 1;
    private List<Airport> previousAirports = new ArrayList<>();

    public boolean flightSearcher(Airport departureAirport, Airport destinationAirport) {

        if (departureAirport.getAllowedDestinations().contains(destinationAirport)) {
            return true;
        } else {
            previousAirports.add(departureAirport);
            for(Airport airport : departureAirport.getAllowedDestinations()) {
                flightsNumber++;
                if (!previousAirports.contains(airport)) {
                    if (flightSearcher(airport, destinationAirport)) {
                        return true;
                    }
                } flightsNumber--;
            }
        }
        return false;
    }

    public int getFlightsNumber() {
        return flightsNumber;
    }
}

