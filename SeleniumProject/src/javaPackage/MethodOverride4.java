package javaPackage;

public class MethodOverride4 extends MethodOverride3 {
	
	public void run () {
		System.out.println("siddhu is running");
}
	public static void main(String[] args) {
		
		MethodOverride4 mo4 = new MethodOverride4();    //  created child class object
		mo4.run();
		
		MethodOverride3 mo3 = new MethodOverride3();     // intentionally created parent class object
		mo3.run();
	}
}
