package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Using_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO AN APPLN
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
//		EXPLICIT WAIT
		
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    wait.until(ExpectedConditions.titleContains("DemoApps | Qspiders | Text Box"));
	    
	    
	    WebElement nameTF = driver.findElement(By.id("name"));
	    
	    wait.until(ExpectedConditions.visibilityOf(nameTF));
	    
	    nameTF.sendKeys("selenium ");
	    
	    driver.findElement(By.id("email")).sendKeys("abc@123");
	    
	    driver.findElement(By.id("password")).sendKeys("subbu");
	    
	       WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
	       
	       wait.until(ExpectedConditions.elementToBeClickable(register));
	       
	       register.click();	
	     
	       
	    
	    
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	    
	}
	    

}
