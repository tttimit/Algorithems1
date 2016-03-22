package chapter1_1;

/**
*	这个程序是计算斐波纳挈数列的算法啊，但是效率很低。
*	修改的话，就直接利用一个数组，假如计算100个，那么从开始
*	每次直接用前两项加后一项加起来就行。
	结果：到最后已经超出long类型的范围了
*/
public class Ex1_19
{
	public static long F(int N)
	{
		if(N == 0) return 0;
		if(N == 1) return 1;
		return F(N-1) + F(N-2);
	}
	public static long F1(long[] arr, int N)
	{
		if(N == 0){
			arr[N] = 0;
		}else if(N == 1){
			arr[N] = 1;
		}else{
			arr[N] = arr[N-1] + arr[N-2];
		}
		return arr[N];
	}
	public static void main(String[] args)
	{
		long[] Fib = new long[100];
		for(int N = 0; N < 100; N++)
			System.out.println(N + " " + F1(Fib, N));
	}
}