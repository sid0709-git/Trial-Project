package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {
		// setting system property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser instance
		driver.manage().window().maximize();// window maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// using implicit wait
		driver.get("https://paytm.com/");// launching application
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();

		// To find out total number of frames on web page
		int allframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames is :- " + allframes);

		// To go inside each frame and check if the web-element is present or not
		for (int i = 0; i < allframes; i++) {
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@role='button']")).click(); 

		}

	}

}
