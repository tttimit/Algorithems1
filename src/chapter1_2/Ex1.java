package chapter1_2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by tttimit on 2016/3/22.
 * 编写一个Point2D的用例，从命令行接受一个整数N。在单位正方形中生成
 * N个随机点，然后计算两点之间的最近距离。
 */
public class Ex1 {
    public static void  main(String[] args)
    {
//        int N = Integer.parseInt(args[0]);
        int N = 10;

        StdDraw.setCanvasSize();
        StdDraw.setScale(0, 512);
        StdDraw.rectangle(266, 266, 100, 100);

        Point[] ar = new Point[N];
        for(int i = 0; i < N; i++)
        {
            int x = StdRandom.uniform(266-100, 266+101);
            int y = StdRandom.uniform(266-100, 200+101);
            ar[i] = new Point(x, y);
            StdDraw.point(x, y);
        }
        double minDist = ar[0].dist(ar[1]);
        for(int i = 0; i < N; i++)
            for(int j = i + 1; j < N; j++)
            {
//                StdDraw.line(ar[i].x, ar[i].y, ar[j].x, ar[j].y);
                minDist = ar[i].dist(ar[j])<minDist?ar[i].dist(ar[j]):minDist;
//                System.out.println("now minDist is: " + minDist);
            }
        System.out.printf("最短距离为：%f" ,minDist);

    }

    public static class Point{
        private final int x;
        private final int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public double dist(Point p){
            double dist = Math.sqrt((x - p.x) ^ 2 + (y - p.y) ^ 2) / 512;
//            System.out.printf("(%.3f, %.3f)到(%.3f, %.3f)的距离为：%.3f\n" , x/512, y/512, p.x/512, p.y/512, dist);
            return dist;
        }
    }
}
