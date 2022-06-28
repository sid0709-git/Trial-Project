package testng;

import org.testng.annotations.Test;

public class Tutorial1 {
	
	@Test(groups={"SmokeTesting"})
	public void Test1() {
	System.out.println("hello testNG");
}
	@Test
	public void Test2() {
		
		System.out.println("bye bye");
		
	} 
}

//How to run test with testNG-?
//ans-you need to have @Test Annotation followed by method.
// you can define multiple tests from single class.
//you can modularized test cases based up on functionality and trigger them accordingly.
//you can get a control on a running specific methods from test case