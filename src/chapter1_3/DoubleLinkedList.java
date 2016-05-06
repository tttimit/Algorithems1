package chapter1_3;

/**
 * Created by Admin on 2016/4/16.
 * <p>
 * 练习题1.3.31 实现一个嵌套类DoubleNode用来构造双向链表，其中每个结点都含有一个指向前驱元素的引用和一项指向
 * 后继元素的引用（如果不存在则为null）。为以下任务实现若干静态方法：在表头插入结点、在表尾插入结点、从表头删
 * 除结点、从表尾删除结点、在指定结点之前插入新结点、在指定结点之后插入新结点、删除指定结点。
 * </p>
 */
public class DoubleLinkedList<Item> {
    private Node tail;
    private Node head;
    private int N;

    private class Node {
        private Item item;
        private Node prev;
        private Node next;
    }

    public void insAtHead(Item item) {
        Node node = new Node();
        node.item = item;
        Node oldHead = head;
        head = node;
        oldHead.prev = head;
        head.next = oldHead;
        N++;
    }

    public void insAtTail(Item item) {
        Node node = new Node();
        node.item = item;
        Node oldTail = tail;
        tail = node;
        tail.prev = oldTail;
        oldTail.next = tail;
        N++;
    }

    public void deleteAtHead() {
        if (head != null && head.next != null) {
            Node newHead = head.next;
            head.item = null;
            head.next = null;
            newHead.prev = null;
            head = newHead;
            N--;
        } else if (head != null && head.next == null) {
            head = null;
            tail = null;
        }
    }

    public void deleteAtTail() {
        if (tail != null && tail.prev != null) {
            Node newTail = tail.prev;
            newTail.next = null;
            tail.item = null;
            tail.prev = null;
            tail = newTail;
            N--;
        } else if (tail != null && tail.prev == null) {
            head = null;
            tail = null;
        }
    }

    public void insertBefore(Item item, Item pos) {
        Node currentNode = head;
        while(currentNode != tail){
            if(pos.equals(currentNode.item)){
                Node node = new Node();
                node.item = item;
                Node lastNode = currentNode.prev;
                lastNode.next = node;
                node.prev = lastNode;
                currentNode.prev = node;
                node.next = currentNode;
                N++;
            }
            currentNode = currentNode.next;
        }
        if(tail.item.equals(pos)){

        }

    }

    public void insertAfter(Item item, Item pos) {

    }

    public void delete(Item item) {

    }

}
