package chapter1;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;

/*
 * 直方图
 * 
 * 假设标准输入流中含有一系列double值。编写一段程序，从命令行接受一个整数N和两个double值l和r。
 * 将（l，r）分为N段并使用StdDraw画出输入流中的值落入每段的数量的直方图。
 */
public class Ex1_32 {

	public static void main(String[] args) {
//		int N = Integer.parseInt(args[0]);
//		double l = Double.parseDouble(args[1]);
//		double r = Double.parseDouble(args[2]);
		int N = 10;
		double l = 0.0;
		double r = 10.0;
		double width = (r - l) / N;	//每段宽度
//		System.out.println("每段宽度为： " + width);
		
		double[] test_arr = new double[50];
		for(int i = 0; i < test_arr.length; i++){
			test_arr[i] = Math.random() * 10;
//			System.out.print(test_arr[i] + " ");
//			if(i != 0 && i % 9 == 0)
//				System.out.println();
		}		
		Arrays.sort(test_arr);	//排序一下，这样后续处理更有效率
		
		int[] lengths = new int[N];	//直方图每段高度
		int now_at = 0;	//定义一个外部变量来保存比较到了数组的哪里，用来减少多余的比较次数
		double start = 0.0;
		double end = 0.0;
		for(int i = 0; i < N; i++){	//这个循环计算直方图每段中数据的个数（确定直方图每段的高度）
			lengths[i] = 0;
			if(i == 0)
			{
				start = l;
				end = l + width;
			}else{
				start = end;
				end = end + width; 
			}
			
//			System.out.println("now start: "+ start+" end: "+end);
//			System.out.println("now start from: " + now_at);
			for(int j = now_at; j < test_arr.length; j++){
				if(test_arr[j] >= start && test_arr[j] < end)
					lengths[i]++;
				else if(test_arr[j] >= end){
//					System.out.println("start: "+start+" end: " + end + " test_arr["+j+"]: "+test_arr[j]);
					now_at = j;
					break;
				}
			}
//			System.out.println("now length[" + i + "] is: " +lengths[i]);
		}
		
		//处理画图
//		StdDraw.setPenRadius(0.005);
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N);
		for(int i = 0; i < N; i++){ // N = 10
			double x = i + 0.5 / N;
			double y = (lengths[i] / 2.0);
			double rw = 0.5 / N;
			double rh = (lengths[i] / 2.0);
			StdDraw.filledRectangle(x, y, rw, rh);
		}
		
	}

}
