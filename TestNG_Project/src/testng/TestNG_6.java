package testng;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class TestNG_6 {

	@Test
	public void race1() {
		System.out.println("race1 test method");// 2
	}

	@Test(invocationCount = 2, priority = -1, enabled = false) // will not execute
	public void race2() {
		System.out.println("race2 test method");
	}

	@Test(invocationCount = 2)
	public void race3() {
		System.out.println("race3 test method");// 4,6
	}

	@BeforeMethod
	public void race4() {
		System.out.println("before test method");// 1,3,5
	}

}
