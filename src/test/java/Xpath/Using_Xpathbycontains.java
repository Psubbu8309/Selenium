package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Xpathbycontains {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,\"Search Amazon.in\")]")).sendKeys("toys");
		
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
	
	Thread.sleep(3000);
	
	}

}
