package chapter1_3;

import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Admin on 2016/4/11.
 * 编写一个类ResizingArrayQueueOfStrings，使用定长数组实现队列的抽象，然后扩展该实现，
 * 使用调整数组的方法突破大小的限制。
 * <p>
 * 设置一个初始的长度，然后当满了的时候，加倍其现有长度。
 * 当元素减少到当前1/4时，队列长度设置为减半。
 * <p>
 * API：<br />
 * size()<br />
 * isEmpty()<br />
 * push()<br />
 * pop()<br />
 * resize()
 */
public class ResizingArrayQueueOfStrings implements Iterable {

    public static void main(String[] args) {
        ResizingArrayQueueOfStrings raQueue = new ResizingArrayQueueOfStrings();
        System.out.print("add:");

        for (int i = 0; i < 50; i++) {
            String temp = "test" + (int)(Math.random() * 50);
            raQueue.enQueue(temp);
            StdOut.print(temp + " ");
        }
        System.out.println();
        System.out.print("pop:");
        for(int i = 0; i < 50; i++){
            StdOut.print(raQueue.deQueue() + " ");
        }
    }

    private String[] arr = new String[10];
    private int N = 0;
    private int first = 0;


    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void enQueue(String str) {
        if (N == 0) {
            arr[N++] = str;
        } else {
            arr[(first + N) % arr.length] = str;
            N++;
        }
        if (N == arr.length) {
            arr = resize(arr.length, 2 * arr.length);
        }
    }

    public String deQueue() {
        String out = "";
        if (N != 0) {
            N--;
            if (N == 1 / 4 * arr.length) {
                resize(arr.length, 1 / 2 * arr.length);
            }
            out = arr[first++];
        }
        return out;
    }

    private String[] resize(int oldLen, int newLen) {
        String[] newArr = new String[newLen];
        for (int i = 0; i < N; i++) {
            newArr[i] = arr[(first + i) % oldLen];
        }
        return newArr;
    }

    @Override
    public Iterator iterator() {
        return new ResizingArrayQueueOfStringsIterator();
    }

    private class ResizingArrayQueueOfStringsIterator implements Iterator {
        private int temp = first;
        private int tempLen = N;

        @Override
        public boolean hasNext() {
            return tempLen == 0;
        }

        @Override
        public String next() {
            String out = "";
            if (hasNext()) {
                out = arr[first % arr.length];
                first++;
                tempLen--;
            }
            return out;
        }

        @Override
        public void remove() {
        }
    }
}
