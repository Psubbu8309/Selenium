package popUp_task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_multiple_popups {

private static final TakesScreenshot TakesScreenshot = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		 
//		LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
//		maximize the window 
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		navigate to an appln
		
		driver.get("https://shoppersstack.com/");
		
		
//		crate a object of action class
		
		Actions act =new Actions(driver);
		
//		identify the men click on it
		
		  WebElement kidsMenu = driver.findElement(By.xpath("//a[text()='Kids']"));
	        act.moveToElement(kidsMenu).perform();
	        
	        Thread.sleep(3000);
	        
//	        click on t-shirts
	        
	        driver.findElement(By.xpath("//a[text()='T-Shirts']")).click(); 
	        
//	        click on first element
	        
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//span[text()='Boys Printed Pure Cotton T Shirt ']")).click();
	        
	        Thread.sleep(3000);
	        
//	        get parent window id
	        
	        String pwid = driver.getWindowHandle();
	        

	        
//	        click on  description
	        
	        driver.findElement(By.xpath
	        	
	        		("//*[name()='svg'][@class=\"MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj\"]")).click();
	        
	        Thread.sleep(3000);
//	        swich to driver control to amazon
	        
//	        fetch the all window ids
	        Set<String> wids = driver.getWindowHandles();
	        for(String s:wids) {
	        	driver.switchTo().window(s);
	        	String url=driver.getCurrentUrl();
	        	
//	        	navigate to amazon web page
	        	
	        	if(url.contains("https://www.amazon.in/")) {
	        		break;
	        	}
	        }
	        
	        driver.manage().window().maximize();
 
	       
	

	        	Thread.sleep(3000);
	        	
//	        	take screenshot of amazon web page
	        	
        	TakesScreenshot ts=(TakesScreenshot)driver;
	        	File src=ts.getScreenshotAs(OutputType.FILE);
	        	File des=new File("./Screenshot/amazonp.png");
	        	
	        	FileUtils.copyFile(src, des);
	        	
	        	Thread.sleep(3000);
	        	
//	        	navigate to parent window
	        	
	        	
	        	driver.switchTo().window(pwid);
	        	
	        	driver.quit();

	        }
	        }
	        
	


