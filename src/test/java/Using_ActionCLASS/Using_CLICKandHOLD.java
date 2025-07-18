package Using_ActionCLASS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_CLICKandHOLD {

	public static void main(String[] args) throws InterruptedException {
		
//		launch the browser
		
		WebDriver driver =new ChromeDriver();
		
//		maximize the window 
		
		driver.manage().window().maximize();
		
//		implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an appln
		
	driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
//		release the element
		
	Actions act =new Actions(driver);
	
	   WebElement cir = driver.findElement(By.id("circle"));
	   cir.click();
		
		
		act.moveToElement(cir).clickAndHold().perform();
		
		
		Thread.sleep(3000);
		act.release(cir).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
}
}
