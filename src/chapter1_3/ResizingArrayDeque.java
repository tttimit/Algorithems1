package chapter1_3;

import java.util.Iterator;

/**
 * Created by tttimit on 2016/4/24.
 * <p>
 * 练习题1.3.33 使用动态数组调整实现这份API的ResizingArrayDeque类。
 */
public class ResizingArrayDeque<Item> implements Iterable<Item> {

    private int first;
    private int tail;
    private int N;

    private Item[] arrays;

    public void pushLeft(Item item) {
        DoubleNode node = new DoubleNode();
        node.item = item;


    }

    public void pushRight(Item item) {
    }

    public void popLeft() {
    }

    public void popRight() {
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private void resize(int targetLength) {
    }

}
