package chapter1_3;

import java.util.Iterator;

/**
 * Created by Admin on 2016/3/31.
 */
public class Bag<Item> implements Iterable<Item>{

    public static void main(String[] args){
        Bag<Integer> bag = new Bag<Integer>();

        for(int i = 0; i < 8; i++){
            int a = (int) (Math.random() * 100);
            bag.add(a);
            System.out.print(a + " ");
        }
        System.out.println();
        for (Integer e : bag) {
            System.out.print(e + " ");
        }
    }


    private class Node{
        private Node next;
        private Item item;
    }
    private Node first;
    private int N;
    public void add(Item item){
        Node oldF = first;
        first = new Node();
        first.item = item;
        first.next = oldF;
        N++;
    }
//    public void pop(){}

    public boolean isEmpty()
    {
        return N == 0;
    }
    public int size(){
        return N;
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Item>
    {
        Node temp = first;
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
