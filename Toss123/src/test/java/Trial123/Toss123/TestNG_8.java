package Trial123.Toss123;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_8 {
	WebDriver driver;

	@BeforeTest
	
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

//Get current date and time
	public String getDateAndTime(){
	DateTimeFormatter currentDateAndTime = DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return currentDateAndTime.format(now);
	}

@DataProvider
public Object[][] dataset() throws Exception{
	//specify property file location
	File src = new File("C:\\Users\\SIDDHARAM\\eclipse-workspace\\SeleniumProject\\Repository\\object_repo.properties");
	//create FileInputStream class object to load file
	FileInputStream fis = new FileInputStream(src);
	//create Properties class object to read properties file
	Properties pro=new Properties();
	pro.load(fis);
	
	//to pass multiple data to application-take object class and multidimensional array
	Object arr [][]=new Object[3][2];
	//create object of TestNG_8 and pass the data
	TestNG_8 t8 = new TestNG_8();
	
	arr[0][0]=pro.getProperty("TestData1")+" "+ t8.getDateAndTime();
	arr[0][1]=pro.getProperty("TestData2");
	
	arr[1][0]="Email_2";
	arr[1][1]="password_2";
	
	arr[2][0]="Email_3";
	arr[2][1]="password_3";
	return arr;
}
@Test(dataProvider="dataset")

public void Enterdata(String user,String pass) throws Exception {
	Thread.sleep(3000);
	driver.findElement(By.id("email")).sendKeys("username");
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys("password");
	Thread.sleep(3000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(3000);
}
}


