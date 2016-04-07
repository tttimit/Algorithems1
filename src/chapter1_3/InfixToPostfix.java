package chapter1_3;

import static chapter1_3.Ex9.isOperand;

/**
 * Created by Admin on 2016/4/1.
 * 编写一段程序InfixToPostfix，将算术表达式由中序表达式转为
 * 后序表达式。
 * <p>
 * 中序表达式又称为中缀表示法，后续表达式又称为后缀表示法，即大名鼎鼎的
 * 逆波兰表示法。
 * <p>
 * 将中缀表示法转化为后缀表示法，使用的是经典的“调度场算法”，因为它像火
 * 车场的调度而得名。
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String test1 = "(1+2)*(3-4)+5*6";
        System.out.println(infix2Postfix(test1));

        String test2 = "(1 + 2 * 3) + 5 - 6 * ( 2 + 5)";
        System.out.println(infix2Postfix(test2));

        String test3 = "5+((1+2)*4)-3";
        System.out.println(infix2Postfix(test3));
    }

    /**
     * 将输入字符（默认是中缀表示法）转化为后缀表示法，并以一个字符串的形式输出
     *
     * @param in 待转化的中缀表达式
     * @return 转化完成的中缀表达式，以一个字符串的形式输出
     */
    public static String infix2Postfix(String in) {
        String out = "";
        Stack<Character> operands = new Stack<Character>();
        Stack<Character> operators = new Stack<Character>();

        for (int i = 0; i < in.length(); i++) {
            char current = in.charAt(i);
            if (current == ' ')  //遇到空格则跳过
                continue;
            if (isOperand(current)) {   //遇到操作数直接进操作数栈
                operands.push(current);
            } else if (operators.isEmpty() || current == '(') {
                operators.push(current);
            } else if (current == ')') {
                char temp = operators.pop();
                while (temp != '(') {
                    operands.push(temp);
                    if (!operators.isEmpty()) {
                        temp = operators.pop();
                    } else {
                        break;
                    }
                }
            } else {
                while (!operators.isEmpty()) {
                    char temp = operators.pop();
                    if (isHigherPriority(temp, current)) {
                        operands.push(temp);
                    } else {
                        operators.push(temp);
                        break;
                    }
                }
                operators.push(current);
            }
//            System.out.println("operand: " + operands.show());
//            System.out.println("operator: " + operators.show());
//            System.out.println("---");
        }


        while (!operators.isEmpty()) {
            operands.push(operators.pop());
        }

        while (!operands.isEmpty()) {
            out = operands.pop() + out;
        }

        return out;
    }


    private static boolean isParenthes(char current) {
        if (current == '(' || current == ')') {
            return true;
        } else {
            return false;
        }
    }

    /*
    如果temp优先级大于current，返回ture，否则返回false
     */
    private static boolean isHigherPriority(char temp, char current) {
        int p1 = getPriority(temp);
        int p2 = getPriority(current);
        if(p1 >= p2)
            return true;
        else
            return false;
    }

    private static int getPriority(char current) {
        int priority = 0;
        switch (current){
            case '*':
            case '/':
                priority = 2;
                break;
            case '+':
            case '-':
                priority = 1;
                break;

        }
        return priority;
    }

}
