package javaPackage;

public class MethodOverload7 {

	// here same method name but observe at parameters

	public void sum(int a, long b) { 							// alternate parameters given here 
		System.out.println(a + b);
	}

	public void sum(long a, int b) {							// alternate parameters given here 
		System.out.println(a + b);
	}

	public static void main(String[] args) { 					// calling main method in same class
		
		MethodOverload7 mo7 = new MethodOverload7();		    // created object in same class
		
		//mo7.sum(10, 5); 										// Ambiguity Issue
	}

}
