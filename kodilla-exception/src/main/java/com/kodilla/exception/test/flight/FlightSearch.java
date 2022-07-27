package com.kodilla.exception.test.flight;

import java.io.IOException;
import java.util.HashMap;

public class FlightSearch {
    public Boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("London", true);
        flightMap.put("New York", true);
        flightMap.put("Tokyo", true);
        flightMap.put("Paris", false);
        flightMap.put("Sydney", false);

        String firstAirport = flight.getArrivalAirport();
        String secondAirport = flight.getDepartureAirport();

        String routeInfo;

        if (!(flightMap.containsKey(firstAirport) && flightMap.containsKey(secondAirport))) {

            if (!(flightMap.containsKey(firstAirport)) && !(flightMap.containsKey(secondAirport))) {
                routeInfo = "both airports couldn't be chosen";
            } else {
                if (!(flightMap.containsKey(firstAirport))) {
                    routeInfo = "arrival airport couldn't be chosen";
                } else {
                    routeInfo = "departure airport couldn't be chosen";
                }
            }
            throw new RouteNotFoundException("Route is not found - " + routeInfo);
        } else {
            return flightMap.get(firstAirport) && flightMap.get(secondAirport);
        }
    }

    public static void main(String[] args) throws RouteNotFoundException {
        Flight firstFlight = new Flight("London", "Paris");
        Flight secondFlight = new Flight("New York", "London");
        Flight thirdFlight = new Flight("Sydney", "Paris");
        Flight fourthFlight = new Flight("Tokyo", "London");
        Flight fifthFlight = new Flight("New York", "Tokyo");
        Flight sixthFlight = new Flight("Paris", "New York");

        FlightSearch flightSearch = new FlightSearch();

        flightSearch.findFlight(firstFlight);
        flightSearch.findFlight(secondFlight);
        flightSearch.findFlight(thirdFlight);
        flightSearch.findFlight(fourthFlight);
        flightSearch.findFlight(fifthFlight);
        flightSearch.findFlight(sixthFlight);

        try {
            flightSearch.findFlight(firstFlight);
        } catch (RouteNotFoundException e) {
           throw new RouteNotFoundException("We are sorry " + e);
        }
        System.out.println(flightSearch.findFlight(firstFlight));
    }
}
