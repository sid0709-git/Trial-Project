package Udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletab_click {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//1. Give me the count of links on the page.
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. Give me the Count of header section links-[Limiting web-driver scope]
		WebElement headDriver =driver.findElement(By.xpath("//header[@class='jumbotron text-center header_style']"));
		System.out.println(headDriver.findElements(By.tagName("a")).size());    //By.tagName("a")) is a keyword to find links. 
		
		//3. Give me the Count of only column section links-[Limiting web-driver scope]
		
		//WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));     // to get 4 th column
		WebElement columndriver = driver.findElement(By.xpath("//table//tbody/tr/td[1]/ul"));      // to get 1 st column
		//WebElement columndriver = driver.findElement(By.xpath("//table//tbody/tr/td[2]/ul"));    // to get 2 nd column
		//WebElement columndriver = driver.findElement(By.xpath("//table//tbody/tr/td[3]/ul"));    // to get 3 rd column
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4.click on each link in the column and check if the pages are opening-
		for(int i=0;  i<columndriver.findElements(By.tagName("a")).size(); i++) {
			
			String Pressctrltab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Pressctrltab);			// here all tabs will open
			Thread.sleep(4000);
		} 
		
		//5.Now to Get the  title of all tabs -
		
		Set<String>  abc = driver.getWindowHandles();		// used getwindowshandles method
		Iterator <String> itr = abc.iterator() ;     		// to iterate from one window to another used iterator
		
	    while(itr.hasNext()) { 								// used hasNext() method to know next window is exists or not
		driver.switchTo().window(itr.next());
		System.out.println("Title of page is : " + driver.getTitle());
	
		}
	}

}
