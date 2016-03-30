package chapter1_3;

import java.util.Iterator;

/**
 * Created by Admin on 2016/3/30.
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {
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
        public void remove() {
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < 10; i++) {
            int ee = (int) (Math.random() * 100);
            s.push(ee);
            System.out.print(ee + " ");
        }
        System.out.println();
        System.out.println("size is: " + s.size());
//        while(!s.isEmpty()){
//            System.out.print(s.pop() + " ");
//        }
        for (Integer e : s) {
            System.out.print(e + " ");
        }

    }

    private class Node {   // 定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;//或 first == null;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node oldF = first;
        first = new Node();
        first.item = item;
        first.next = oldF;
        N++;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }


}
