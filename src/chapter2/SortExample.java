package chapter2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Admin on 2016/3/22.
 * 这个类展示的是数组排序实现的框架。
 */
public class SortExample {
    public static void sort(Comparable[] a){
        //各种待实现的排序算法
    }
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for(int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 1; i < a.length; i++)
            if(less(a[i], a[i - 1])) return false;
        return true;
    }

    public static void main(String[] args){
        String[] a = In.readStrings();
        sort(a);
        assert isSorted(a);//用来确认排序后的数组都是有序的
        show(a);
    }
}
