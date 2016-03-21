package chapter1;

public class IsEqual {
    public static void main(String[] args){
        int i1, i2, i3;
		if(args.length >= 3){
			i1 = Integer.parseInt(args[0]);
			i2 = Integer.parseInt(args[1]);
			i3 = Integer.parseInt(args[2]);
			if(i1 == i2 && i1 == i3)
				System.out.println("equal");
			else
				System.out.println("not equal");
		}else{
			System.out.println("not enough arguments");
		}		
    }
}
