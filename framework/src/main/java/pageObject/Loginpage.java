package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	public WebDriver driver;						// globally defined variable
	
	By Email = By.id("user_email");
	By Password = By.id("user_password");
	By Login = By.xpath("//input[@value='Log In']");

	public Loginpage(WebDriver driver) { 				// created constructor
		this.driver=driver;
	}

	public WebElement  getEmail() {					  // here we are returning a WebElement 
		return driver.findElement(Email); 			  // returning driver
		
	}
	public WebElement  getPassword() {					// here we are returning a WebElement 
		return driver.findElement(Password); 			// returning driver
		
	}
	public WebElement  getLogin() {					  // here we are returning a WebElement 
		return driver.findElement(Login); 			  // returning driver
		
	}
}
