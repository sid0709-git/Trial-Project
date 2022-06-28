package javaPackage;

public class ConstructorOverload1 {

	ConstructorOverload1() {
		System.out.println("no argument sent");
	}

	ConstructorOverload1(int a) {
		System.out.println("int argument sent");
	}

	ConstructorOverload1(String b) {
		System.out.println("string  argument sent");

	}
	
	public static void main(String[] args) {
		ConstructorOverload1 co1 = new ConstructorOverload1();
		ConstructorOverload1 co2=  new ConstructorOverload1(1);
		ConstructorOverload1 co3=  new ConstructorOverload1("boss");
	}
}

