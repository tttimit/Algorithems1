package chapter1_1;

/**
 * Created by tttimit on 2016/3/11.
 * 编写一个静态方法lg()，接受一个整形参数N，返回不大于Log2(N)的最大整数。不要用Math库。
 */
public class Ex1_14 {
    public static void main(String[] args) {
        int N = 128;
        System.out.println(lg(N));
    }

    public static int lg(int N) {
        int result = 0;
        for (; N > 1; result++) {
            N /= 2;
        }
        return result;
    }
}
