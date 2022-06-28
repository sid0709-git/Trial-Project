package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
@Test
public void testcase2() {
	String actualmsg= "Googgle";
	String expectedmsg= "Google";
	
	try {
		Assert.assertEquals(actualmsg, expectedmsg);
	} catch (Exception e) {

		e.printStackTrace();
	}
System.out.println("equal assertion pass");

}
}
