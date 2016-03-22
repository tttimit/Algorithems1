package chapter1_1;

/**
 * Created by tttimit on 2016/3/11.
 * 打印一个M行N列数组的转置（交换数组行和列）
 */
public class Ex1_13 {
    public static void main(String[] args){
        int[][] arr;
        int M = 5;
        int N = 5;
        arr = new int[M][N];
        for(int i = 0; i < M; i++)
            for(int j = 0; j < N; j++)
                arr[i][j] = (int)(Math.random() * 10);
        printArr(arr, M, N);

        int[][] newArr = zhuanzhiArr(arr, M, N);
        System.out.println("----------------");
        printArr(newArr, N, M);
    }

    private static int[][] zhuanzhiArr(int[][] arr, int m, int n) {
        int[][] newArr = new int[n][m];
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                newArr[j][i] = arr[i][j];
        return newArr;
    }

    public static void printArr(int[][] arr, int row, int col){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
