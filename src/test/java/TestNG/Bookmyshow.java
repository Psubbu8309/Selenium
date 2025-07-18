package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Bookmyshow {
@Parameters("browser")	
@Test
	
	public void bookmyshow(String BROWSER) throws InterruptedException {
	
	WebDriver driver=null;
	
	if(BROWSER.equals("chrome")) {
		driver=new ChromeDriver();
		
		
	}
	else if(BROWSER.equals("edge")){
		
		driver=new EdgeDriver();
		
		
	}
	else {
		
		driver=new ChromeDriver();
		
	}

//		MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		
//		IMPLICIT WAIT
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		NAVIGATE TO APPLN
		driver.get("https://in.bookmyshow.com/");
		
		Thread.sleep(3000);
		
		Reporter.log("bookmyshow",true);
		
		driver.quit(); 
		

}
}
