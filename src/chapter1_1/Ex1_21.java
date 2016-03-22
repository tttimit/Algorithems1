package chapter1_1;


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


/**
*	编写一段程序，从标准输入中按行读取数据，其中每行都包含一个名字和两个整数。
	然后用printf()打印一张表格，每行的若干列数据包括名字、两个整数和第一个整数
	与第二个整数的商，精确到小数点后三位。
*/
public class Ex1_21{
	public static void main(String[] args){
		System.out.println("请依次输入姓名，第一个整数，第二个整数并按回车输入下一行");
		System.out.println("输入quit并按回车退出");
		String s;
		int i1, i2;
		while(!(s = StdIn.readString()).equals("quit")){
			i1 = StdIn.readInt();
			i2 = StdIn.readInt();
			StdOut.printf("%s  %d  %d  %.3f\n", s, i1, i2, (float)i1/i2);
		}
		System.out.println("Thanks for using!");
	}
}