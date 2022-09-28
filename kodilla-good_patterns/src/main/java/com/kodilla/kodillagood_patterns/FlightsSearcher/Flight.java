package com.kodilla.kodillagood_patterns.FlightsSearcher;

public final class Flight {

    private final String startAirport;
    private final String finalAirport;

    public Flight(final String startAirport, final String finalAirport) {
        this.startAirport = startAirport;
        this.finalAirport = finalAirport;
    }

    public final String getStartAirport() {
        return startAirport;
    }

    public final String getFinalAirport() {
        return finalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (getStartAirport() != null ? !getStartAirport().equals(flight.getStartAirport()) : flight.getStartAirport() != null)
            return false;
        return getFinalAirport() != null ? getFinalAirport().equals(flight.getFinalAirport()) : flight.getFinalAirport() == null;
    }

    @Override
    public int hashCode() {
        int result = getStartAirport() != null ? getStartAirport().hashCode() : 0;
        result = 31 * result + (getFinalAirport() != null ? getFinalAirport().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startAirport=" + startAirport +
                ", finalAirport=" + finalAirport +
                '}';
    }
}
