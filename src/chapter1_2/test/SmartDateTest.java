import chapter1_2.SmartDate;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Admin on 2016/3/24.
 */
public class SmartDateTest {
    @Test
    public void dayOfTheWeeksTest() throws Exception {
        String[] WEEKS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        assertEquals(WEEKS[5], new SmartDate(1,1,2000).dayOfTheWeek());
        assertEquals(WEEKS[1], new SmartDate(1,2,2000).dayOfTheWeek());
        assertEquals(WEEKS[2], new SmartDate(1,3,2000).dayOfTheWeek());
        assertEquals(WEEKS[5], new SmartDate(1,4,2000).dayOfTheWeek());
        assertEquals(WEEKS[0], new SmartDate(1,1,2001).dayOfTheWeek());
        assertEquals(WEEKS[3], new SmartDate(1,2,2001).dayOfTheWeek());
        assertEquals(WEEKS[3], new SmartDate(1,11,2001).dayOfTheWeek());
        assertEquals(WEEKS[3], new SmartDate(24,3,2016).dayOfTheWeek());
        assertEquals(WEEKS[4], new SmartDate(25,3,2016).dayOfTheWeek());
        assertEquals(WEEKS[4], new SmartDate(29,2,2008).dayOfTheWeek());
        assertEquals(WEEKS[0], new SmartDate(6,12,2027).dayOfTheWeek());
    }
}
