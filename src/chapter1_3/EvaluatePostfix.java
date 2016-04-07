package chapter1_3;

import static chapter1_3.Ex9.isOperand;

/**
 * Created by Admin on 2016/4/7.
 * 编写一段程序EvaluatePostfix，从标准输入中得到一个后序表达式，求值并打印结果。
 */
public class EvaluatePostfix {
    public static void main(String[] args){
//        String in = args[0];
//        String in = "5 1 2 + 4 * + 3 −";

        String in = "51+2*";

        System.out.println("result: " + evaluatePostfix(in));
    }

    public static String evaluatePostfix(String in) {
        String out = "";
        Stack<Double> operands = new Stack<Double>();
        for(int i = 0; i < in.length(); i++){

            char current = in.charAt(i);
            if(current == ' ')
                continue;
            else if(isOperand(current))
                operands.push(Double.parseDouble(current+""));
            else{
                double op2 = operands.pop();
                double op1 = operands.pop();
                double result = 0;
                switch (current){
                    case '*':
                        result = op1 * op2;
                        break;
                    case '-':
                        result = op1 - op2;
                        break;
                    case '+':
                        result = op1 + op2;
                        break;
                    case '/':
                        result = op1 / op2;
                        break;
                }
                operands.push(result);
            }
        }
        out = operands.peek() + "";
        return out;
    }
}
