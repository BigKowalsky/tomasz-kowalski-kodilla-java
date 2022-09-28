package com.kodilla.kodillagood_patterns.FlightsSearcher;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class FlightTable {
        private static final String airport1 = "Warszawa";
        private static final String airport2 = "Kraków";
        private static final  String airport3 = "Gdańsk";
        private static final String airport4 = "Wrocław";
        private static final String airport5 = "Poznań";

        public static Set<Flight> flightTable = new HashSet<>();

        static {
                flightTable.add(new Flight(airport1, airport2));
                flightTable.add(new Flight(airport1, airport3));
                flightTable.add(new Flight(airport1, airport4));
                flightTable.add(new Flight(airport1, airport5));

                flightTable.add(new Flight(airport2, airport1));
                flightTable.add(new Flight(airport2, airport3));
                flightTable.add(new Flight(airport2, airport4));
                flightTable.add(new Flight(airport2, airport5));

                flightTable.add(new Flight(airport3, airport1));
                flightTable.add(new Flight(airport3, airport2));
                flightTable.add(new Flight(airport3, airport4));
                flightTable.add(new Flight(airport3, airport5));

                flightTable.add(new Flight(airport4, airport1));
                flightTable.add(new Flight(airport4, airport2));
                flightTable.add(new Flight(airport4, airport3));
                flightTable.add(new Flight(airport4, airport5));

                flightTable.add(new Flight(airport5, airport1));
                flightTable.add(new Flight(airport5, airport2));
                flightTable.add(new Flight(airport5, airport3));
                flightTable.add(new Flight(airport5, airport4));
        }

        public static Set<Flight> content() {
                return new HashSet<>(flightTable);
        }
}
