package chapter1_3;

/**
 * Created by Admin on 2016/4/2.
 *
 * 这个是别人实现的，拿过来运行一下看看
 */
public class Ex9_1 {

    private String completeParentese(String str) {
        Stack<String> optrStack = new Stack<>();
        Stack<String> dataStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (isDigit(str.charAt(i))) {
                // 处理数字的情况
                dataStack.push(String.valueOf(str.charAt(i)));
            } else if (isOpeartor(str.charAt(i))) {
                // 处理操作符的情况
                optrStack.push(String.valueOf(str.charAt(i)));
            } else {
                // 处理右括号的情况
                String d2 = dataStack.pop();
                String d1 = dataStack.pop();
                String opt = optrStack.pop();
                String exstr = "(" + d1 + opt + d2 + ")";
                dataStack.push(exstr);
            }
        }

        while (optrStack.size() > 0) {
            String opt = optrStack.pop();
            String d2 = dataStack.pop();
            String d1 = dataStack.pop();
            String exstr = "(" + d1 + opt + d2 + ")";
            dataStack.push(exstr);
        }

        return dataStack.pop();
    }

    private boolean isOpeartor(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    public static void main(String[] args) {
        String str = "1+2)*3-4)*5-6)))";
        Ex9_1 cp = new Ex9_1();
        String res = cp.completeParentese(str);
        System.out.println(res);
    }
}