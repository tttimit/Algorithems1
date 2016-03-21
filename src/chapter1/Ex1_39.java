package chapter1;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by TIMIT$ on 2016/3/21.
 * 随机匹配
 * 编写一个使用BinarySearch的程序，它从命令行接受一个整型参数T，并会分别针对
 * N=10^3、10^4、10^5、10^6将以下实验运行T遍：生成两个大小为N的随机6位正整数
 * 数组并找出同时存在于两个数组中的整数的数量。打印一个表格，对于每个N，给出T次
 * 实验中该数量的平均值。
 */
public class Ex1_39 {
    public static void main(String[] args) {
//        int T = Integer.parseInt(args[0]);
        int T = 10;
        double[][] result = new double[T][4];
        for (int i = 0; i < T; i++) {
            result[i][0] = match(createArr(1000), createArr(1000));
            result[i][1] = match(createArr(10000), createArr(10000));
            result[i][2] = match(createArr(100000), createArr(100000));
            result[i][3] = match(createArr(1000000), createArr(100000));
        }

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int match(int[] a, int[] b) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] == BinarySearch(a[i], b))
                count++;
        }
        System.out.println("now count is: " + count);
        return count;
    }

    /*
    生成大小为N的随机6位正整数数组
     */
    private static int[] createArr(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = StdRandom.uniform(100000, 1000000);
        }
        return arr;
    }

    private static int BinarySearch(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {//被查找数组的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
