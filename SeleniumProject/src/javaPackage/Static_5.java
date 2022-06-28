package javaPackage;

public class Static_5 {

	String a; 						// global variable
	int b;  						// global variable
	static int c = 5;  				// static variable
	
//created-user defined-static method
	public static void gems() {
		System.out.println("Hello India");
	}
//created-user defined-non-static method
		public  void candy() {
			System.out.println("Hello Solapur");
			gems();                                  // called user defined-static method 
		}
		
	public static void main(String[] args) {         // predefined main method in java
		
		Static_5 s5 = new Static_5(); 				// created object of class Static_5
		
		s5.a="Hindu";                               // called global variable 'a' using object reference
		s5.b=786;                                   // called global variable 'b' using object reference
		s5.candy();                                  //called user defined-non-static method using object reference.
		//gems();                                   // called user defined-static method without object reference.
		
		System.out.println(s5.a+" "+s5.b+" ");
		System.out.println(c);
		

	}

}
