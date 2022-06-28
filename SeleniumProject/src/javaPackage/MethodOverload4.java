package javaPackage;

public class MethodOverload4 extends MethodOverload3 {
	
	public static void main(String[] args) {
		
		// No need to create object of class as its static method.  
		
		System.out.println(add(5,8));      //13       and called 'add' method from MethodOverload3
		
		System.out.println(add(6,9,3));   //18        and called 'add'  method from MethodOverload3
		
		
	}

}
