package chapter1_3;

import java.util.Iterator;

/**
 * Created by Admin on 2016/4/15.
 * <p>
 * 练习题1.3.29 用环形链表实现Queue。环形链表也是一条链表，只是没有任何结点的链接为空，且只要链表
 * 非空则last.next的值为first。只能用一个Node类型的实例变量(last)。
 * <p>
 * API:
 * isEmpty()
 * size()
 * enQueue()
 * deQueue()
 */
public class CircleQueue<Item> implements Iterable<Item> {
    private int N;
    private Node<Item> last;

    public void enQueue(Item item) {
        Node<Item> node = new Node<Item>();
        node.item = item;
        if (last == null) {
            last = node;
            last.next = last;
        } else {
            node.next = last.next;
            last.next = node;
        }
        N++;
    }

    public Item deQueue() {
        Node<Item> node = new Node<Item>();
        node = last.next;
        last.next = last.next.next;
        N--;
        return node.item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return new CircleQueueIterator();
    }

    private class CircleQueueIterator implements Iterator<Item> {
        private Node temp = last;
        private boolean flag = false;

        @Override
        public boolean hasNext() {
            while (temp != null) {
                Node oldTemp = temp;
                temp = temp.next;
                if (oldTemp == last)
                    return false;
                else
                    return true;
            }
            return false;
        }

        @Override
        public Item next() {
            return (Item)temp.item;
        }

        @Override
        public void remove() {

        }
    }
}
