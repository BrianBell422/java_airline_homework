import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import person.Passenger;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger, passenger2, passenger3;

    @Before
    public void before() {
        flight = new Flight(PlaneType.WEEPLANE10, 111, "Edinburgh", "Inverness", "12:00");
        passenger = new Passenger("Brian", 1);
        passenger2 = new Passenger("David", 1);
        passenger3 = new Passenger("John", 1);
//        flight.addPassenger(passenger);
//        flight.addPassenger(passenger2);
//        flight.addPassenger(passenger3);
    }

    @Test
    public void flightHasPlaneType() {
        assertEquals(PlaneType.WEEPLANE10, flight.getPlaneType());
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

    @Test
    public void numberOfAvailableSeats() {
        assertEquals(2, flight.getAvailableSeats());
    }

    @Test
    public void numberOfAvailibleSeatsWithPassengers() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getAvailableSeats());
    }

    @Test
    public void bookPassengerIfSeatAvailable() {
        assertEquals("Booking confirmed", flight.addPassenger(passenger));
    }

    @Test
    public void flightFullIfNoSeats() {
        flight.addPassenger(passenger);
        flight.addPassenger(passenger2);
        assertEquals("Sorry flight full", flight.addPassenger(passenger3));
    }

    @Test
    public void passengerHasFlightNumber() {
        flight.addPassenger(passenger);
        assertEquals(111, passenger.getBookedFlightNumber());
    }

}
