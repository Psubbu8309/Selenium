package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_relativepath {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//form//input[1]")).sendKeys("computers");
		
		
		driver.findElement(By.xpath("//form//input[2]")).click();
		
		Thread.sleep(3000);
		

	}

}
