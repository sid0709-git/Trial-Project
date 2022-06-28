package Udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sidc0709@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		
		 
	}
	
}
