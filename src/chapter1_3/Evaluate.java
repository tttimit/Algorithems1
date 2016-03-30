package chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * Created by Admin on 2016/3/30.
 * 验证一下Dijkstra算法计算算术表达式
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
//        while (!StdIn.isEmpty()) {   //读取字符，如果是运算符则压入栈
//            String s = StdIn.readString();
        String s1 = "(1+2)";
        for(int i = 0;i < s1.length();i++){
            String s = s1.charAt(i) + "";
        if (s.equals("(")) ;
        else if (s.equals("+")) ops.push(s);
        else if (s.equals("-")) ops.push(s);
        else if (s.equals("*")) ops.push(s);
        else if (s.equals("/")) ops.push(s);
        else if (s.equals("sqrt")) ops.push(s);
        else if (s.equals(")")) {   // 如果字符是 "}"，弹出运算符和操作数，计算结果并压入栈
            String op = ops.pop();
            double v = vals.pop();
            if (op.equals("+")) v = vals.pop() + v;
            else if (op.equals("-")) v = vals.pop() - v;
            else if (op.equals("*")) v = vals.pop() * v;
            else if (op.equals("/")) v = vals.pop() / v;
            else if (op.equals("sqrt")) v = Math.sqrt(v);
            vals.push(v);
        }   // 如果字符既非运算符也不是括号，将它作为double数压入栈
        else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
