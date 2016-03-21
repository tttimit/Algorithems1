package chapter1;

/**
 * Created by tttimit on 2016/3/11.
 * 编写一个静态方法histogram()，接受一个整形数组a[]和一个整数M作为参数并返回一个大小
 * 为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1
 * 之间，返回数组中所有元素之和应该和a.length相等。
 */
public class Ex1_15 {
    public static void main(String[] args) {
    	int N = 100;
    	int[] arr = new int[N];
    	int[] resultArr;
    	
    	for(int index = 0; index < arr.length; index++)
    	{
    		arr[index] = (int)(Math.random() * N);
    	}
    	printArr(arr);
    	System.out.println("---------");
    	resultArr = histogram(arr);
    	printArr(resultArr);
		/* test
		int total = 0;
		for(int i = 0; i < resultArr.length; i++)
			total += resultArr[i];
		System.out.println("total: " + total);
		*/
    }

    private static int[] histogram(int[] a) {
        int[] resArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resArr[i] = occurs(a, i);
        }
        return resArr;
    }
    
    private static int occurs(int[] arr, int i){
    	int count = 0;
    	for(int index = 0; index < arr.length; index++){
    		if(i == arr[index])
    			count++;
    	}
    	return count;
    }
    
    private static void printArr(int[] arr)
    {
    	for(int i = 0; i < arr.length; i++)
    	{
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }
}
