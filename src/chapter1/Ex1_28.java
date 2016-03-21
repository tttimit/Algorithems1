package chapter1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * 删除重复元素
 * 	修改BinarySearch类中的测试用例来删去排序之后白名单中所有重复元素。
 */
public class Ex1_28 {
	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		whitelist = remove_duplicate_elements(whitelist);
		while(!StdIn.isEmpty())
		{//读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			if(BinarySearch.rank(key, whitelist) < 0)
				StdOut.println(key);
		}
	}
	/*
	 * 参数whitelist是一个排序好的数组，现在要移除其中的重复元素
	 */
	private static int[] remove_duplicate_elements(int[] whitelist) {
		int[] result_list = new int[whitelist.length];
		for(int i = 0; i < whitelist.length; i++)
		{
			if(i > 0 && whitelist[i] != result_list[i-1])
				result_list[i] = whitelist[i];
		}
		return result_list;
	}
}