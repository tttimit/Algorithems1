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

    private class Node{
        Item item;
        Node next;
    }

    private Node first;

    public void push(Item item){
        if(first == null){
            first.item = item;
        }else{
            Node oldF = first;
            Node node = new Node();
            node.item = item;
            node.next = null;
            first = node;
            oldF.next = first;
        }
    }

    private class IterableStackIterator implements Iterator<Item> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
