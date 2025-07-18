package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ActionMethods {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE BROWSER
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO ANA APPLN 
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		IDENTIFY SEARCH TF ENTER SO TEXT AND CLEAR IT
		
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	
//	enter the text
		
	search.sendKeys("subbu");
//	clear the text
	
	search.clear();
	
//	enter the text
	
	
	search.sendKeys("mobiles");
	
//	click on search button
	
	driver.findElement(By.xpath("//input[@value='Search']")).submit();

//	click on login link
	
	driver.findElement(By.xpath("//label[text()='Advanced search']")).click();
	
	
	Thread.sleep(3000);
	
	}
	
}