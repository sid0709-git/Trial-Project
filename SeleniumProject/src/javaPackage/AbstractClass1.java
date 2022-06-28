package javaPackage;

public abstract class AbstractClass1 {

	static int a = 10;
	int b = 20;
	final int c = 30;
	// we can not create an object of abstract class/interface
	// default constructor
	AbstractClass1() {
		System.out.println("Hello Abstract class");
	}

	// abstract method
	abstract void eat();

	// non abstract method
	public void meet() {
		System.out.println("non abstract method");

	}
}
