package taskes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AjioTask {

	public static void main(String[] args) throws InterruptedException, IOException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver= new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to appln
		
		driver.get("https://www.flipkart.com/");
		
//		mouse over on men
		
		Actions act=new Actions(driver);
	
		WebElement ele= driver.findElement(By.xpath("//div[@aria-label=\"Electronics\"]"));
	
	act.moveToElement(ele).perform();
	
	Thread.sleep(3000);
	WebElement ALL= driver.findElement(By.xpath("//a[text()='All']"));
	
		act.moveToElement(ALL).click().build().perform();
		
		Thread.sleep(3000);
		
//		  driver.findElement(By.xpath("//div[text()='Brand']")).click();
		  
		 WebElement DD = driver.findElement(By.xpath("//select[@class=\"Gn+jFg\"]"));
		
		Select s=new Select(DD);
		
		s.selectByIndex(2);
		
		WebElement buds = driver.findElement(By.xpath()
		
		File src=buds.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./wede/budss.png");
		
		FileUtils.copyFile(src, dest);
		
		driver.quit();
		
		
}

	
    
}
