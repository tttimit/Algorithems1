package chapter1_2;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by tttimit on 2016/3/24.
 * 文件输入。
 * 基于String的split()方法实现In中的静态方法readInts()。
 * 这个方法说白了就是逐个将字符串中的字符解析为int类型的数，
 * 存入一个数组中，当读取完毕后返回这个数组。
 */
public class Ex15 {
    public static void main(String[] args){
        int[] re = likeReadInts();
        for(int i = 0; i < re.length; i++){
            System.out.print(re[i] + " ");
        }
    }

    public static int[] likeReadInts(){
        String all = StdIn.readString();
        int[] res = new int[all.length()];
        for(int i = 0; i < res.length; i++){
            res[i] = Integer.parseInt(all.charAt(i) + "");
        }
        return res;
    }
}
