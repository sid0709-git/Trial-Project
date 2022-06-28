package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how stuff works");

		// Handling auto suggestions
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total auto suggestion list:-" + AllSuggestions.size());

		for (int i = 0; i < AllSuggestions.size(); i++) {
			String ExpectedResult = "how stuff works quiz";
			if (AllSuggestions.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				AllSuggestions.get(i).click();
				System.out.println(ExpectedResult + "  is clicked"); 
			} 
		}

	}

}
