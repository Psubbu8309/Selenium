package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSELECTORSTASK {

	public static void main(String[] args) {
		
//		LAUNCH THE BROWSER
		WebDriver driver= new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		navigative to an appln
		
		driver.get("https://www.flipkart.com/");
		
//		click on cart
		
		driver.findElement(By.cssSelector("a[title='Cart']")).click();
		
		driver.findElement(By.cssSelector("a[class='wsejfv']")).click();
		
		
		driver.findElement(By.cssSelector("button[class='QqFHMw aEsfVh _7Pd1Fp']")).click();
		
		driver.findElement(By.cssSelector("body[class=\"fk-modal-visible\"]")).click();
		driver.findElement(By.cssSelector("body[class='fk-modal-visible']")).sendKeys("8309606254");
		

	}

}
