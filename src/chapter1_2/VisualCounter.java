package chapter1_2;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by Admin on 2016/3/24.
 * 编写一个类VisualCounter，支持加一和减一操作。它的构造函数接受两个参数N和max，
 * 其中N指定了操作的最大次数，max指定了计数器的最大绝对值。作为副作用，用图像显
 * 示每次计数器变化后的值。
 */
public class VisualCounter {
    private final int N;
    private final int max;
    private int count;
    private int value;

    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
    }

    public void increment() {
        if (count < N && value < max) {
            count++;
            value++;
        }
        StdDraw.clear();
        StdDraw.text(0.5, 0.5, now());
    }

    public void decrement() {
        if (count < N && Math.abs(value) < max) {
            count++;
            value--;
        }
        StdDraw.clear();
        StdDraw.text(0.5, 0.5, now());
    }

    private String now() {
        return value + "";
    }

    public static void main(String[] args) {
        VisualCounter vc = new VisualCounter(10, 15);

        vc.increment();
        vc.decrement();
        vc.decrement();
        vc.decrement();
        vc.decrement();
    }

}
