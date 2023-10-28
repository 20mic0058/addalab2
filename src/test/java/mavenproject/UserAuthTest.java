package mavenproject;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserAuthTest {
	@Test
    public void testAuthenticate() {
        assertTrue(UserAuth.authenticate("deekshit", "2002"));
        assertFalse(UserAuth.authenticate("janu", "1997"));
    }
}
