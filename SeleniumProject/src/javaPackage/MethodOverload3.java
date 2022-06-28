package javaPackage;

public class MethodOverload3 {
	
	static int add(int a, int b) {
		return a + b;
	}

	//same method name but different parameters
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
