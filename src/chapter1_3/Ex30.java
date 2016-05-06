package chapter1_3;

/**
 * Created by Admin on 2016/4/15.
 * <p>
 * 练习题1.3.30 编写一个函数，接受一条链表的首结点作为参数，（破坏性地）将链表反转并返回结果链表的
 * 首结点。
 */
public class Ex30 {
    public static Node reverse(Node first) {
        if (first != null) {
            Node newList = null;
            Node currentNode = null;
            Node oldList = first;
            while (oldList != null) {
                currentNode = oldList;
                oldList = oldList.next;
                currentNode.next = newList;
                newList = currentNode;
            }
            return newList;
        } else {
            return null;
        }
    }

    public static Node recursivelyReverse(Node first) {
        if (first == null) return null;
        if (first.next == null) return first;
        Node second = first.next;
        Node result = recursivelyReverse(second);
        second.next = first;
        first.next = null;
        return result;
    }
}
