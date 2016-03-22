package chapter1_1;
/*
 * 模拟掷骰子。
 * 以下代码能够计算每种两个骰子之和的准确概率分布：
 */
public class Ex1_35 {

	public static void main(String[] args) {
		int SIDES = 6;
		double[] dist = new double[SIDES * 2 + 1];
		calc(dist, SIDES);
		
		double[] exam = new double[SIDES * 2 + 1];
		double target = 0.001;
		
//		int N = 50000;
//		double fi = 0.0;
//		for(int i = 0; i < 10; i++){
//			fi += test(dist, exam, target);
//		}
		
//		System.out.println("经过500次的试验，平均需要" + fi /10 +"次才能得到精度满足要求的结果");
		
		test(dist, exam, target);
				for(int i = 2; i < dist.length; i++){
			System.out.printf("dist[%d]=%.4f exam[%d]=%.4f\n", i, dist[i], i, exam[i]/exam[0]);
		}
		
	}

	private static double test(double[] dist, double[] exam, double target) {
		exam[0] = 1;
		
		for(int i = 1; isContinue(dist, exam, target) ; i++)
		{
			int res = go() + go();
			exam[res]++;
			exam[0]++;
		}
		System.out.println("总共需要"+exam[0]+"次，才能符合精度0.001的要求。");
		return exam[0];
	}
	
	public static boolean isContinue(double[] dist, double[] exam, double target){
		for(int i = 2; i < dist.length; i++){
			try {
				if(Math.abs(dist[i] - exam[i] / exam[0]) > target)
					return true;
			} catch (Exception e) {
				System.out.println("Now i is:" + i);
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public static void calc(double[] dist, int s){
		for(int i = 1; i <= s; i++)
			for(int j = 1; j <= s; j++)
				dist[i + j] += 1.0;
		
		for(int k = 2; k <= 2 * s; k++)
			dist[k] /= 36.0;
	}
	
	public static int go(){
		int res = 0;

		double d = Math.random() * 6 + 1;//产生一个1到7之间的数（包含1，不包含7）
		if(d < 2)
			res = 1;
		else if(d < 3)
			res = 2;
		else if(d < 4)
			res = 3;
		else if(d < 5)
			res = 4;
		else if(d < 6)
			res = 5;
		else if(d < 7)
			res =6;
		
		return res;
	}
}
