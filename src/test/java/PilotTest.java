import org.junit.Before;
import org.junit.Test;
import person.Pilot;
import person.RankType;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Charlie", RankType.CAPTAIN, 1234);
    }

    @Test
    public void pilotHasName () {
        assertEquals("Charlie", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicenceNumber() {
        assertEquals(1234, pilot.getLicenceNumber());
    }

}
