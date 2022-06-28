package com.facebook.genericPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Masterpage {
	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	// Constructor created
	public Masterpage() throws IOException {

		// Configuration of properties file
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
				+ "C:\\Users\\SIDDHARAM\\eclipse-workspace\\shammi\\src\\main\\java\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// Configuration of Locators file
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")
				+ "C:\\Users\\SIDDHARAM\\eclipse-workspace\\shammi\\src\\main\\java\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SIDDHARAM\\eclipse-workspace\\shammi\\com.facebook.driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\SIDDHARAM\\eclipse-workspace\\shammi\\com.facebook.driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("open IE browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void enterData(String xpathkey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(or.getProperty(testData));
	}

	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}

	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}

	public void clickListElement(String xpathkey, String testData) {
		List<WebElement> radio = driver.findElements(By.xpath(xpathkey));
		for (int i = 0; i < radio.size(); i++) {
			if (radio.get(i).getText().equalsIgnoreCase(or.getProperty(testData)))
				;
			radio.get(i).click();
		}
	}
}
