package javaPackage;

public class LogicalOperator {

	public static void main(String[] args) {
		int x = 10;                // local variable
		int y = 20;                // local variable
		int z = 30;                // local variable
		
		//logical && operator-
		 System.out.println(x>y && z>y);        // will print 'false' as first condition is not satisfied
		 
		 System.out.println(z>x && z>y);        // will print 'true' as first and second conditions are satisfied.
		 
		 System.out.println(x<y && x++ < y);    // will print 'true' as first and second conditions are satisfied.
		
		//bitwise & operator-
         System.out.println(y>z & z>x);        // false,true --it will print false
         System.out.println(y>x & y>z);        // true,false --it will print false
         System.out.println(x>z & y>z);        // false,false --it will print false
         System.out.println(z>y & z>x);        // true,true --it will print true
         System.out.println(z>x & y++ > x);    // true,true --it will print true
	}

}
