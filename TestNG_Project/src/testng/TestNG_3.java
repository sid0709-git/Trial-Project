package testng;

import org.testng.annotations.Test;

//Sequencing of TEST CASES-it will follow alphanumeric order...

public class TestNG_3 {
	
	@Test
	public void a3() {
		System.out.println("a3 test method");
	}

	@Test
	public void a2() {
		System.out.println("a2 test method");
	}

	@Test
	public void z() {
		System.out.println("z test method");
	}

	@Test
	public void q() {
		System.out.println("Q test method");
	}
}
