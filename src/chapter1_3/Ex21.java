package chapter1_3;

/**
 * Created by tttimit on 2016/4/14.
 * <p>
 * 练习题1.3.21 编写一个方法find()，接受一条链表和一个字符串key作为参数。如果链表中的某个节点的item
 * 值为key，则方法返回true，否则返回false。
 */
public class Ex21 {
    private class Node {
        private String data;
        private Node next;
    }

    /**
     * 目标方法
     *
     * @param first 待查找的链表
     * @param key   关键字
     * @return 如果链表中存在key，则返回true，否则返回false
     */
    public static boolean find(Node first, String key) {
        if (first == null )
            throw new RuntimeException("待查找的链表为空！");
        else if(key.length() == 0)
            throw new RuntimeException("待查找的key不能为空");
        else if (first.data.equals(key))
            return true;
        else {
            while (first.next != null) {
                first = first.next;
                if (first.data.equals(key))
                    return true;
            }
        }
        return false;
    }
}
