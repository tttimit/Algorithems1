package chapter1_3;

import java.util.Iterator;

/**
 * Created by tttimit on 2016/4/24.
 * <p>
 * 练习题1.3.33 使用动态数组调整实现这份API的ResizingArrayDeque类。
 * <p>
 * 先不管泛型，假设用int来做
 */
public class ResizingArrayDeque implements Iterable {

    private int first;
    private int tail;
    private int N;
    private int[] array;

    public ResizingArrayDeque() {
        first = 0;
        tail = 0;
        N = 0;
        array = new int[10];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int targetArrLength) {
        int[] newArray = new int[targetArrLength];
        for (int i = 0; (first + i) % array.length < tail; i++) {
            newArray[i] = array[first + i];
        }
        array = newArray;
    }

    public void pushLeft(int item) {
    }

    public void pushRight(int item) {
    }

    public void popLeft() {
    }

    public void popRight() {
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }


}
