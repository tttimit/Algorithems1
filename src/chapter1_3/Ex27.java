package chapter1_3;

/**
 * Created by Admin on 2016/4/15.
 * <p>
 * 练习题1.3.27 编写一个方法max()，接受一条链表的首结点作为参数，返回链表中键最大的结点的值。
 * 假设所有键均为正整数，如果链表为空则返回0。
 */
public class Ex27 {
    public static int max(Node<Integer> first) {
        if (first == null) {
            return 0;
        } else {
            int i = first.item;
            while (first.next != null) {
                first = first.next;
                i = i < first.item ? first.item : i;
            }
            return i;
        }
    }
}
