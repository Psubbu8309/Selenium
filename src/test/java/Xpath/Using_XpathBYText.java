package Xpath;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathBYText {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver= new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO AN APPLN 
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//div[text()='REDMI A3X (Ocean Green, 64 GB)']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
