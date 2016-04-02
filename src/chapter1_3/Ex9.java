package chapter1_3;

/**
 * Created by Admin on 2016/3/31.<br />
 * 从标准输入中得到一个缺少左括号的表达式并打印出补全括号之后的中序表达式。<br />
 * 例如，给定输入：<br />
 * 1 + 2) * 3 - 4) * 5 - 6)))<br />
 * 应该得到输出：<br />
 * ((1 + 2) * ((3 - 4) * (5 - 6)))<br />
 * <p>
 * 自己的思考：感觉不太对，废弃<br />
 * <del>括号都是成对出现的，现在是缺失了右括号，那么我逆序读入字符串，每当遇到一个右括号，<br />
 * 就入栈。在逆序读取字符的</del>
 * <p>
 * 网上看了一下，使用所谓的双栈法来解决比较好
 */
//TODO:这个题目没完成
public class Ex9 {
    public static void main(String[] args) {
        String src = "1+2)*3-4)*5-6)))";
        System.out.println(refillP(src));
    }

    public static String refillP(String src) {
        Stack<String> dataStack = new Stack<String>();
        Stack<String> operatorStack = new Stack<String>();

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (isOperand(ch))
                dataStack.push(ch + ""); //操作数，直接入栈
            else if (isOperator(ch)) {
                operatorStack.push(ch + ""); //操作符，直接入栈
            } else {
                String o1 = dataStack.pop();
                String o2 = operatorStack.pop();
                String o3 = dataStack.pop();
                String temp = "(" + o3 + o2 + o1 + ")";
                dataStack.push(temp);
            }
            //        /*
//        类似匹配字符串的做法，从右往左，遇到右括号，操作数，操作符，操作数，更高级的操作符，那么就把
//        右括号，操作数，操作符，操作数这四个结合起来，左侧添加一个括号。再放入stack中。
//         */
////        String[] checkList = new String[st.size()];
//        char lastOp = 0;
//        int flag = 0;
//        while(!st.isEmpty())
//        {
//            String cur = st.pop();
//            if(flag > 0){
//                if(bst.size() >= 3 && )
//            }
//            if(cur.equals(")")){
//                flag++;
//                bst.push(")");
//            }
//        }

//        boolean flag = false;
//        String temp = "";
//        char lastOp = 0;
//        while (!st.isEmpty()) {
//            String cur = st.pop();
//            if (cur.length() > 1)    //取出来的字符串长度大于1，说明是已经被括号包裹过的字符串
//                result = cur + result;  //拼到结果字符串左侧
//            else {   //取出的字符串长度等于1，说明是操作数，操作符或者括号，需要进行处理
//                char ch = cur.charAt(0);    //字符串长度只有，所以转化成字符，方便判断
//                if (ch == ')') {
//                    if(temp.contains(")"))
//                        bst.push(")");
//                } else if (isOperator(ch)) {
//                    if (isHigherPriority(ch, lastOp) && hasRightBracket(temp)) {
//                        //TODO:这里只能消耗掉temp中，离操作数最近的一个括号
//                        temp = "(" + temp;
//                        result = temp + result;
//                        temp = "";
//                    }
//                    temp = ch + temp;
//                }
//
//            }
//        }
        }
        while (operatorStack.size() > 0) {
            String opt = operatorStack.pop();
            String o2 = dataStack.pop();
            String o1 = dataStack.pop();
            String temp = "(" + o1 + opt + o2 + ")";
            dataStack.push(temp);
        }

        return dataStack.pop();
    }

    /**
     * 当前临时字符串右侧含有右括号，例如<br />
     * 1 + 2 ）：这种情况下，返回true<br />
     * 1 + 2 ))): 这种情况下，返回true<br />
     * 5 + 3 ： 这种情况下，返回false
     */
    private static boolean hasRightBracket(String temp) {
        if (temp.contains(")"))
            return true;
        else
            return false;
    }

    /**
     * 比较两个操作符的优先级
     *
     * @param ch
     * @param lastOp
     * @return 讨论优先级<br />
     * true: ch优先级高于lastOp<br />
     * false：ch优先级不高于lastOp（即优先级相同或者ch低于lastOp)
     */
    private static boolean isHigherPriority(char ch, char lastOp) {
        if (isMulOrDiv(ch) && isPlusOrMinus(lastOp))
            return true;
        else
            return false;
    }

    public static boolean isBracket(char ch) {
        if (ch == '(' || ch == ')')
            return true;
        return false;
    }

    public static boolean isOperand(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    public static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;
        return false;
    }

    public static boolean isOperator(String st) {
        if (st.length() > 1)
            return true;
        else
            return false;
    }

    public static boolean isPlusOrMinus(char ch) {
        if (ch == '+' || ch == '-')
            return true;
        else
            return false;
    }

    public static boolean isMulOrDiv(char ch) {
        if (ch == '*' || ch == '/')
            return true;
        else
            return false;
    }

}
