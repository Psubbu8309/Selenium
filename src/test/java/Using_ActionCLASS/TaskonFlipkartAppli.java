package Using_ActionCLASS;

import java.awt.event.ActionEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TaskonFlipkartAppli {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE BROWSER 
		
		driver.manage().window().maximize();
		
//		IMPLICIT WAIT
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Navigate to an applin
		
		driver.get("https://www.flipkart.com/");
		
//		Action om fashion 
		
		Actions act = new Actions(driver);
		
//		identify the fashion 
		
		WebElement fas = driver.findElement(By.xpath("//img[@alt=\"Fashion\"]"));
		
		act.moveToElement(fas).perform();
		
//		click on top wear
		
		WebElement men=driver.findElement(By.linkText("Men's Top Wear"));
		
		act.moveToElement(men).perform();
		
//		click on mens t-shirts
		
		WebElement ment = driver.findElement(By.linkText("Men's T-Shirts"));
		
		act.moveToElement(ment).click().build().perform();
		
		Thread.sleep(3000);
		
		
		
//	 identift the min dd 
		
//	WebElement mindd=driver.findElement(By.xpath("//div[@class=\"suthUA\"]/select"));
		WebElement min=driver.findElement(By.xpath("//div[@class='suthUA']/select"));

		

//		create an object of select the price
		
		Select s= new Select(min);
		
//		identify min dd value
		
		s.selectByIndex(2);
		
//		identift the max dd
		
		WebElement max = driver.findElement(By.xpath("//div[@class='tKgS7w']/select"));
		
			
		
		Select s2=new Select(max);
		
		s2.selectByIndex(1);
		
//		identify the newlly first item
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		fetch the item price
		
		WebElement price =  driver.findElement(By.xpath("//a[contains(text(),'Men Printed, Typography Round Neck Po')]/ancestor::div[@data-id=\"TSHGZA4CQUGHQVJP\"]/descendant::div[@class=\"Nx9bqj\"]"));
		System.out.println(price.getText());
		
		Thread.sleep(3000);
		
		driver.quit();		
	}

}
