package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver; // globally defined variable

	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector("div[class='text-center'] h2");
	By navbar = By.xpath("//nav[@class='navbar-collapse collapse']");

	public Landingpage(WebDriver driver) { 		// created constructor
		this.driver = driver;
	}

	public WebElement getlogin() { 				// here we are returning a WebElement
		return driver.findElement(signin); 		// return driver
	}

	public WebElement getTitle() {				 // here we are returning a WebElement
		return driver.findElement(title);		 // return driver
	}

	public WebElement getNavbar() {
		return driver.findElement(navbar);
	}
}
