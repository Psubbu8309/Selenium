package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_HardAssert {
	
	@Test
	
	public void Flipkart() {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.flipkart.com/");
		
//		validation the title of the webpage
		
	@Nullable
	String acttitle = driver.getTitle();
	
	String exptitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	
//	Assert.assertEquals(acttitle, exptitle);
	Assert.assertNotEquals(acttitle, exptitle);
	
//	Assert.assertTrue(acttitle.contains(exptitle));
	
//	Assert.fail();
	

//	Assert.assertNull(exptitle);
	
	
	
	
	driver.quit();
	

		
	}
	
	
	
	

}
