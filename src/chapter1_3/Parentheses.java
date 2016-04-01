package chapter1_3;

import edu.princeton.cs.algs4.StdIn;

import java.util.*;

/**
 * Created by Admin on 2016/3/31.
 * 判断括号是否配对完整
 * 从标准输入流中读取一个文本流并判断其中的括号是否配对完整。
 */
public class Parentheses {
    public static void main(String[] args) {
        String str1 = "";
        String[] ss = StdIn.readAllStrings();
        for (int i = 0; i < ss.length; i++) {
            str1 += ss[i];
        }

        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (isLeft(c))   //如果是左侧的符号，直接入栈
            {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    System.out.println("false");
                    return;
                }
                char temp = st.pop();
                switch (c) {
                    case ')':
                        if (temp != '(') {
                            System.out.print("false");
                            return;
                        }
                        break;
                    case ']':
                        if (temp != '[') {
                            System.out.print("false");
                            return;
                        }
                        break;
                    case '}':
                        if (temp != '{') {
                            System.out.print("false");
                            return;
                        }
                        break;
                    case '>':
                        if (temp != '<') {
                            System.out.print("false");
                            return;
                        }
                        break;
                    default:
                        break;
                }
            }
//            switch (c) {
//                case '(':
//                    st.push('(');
//                    break;
//
//                case '[':
//                    st.push("[");
//                    break;
//                case '{':
//                    st.push("{");
//                    break;
//                case '<':
//                    st.push("<");
//                    break;
//                default:
//                    break;
//            }
        }
        if (st.size() != 0)
            System.out.println("false");
        else
            System.out.println("true");
    }

    /**
     * 检查该字符是不是左括号
     *
     * @param c 待检查的字符
     * @return true  - 是左括号<br />
     * false - 是右括号
     * @throws RuntimeException 如果待判断的字符既不是左括号也不是右括号
     */
    private static boolean isLeft(char c) {
        boolean flag = false;
        if (c == '(' || c == '[' || c == '{' || c == '<')
            flag = true;
        else if (c == ')' || c == ']' || c == '}' || c == '>')
            flag = false;
        else
            throw new RuntimeException("待判断的字符并不是任何括号类的字符");
        return flag;
    }
}
