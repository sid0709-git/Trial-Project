package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver ;   // set as global variable so that it can be accessible in every method,class.
	public Properties prop;    // set as global variable so that it can be accessible in every method,class.
	
	public WebDriver initializeDriver() throws Exception { 			// return WebDriver
	
		 prop = new Properties();				
		
		FileInputStream fis = new FileInputStream("C:\\Users\\SIDDHARAM\\eclipse-workspace\\framework\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		
		String brName = prop.getProperty("browser"); 
		
		if (brName.equals("chrome") ) {
			System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			// execute code in chrome driver
			 
		} else if (brName.equals("Firefox")) {
			driver = new FirefoxDriver();
			// execute code in firefox
			
		} else if (brName.equals("IE")) {
			// execute code in IE
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//sending driver object back so, whoever want use this method they can use it by simply calling this method-  [initializeDriver()]
		return driver;
	}

	public void getScreenShot(String testcasename) throws IOException  {
		//TakesScreenshot ts =(TakesScreenshot)driver;
	//	File source= ts.getScreenshotAs(OutputType.FILE);
		 File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String dstnfile= System.getProperty("C:\\Users\\SIDDHARAM\\eclipse-workspace\\framework\\screenshots")+testcasename+"_"+".png";
		//FileUtils.copyFile(source, new File(dstnfile));
		FileUtils.copyFile(source,new File("C:\\Users\\SIDDHARAM\\eclipse-workspace\\framework\\src\\screenshots\\"+testcasename+"_"+".png"));
	//	FileUtils.copyFile(source, new File("logo.png"));
	}
	

   
    
}
