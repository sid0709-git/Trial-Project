package javaPackage;

public class Inheritance2 extends Inheritance1 {

	String name = "Samarth boss"; 					 // global variable

	public static void main(String[] args) {	     // created main method to execute code

		Inheritance2 i2 = new Inheritance2();		// create object of 'Inheritance2 class'
		
		System.out.println(i2.roll);				// inherited 'Inheritance1 class' property
		
		System.out.println(i2.name);

	}

}
