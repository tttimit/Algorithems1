package chapter1_2;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by tttimit on 2016/3/22.
 * 编写一个Interval1D的用例，从命令行接受一个整数N。从标准输入中
 * 读取N个间隔（每个间隔由一对double值定义）并打印出所有相交的间
 * 对。
 */
public class Ex2 {
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        double[] ar = new double[N * 2];

        for(int i = 0; i < N * 2; i++)
        {
            ar[i] = StdIn.readDouble();
        }

        for(int i = 0; i < N; i++)
        {

        }

    }

}
