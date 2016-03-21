package chapter1;

public class IsInZeroAndOne{
	public static void main(String[] args){
		double d1, d2;
		if(args.length >= 2)
		{
			d1 = Double.parseDouble(args[0]);
			d2 = Double.parseDouble(args[1]);
			if(d1 > 0 && d1 < 1 && d1 > 0 && d2 < 1){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}else{
			System.out.println("not enough arguments");
		}
	}
}