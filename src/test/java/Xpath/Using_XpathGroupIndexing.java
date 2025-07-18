package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathGroupIndexing {
	
	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//  MAXIMIZE THE WINDOW 
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO AN APPLN
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(3000);
		
//		identify name tf
		
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("selenium");

//		identify email tf
		
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("abd@gmail.com");
		
//		identify password tf
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("abc");
		
//		click on  login button
		driver.findElement(By.xpath("(//button)[2]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
	}

}
