package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Using_flipkart {
	@Parameters("browser")
	@Test
	
	public void flipkat(String BROWSER) throws InterruptedException {
		
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
	
		
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		Reporter.log("flipkart",true);
		
		driver.quit();
	}
	
}

