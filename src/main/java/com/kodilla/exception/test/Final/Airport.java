package com.kodilla.exception.test.Final;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {
    private String name;
    private List<Airport> allowedDestinations = new ArrayList<>();

    public Airport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Airport> getAllowedDestinations() {
        return allowedDestinations;
    }

    public void setAllowedDestinations(List<Airport> allowedDestinations) {
        this.allowedDestinations = allowedDestinations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return name.equals(airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                '}';
    }
}
