package seleniumPackage;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot2 {


		public static void main(String[] args) throws InterruptedException, IOException {
		//	WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.amazon.in");

			// Need to convert the WebDriver object to Screenshot object, basically type cast the driver to TakeScreenshot.The output as File type - OutputType.FILE so that we can view it and sorting in file source
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);



			// To bring the file from source to local machine using FileUtils.copy



			//FileUtils.copyFile(source, new File("C:\\Users\\kuldeep.kumar\\screenshot.jpg"));



			// Here is one catch in program, if we run it multiple times then the image will be overridden, so to avoid this issue we need to add the time stamp with image as below
			// Define the Date format, object of date class and store the date format in string variable
			DateFormat df= new SimpleDateFormat("ddMMYYYY_ HHmmss");
			Date d= new Date(0);
			String TimeStamp =df.format(d);



			// Concatenate the time stamp with image
			Files.copy(source, new File("C:\\Users\\kuldeep.kumar\\screenshot"+TimeStamp+".jpg"));
			System.out.println("Screenshot taken successfully..!!");
			driver.close();
			}
			
	}


