package chapter1_3;

/**
 * Created by tttimit on 2016/4/14.
 *
 * 练习题1.3.24 编写一个方法removeAfter()，接受一个链表节点作为参数并删除该节点的后续节点（如果
 * 参数节点或参数节点的后续节点为空则什么也不做）
 */
public class Ex24 {
    private class Node{
        private int data;
        private Node next;
    }

    public static void removeAfter(Node first){
        if(first != null && first.next != null){
            first.next = null;
        }
    }
}
