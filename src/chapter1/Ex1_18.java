package chapter1;

/**
*	里面是加号的时候，返回的是ab
	里面是星号的时候，返回的是a的(int)logb+1
*/
public class Ex1_18{
	public static void main(String[] args)
	{
		//System.out.println("mystery(2, 25) returns " + mystery(2, 25));
		//System.out.println("mystery(3, 11) returns " + mystery(3, 11));
		System.out.println("mystery("+args[0] +","+args[1]+") returns "+mystery(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
	public static int mystery(int a, int b)
	{
		if( b == 0) return 1;
		if(b % 2 == 0) return mystery(a * a, b/2);
		return mystery(a * a, b/2) + a;
	}
}