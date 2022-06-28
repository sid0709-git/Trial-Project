package javaPackage;

public class ParameterizedConstructor {
	int id;
	String name;
	String address;

	// Default Constructor
	ParameterizedConstructor() {
		System.out.println("hello Default-Constructor");
	}

	// Parameterized Constructor
	ParameterizedConstructor(int a, String b, String c) {
		id = a;
		name = b;
		address = c;
	}

	// non static method
	public void displayinfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		// Default Constructor calling
		ParameterizedConstructor pc = new ParameterizedConstructor();

		// Parameterized Constructor calling
		ParameterizedConstructor pc1 = new ParameterizedConstructor(1, "ram", "pune");
		ParameterizedConstructor pc2 = new ParameterizedConstructor(2, "shyam", "mumbai");
		
		pc1.displayinfo();
		pc2.displayinfo();
	}

}
