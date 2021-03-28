import org.junit.Before;
import org.junit.Test;
import person.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Brian", 1);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Brian", passenger.getName());
    }

    @Test
    public void passengerHasBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }

}
