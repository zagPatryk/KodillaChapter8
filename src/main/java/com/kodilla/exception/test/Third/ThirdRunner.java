package com.kodilla.exception.test.Third;

public class ThirdRunner {
    public static void main(String args[]) {
        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            flightSearcher.findFlight(new Flight("airport2","airport2"));
        } catch (RouteNotFoundException e) {
            System.out.println("Nie znaleziono połączenia");
        } finally {
            System.out.println("Koniec");
        }
    }
}
