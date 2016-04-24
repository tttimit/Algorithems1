package chapter1_3;

import java.util.Iterator;

/**
 * Created by tttimit on 2016/4/24.
 * <p>
 * 练习题1.3.33 Deque
 * 一个双向队列（或者称为deque)和栈或者队列相似，但它同时支持在两端添加或删除元素。
 * Deque能够存储一组元素并支持以下API：
 * <hr>
 * public class Deque<Item> implements Iterable<Item><br>
 * Deque(()<br>
 * isEmpty()<br>
 * size()<br>
 * pushLeft(Item item)<br>
 * pushRight(Item item)<br>
 * popLeft()<br>
 * popRight()
 */
public class Deque<Item> implements Iterable<Item> {
    private class Node {
        private Item item;
        private Node next;
        private Node prev;
    }

    private Node first;
    private int N;
    private Node tail;


    public Deque() {
        N = 0;
        first = null;
        tail = null;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void pushLeft(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first.prev = node;
        first = node;
        if (tail == null) {
            tail = first;
        }
        N++;
    }

    public Item popLeft() {
        if (first != null) {
            Item item = (Item) first.item;
            N--;
            first = first.next;
            first.prev = null;
            return item;
        } else return null;
    }

    public void pushRight(Item item) {
        Node node = new Node();
        node.item = item;
        tail.next = node;
        node.prev = tail;
        tail = node;
        if (first == null) {
            first = tail;
        }
        N++;
    }

    public Item popRight() {
        if (tail != null) {
            Item item = (Item) tail.item;
            tail = tail.prev;
            tail.next = null;
            N--;
            return item;
        } else return null;
    }


    @Override
    public Iterator<Item> iterator() {
        return new DeQueIterator();
    }

    private class DeQueIterator implements Iterator<Item> {
        private Node first;
        private Node tail;

        @Override
        public boolean hasNext() {
            return first == null;
        }

        @Override
        public Item next() {
            if (first != null) {
                Item item = first.item;
                first = first.next;
                return item;
            } else return null;
        }

        @Override
        public void remove() {
        }
    }
}
