
package seleniumPackage;

//import statement used to import the class/interface present in other packages.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		// set system property for chrome driver and passing chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 			 // to launch Chrome browser instance

		driver.get("https://www.w3schools.com"); 		 // to open w3school site
		driver.get("http://www.google.com"); 			 // to open google site
		driver.get("http://www.gmail.com"); 			 // to open gmail.com site
		driver.manage().window().maximize();			 // to maximize the size of window
		String Title = driver.getTitle(); 				 // to get title of the page

		System.out.println("title of webpage is- " + Title); 		// to print the title
	} 																// press ctrl + shift + F to allign the code.

}
