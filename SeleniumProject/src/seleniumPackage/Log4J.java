package seleniumPackage;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Log4J {

	public static void main(String[] args) {
//we need to create logger instance so we need to pass class name for which we want to create log file

	Logger logger = Logger.getLogger("Log4J");
	
	
		// configure Log4J properties file
	PropertyConfigurator.
	("C:\\Users\\SIDDHARAM\\eclipse-workspace\\TestProject\\log4j.properties");
		
        // open chrome browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// launch browser instance
		logger.info("chrome browser instance opened");
		
		// window maximize
		driver.manage().window().maximize();
		logger.info("window maximized");
		
		//open url
		driver.get("https://www.facebook.com");
		logger.info("Facebook application launch"); 
	}

} 
 