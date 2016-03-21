package chapter1;

/**
 * Created by tttimit on 2016/3/11.
 * 打印一个二维布尔数组，真打印星号，假打印空格
 */
public class Ex1_11 {
    public static void main(String[] args) {
        boolean[][] arr;
        arr = new boolean[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                arr[i][j] = Math.random() > 0.5;

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                System.out.print(i + "-" + j + ":");
                if (arr[i][j])
                    System.out.print("*");
                else
                    System.out.print(" ");
                System.out.println();
            }
    }
}
