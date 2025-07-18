package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		implicitwait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		NAVIGATE TO ANNPLN
		
		driver.get("https://www.facebook.com/");
		
//		LOGIN
		
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		driver.findElement(By.name("login")).click();
		

		 Thread.sleep(3000);
		driver.quit();

	}

}
