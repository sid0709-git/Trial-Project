package testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_5 {
	// we can skip the tests by using this syntax= @Test(enabled=false)
	//OR simply by giving // this also we skip the test
	
	@Test
	public void star() {
		System.out.println("star test method");
	}

	@Test(enabled=false)
	public void moon() {
		System.out.println("moon test method");
	}
	
	//Test case Execution will be Three Times
	@Test(invocationCount = 3)
	public void sun() {
		System.out.println("sun test method");
}
	//Test case Execution will be 0 Times, means test case will be skipped...
	@Test(invocationCount = 0)
	public void solar() {
		System.out.println("solar test method");
}
	//we can skip test  using throw new method also..
	@Test
	public void galaxy() {
		System.out.println("galaxy test method");
		throw new SkipException("skip the test");
		//System.out.println("bap re");			// unreachable code
	}
}