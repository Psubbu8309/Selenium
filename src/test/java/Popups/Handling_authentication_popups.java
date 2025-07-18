package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_authentication_popups {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(3000);
		
		driver.quit();
		}

}
