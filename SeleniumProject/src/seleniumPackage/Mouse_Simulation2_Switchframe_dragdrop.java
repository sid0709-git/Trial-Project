package seleniumPackage;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Simulation2_Switchframe_dragdrop{

	public static void main(String[] args) throws Exception {
		// setting system property of chrome browser and passing chrome driver path
				System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();// launch browser instance
				driver.manage().window().maximize();// window maximize
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// using implicit wait
				driver.get("https://jqueryui.com/droppable/");// launching application
				Thread.sleep(3000);

				//Switching to frame
				List<WebElement> allframe= driver.findElements(By.tagName("iframe"));
				System.out.println("Total frames:- "+allframe.size());
				driver.switchTo().frame(0);
				
				//Find draggable element
				WebElement source = driver.findElement(By.id("draggable"));
				
				// Find droppable element
				WebElement target = driver.findElement(By.id("droppable"));
				
				//Using Action class to drag and drop web-element
				Thread.sleep(4000);
				Actions act = new Actions (driver);
				act.dragAndDrop(source, target).build().perform();
				
	}

}
