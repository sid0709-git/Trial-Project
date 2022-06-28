package com.rediff.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Rediffloginpage;

public class LogintoApplication {
	
@Test
public void verifyLogin() {
	
	WebDriver driver =(WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	Rediffloginpage login = new Rediffloginpage(driver);
	login.Username();
	login.Password();
	login.Proceed();
	
}

	
}
