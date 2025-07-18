package Using_ActionCLASS;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Keyup_keydown_sendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement str = driver.findElement(By.name("q"));
		
		Actions act = new Actions (driver);
		
		
		
		act.moveToElement(str).click(str).keyDown(Keys.SHIFT)
		.sendKeys("mobile").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
