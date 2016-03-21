package chapter1;

import edu.princeton.cs.algs4.StdOut;

/*
 * 给出使用欧几里得算法计算105和24的最大公约数的过程中得到的一系列p和q的值。扩展该算法
 * 中的代码得到一个程序Euclid，从命令行接受两个参数，计算它们的最大公约数并打印出每次
 * 调用该递归方法时的两个参数。并用该程序计算1 111 111和1 234 567的最大公约数。
 */
public class Ex1_24 {
	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
//		int q = 1111111;
//		int p = 12345567;
		System.out.println("result is: " + Euclid(p, q));
	}

	
	/*
	 * 书中给出的欧几里得算法经过修改得到下面的代码
	 */
	public static int Euclid(int p, int q)
	{
		StdOut.println("p:"+ p +"\tq:" + q );
		if(q == 0)	return p;
		int r = p % q;
		return Euclid(q, r);
	}
}
