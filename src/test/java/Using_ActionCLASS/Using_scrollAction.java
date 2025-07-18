package Using_ActionCLASS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_scrollAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/");
		
//		identify the element
		
	   WebElement str=driver.findElement(By.linkText("API"));
	   
			
		
//		click and hold the element
		
		Actions act = new Actions (driver);
//		act.scrollByAmount(0, 1700).perform();
		
		act.scrollToElement(str).perform();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
