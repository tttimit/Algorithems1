import org.junit.Test;

import static chapter1_2.Rational.gcd;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Admin on 2016/3/25.
 */
public class RationalTest {
    @Test
    public void gcdTest() throws Exception {
        assertEquals(2, gcd(4, 6));
        assertEquals(3, gcd(9, 6));
        assertEquals(1, gcd(5, 6));
    }
}
