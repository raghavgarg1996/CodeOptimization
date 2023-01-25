
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastSeenTest {
    @Test
    public void userLastSeenAsMoreThanAYear() {
        String lastSeenInString = "11/01/2022 09:33:43";
        LastSeen lastSeen = new LastSeen();
        String user = "Aman";
        assertEquals(lastSeen.getLastSeenStatus(user, lastSeenInString), user + " was online 1 Years ago");
    }

    @Test
    public void userLastSeenAsMoreThanAnHours() {
        String lastSeenInString = "23/01/2023 15:33:43";
        LastSeen lastSeen = new LastSeen();
        String user = "Aman";
        assertEquals(lastSeen.getLastSeenStatus(user, lastSeenInString), user + " was online 1 Days ago");
    }
}