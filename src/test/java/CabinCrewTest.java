import org.junit.Before;
import org.junit.Test;
import person.CabinCrew;
import person.RankType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Billy", RankType.FLIGHTATTENDANT);
    }

    @Test
    public void messageToPassengers() {
        assertEquals("Don't panic", cabinCrew.messageToPassengers("Don't panic"));
    }
}
