package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_7 {
	
	@Test
	public void s() {
		Assert.assertTrue(4>15);				 //AssertionError: expected [true] but found [false]
		//Assert.assertTrue(20>15);
		System.out.println("s test method");
		  
	}
	
@Test(dependsOnMethods="s")
public void p() {
	System.out.println("p test method");		// p method will be skipped if s method is failed..
} 

}
