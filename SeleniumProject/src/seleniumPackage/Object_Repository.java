package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Repository {
	public static Properties prop;
	public static void main(String[] args) throws Exception {
		 prop = new Properties();
		// Specify the location of properties file
		FileInputStream src = new FileInputStream("C:\\Users\\SIDDHARAM\\eclipse-workspace\\SeleniumProject\\Repository\\object_repo.properties");
	//	C:\Users\SIDDHARAM\eclipse-workspace\SeleniumProject\Repository
		// Create FileInputStream class object to read properties file
		prop.load(src);
		//FileInputStream fis = new FileInputStream(src);
		
		// Create Properties class object to read properties file
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.facebook.com");					//previously we wrote like this.
		driver.get(prop.getProperty("URL"));						//now we can write like this
		
//getProperty() method accept key and it returns value for the same key
//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");  //previously we wrote like this.
		
driver.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(prop.getProperty("TestData1")); //now we can write like this
driver.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("TestData2"));
	    Thread.sleep(3000);
	    driver.close();
		
		
		
	}

}
