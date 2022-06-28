package testng;

import org.testng.annotations.Test;

public class Tutorial4 {

	@Test
	public void Test7logoff() {
		// selenium code
		System.out.println("weblogoff");
	}

	@Test
	public void Test8logoff() {
		// appium
		System.out.println("Mobilelogoff");
	}

	@Test(groups={"SmokeTesting"})
	public void Test9logoff() {
		// Rest API automation 
		System.out.println("APIlogoff");
	}
}

