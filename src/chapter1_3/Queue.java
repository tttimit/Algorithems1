package chapter1_3;

import java.util.Iterator;

/**
 * Created by Admin on 2016/3/30.
 */
public class Queue<Item> implements Iterable<Item> {

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item> {
        DoubleNode temp = first;

        @Override
        public boolean hasNext() {
            return temp == last.next; //return temp == null;
        }

        @Override
        public Item next() {
            Item item = (Item) temp.item;
            temp = temp.next;
            return item;
        }

        @Override
        public void remove() {
        }
    }

    private DoubleNode first;
    private DoubleNode last;
    private int N;

    public void enQueue(Item item) {
        DoubleNode oldL = last;
        last = new DoubleNode();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldL.next = last;
        N++;
    }

    public Item deQueue() {
        Item item = (Item) first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

    public boolean isEmpty() {
        return N == 0; //return first == null;
    }

    public int size() {
        return N;
    }

}
