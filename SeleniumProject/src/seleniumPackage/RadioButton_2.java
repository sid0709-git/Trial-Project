package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_2 {

	public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "C:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
	// 1 st way to  handle radio button [not recommended]
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='1']")).click();     // to click on Female radio button.
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='2']")).click();     // to click on Male radio button.
	Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@value='-1']")).click();    // to click on Custom radio button.
    
    //2 nd way to handle radio button [not proper]
    List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']")) ; // using List interface/class
    System.out.println("Total radio buttons= " + radios.size());     // to know total radio buttons we used .size()method.
    
    System.out.println(radios.get(1).isEnabled());       // to check Male radio button is enabled or not.//returns-true
    System.out.println(radios.get(0).isDisplayed());     // to check Female radio button is displayed or not.//returns-true
    System.out.println(radios.get(2).isSelected());      // to know custom radio button is selected or not.//returns-true
    Thread.sleep(3000);
    radios.get(1).click(); 								 // to click on male radio button.
    System.out.println(radios.get(2).isSelected());      // to check custom radio button is selected or not.//returns-false
    Thread.sleep(4000);
    
    
    // 3 rd way to handle radio buttons [proper and correct]
    
    List<WebElement> radio1 = driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
    String ExpResult = "Custom";
    for (int i=0; i<radio1.size();i++) {
    	if(radio1.get(i).getText().equalsIgnoreCase(ExpResult)) {
    		radio1.get(i).click();
    		System.out.println(ExpResult + "-  button is clicked");
    		//break;
    		
    		driver.close();
    		
    	}
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
	}

}
