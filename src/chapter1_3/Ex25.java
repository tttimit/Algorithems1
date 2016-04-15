package chapter1_3;

import chapter1_3.Ex21.Node;

/**
 * Created by tttimit on 2016/4/14.
 * <p>
 * 练习题1.3.25 编写一个方法insertAfter()，接受两个链表节点作为参数，将第二个节点插入链表并使之
 * 成为第一个节点的后续节点（如果两个参数为空则什么也不做）。
 * </p>
 */
public class Ex25 {
    public static void insertAfter(Node first, Node second) {
        if (first != null && second != null) {
            Node oldTail = first.next;
            first.next = second;
            while(second.next != null){
                second = second.next;
            }
            second.next = oldTail;
        }
    }
}
