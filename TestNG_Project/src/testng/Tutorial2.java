package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tutorial2 {
	
	@AfterTest
	public void last() {
		System.out.println("last method  will execute at last");
	}


	
	@Test(groups={"SmokeTesting"})
	public void Test3() {
		System.out.println("good to have you");
		
	}
@BeforeTest
public void first() {
	System.out.println("first method will execute on priority");
}
} 
