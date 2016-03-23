package chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by Admin on 2016/3/23.
 * 编写一个Interval2D的用例，从命令行接受参数N、min和max。生成N个随机的2D间隔，其宽
 * 和高均匀地分布在单位正方形中的min和max之间。用StdDraw画出他们并打印出相交的间隔对
 * 的数量以及有包含关系的间隔对数量。
 */
public class Ex3 {
    public static void main(String[] args) {
//        int N = Integer.parseInt(args[0]);
//        int min = Integer.parseInt(args[1]);
//        int max = Integer.parseInt(args[2]);
        int N = 5;
        int min = 0;
        int max = 1;

        Interval2D[] ar = new Interval2D[N];

        for (int i = 0; i < N; i++) {
//            double lo = StdIn.readDouble();
            double lo = StdRandom.uniform();
            double hi = 0.0;
            while (hi <= lo)
//                hi = StdIn.readDouble();
                hi = StdRandom.uniform();
            Interval1D x = new Interval1D(lo, hi);

            lo = StdRandom.uniform();
            hi = 0.0;
            while (hi <= lo)
//                hi = StdIn.readDouble();
                hi = StdRandom.uniform();
            Interval1D y = new Interval1D(lo, hi);

            ar[i] = new Interval2D(x, y);
        }

        for (int i = 0; i < N; i++) {
            ar[i].draw();
            for (int j = i + 1; j < N; j++) {
                if (ar[i].intersects(ar[j]))
                    System.out.println(ar[i] + " 与 " + ar[j] + " 相交");
            }
        }

    }
}
