package javaPackage;

public class Typecasting_Narrowing {

	public static void main(String[] args) {
		double a = 23.14;
		double b = 45.99;
		int d = (int) a ; 			//manualy casting double to int 
		int f = (int)b;				//manualy casting double to int 
		
		System.out.println(a);		//23.14
		System.out.println(b);		//45.99
		System.out.println(d);		//23 				   (narrowing of a)
		System.out.println(f);		//45 				   (narrowing of b)
		
		// To convert 'int' into string
		int z = 12;
		String s = String.valueOf(z);
		System.out.println(s);	//12
		
		String h = Integer.toString(z);
		System.out.println(h);	// 12
		
		//  To convert string  into 'int'
		String k = "500";
		int i = Integer.parseInt(k);
		System.out.println(i); //500
		
		
		
		
		
		
		
		
	}

}
