package chapter1_3;

import java.util.Iterator;

/**
 * Created by Admin on 2016/3/30.
 */
public class Queue<Item> implements Iterable<Item>{
    private class Node{
        private Item item;
        private Node next;
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item>{
        Node temp = first;
        @Override
        public boolean hasNext() {
            return temp == last.next; //return temp == null;
        }

        @Override
        public Item next() {
            Item item = temp.item;
            temp = temp.next;
            return item;
        }

        @Override
        public void remove() {

        }
    }

    private Node first;
    private Node last;
    private int N;

    public void enQueue(Item item)
    {
        Node oldL = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first = last;
        else oldL.next = last;
        N++;
    }

    public Item deQueue()
    {
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        N--;
        return item;
    }

    public boolean isEmpty()
    {
        return N == 0; //return first == null;
    }

    public int size()
    {return N;}

}
