package Sychronization;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_implicitWaittask {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER 
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE BROWSER
		
		driver.manage().window().maximize();
		
//		implicitWAIT
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		NAVIGATE TO ANPPLN
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(3000);
		
//		login
		
		driver.findElement(By.id("name")).sendKeys("subbu");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("email")).sendKeys("abc@123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("password")).sendKeys("subbu123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
