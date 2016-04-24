package chapter1_3;

/**
 * Created by tttimit on 2016/4/24.
 * <p>
 * 练习题1.3.32 Steque。
 * 一个以栈为目标的队列（或称steque），是一种支持push、pop和enqueue操作的数据类型。
 * 为这种抽象数据类型定义一份API并给出一份基于链表的实现。（push、pop是对队列的同一
 * 端的操作，enqueue和push相对应，但操作的是队列的另一端。
 * <p>
 * API：<br>
 * size()<br>
 * isEmpty()<br>
 * push()<br>
 * pop()<br>
 * enqueue()
 */
public class Steque<Item> {
    private Node first;
    private Node tail;
    private int N;

    public void push(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        if (N == 0) {
            tail = first;
        }
        N++;
    }

    public Item pop() {
        if (first != null) {
            Item item = (Item) first.item;
            first = first.next;
            N--;
            return item;
        } else return null;
    }

    public void enqueue(Item item) {
        Node node = new Node();
        node.item = item;
        tail.next = node;
        tail = node;
        if (N == 0) {
            first = tail;
        }
        N++;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }
}
