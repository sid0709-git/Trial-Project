package javaPackage;

public class AbstractClass2 extends AbstractClass1  {
	
	void eat () {
		System.out.println("eating sugar");
	}
	// we can not create an object of abstract class/interface
	
	public static void main(String[] args) {
		
		AbstractClass2 ac2 = new AbstractClass2();
		     ac2.eat();
			ac2.meet();
			
		}
	

}



