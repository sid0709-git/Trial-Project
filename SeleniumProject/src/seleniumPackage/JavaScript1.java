package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Exception {
		// setting system property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser instance
		driver.manage().window().maximize();// window maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// using implicit wait
		driver.manage().deleteAllCookies();// delete all cookies
		driver.get("https://www.facebook.com");// launching application

		// Type casting of two interfaces
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate WebElement using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value='abcd@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='abc@123'");

		// scroll down using Javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,400)");
	

		// scroll up using Javascript
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-400)");
	}

}
