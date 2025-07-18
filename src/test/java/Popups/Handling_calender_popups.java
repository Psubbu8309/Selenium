package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_calender_popups {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an appln
		
		driver.get("https://www.makemytrip.com/");
		
//		avoid pop up
		
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		
//		click on from botton
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
//		enter the from tf 
		
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("hyd");
		
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
//		click on to button
		
		driver.findElement(By.xpath("//span[text()='To']")).click();
		
//		enter the text on to
		
		driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\"]")).sendKeys("beng");
		
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		
		WebElement price = driver.findElement(By.xpath("//div[contains(text(),'June')]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()='29']"));
		
		System.out.println(price.getText());
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
