package testng;

import org.testng.annotations.Test;

public class Tutorial3 {

	@Test
	public void Test4login() {
		// selenium code
		System.out.println("weblogin");
	}

	@Test
	public void Test5login() {
		// appium
		System.out.println("Mobilelogin");
	}

	@Test(groups={"SmokeTesting"})
	public void Test6login() {
		// Rest API automation
		System.out.println("APIlogin");
	} 
}