package Building.framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

import pageObject.Landingpage;
import resources.base;
@Listeners(Listener.class)
public class Validate_title extends base {
	public WebDriver driver;							// to run parellel test need to define at global level
	public static Logger log = LogManager.getLogger(base.class.getName());    // to generate log
	
	@BeforeTest
	public void initialize() throws Exception {
		driver = initializeDriver();
		log.info("driver is initialize");
		
		driver.get(prop.getProperty("url"));	             // here we fetching url from properties file
		log.info("navigated to home page");
		//driver.get("http://qaclickacademy.com"); 			// invokes url by hardcode
	}

@Test
public void basePageNavigation() throws Exception {
	driver.manage().window().maximize();
	 Landingpage l= new Landingpage(driver);			//created object of Landingpage
	 
	 //compare the text from browser with actual text
	 Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES_123");
	 log.info("validated text message successfuly");
	 
	 //check that navigation bar is present on homepage or not
	// l.getNavbar().isDisplayed();
	 Assert.assertTrue(l.getNavbar().isDisplayed());
	 log.info("validated navigation bar successfuly");
	 
}

@AfterTest
public void close() {
	driver.close();
}

}
		 
	 
	 







