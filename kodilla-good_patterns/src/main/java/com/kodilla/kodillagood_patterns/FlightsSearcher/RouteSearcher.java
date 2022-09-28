package com.kodilla.kodillagood_patterns.FlightsSearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.kodilla.kodillagood_patterns.FlightsSearcher.FlightTable;

public final class RouteSearcher {
    public List<String> flightsFrom(String startAirport) {
        List<String> from = FlightTable.content().stream()
                .filter(f -> f.getStartAirport().equals(startAirport))
                .map(f -> f.getFinalAirport())
                .collect(Collectors.toList());
        return from;
    }

    public List<String> flightsTo(String finalAirport) {
        List<String> to = FlightTable.content().stream()
                .filter(f -> f.getFinalAirport().equals(finalAirport))
                .map(f -> f.getStartAirport())
                .collect(Collectors.toList());
        return to;
    }

    public void flightsVia(String startAirport, String finalAirport) {
        List<String> fromVia = flightsFrom(startAirport);
        List<String> toVia = flightsTo(finalAirport);

        List<String> transferFlight = new ArrayList<>();
        for (String via : fromVia) {
            if (toVia.contains(via));
        }
    }
}
