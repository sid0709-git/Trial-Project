package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Rediffloginpage {

	WebDriver driver;

	By Username = By.id("login1");
	By Password = By.name("passwd");
	By Proceed = By.name("proceed");

	public Rediffloginpage(WebDriver driver) {
		this.driver = driver;
	}

	public void Username() {
		driver.findElement(Username).sendKeys("admin");
	}

	public void Password() {
		driver.findElement(Password).sendKeys("12345");
	}

	public void Proceed() {
        driver.findElement(Proceed).click();
	}
}