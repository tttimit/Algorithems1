package chapter1_3;

import static chapter1_3.Ex9.isOperand;

/**
 * Created by Admin on 2016/4/1.
 * 编写一段程序InfixToPostfix，将算术表达式由中序表达式转为
 * 后序表达式。
 *
 * 中序表达式又称为中缀表示法，后续表达式又称为后缀表示法，即大名鼎鼎的
 * 逆波兰表示法。
 *
 * 将中缀表示法转化为后缀表示法，使用的是经典的“调度场算法”，因为它像火
 * 车场的调度而得名。
 */
public class InfixToPostfix {
    public static void main(String[] args){

    }

    /**
     * 将输入字符（默认是中缀表示法）转化为后缀表示法，并以一个字符串的形式输出
     * @param in 待转化的中缀表达式
     * @return 转化完成的中缀表达式，以一个字符串的形式输出
     */
    public static String infix2Postfix(String in)
    {
        String out = "";
        Stack<Character> operands = new Stack<Character>();
        Stack<Character> operators = new Stack<Character>();

        for(int i = 0; i < in.length(); i++)
        {
            char current = in.charAt(i);
            if(isOperand(current))
                operands.push(current);
            else{

            }
        }


        return out;
    }

}
