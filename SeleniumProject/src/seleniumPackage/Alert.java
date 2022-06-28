package seleniumPackage;

import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws Exception {
	
		// setting system property of chrome browser and passing chrome driver path
		
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser instance
		driver.manage().window().maximize();// window maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// using implicit wait
		driver.get("https://demoqa.com/alerts/");// launching application
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click(); 
		Thread.sleep(3000);
		
		//To get the Alert text
		System.out.println(driver.switchTo().alert().getText());
		
		String expResult = "Do you confirm action?"; 
		Assert.assertEquals(driver.switchTo().alert().getText(),expResult);   
		System.out.println("Alert text verified");
				
		//To Accept the Alert
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		System.out.println("alert is accepted");
		
		//To dismiss the alert
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("Alert is dismissed");
		driver.close();
	}

}
