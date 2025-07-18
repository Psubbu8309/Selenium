package Using_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_NearMethod {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		WebElement search = driver.findElement(By.name("q"));
		
		Thread.sleep(3000);
		WebElement link = driver.findElement(RelativeLocator.with(By.tagName("a")).near((search)));
		
		link.click();
	
		
	
	
	}

}
