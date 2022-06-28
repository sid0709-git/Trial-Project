package testng;

import org.testng.annotations.Test;

//Prioritization of TEST CASES

public class TestNG_4 {
	
	@Test(priority = -1)
	public void x() {
		System.out.println("X-test method will execute first");// will execute first
	}

	@Test(priority = 1)
	public void y() {
		System.out.println("Y-test method will execute third");// will execute third
	}

	@Test(priority = 0)
	public void z() {
		System.out.println("Z-test method will execute second");// will execute second
	}
	
	// Here if we take main method , we will have two option to run the code..
	public static void main(String[] args) {
		System.out.println("hello bolo");
	}
}
