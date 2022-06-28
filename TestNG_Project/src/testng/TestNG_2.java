package testng;

import org.testng.annotations.*;
import org.testng.annotations.Test;

//we can use import org.testng.annotations.* also instead of importing package everytime.

public class TestNG_2 {

	@Test
	public void a() {
		System.out.println("a- test method");//5
	}

	@BeforeTest
	public void b() {
		System.out.println("b-before test ");//2
	}

	@BeforeSuite
	public void c() {
		System.out.println("c-before suite");//1
	}

	@AfterMethod
	public void d() {
		System.out.println("d- After method");//6,9
	}

	@BeforeClass
	public void e() {
		System.out.println("e- before class ");//3`
	}

	@AfterTest
	public void f() {
		System.out.println("f- Aftertest method"); //11 
	}

	@AfterClass
	public void g() {
		System.out.println("g- Afterclass");//10
	}

	@BeforeMethod
	public void h() {
		System.out.println("h- before method");//4,7
	}

	@AfterSuite
	public void i() {
		System.out.println("i-Aftersuite");//12-After suite-(at last will execute)
	}

	@Test
	public void j() {
		System.out.println("j- test method");//8
	}
}
