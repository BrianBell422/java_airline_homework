import org.junit.Before;
import org.junit.Test;
import person.EmployeeImplementation;
import person.RankType;

import static org.junit.Assert.assertEquals;

public class EmployeeImplementationTest {

    EmployeeImplementation employeeImplementation;

    @Before
    public void before() {
        employeeImplementation = new EmployeeImplementation("Brian", RankType.CAPTAIN);
    }

    @Test
    public void employeeHasName() {
        assertEquals("Brian", employeeImplementation.getName());
    }

    @Test
    public void employeeHasRank() {
        assertEquals(RankType.CAPTAIN, employeeImplementation.getRank());
    }
}
