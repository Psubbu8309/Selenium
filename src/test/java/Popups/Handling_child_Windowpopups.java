package Popups;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_child_Windowpopups {

	public static void main(String[] args) throws InterruptedException {
		
//		launch the browser
		
		WebDriver driver= new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to appln
		
		driver.get("https://www.flipkart.com/");
		
//		identify the text field
		
		driver.findElement(By.name("q")).sendKeys("toys");
		
//		identify the button and click on \it
		
		
		driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]")).click();
		
//		fetch the parent window id
		
		  String pwid = driver.getWindowHandle();
		  
		  System.out.println("parent window id : "+pwid);
		  
		  Thread.sleep(3000);
		  
//		  identify the product name and click on it
		  
		 driver.findElement(By.xpath("//a[contains(text(),'ARIZON')]")).click();
		 
//		 fetch the all window ids
		 
		Set<String> wids = driver.getWindowHandles();
		
		System.out.println("all window ids :"+wids);
		

		 for(String s : wids) {
			 
			 driver.switchTo().window(s);
		 
		 if(driver.getTitle().contains("ARIZON DIY Plastic Buildin\"")) {
			 
			 Thread.sleep(3000);
			 
//			 click on buy no
			 
			 driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
			 
			 Thread.sleep(3000);
		 }
		 }
		 
//			switch back to parent window
			

	
	driver.switchTo().window(pwid);
	
	Thread.sleep(3000);
	
   driver.quit();
   
	}
}
	

