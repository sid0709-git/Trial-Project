package javaPackage;

public class Inheritance3 {

	int z; 										// declared 'z' gobal variable

	// user defined method-1
	public void add(int x, int y) {
		z = x + y; 								// Established relation
		System.out.println("sum is :" + z);
	}

	// user defined method-2
	public void subtract(int x, int y) {
		z = x - y; 								// Established relation
		System.out.println("subtraction is :" + z);

	}
}