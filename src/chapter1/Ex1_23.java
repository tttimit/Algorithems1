package chapter1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * 为BinarySearch的测试用例添加一个参数：+ 打印出标准输入中不在白名单上的值；
 *  -，则打印出标准输入中在白名单上的值。
 */
public class Ex1_23 {
	/*
	 * 这个main方法是直接从BinarySearch中拿来的，直接进行修改
	 */
	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty())
		{//读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			char flag = StdIn.readChar();
			if('+' == flag && BinarySearch.rank(key, whitelist) < 0)
				StdOut.println(key);
			else if('-' == flag && BinarySearch.rank(key, whitelist) >= 0)
				StdOut.println(key);
		}
	}
	
	
}
