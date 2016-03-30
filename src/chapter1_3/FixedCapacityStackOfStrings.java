package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by Admin on 2016/3/30.
 * 创建第一个抽象数据类型：定容栈
 * 这个栈中，存储String类型的数据，并且规定了栈的长度。
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }
    public boolean isEmpty()
    {
        return N == 0;
    }
    public int size(){
        return N;
    }
    public void push(String item)
    {
        a[N++] = item;
    }
    public String pop()
    {
        return a[--N];  //N是数组长度，但是数组的脚标是0到N-1
    }

    public static void main(String[] args)
    {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while(!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if(!item.equals("-"))
                s.push(item);
            else if(!s.isEmpty()) StdOut.print(s.pop()+" ");
        }
        StdOut.println("(" + s.size() + " left on stack()");
    }
}
