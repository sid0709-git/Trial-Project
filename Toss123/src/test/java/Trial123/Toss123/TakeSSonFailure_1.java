package Trial123.Toss123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeSSonFailure_1 {
WebDriver driver;

public void captureSS(ITestResult result) throws Exception {
	
	if(ITestResult.FAILURE==result.getStatus()) {
		
		//create ref of TakesScreenShot interface and type  casting of two interface
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		//use getScreenshotAs()method to capture screenshot in file format(return type= File)
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//copy file to specific location
		FileUtils.copyFile(source, new File("C:\\SOFTWARE\\screenshot.png"));
		System.out.println("screenshot captured");
	
	}
}
}
