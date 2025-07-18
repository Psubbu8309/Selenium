package taskes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class filpkart_task {

	public static void main(String[] args) throws InterruptedException {
		
		
//		Launch the browser
		
		WebDriver driver=new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an appln 
		
		driver.get("https://www.flipkart.com/");
		
//		create a object of action class
		
		Actions act=new Actions(driver);
		
// move to mouse on mobiles
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		act.moveToElement(fashion).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
