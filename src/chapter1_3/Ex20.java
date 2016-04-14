package chapter1_3;

/**
 * Created by tttimit on 2016/4/14.
 * <p>
 * 1.3.20 编写一个方法delete()，接受一个int参数k，删除链表的第k个元素（如果它存在的话）。
 */
public class Ex20 {
    private class Node {
        private int date;
        private Node next;
    }

    /**
     * 删除传入链表的第k个元素（如果该元素存在）
     *
     * @param first
     * @param k
     */
    public static void delete(Node first, int k) {
        for(int i = 1; i < k; i++){
            if(first.next == null)
                return;
            else
            {
                first = first.next;
            }
        }

        if (first.next != null)
            first.next = first.next.next;
    }
}
