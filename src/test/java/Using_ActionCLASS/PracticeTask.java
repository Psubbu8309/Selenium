package Using_ActionCLASS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeTask {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER 
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE BROWSER 
		
		driver.manage().window().maximize();
		
//		implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		NAVIGATE TO AN APPLN 
		
		driver.get("https://www.flipkart.com/");
		
//		CREATE AN OBJECT OF ACTION CLASS
		
    Actions act = new Actions(driver);
    
//    IDENTIFY THE FASHION ICON AND CLICK
    
   WebElement fas = driver.findElement(By.xpath("//div[@aria-label=\"Fashion\"]"));
		  
  act.moveToElement(fas).perform();
  
//  identify the mens foot wear
  
  WebElement foot = driver.findElement(By.linkText("Men Footwear"));
  
  act.moveToElement(foot).perform();
  
//  identify mens shoes
  
  WebElement shoe = driver.findElement(By.linkText("Men's Sports Shoes"));
  
  act.moveToElement(shoe).click().build().perform();
  
//  identify the min dd
  
      WebElement min = driver.findElement(By.xpath("//div[@class=\"suthUA\"]/select"));
      
//      creat an object of select class
      
      Select s = new Select(min);
      
      s.selectByIndex(1);
 
      
//      click on newllyfirst
      
      driver.findElement(By.xpath("//div[@class=\"zg-M3Z\"][3]")).click();
      
      Thread.sleep(3000);
 
  
//  print the price 
  
     WebElement price = driver.findElement(By.xpath("//a[contains(text(),'Premium Comfortable Regular Wear F')]"
     		+ "/ancestor::div[@class=\"_1sdMkc LFEi7Z\"]/descendant::div[@class=\"Nx9bqj\"]"));
     
     System.out.println(price.getText());
  
     driver.quit();
    
	}

}
