package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingSVGTagsNameFun {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO APPLN
		
		driver.get("https://www.flipkart.com/");
		
//		IDENTIFY HTE SEARCH TF AND PASS THE INPUT
		
		driver.findElement(By.name("q")).sendKeys("toys");
		
//		IDENTIFY THE SEARCHB ICON AND CLICK ON IT
		
		driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
