package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_1
{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// to find web element on webpage we use findElement method() and provides x-path of webelement.
		// to open registration form on facebook we perform click() operation
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click(); // xpath manually created
		// driver.findElement(By.xpath("//a[@id='u_0_2_9A']")).click();                           // xpath using selector hub
	
	}

}
