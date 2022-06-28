package seleniumPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handling {

	public static void main(String[] args) throws Exception {
		// setting system property of chrome browser and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser instance
		driver.manage().window().maximize();// window maximize
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// using implicit wait
		driver.get("https://demoqa.com/browser-windows");// launching application
		Thread.sleep(3000);

		// To print how many windows are opened
		Set<String> WindowsID = driver.getWindowHandles();   //used getwindowsHandles method
		System.out.println(WindowsID);
		System.out.println(WindowsID.size());

		//Iterator<String> abc = WindowsID.iterator();    // error has come here so not able to execute code......
		//String Windows1 = abc.next();
		//String Windows2 = abc.next();

		// To Print title of Pop-up window 2
		driver.switchTo().window("Window2");
		System.out.println("Window2");// alpha numeric id of pop up window 2
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		// To Print the title of Pop-up window 1
		driver.switchTo().window("Window1");
		System.out.println("Window1");// alpha numeric id of pop up window 1
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit(); // will close current as well associated window 2

	}

}
