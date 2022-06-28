package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);// here we put thread.sleep after click on reg.page because browser can find
							// desired result...

		// How to handle dropdown in selenium...........
		// 1st way -not recommended but industry widely use.....
		List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total months in year:-" + birthmonth.size());
		System.out.println(birthmonth.get(7).isEnabled());
		birthmonth.get(7).click();

		// 2nd way- recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select Month = new Select(bm); // select class constructor
		Month.selectByVisibleText("Apr");// select by visible text method used
		Month.selectByIndex(10);// select by index method is used
		Month.selectByValue("5");// select by value method is used
		System.out.println(Month.getFirstSelectedOption().getText());// return latest selected value..

		// 3rd way- will store all value in a list
		List<WebElement> MonthList = Month.getOptions();
		System.out.println("Total dropdown list:-" + MonthList.size());
		for (int i = 0; i < MonthList.size(); i++) {
			if (MonthList.get(i).getText().equalsIgnoreCase("Aug")) {
				MonthList.get(i).click();

				//4 th way-
				WebElement cm = driver.findElement(By.xpath("//select[@id='month']"));
				cm.sendKeys("Feb");
				
				//5 th way-
				Thread.sleep(3000);
				driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar"); 
				
				//6 th way-check if dropdown supports multi selection or not
				System.out.println(Month.isMultiple());//false
				Month.selectByVisibleText("Dec");//Dec
				Month.selectByIndex(10);//nov
				Month.selectByValue("10");//oct
				
				//Deselect the selected dropdown values
				Month.deselectByVisibleText("Dec");
				Month.deselectByIndex(10);
				Month.deselectByValue("10");
				Month.deselectAll();//deselect all selected values
				
				
				
			}
		}

	}

}
