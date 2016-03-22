package chapter1_1;

import edu.princeton.cs.algs4.StdRandom;

/*
 * 乱序检查
 * 通过实验检查表1.1.10中的乱序代码是否能够产生预期的效果。编写一个程序ShuffleTest，接受
 * 命令行参数M和N，将大小为M的数组打乱N次且在每次打乱之前都将数组重新初始化为a[i]=i。打印一
 * 个M×M的表格，对于所有的列j，行i表示的是i在打乱后落到j的位置的次数。数组中所有元素的值都应
 * 该接近于N/M。
 */
public class Ex1_36 {

	public static void main(String[] args) {
//		int M = Integer.parseInt(args[0]);
//		int N = Integer.parseInt(args[1]);
		int M = 4;
		int N = 2;
		double[] arr = new double[M];
		
		int[][] res = new int[M][M];
		
		
		for(int i = 0; i < N; i++){
			initArr(arr);
			res = Shuffle(arr, res, i);
		}
		
		printArr(res);
	}

	private static void printArr(int[][] res) {
		for(int i = 0; i < res.length; i++){
			for(int j = 0; j < res[0].length; j++)
				System.out.print(res[i][j] + " ");
			System.out.println();
		}
	}
	
	private static void initArr(double[] arr) {
		for(int i = 0; i < arr.length; i++){
			arr[i] = i;
		}
	}

	public static int[][] Shuffle(double[] a, int[][] res, int col){
		int N = a.length;
		for(int i = 0; i < N; i++)
		{	//将a[i]和a[i..N-1]中任意一个元素交换
//			int r = i + StdRandom.uniform(N-i);
			int r = StdRandom.uniform(N-0);
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
			res[r][col]++;  
		}
		return res;
	}

}
