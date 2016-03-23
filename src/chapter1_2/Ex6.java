package chapter1_2;

/**
 * Created by tttimit on 2016/3/23.
 * 如果字符串中的字符循环移动任意位置之后能够得到另一个字符串t，那么s就被称为t的
 * 回环变位（circular rotation）。例如，ACTGACG就是TGACGAC的一个回环变位，反
 * 之亦然。判定这个条件在基因组序列的研究中是很重要的。编写一个程序检查两个给定的
 * 字符串s和t是否互为回环变位。提示：答案只需要一行用到indexOf()、length()和字
 * 符串连接的代码。
 */
public class Ex6 {
    public static void main(String[] args) {

    }

    public static boolean checkCR(String a, String b) {
        if (a.length() != b.length()) return false;
        else if (a.equals(b)) return false;
        else {
            String a2 = a + a;
//            boolean flag = false;
            for (int i = 0, j = 0; i < a2.length(); ) {
                if (a2.charAt(i) == b.charAt(j)) {
                    i++;
                    j++;
                    if (j == b.length() - 1)
                        return true;
                } else {
                    if (j != 0) {
                        i += j; //跳过没必要的比较
                    } else {
                        i++;
                    }
                    j = 0;
                }
            }
            return false;
//            int index = 0;
//            for (int i = 0; i < a.length(); i++) {
//                if (i == 0)
//                    index = b.indexOf(a.charAt(i)) % a.length();
//                else {
//                    if ((b.indexOf(a.charAt(i)) % a.length()) != index)
//                        return false;
//                }
//            }                 return false;
        }

    }

}
