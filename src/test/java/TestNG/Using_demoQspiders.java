package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_demoQspiders {
	
@Test(groups="smoke")
	
	public void qspiders() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/");
		
		Thread.sleep(3000);
		
		Reporter.log("qspiders",true);
		
		driver.quit(); 

}
}
