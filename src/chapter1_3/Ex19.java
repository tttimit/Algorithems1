package chapter1_3;

/**
 * Created by tttimit on 2016/4/14.
 *
 * 练习题1.3.19 给出一段代码，删除链表的尾节点，其中链表的首节点为first。
 */
public class Ex19 {
    /**
     * 链表的节点，假设数据为int类型
     */
    private class Node{
        private int date;
        private Node next;
    }
    public static void deleteTail(Node first){
        Node oldLast = first;
        while(first.next != null){
            oldLast = first;
        }
        oldLast.next = null;
    }
}
