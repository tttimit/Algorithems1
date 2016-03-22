package chapter1_1;
/*
 * 数组练习
 * 编写一段程序，创建一个N×N的布尔数组a[][]。其中当i和j互质时（没有
 * 相同的因子），a[i][j]为true，否则为flase
 */
public class Ex1_30 {

	public static void main(String[] args)
	{
		int N = 10;
		boolean[][] arr = creat_arr(N);
		printArr(arr);
	}
	
	public static boolean[][] creat_arr(int N)
	{
		boolean[][] arr = new boolean[N][N];
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
			{
				if(gcd(i, j) <= 1)
					arr[i][j] = true;
				else
					arr[i][j] = false;
			}
		
		return arr;
	}
	
	public static int gcd(int p, int q)
	{
		if(q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}
	
    public static void printArr(boolean[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j]==true?"1 ":"0 ");
            System.out.println();
        }
    }
}
