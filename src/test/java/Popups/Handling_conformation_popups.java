package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_conformation_popups {

	public static void main(String[] args) throws InterruptedException {
		
		
//		LAUNCH THE BROWSER
		
		WebDriver driver= new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
//		navigate to an appln
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		click on conformation alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
//		switch to popups
		
		Alert al = driver.switchTo().alert();
		
		al.accept();
		
		Thread.sleep(3000);
		
		WebElement res = driver.findElement(By.id("result"));
		
	System.out.println(res.getText());
		
		driver.quit();
		
	}
	

}
