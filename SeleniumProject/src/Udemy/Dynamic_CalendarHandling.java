package Udemy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_CalendarHandling {

	public static void main(String[] args) throws Exception {
// Set the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");

// start chrome
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// start application
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click(); // to remove notification on screen

// to click on from tab
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();

// to click Pune-option
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-4']")).click();

//to select destination- Mumbai
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();

// to click on departure tab
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(3000);

		// To select month value
		while (!driver.findElement(By.xpath("//div[@role='heading']")).getText().contains("June")) {
			driver.findElement(By.cssSelector("[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(3000);
		}

// this will find all matching nodes in calendar
//List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]/div[3]/div/div/div/p[1]"));
		
List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[3]/div/div[@class='DayPicker-Day']/div/p[1]"));
	

		for (WebElement date:dates) {
			String txt = date.getText();
			//Thread.sleep(3000);
			if (txt.equals("28")) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoViewIfNeeded();",date);
				               Thread.sleep(4000);
				               date.click();
				               Thread.sleep(2000);
				break;
				
				

			}
		}

	}

}
