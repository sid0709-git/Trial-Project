package javaPackage;

public class Inheritance4 extends Inheritance3 {

	public void multiply(int x, int y) {            // created multiply method
		z = x * y; 									// Established Relation
		
		System.out.println("Multiply is :" + z);
	}

	public static void main(String[] args) {  		// created main method to run code

		int x = 20, y = 10;						    // defined variable x and y
		
		Inheritance4 i4 = new Inheritance4();		// created object of Inheritance4-class

		i4.add(x, y);							    // called add method from Inheritance3 class
		
		i4.subtract(x, y);						    // called subtract method from Inheritance3 class
		
		i4.multiply(x, y);					    	// called multiply method 

	}
}
