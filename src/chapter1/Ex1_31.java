package chapter1;

import edu.princeton.cs.algs4.StdDraw;

/*
 * 随机连接
 * 编写一段程序，从命令行接受一个整数N和double值p（0到1之间）作为参数，
 * 在一个圆上画出大小为0.05且间距相等的N个点，然后将每对点按照概率p用灰线
 * 链接
 */
public class Ex1_31 {

	public static void main(String[] args) {
//		int N = Integer.parseInt(args[0]);
//		double p = Double.parseDouble(args[1]);
		int N = 10;
		double p = 0.5;
		int radius = 200;
		StdDraw.setPenRadius(0.005);
//		StdDraw.setPenRadius(0.002);
		StdDraw.setXscale(-200, 200);
		StdDraw.setYscale(-200, 200);

//		StdDraw.setCanvasSize(600, 600);

		double x = 0.0; // 每次要画的点
		double y = 0.0;
		double angle = 0.0;
		double[][] points = new double[N][N];
		
		for (int i = 0; i < N; i++)// N个点
		{
			if (i == 0) {
				angle = Math.random() * Math.PI * 2;
			} else {
				angle += 2 * Math.PI / N;
			}
			x = Math.cos(angle) * radius;
			y = Math.sin(angle) * radius;
			points[0][i] = x;
			points[1][i] = y;
			System.out.println("now draw point:("+x+", "+y + ")");
			StdDraw.point(x, y);
		}
		
		StdDraw.setPenColor(StdDraw.GRAY);
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(i != j){
					if(Math.random() < p)
						StdDraw.line(points[0][i], points[1][i], points[0][j], points[1][j]);
				}
			}
		}
		
	}

	/*
	 * 由于产生随机数的函数不能包含上界，因此我包装了一下这个方法， 让他能够产生包含上界的随机数
	 * 
	 * 但是发现用弧度可以直接解决问题了，所以这个函数就不用了
	 */
	public static double nextDouble(int radius) {
		double rr = 0.0;
		while (true) {
			if ((rr = Math.random() * (radius + 1)) <= radius)
				break;
		}
		return rr;
	}

}
