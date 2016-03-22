import chapter1.Ex1_39;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Admin on 2016/3/22.
 */
public class Ex1_39Test {
    @Test
    public void testMatch() throws Exception {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 5, 6, 8};
        int[] c = {1, 3, 5};
        int[] d = {15, 22, 32, 44};

        assertEquals(3, Ex1_39.match(a, b));
//        assertEquals(3, Ex1_39.match(a, c));
//        assertEquals(0, Ex1_39.match(a, d));
//        assertEquals(1, Ex1_39.match(c, b));
    }

    @Test
    public void testBinarySearch() throws Exception {
        int[] a = new int[10000];
        for (int i = 0; i < 10000; i++) {
            a[i] = StdRandom.uniform(10 ^ 5);
        }
        Arrays.sort(a);
        for (int i = 0; i < 10000; i++) {
            int key = StdRandom.uniform(10 ^ 5);
            assertEquals(Arrays.binarySearch(a, key), Ex1_39.BinarySearch(key, a));
        }

    }
}
