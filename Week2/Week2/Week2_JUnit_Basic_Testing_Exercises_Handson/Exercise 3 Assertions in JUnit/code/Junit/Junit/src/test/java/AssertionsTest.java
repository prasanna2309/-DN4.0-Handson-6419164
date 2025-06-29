import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals - check if 2 + 3 equals 5
        assertEquals(5, 2 + 3);

        // Assert true - check if 5 is greater than 3
        assertTrue(5 > 3);

        // Assert false - check if 5 is NOT less than 3
        assertFalse(5 < 3);

        // Assert null - check if the value is null
        assertNull(null);

        // Assert not null - check if the object is not null
        assertNotNull(new Object());
    }
}
