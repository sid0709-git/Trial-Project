package javaPackage;

public class Variables2 {

	int j = 23;                                            //Global variable
	
	static int y = 45;                                     //static variable
	
	public static void main(String[] args) {               //It is predefined method in java
		
		int r = 12;                                        //integer type local variable.
		System.out.println(r);
		System.out.println(y);
		System.out.println(f);
		anee();                                           //called anee(); method inside main method
	}

	static int f = 78;                                     //static variable.
	
	
	public static void anee() {                            // It is user defined method.
		int d = 98;                                        // integer type local variable.
		System.out.println(d);
	}
}
//important note-
//if we don't use static keyword in user defined method-"[public.... void anee() {]" 
//(before void) it will not print and accessible in main method.