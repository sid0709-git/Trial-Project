package javaPackage;

public class MethodOverload6 extends MethodOverload5 {
	
	public static void main(String[] args) {
		
		// No need to create object of class as its static method.  
		
		System.out.println(add(23, 24));      //47 				and called 'add' method from MethodOverload5
		
		System.out.println(add(10.5, 12.5)); //23.0 			and called 'add' method from MethodOverload5
	}

}
