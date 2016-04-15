import org.junit.Test;

import static chapter1_3.EvaluatePostfix.evaluatePostfix;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Admin on 2016/4/7.
 */
public class EvaluatePostfixTest {
    @Test
    public void evaluateTest() throws Exception {

        assertEquals("6.0", evaluatePostfix("51+"));
        assertEquals("6.0", evaluatePostfix("23*"));
        assertEquals("0.0", evaluatePostfix("20*"));
        assertEquals("0.0", evaluatePostfix("02*"));
        assertEquals("6.0", evaluatePostfix("12+2*"));
        assertEquals("17.0", evaluatePostfix("512+4*+"));
        assertEquals("14.0", evaluatePostfix("512+4*+3-"));
        assertEquals("14.0", evaluatePostfix("5 1 2 + 4 * + 3 -"));

    }
}
