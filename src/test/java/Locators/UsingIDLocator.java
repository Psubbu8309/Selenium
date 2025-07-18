package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {

	public static void main(String[] args) throws InterruptedException {
//		launch the browser
		WebDriver driver =new ChromeDriver();
		
//		maximize th window
		
		driver.manage().window().maximize();
		
//		navigate to an applin
		
		driver.get("https://www.facebook.com/");
		
//		idedntify the user text TF
		
		driver.findElement(By.id("email")).sendKeys("selenium");
		
//		IDENTIFY PSWD TF
		
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
//		identify login btn and click on it 
//		we should consider alpha numaric values 
		driver.findElement(By.id("u_0_0_/o")).click();
		
		Thread.sleep(3000);
		
//		close the browser 
		
		driver.quit();
		
		
	}

}
