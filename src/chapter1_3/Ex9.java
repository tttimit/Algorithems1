package chapter1_3;

/**
 * Created by Admin on 2016/3/31.
 * 从标准输入中得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。
 * 例如，给定输入：
 * 1 + 2) * 3 - 4) * 5 - 6)))
 * 应该得到输出：
 * ((1 + 2) * ((3 - 4) * (5 - 6)))
 */
public class Ex9 {
    public static void main(String[] args)
    {

    }

    public static String fff(String src)
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
