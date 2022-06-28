package testng;

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
	driver.get("https://www.snapdeal.com/");
	Thread.sleep(4000);
	WebElement screen=driver.findElement(By.xpath("//div[@class='downloadAppTextCont']"));
	//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File file=screen.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file,new File("logo.png"));
	
}
}