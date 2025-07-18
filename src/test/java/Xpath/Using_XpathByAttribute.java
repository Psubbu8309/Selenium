package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		Navigate to an appln 
		
		driver.get("https://www.flipkart.com/");
		
//		IDENTIFTY SEARCH TF AND PASS THE TEXT
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles"+Keys.ENTER);
		
	Thread.sleep(3000);	
	
//	IDENTIFY THE BRAND TF PASS THE TEXT
	
	driver.findElement(By.xpath("//input[@placeholder='Search Brand']")).sendKeys("samsung");
	
	Thread.sleep(3000);
	
//	CLOSE THE BROWSER
	
	

	
	driver.findElement(By.xpath("//div[text()='Popularity']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//div[text()='vivo T4x 5G (Pronto Purple, 128 GB)'])[1]")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
	
	Thread.sleep(3000);
	driver.quit();
		

	}

}
