import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    @Before
    public void before() {
        flight = new Flight(PlaneType.BOEING747, 111, "Edinburgh", "Inverness", "12:00");
    }

    @Test
    public void flightHasPlaneType() {
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals(111, flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("Edinburgh", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("Inverness", flight.getDepartureAirport());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("12:00", flight.getDepartureTime());
    }

}
