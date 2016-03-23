import org.junit.Test;

import static chapter1_2.Ex6.checkCR;
import static org.junit.Assert.assertEquals;

/**
 * Created by tttimit on 2016/3/23.
 */
public class Ex6Test {
    @Test
    public void checkCRTest() throws Exception {
        String a = "ACTGACG";
        String b = "TGACGAC";
        String c = "ACTGACG";
        String d = "GACGAC";
        String e = "CGACTGA";


        assertEquals(checkCR(a, b), true);
        assertEquals(checkCR(a, c), false);
        assertEquals(checkCR(a, d), false);
        assertEquals(checkCR(b, d), false);
        assertEquals(checkCR(b, e), true);
        assertEquals(checkCR(c, d), false);
        assertEquals(checkCR(c, e), true);
        assertEquals(checkCR(d, e), false);
        assertEquals(checkCR("12345", "4512"), false);
        assertEquals(checkCR("12345", "45123"), true);
        assertEquals(checkCR("", ""), false);
        assertEquals(checkCR("123123123", "123123123"), false);
        assertEquals(checkCR("  ", "   "), false);
        assertEquals(checkCR(" ", " "), false);
        assertEquals(checkCR(" 1 2 ", "1 2  "),true);


    }
}
