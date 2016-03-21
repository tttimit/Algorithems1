package chapter1;
/*
 * 使用rank（）递归方法重新实现BinraySearch并跟踪该方法的调用。每当该方法被调用时，
 * 打印它的参数lo和hi并按照递归的深度缩进。提示：为递归方法添加一个参数来保存递归的深度。
 */
public class Ex1_22 {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i = 0; i < 100; i++)
			arr[i] = i;
		rank(21, arr);
	}
	
	public static int rank(int key, int[] a){
		return rank(key, a, 0, a.length-1 , 0); 
	}
	
	public static int rank(int key, int[] a, int lo, int hi, int depth){
		for(int i = 0; i < depth; i++)
			System.out.print(" ");
		System.out.printf("lo: %d - hi: %d\n", lo, hi);
		if(lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) return rank(key, a, lo, mid - 1, ++depth);
		else if(key > a[mid]) return rank(key, a, mid + 1, hi, ++depth);
		else return mid;
	}
	

}
