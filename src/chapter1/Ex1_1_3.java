package chapter1;

/**
 * Created by tttimit on 2016/3/10.
 */
public class Ex1_1_3 {
    public static void main(String[] args)
    {
        int s1, s2, s3;

//        if(null != args[0])
            s1 = Integer.parseInt(args[0]);
//        if(null != args[1])
            s2 = Integer.parseInt(args[1]);
//        if(null != args[2])
            s3 = Integer.parseInt(args[2]);

        if(s1 == s2 && s1 == s3)
            System.out.println("equal");
        else
            System.out.println("not equal");

    }
}
