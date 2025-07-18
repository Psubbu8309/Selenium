package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_javascript_alertpopups {

	public static void main(String[] args) throws InterruptedException {
		
		
//		LAUNCH THE BROWSER
		
		WebDriver driver= new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
//    navigate to appln
    
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
    
//    click on alert button 
    
   driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
      
      Thread.sleep(3000);
      
      
//    switch to alert popup
      
       Alert al = driver.switchTo().alert();
      
      al.accept();
//     al.dismiss();
      
      Thread.sleep(3000);
      
//      identify result and print
      
      WebElement res = driver.findElement(By.id("result"));
      
      System.out.println(res.getText());
      
      Thread.sleep(3000);
      
      driver.quit();
      
//      unhandledalertexeception
//      noalertpresentexeception
      
      
	}

}
