package chapter1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/*
 * 等值键。
 * 为BinarySearch类添加一个静态方法rank()，它接受一个键和一个整型有序数组（可能存在重复键）作为参数
 * 并返回数组中小于该键的元素数量，以及一个类似的方法count()来返回数组中等于该键的元素的数量。注意：
 * 如果i和j分别是rank(key, a)和count(key, a)的返回值，那么a[i..i+j-1]就是数组中所有和
 * key相等的元素。
 */
public class Ex1_29 {

	public static int rank(int key, int[] a)
	{//二分查找数组必须是有序的
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi)
		{//被查找数组的键要么不存在，要么必然存在于a[lo..hi]之中
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]) hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else 	return mid;
		}
		return -1;
	}
	
	/*
	 * 添加的方法，接收一个键和一个整型有序数组
	 * 返回数组中小于该键的元素数量
	 */
	public static int rank1(int key, int[] a)
	{
		int count = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < key)
				count++;
			else
				break;
		}
		return count;
	}
	/*
	 * 添加的方法，接收一个键和一个整型有序数组
	 * 返回数组中等于该键的元素数量
	 */
	public static int count(int key, int[] a)
	{
		int count = 0;
		boolean flag = false;
		for(int i = 0; i < a.length; i++)
		{
			if(key == a[i])
			{
				flag = true;
				count++;
			}
			else if(flag)
				break;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty())
		{//读取键值，如果不存在于白名单中则将其打印
			int key = StdIn.readInt();
			if(rank(key, whitelist) < 0)
				StdOut.println(key);
		}
	}
}
