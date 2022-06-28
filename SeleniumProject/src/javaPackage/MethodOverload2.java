package javaPackage;

public class MethodOverload2 extends MethodOverload1{
	
	public static void main(String[] args) {
		
		// created object of class and called method from MethodOverload1
		
		MethodOverload2 mo2 = new MethodOverload2();
		mo2.sum(12, 15);			// 27
		mo2.sum(10, 5, 8);			//(a + b - c) i.e 7
		
	}

}
