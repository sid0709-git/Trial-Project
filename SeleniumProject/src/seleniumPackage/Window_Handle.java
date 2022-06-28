package seleniumPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		// Now we have to swith to new window by using getWindowHandles();method
		Set<String> windows = driver.getWindowHandles();
		
	    Iterator<String> it = windows.iterator();
		
		 
		String parentId = it.next();
		String childId = it.next();

		// switching to child window
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();

		System.out.println(driver.findElement(By.xpath("//ul[@class='clearfix']/li")).getText()); 
		driver.findElement(By.xpath("//ul[@class='clearfix']/li")).getText();
		
		// stored that get-text in string as emailId and split to get required text only.
		Thread.sleep(2000);
		String emailId = driver.findElement(By.xpath("//ul[@class='clearfix']/li")).getText().split("@")[1].trim();
		System.out.println("Email id to be entered: "+emailId);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("name")).sendKeys(emailId);
		
		// To find out no.of link present on the page
		Thread.sleep(3000); 	
		System.out.println("No.of links present on page : "+ driver.findElements(By.tagName("a")).size());

	} 

}
