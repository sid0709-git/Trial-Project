package javaPackage;

public class Inheritance7 extends Inheritance6 {

	public static void main(String[] args) {

		// here we inherited 'Inheritance5' & 'Inheritance6' class properties in 'Inheritance7' class.
	

		Inheritance7 i7 = new Inheritance7(); // created object of 'Inheritance7' class

		i7.write(); // Inherited property from Inheritance5 class

		i7.read(); // Inherited property from Inheritance6 class
	}

}
