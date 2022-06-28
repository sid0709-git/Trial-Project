package javaPackage;

public class Encapsulation1 {
	String name;
	int x;
	final int d = 4;

	public void SetName(String a) {
		this.name = a;
		this.x = 8;
		System.out.println(x);
		System.out.println(d);
		
	}

	public Object getName() {
		return name;

	}
}
