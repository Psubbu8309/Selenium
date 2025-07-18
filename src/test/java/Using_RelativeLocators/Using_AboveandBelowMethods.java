package Using_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_AboveandBelowMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE WINDOW 
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO APPLN
		
		driver.get("https://www.facebook.com/");
		
//		identify pswd (base element)
		
	WebElement pswd = driver.findElement(By.id("pass"));
	
//	IDENTIFY UN TF AND ENTER UN
	
	WebElement un =driver.findElement(RelativeLocator.with(By.tagName("input")).above(pswd));
	
	un.sendKeys("subbu");
	pswd.sendKeys("ssssss");
	
	driver.findElement(RelativeLocator.with(By.tagName("button")).below(pswd)).click();
	
	Thread.sleep(3000);
	
	driver.quit();
	     
	}
	
	
}
