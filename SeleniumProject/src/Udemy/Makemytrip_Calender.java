package Udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Makemytrip_Calender {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// To remove chrome notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click(); // to remove notification on screen

		// to click on from tab
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();

		// to click option
		// driver.findElement(By.id("react-autowhatever-1-section-0-item-4")).click();
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-4']")).click();

		// to select destination
		driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();

		// to click on departure tab
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		// Thread.sleep(3000);

		String flag = "false";
		while (flag == "false") {
			if (driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 07 2022')]"))
					.size() > 0) {
				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sep 07 2022')]"))
						.click();
				flag = "true";
				// Thread.sleep(3000);
			} else {
				// To click on arrow --->
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}
		}

		driver.findElement(By.xpath("//label[@for='travellers']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-cy='children-3']")).click();
		Thread.sleep(3000);

		// to select 'Premium Economy tab '-we traveled from parent to child..
		// [ul-->li-->index[2]]
		driver.findElement(By.xpath("//ul[@class='guestCounter classSelect font12 darkText']/li[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//li[@class='font12 blackText latoBold wrapFilter activeItem ']")).click();
		// Thread.sleep(3000);

		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		Thread.sleep(3000);

		System.out.println("Test is passed");
	}
}

//https://www.devdbqa.com/2020/04/how-to-automate-date-picker-on.html....[for reference]
