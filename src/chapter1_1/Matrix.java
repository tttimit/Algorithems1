package chapter1_1;

/*
 * 矩阵库
 * 
 * 编写一个矩阵库，并且编写一个测试用例，从标准输入读取矩阵并测试所有方法。
 */
public class Matrix {

	public static void main(String[] args) {
		double[][] a1 ={{2, 3, 5}, {1, 2, 4}, {5, 6, 7}, {3, 1, 2}};
		double[] b1 = {3, 2, 5, 4};
		double[][] b2 = {{5},{6},{7}};
		double[] b3 = {4, 2, 1};
		
//		System.out.println("a1 ----");
//		print(a1);
//		System.out.println("a1 ^ T----");
//		print(transpose(a1));
//		System.out.println("b2 ^ T----");
//		print(transpose(b2));
//		System.out.println("b1 * a1----");
//		print(mult(b1, a1));
		System.out.println("----");
		print(mult(a1, b3));
		System.out.println("----");
	}

	/*
	 * 向量点乘
	 */
	public static double dot(double[] x, double[] y) {
		double res = 0.0;
		for (int i = 0; i < x.length; i++)
			res += x[i] * y[i];
		return res;
	}

	/*
	 * 矩阵和矩阵之积 假设A矩阵是m×n的矩阵，B矩阵为o×p的矩阵，当A矩阵的列数等于B矩阵的行数
	 * 时，即n=o时，矩阵乘法才有意义，得到的结果是一个m×p的矩阵。
	 */
	public static double[][] mult(double[][] a, double[][] b) {
		double[][] res = new double[a[0].length][b.length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < b.length; j++) {
				res[i][j] = 0;
				for (int k = 0; k < a[0].length; k++)
					res[i][j] += a[i][k] * b[k][j];
			}
		return res;
	}

	/*
	 * 转置矩阵
	 */
	public static double[][] transpose(double[][] a) {
		double[][] res = new double[a[0].length][a.length];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[0].length; j++)
				res[j][i] = a[i][j];
		return res;
	}

	/*
	 * 矩阵和向量之积 这个也要满足矩阵的列数等于向量的行数
	 */
	public static double[] mult(double[][] a, double[] x) {
		double[] res = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			res[i] = 0;
			for (int j = 0; j < a[0].length; j++)
				res[i] += a[i][j] * x[j];
		}
		return res;
	}

	/*
	 * 向量和矩阵之积 需要满足向量的列数等于矩阵的行数
	 */
	public static double[] mult(double[] y, double[][] a) {
		double[] res = new double[a[0].length];
		for (int i = 0; i < a[0].length; i++){
			res[i] = 0;
			for (int j = 0; j < a.length; j++) 
				res[i] += y[j] * a[j][i];
		}
		return res;
	}

	public static void print(double[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[0].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void print(double[] mat){
		for(int i = 0;i < mat.length; i++)
			System.out.print(mat[i] + " ");
	}
}
