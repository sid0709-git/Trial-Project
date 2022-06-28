package Trial123.Toss123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeSSonFailure_2 {
	
	 TakeSSonFailure_1 t1 = new  TakeSSonFailure_1();
	 
	 @Test
	 public void login() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		 t1.driver= new ChromeDriver();
		 t1.driver.manage().window().maximize();
		 t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 t1.driver.get("https://www.facebook.com/");
		 Thread.sleep(3000);
		 t1.driver.findElement(By.id("email")).sendKeys("abd@gmail.com");
		 t1.driver.findElement(By.id("pass")).sendKeys("12345");
		 
		 //pass wrong id so that our test will fail
		 t1.driver.findElement(By.id("login_button_wrong_id")).click();
	 }

	 @AfterMethod
	 public void TakeSSonfailure(ITestResult result2) throws Exception {
		 t1.captureSS(result2);
	 }
}
	 


