package com.kodilla.exception.test.Final;


import static com.kodilla.exception.test.Final.FlightSearcherBase.*;

public class Runner {
    public static void main(String args[]) throws RouteNotFoundException{
        warsaw.setAllowedDestinations(warsawAllowedDestinations);
        berlin.setAllowedDestinations(berlinAllowedDestinations);
        london.setAllowedDestinations(londonAllowedDestinations);
        newYork.setAllowedDestinations(newYorkAllowedDestinations);
        rio.setAllowedDestinations(rioAllowedDestinations);
        tokyo.setAllowedDestinations(tokyoAllowedDestinations);
        moscow.setAllowedDestinations(moscowAllowedDestinations);

        FlightSearcher flightSearcher = new FlightSearcher();
        boolean result = false;

        try {
            result = flightSearcher.flightSearcher(warsaw, rio);
            if (!result) {
                throw new RouteNotFoundException();
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Nie ma takiego połączenia");
        }

        if (result) {
            System.out.println("Dolecisz wykonując " + flightSearcher.getFlightsNumber() + " lotów");
        }
    }
}
