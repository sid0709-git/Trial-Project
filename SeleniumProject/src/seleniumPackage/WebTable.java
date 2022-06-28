package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");

		// create a list of all companies
		List<WebElement> Allcompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total companies:-" + Allcompanies.size());

		// create list- current prize
		
		List<WebElement> CurrentPrize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Prize:-" + CurrentPrize.size());
		
		String ExpectedCompany = "Shri Keshav cements";
		for (int i = 0; i < Allcompanies.size(); i++) {
			if (Allcompanies.get(i).getText().equalsIgnoreCase(ExpectedCompany)) {
				System.out.println(Allcompanies.get(i).getText() + "==" + CurrentPrize.get(i).getText());
				Allcompanies.get(i).click();

				break;
			}
		}

	}

}
