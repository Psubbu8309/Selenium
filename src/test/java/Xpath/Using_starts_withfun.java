package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_starts_withfun {
	
	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email ')]")).sendKeys("subbu");
		
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal-pass')]")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//button[starts-with(@name,'login')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
