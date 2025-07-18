package Popups;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Using_prompt_Popups {

	public static void main(String[] args) {
	
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
//		navigate to appln
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		click on -prompt pop up
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
//  uswith to prompt popup
		
		Alert al = driver.switchTo().alert();
	
		al.sendKeys("selenium");
		al.accept();
		
		WebElement res = driver.findElement(By.id("result"));
		
		System.out.println(res.getText());
		
	}

}
