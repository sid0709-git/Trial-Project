package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Simulation1 {

	public static void main(String[] args) throws Exception {
		// setting system property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser instance
		driver.manage().window().maximize();// window maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// using implicit wait
		driver.get("https://www.flipkart.com/");// launching application
		Thread.sleep(3000);
		
		// to remove login window we copied x path of cross symboll and to click on cross symboll we used click method.
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		// Mouse simulation using action class
		Actions act = new Actions(driver);
		Thread.sleep(3000);

		// create webelement reference
		WebElement Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));

		// Mouse Hover on Electronics WebElement
		act.moveToElement(Electronics).build().perform(); // after action class we use build().perform()

		// Right click on webElement
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform(); // to right click on Electronics web element

		// Release control from webElement
		Thread.sleep(3000);
		act.release(Electronics).build().perform();

		// To perform Key events
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		// Press Enter key to HOME webElement
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		Thread.sleep(2000);
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("home menu is clicked");

	}

}
