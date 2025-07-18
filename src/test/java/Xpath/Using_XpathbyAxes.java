package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_XpathbyAxes {

	public static void main(String[] args) throws InterruptedException {
		
//	LAUNCH THE BROWSER
		
  WebDriver driver = new EdgeDriver();
  
//  MAXIMIZE THE WINDOW
  
  driver.manage().window().maximize();
  
//  navigate to an appln
  
  driver.get("https://www.amazon.in/");
  
//  identify ancestor and descendent
  
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys"+Keys.ENTER);
  
 WebElement dr = driver.findElement(By.xpath
		  ("//span[contains(text(),'Gooyo GY3716 ')]/ancestor::div[contains(@class,'a-section a-spacing-sma')]/descendant::span[@class='a-price-whole']"));
  
  System.out.println(dr.getText());
  
  Thread.sleep(3000);
  
  driver.quit();
	}

}//span[contains(text(),'Gooyo ')]/ancestor::div[contains(@class,'puis-card-container s-')]/descendent::