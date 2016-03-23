package chapter1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by tttimit on 2016/3/22.
 * 编写一个Interval1D的用例，从命令行接受一个整数N。从标准输入中
 * 读取N个间隔（每个间隔由一对double值定义）并打印出所有相交的间
 * 对。
 */
public class Ex2 {
    public static void main(String[] args)
    {
//        int N = Integer.parseInt(args[0]);
        int N = 5;
        Interval1D[] ar = new Interval1D[N];

        for(int i = 0; i < N; i++)
        {
//            double lo = StdIn.readDouble();
//            double hi = StdIn.readDouble();
            double lo = StdRandom.uniform();
            double hi = 0.0;
            while(hi <= lo)
                hi = StdRandom.uniform();
            ar[i] = new Interval1D(lo, hi);
        }

        for(int i = 0; i < N; i++)
        {
            for(int j = i+1; j < N; j++)
            {
                if(ar[i].intersects(ar[j]))
                    System.out.println("("+ar[i].left()+", " + ar[i].right()+
                            ") 与("+ar[j].left() + ", " + ar[j].right()+")相交");
            }
        }

    }

}
