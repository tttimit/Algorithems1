package chapter1_2;

import java.util.Arrays;

/**
 * Created by Admin on 2016/3/24.
 * 修改BinarySearch，使用Counter统计在有查找中被检查的键的总数并在
 * 查找全部结束之后打印该值。提示：在main()中创建一个Counter对象并
 * 将它作为参数传递给rank()。
 */
public class Ex9 {

    public static void main(String[] args) {
        Counter c = new Counter("time");
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.random() * 1001;
        }

        Arrays.sort(a);

        rank(1, a, c);

        System.out.println("检查了" + c.tally() +"次");

    }


    public static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < key) {
                lo = mid + 1;
                counter.increment();
            } else if (a[mid] > key) {
                hi = mid - 1;
                counter.increment();
            } else return mid;
        }
        return -1;
    }

}
