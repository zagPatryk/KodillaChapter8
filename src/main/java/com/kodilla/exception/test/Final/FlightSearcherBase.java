package com.kodilla.exception.test.Final;

import java.util.ArrayList;
import java.util.List;

public interface FlightSearcherBase {
    Airport warsaw = new Airport("Warsaw");
    Airport london = new Airport("London");
    Airport newYork = new Airport("New York");
    Airport berlin = new Airport("Berlin");
    Airport rio = new Airport("Rio");
    Airport tokyo = new Airport("Tokyo");
    Airport moscow = new Airport("Moscow");

    List<Airport> warsawAllowedDestinations = new ArrayList<Airport>() {
        {
            add(berlin);
            add(london);
        }
    };

    List<Airport> moscowAllowedDestinations = new ArrayList<Airport>() {
        {

        }
    };


    List<Airport> rioAllowedDestinations = new ArrayList<Airport>() {
        {
            add(moscow);
            add(newYork);
        }
    };

    List<Airport> tokyoAllowedDestinations = new ArrayList<Airport>() {
        {
            add(rio);
        }
    };


    List<Airport> londonAllowedDestinations = new ArrayList<Airport>() {
        {
            add(rio);
        }
    };

    List<Airport> newYorkAllowedDestinations = new ArrayList<Airport>() {
        {
            add(berlin);
            add(london);
        }
    };

    List<Airport> berlinAllowedDestinations = new ArrayList<Airport>() {
        {
            add(london);
            add(warsaw);
        }
    };



}
