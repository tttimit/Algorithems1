package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Admin on 2016/4/11.
 * 编写一个Queue的用例，接受一个命令行参数k并打印出标准输入中的倒数第k个字符串（假
 * 设标准输入中至少有k个字符串）。
 */
public class UseCaseOfQueue {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        Queue<String> queue = new Queue<String>();
        while (!StdIn.isEmpty()) {
            queue.enQueue(StdIn.readString());
        }
        while (queue.size() > k) {
            queue.deQueue();
        }
        StdOut.println(queue.deQueue());
    }
}
