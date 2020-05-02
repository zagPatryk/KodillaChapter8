package com.kodilla.exception.test.Final;

public class FlightSearcher {
    private int flightsNumber = 1;
    public boolean flightSearcher(Airport departureAirport, Airport destinationAirport) throws RouteNotFoundException {

        if (departureAirport.getAllowedDestinations().contains(destinationAirport)) {
            return true;
        } else {
            for(Airport airport : departureAirport.getAllowedDestinations()) {
                flightsNumber++;
                if (flightSearcher(airport, destinationAirport)) {
                    return true;
                } flightsNumber--;
            }
        }
        return false;
    }

    public int getFlightsNumber() {
        return flightsNumber;
    }
}

