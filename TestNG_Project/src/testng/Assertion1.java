package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	WebDriver driver;
	@Test
	public void testcase1() throws Exception {
		String expectedmsg = "sorry,we don't recognize this mail";
		
		 System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://login.yahoo.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.id("login-signin")).click();
		 Thread.sleep(3000);
		 
		 String actualmsg = driver.findElement(By.id("username-error")).getText();
		 
		 Assert.assertEquals(actualmsg, expectedmsg);
		 System.out.println("equal assertion verified");
		 
		 Thread.sleep(3000);
		 Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		 System.out.println("False assertion verified");
	}
	
	
	
}
