package flight;

public class FlightManager {

    private int weightReservedPerPassenger;
    private int weightBookedOnFlight;
    private int weightCapacityRemaining;

    public int bagWeightPerPerson(Flight flight) {
        int totalLuggageWeight = flight.getPlaneType().getTotalWeight() / 2;
         return totalLuggageWeight / flight.getPlaneType().getCapacity();
    }
}
