package chapter1_2;

/**
 * Created by Admin on 2016/3/24.
 * 这个递归函数的返回值是什么
 *
 * 返回的是前后颠倒的字符串
 */
public class Ex7 {
    public static void main(String[] args)
    {
        System.out.println(mystery(args[0]));
    }

    public static String mystery(String s)
    {
        int N = s.length();
        if(N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }

}
