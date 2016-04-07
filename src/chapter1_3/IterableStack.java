package chapter1_3;

import java.util.Iterator;

/**
 * Created by Admin on 2016/4/7.
 * 编写一个可迭代的Stack用例，它还有一个静态的copy()方法，接受一个字符串的栈作为参数并返回该栈
 * 的一个副本。注意：这种能力是迭代器价值的一个重要体现，因为有了它我们无需改变基本API就能够实现
 * 这种功能。
 */
public class IterableStack<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return new IterableStackIterator();
    }

    private class Node {
        Item item;
        Node next;
    }

    private Node first;
    private int N;

    public void push(Item item) {
        if (first == null) {
            first.item = item;
            N = 1;
        } else {
            Node oldF = first;
            first.item = item;
            first.next = null;
            oldF.next = first;
            N++;
        }
    }

    public Item pop() {
        if (first != null) {
            Item item = first.item;
            first = first.next;
            N--;
            return item;
        } else {
            return null;
        }
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0; //return first == null;
    }

    public Item peek() {
      return first.item;
    }

    public static IterableStack<String> copy(IterableStack<String> stack){
        IterableStack<String> out = new IterableStack<String>();
        while(!stack.isEmpty()){
            out.push(stack.pop());
        }
        return out;
    }

    private class IterableStackIterator implements Iterator<Item> {
        private Node temp = first;
        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public Item next() {
            Item item = temp.item;
            temp = temp.next;
            return item;
        }

        @Override
        public void remove() {}
    }
}
