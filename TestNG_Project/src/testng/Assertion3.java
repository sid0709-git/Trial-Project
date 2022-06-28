package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
@Test
public void testcase3() {
	
	int i = 223;
	int j= 223;
	
	
		Assert.assertTrue(i>j);

	System.out.println("Assertion fail");
}
}
