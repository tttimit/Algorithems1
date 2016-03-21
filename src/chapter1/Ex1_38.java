package chapter1;

import java.util.Arrays;

/*
 * 二分查找与暴力查找
 * 根据1.1.10.4节给出的暴力查找法编写一个程序BruteForceSearch，在
 * 你的计算机上比较它和BinarySearch处理largeW.txt和largeT.txt
 * 所需的时间。
 */
public class Ex1_38 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    public static int BruteForceSearch(int key, int[] a) {
        Arrays.sort(a);
        return rank(key, a);
    }

    /*
    二分查找
    缺点是待查找的数组必须是有序的
     */
    public static int BinarySearch(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] > key) lo = mid + 1;
            else if (a[mid] < key) hi = mid - 1;
            else return mid;
        }
        return -1;
    }


    /*
    书1.1.10.4里面的暴力查找算法
    其实就是遍历
     */
    public static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

}
