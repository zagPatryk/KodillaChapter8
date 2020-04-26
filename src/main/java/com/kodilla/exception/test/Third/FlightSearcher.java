package com.kodilla.exception.test.Third;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airport1Destinations = new HashMap<>();
        airport1Destinations.put("airport2", true);
        airport1Destinations.put("airport3", true);

        Map<String, Boolean> airport2Destinations = new HashMap<>();
        airport2Destinations.put("airport1", false);
        airport2Destinations.put("airport3", true);

        if (flight.departureAirport == "airport1") {
            if (airport1Destinations.containsKey(flight.arrivalAirport)) {
                System.out.println(airport1Destinations.get(flight.arrivalAirport));
            } else {
                throw new RouteNotFoundException();
            }
        } else if (flight.departureAirport == "airport2") {
            if (airport2Destinations.containsKey(flight.arrivalAirport)) {
                System.out.println(airport2Destinations.get(flight.arrivalAirport));
            } else {
                throw new RouteNotFoundException();
            }
        } else {
            throw new RouteNotFoundException();
        }
    }
}
