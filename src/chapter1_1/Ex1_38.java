package chapter1_1;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

/*
 * 二分查找与暴力查找
 * 根据1.1.10.4节给出的暴力查找法编写一个程序BruteForceSearch，在
 * 你的计算机上比较它和BinarySearch处理largeW.txt和largeT.txt
 * 所需的时间。
 */
public class Ex1_38 {

    public static void main(String[] args) {
        int key = 983392;


//        int[] lt = In.readInts("C:\\works\\IdeaProjects\\Algorithems1\\src\\chapter1_1\\largeT.txt");
        int[] lt = In.readInts("C:\\works\\IdeaProjects\\Algorithems1\\src\\chapter1_1\\largeW.txt");
        Arrays.sort(lt);

        double st = System.currentTimeMillis();
        int res = BruteForceSearch(key, lt);
        double et = System.currentTimeMillis();
        System.out.println("BruteForceSearch-----");
        System.out.print(res != -1 ? "find it!" : "not find");
        System.out.printf(" location is %d, use %f seconds.\n",  res, (et - st) / 1000 );



        st = System.currentTimeMillis(); //start time
        res = BinarySearch(key, lt);
        et = System.currentTimeMillis();
        System.out.println("BinarySearch-----");
        System.out.print(res != -1 ? "find it!" : "not find");
        System.out.printf(" location is %d, use %f seconds.\n",  res, (et - st) / 1000 );
    }

    private static int BruteForceSearch(int key, int[] a) {

        return rank(key, a);
    }

    /*
        二分查找
        缺点是待查找的数组必须是有序的
         */
    private static int BinarySearch(int key, int[] a) {
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
    书1.1.10.4里面的暴力查找算法
    其实就是遍历
     */
    private static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == key) return i;
        return -1;
    }

}
