package Building.framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import pageObject.Loginpage;
import resources.base;

public class Homepage extends base {
	public WebDriver driver;							// to run parellel test need to define at global level
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws Exception {
		driver = initializeDriver();
	}

	@Test(dataProvider = "getData") 
	public void basePageNavigation(String Username, String Password, String text) throws Exception {

		driver.get(prop.getProperty("url")); 			// here we fetching url from properties file
		//driver.get("http://qaclickacademy.com"); 		// here we fetching url by hardcode
		
		Landingpage l = new Landingpage(driver); 		// created object of Landingpage
		l.getlogin().click(); 							// l.getlogin() means driver.findElement(By.css()

		Loginpage lp = new Loginpage(driver);			 // created object of Logingpage
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		log.info(text);
		
		//System.out.println(text);
		Thread.sleep(3000);
		lp.getLogin().click();
		
	}
@AfterTest
public void close() {
	driver.close();
}
	
	@DataProvider
	public Object[][] getData() {
		// Row stands for how many diff.data type test should run
		// cloumns stands for how many values for each test
		Object[][] data = new Object[2][3]; // created array of 2 rows and 3 columns[size of array is 2R/3C]

		data[0][0] = "nonrestricteruser@qw.com"; // 0th row
		data[0][1] = "12345";
		data[0][2] = "Restricted user";

		data[1][0] = "restricteruser@qw.com"; // 1st row
		data[1][1] = "46677";
		data[1][2] = "NonRestricteruser";
		return data;
		//here browser will invokes for two times-
		// one for - "nonrestricteruser@qw.com"
		// second for-"restricteruser@qw.com"
	}
		
}




