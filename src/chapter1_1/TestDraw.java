package chapter1_1;

import edu.princeton.cs.algs4.StdDraw;
/*
 * 测试了一下标准画图类，原来在画图的时候，如果不设置x和y的缩放，
 * 那么x和y的坐标默认是0.0到1.0，如果设置了缩放，那么可以根据
 * 你输入的值来写。
 */
public class TestDraw {

	public static void main(String[] args) {
		
//		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(-200, 200);
		StdDraw.setYscale(-200, 200);
//		StdDraw.setPenRadius(0.002);
//		StdDraw.line(0, 0, 15 , 15);
//		StdDraw.setPenColor();
//		StdDraw.filledCircle(50, 50, 50);
//		StdDraw.setPenRadius(0.002);
//		StdDraw.point(0.1, 0.5);	
		StdDraw.circle(0, 0, 200);
//		StdDraw.setPenRadius(1);
//		StdDraw.point(15, 15);
//		StdDraw.line(0, 3, 5, 8);
		
//		StdDraw.
//		StdDraw.
//		StdDraw.
	}
	
	public static void draw1(int N)
	{
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N * N);
		StdDraw.setPenRadius(0.01);
		for(int i = 1; i <= N; i++)
		{
			StdDraw.point(i, i);
			StdDraw.point(i, i * i);
			StdDraw.point(i, i * Math.log(i));
		}
	}

}
