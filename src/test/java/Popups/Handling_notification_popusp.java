package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_notification_popusp {

	public static void main(String[] args) throws InterruptedException {
		
		
//		create chrome options object
		
		ChromeOptions opt = new ChromeOptions();
		
//		for notication popups
		
    opt.addArguments("--disable-notifications");
    
//    for location popups
    
	
	opt.addArguments("--disable-geolocation");
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver(opt);
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		NAVIGATE TO APPLN
		
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		
//		click on notification button
		
		driver.findElement(By.id("browNotButton")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		

		
		

	}

}
