package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Url {

	public static void main(String[] args) throws Exception {
		
		// set the property for chrome driver and passing the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		
		// launching chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		// launching the application URL using get() method
		driver.get("http://wwww.facebook.com");
		
		// launching the application URL using navigate() method
		driver.navigate().to("http://www.google.com");
		
		// to refresh the page
		Thread.sleep(4000);					 	// to pause window for 4 seconds
		driver.navigate().refresh();
	
		// navigate to back
		Thread.sleep(3000); 					// to pause window for 3 seconds
		driver.navigate().back();
		
		// navigate to forward
		Thread.sleep(4000); 					// to pause window for 4 seconds
		driver.navigate().forward();
		
		// navigate to back
		Thread.sleep(3000); 					// to pause window for 3 seconds
		driver.navigate().back();
		
		// To find out no.of link present on the page
		Thread.sleep(3000); 	
		System.out.println(driver.findElements(By.tagName("a")).size());
	}

}
