package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		// Enter Username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");

		// to get the typed text in a textbox we used getAttribute()method.....
		String Text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println("Given email input is:-  " + Text);

		// use explicit wait to check if password field is visible or not
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("12345");																	
		driver.close();

	}

}
