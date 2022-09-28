package com.kodilla.kodillagood_patterns.FlightsSearcher;

public class Application {
    public static void  main(String[] args) {
      RouteSearcher routeSearcher = new RouteSearcher();
      routeSearcher.flightsFrom("Warszawa");
      routeSearcher.flightsTo("Poznań");
      routeSearcher.flightsVia("Kraków", "Gdańsk");
    }
}
