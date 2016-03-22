package chapter1_1;

/**
* 	编写一个递归的静态方法计算ln(N!)的值
*	N阶乘的自然对数	
*/

public class Ex1_20{
	public static void main(String[] args){
		int N = Integer.parseInt(args[0]);
		System.out.println("lln(" + N + ")=" + lln(N));
		System.out.println("Math.log(" + N + "!)=" + Math.log(fact(N)));
	}
	public static double lln(int N){
		if(N == 1) return 0;
		return Math.log(N) + lln(N-1);
/*		long total = 0;
		int result = 0
		for(int i = 1; i <= N; i++)
		{
			total *= i;
		}
		
		for(;N >= 1;N--){
			result *= Math.log(N)
		}*/
	}
	public static int fact(int N)
	{
		int i;
		for(i = 1; N > 0; N--)
		{
			i *= N;
		}
		return i;
	}
}