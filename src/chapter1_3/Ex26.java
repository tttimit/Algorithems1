package chapter1_3;


/**
 * Created by Admin on 2016/4/15.
 * <p>
 * 练习题1.3.26
 * 编写一个方法remove()，接受一条链表和一个字符串key作为参数，删除链表中所有item域为
 * key的结点。
 */
public class Ex26 {
    public static Node remove(Node<String> first, String key) {
        if (first == null) {
            return null;
        } else {
            if (first.item.equals(key)) {
                first = first.next;
            }
            Node resultNode = first;    //头结点
            Node tempNode = first;      //用于删除中间节点的临时结点
            while (first != null) {
                if (first.item.equals(key)) { //当前结点的数据域与key相同
                    first = first.next;     //删除当前结点
                    tempNode.next = first;
                } else {                  //当前结点数据域与key不同，则正常向后移动
                    tempNode = first;
                    first = first.next;
                }
            }
            return resultNode;
        }
    }
}
