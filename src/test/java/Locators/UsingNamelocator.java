package Locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNamelocator {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
//		maximize the window 
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO AN APPLN
		
		driver.get("https://www.facebook.com/");
		
//		identify
		
		driver.findElement(By.name("email")).sendKeys("selenium");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
