package chapter1_3;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Admin on 2016/3/30.
 *
 * 继承Iterable接口是为了使其能够使用foreach来进行迭代，每次迭代返回的是迭代器
 * 继承Iterator接口是让他成为迭代器
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(Item i) {// 这里添加一个额外的操作：判断一下当前的大小，决定并执行扩容
        if (N == a.length) resize(2 * a.length);
        a[N++] = i;
    }

    public Item pop() {   //这里要注意，如果单纯移除一个元素，那么会出现无主引用，并且不会被GC回收
        Item item = a[--N];
        a[N] = null;    //这就是避免对象游离的操作
        if (N > 0 && N == 1 / 4 * a.length) resize(a.length / 2);  //当占用只有1/4时，缩为原来的一般
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    /*
    套接类
     */
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return N == 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() { //使其不能移除元素
        }
    }
}
