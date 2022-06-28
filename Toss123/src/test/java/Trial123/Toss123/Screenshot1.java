package Trial123.Toss123;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.squarespace.com/");

		Thread.sleep(4000);
        //create webElement of target screen
		WebElement screen = driver.findElement(By.xpath("//div[@id='www-navigation-container']"));
		
		//use getScreenshotAs()method to capture screenshot in file format(return type= File)
		File file = screen.getScreenshotAs(OutputType.FILE);
		
		//copy file to specific location
		FileUtils.copyFile(file, new File("C:\\SOFTWARE\\screenshot.png"));

	}
}