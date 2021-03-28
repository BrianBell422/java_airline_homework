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
    public void calculateBagWeightPerPassenger() {
        assertEquals(10, flightManager.bagWeightPerPerson(flight));
    }

}
