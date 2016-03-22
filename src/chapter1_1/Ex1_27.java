package chapter1_1;
/*
 * 二项分布，估计用以下代码计算binomial(100, 50，.25)将会产生的递归调用次数
 * 
 * 将已经计算过的值保存在在数组中并给出一个更好地实现。
 * 
 * 这道题简直炸裂，不理解是要干啥
 */
public class Ex1_27 {

	public static int count = 0;
	public static void main(String[] args) {
		System.out.println("result: " + binomial(100, 5, .25));
	}
	
	public static double binomial(int N, int k, double p)
	{
		System.out.println(count++ + " - ");
		if(N == 0 && k == 0) return 1.0;
		if(N < 0 || k < 0) return 0.0;
		return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
	}

}
