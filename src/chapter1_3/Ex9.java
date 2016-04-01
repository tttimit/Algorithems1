package chapter1_3;

/**
 * Created by Admin on 2016/3/31.
 * 从标准输入中得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。
 * 例如，给定输入：
 * 1 + 2) * 3 - 4) * 5 - 6)))
 * 应该得到输出：
 * ((1 + 2) * ((3 - 4) * (5 - 6)))
 *
 * 自己的思考：
 * 括号都是成对出现的，现在是缺失了右括号，那么我逆序读入字符串，每当遇到一个右括号，
 * 就入栈。在逆序读取字符的郭晨规划总
 */
//TODO:这个题目没完成
public class Ex9 {
    public static void main(String[] args)
    {

    }

    public static String refillP(String src)
    {
        Stack<String> st = new Stack<String>();
        for(int i = 0; i < src.length(); i++)
        {
            char cur = src.charAt(i);

        }

        return "";
    }

    public static boolean isBracket(char ch)
    {
        if(ch == '(' || ch == ')')
            return true;
        return false;
    }

    public static boolean isNumber(char ch)
    {
        if(ch >= 0 && ch <= '9')
            return true;
        return false;
    }

    public static boolean isOperator(char ch)
    {
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;
        return false;
    }


}
