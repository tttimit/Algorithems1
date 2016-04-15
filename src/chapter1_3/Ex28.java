package chapter1_3;

/**
 * Created by Admin on 2016/4/15.
 * <p>
 * 练习题1.3.28 编写一个递归的方法max()，接受一条链表的首结点作为参数，返回链表中键最大的值。
 * 假设所有键均为正整数，如果链表为空则返回0。
 * </p>
 */
public class Ex28 {
    public static int max(Node<Integer> first) {
        if (first == null) {
            return 0;
        } else {
            int maxNumAfterCurrrentNode = max(first.next);
            return first.item < maxNumAfterCurrrentNode ? maxNumAfterCurrrentNode : first.item;
        }
    }
}
