package testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {

	@Test
	public void rat_A() {
		System.out.println("rat says chi,chi");
	}

	@BeforeTest
	public void dog_B() {
		System.out.println("dog says bhoww,bhoww");
	}

	@BeforeSuite
	public void cat_C() {
		System.out.println("cat says meawww,meawww");
	}

	@Test
	public void x() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}
}
