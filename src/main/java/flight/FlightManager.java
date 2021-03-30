package flight;

public class FlightManager {

    Flight flight;

    private int weightReservedPerPassenger;
    private int weightBookedOnFlight;
    private int planeBagWeightCapacity;
    private int remainingBagCapacity;
    private int currentFlightNumber;

    public void checkFlight(Flight flight) {
        currentFlightNumber = flight.getFlightNumber();
    }

    public int getCurrentFlightNumber() {
        return currentFlightNumber;
    }

    public int getPlaneBagWeightCapacity(Flight flight) {
        planeBagWeightCapacity = flight.getPlaneType().getTotalWeight() / 2;
        return planeBagWeightCapacity;
    }

    public int bagWeightPerPerson(Flight flight) {
        weightReservedPerPassenger = getPlaneBagWeightCapacity(flight) / flight.getPlaneType().getCapacity();
        return weightReservedPerPassenger;
    }

    public int getBagWeightBookedOnFlight(Flight flight) {
        weightBookedOnFlight = bagWeightPerPerson(flight) * flight.getPassengers();
        return weightBookedOnFlight;
    }

    public int getRemainingBagCapacity(Flight flight) {
        remainingBagCapacity = getPlaneBagWeightCapacity(flight) - getBagWeightBookedOnFlight(flight);
        return remainingBagCapacity;
    }
}
