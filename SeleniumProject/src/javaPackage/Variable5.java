package javaPackage;

public class Variable5 {
	       int j = 45;                                       //global variable
	       int b = 76;                                       //global variable
	       int s = 55;                                      // global variable
	static int k = 98;                                       //static variable
	
	public static void main(String[] args) {
		int n = 29;                                         // local variable
		
		// to create a object of any class use ->>-ClassName Refname = new ClassName();
		
		Variable5 V5 = new Variable5();                    // created object of a 'Variable5' class
		System.out.println(V5.j);                          // calling a (global) variable using Object reference.
		System.out.println(V5.b);                          // calling a (global) variable using Object reference.
		System.out.println(V5.s);                          // calling (global) variable using object reference
		System.out.println(k);                             // calling a (static) variable.
		x();                                               // calling x() method in Main method.
		
	}

	public static void x() {                               // user defined x()-method
		int m = 19;                                        // local variable
		float r = 2.2f;
		System.out.println(r);
		System.out.println(m);
		System.out.println("hello automation");
		System.out.println("hello lokesh");
		
	}
}

