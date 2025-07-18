package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Using_SoftAssert {
	
	@Test
	
	public void secnario_ss() {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
	
		String acturl = driver.getCurrentUrl();
		String expurl = "https://www.facebook";
		
		SoftAssert soft=new SoftAssert();
		
//		soft.assertNotEquals(acturl, expurl);
		
//		soft.assertNotNull(expurl);
		
		soft.assertFalse(acturl.contains(expurl));
		
		driver.quit();
		
//		soft.assertAll();
		
		
	}

}
