import flight.Flight;
import flight.FlightManager;
import org.junit.Before;
import org.junit.Test;
import person.Passenger;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight;
    Passenger passenger, passenger2, passenger3;

    @Before
    public void before () {
        flightManager = new FlightManager();
        flight = new Flight(PlaneType.WEEPLANE10, 111, "Edinburgh", "Inverness", "12:00");
        passenger = new Passenger("Brian", 1);
        passenger2 = new Passenger("David", 1);
        passenger3 = new Passenger("John", 1);
    }

    @Test
    public void flightManagerHasFlight() {
        flightManager.checkFlight(flight);
        assertEquals(111, flightManager.getCurrentFlightNumber());
    }

    @Test
    public void calculateBagWeightPerPassenger() {
        assertEquals(10, flightManager.bagWeightPerPerson(flight));
    }

    @Test
    public void calculateWeightBookedOnFlight() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        assertEquals(20, flightManager.getBagWeightBookedOnFlight(flight));
    }

    @Test
    public void calculatePlaneTotalBagWeight() {
        assertEquals(20, flightManager.getPlaneBagWeightCapacity(flight));
    }

    @Test
    public void calculateRemainingBagCapacity() {
        flight.addPassenger(passenger);
        assertEquals(10, flightManager.getRemainingBagCapacity(flight));
    }

}
