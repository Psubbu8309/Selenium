package Data_Provider;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class FetchING_DATAprovider {
	@DataProvider
	public Object[][] data() {
		//create an 2d object
		Object[][] obj=new Object[2][2];
		obj[0][0]="subbu";
		obj[0][1]="subbu123";
		obj[1][0]="krishna";
		obj[1][1]="krishna78";
		
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void test(String un,String pswd) throws InterruptedException {
		
//		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//navigate to web page
//		driver.get("https://www.facebook.com/");
//		
//		//enter username from data providers
//		driver.findElement(By.id("email")).sendKeys(un);
//		//enter password from data providers
//		driver.findElement(By.id("pass")).sendKeys(pswd);
//		driver.findElement(By.name("login")).click();
//	
		
		System.out.println(un+pswd);
		Thread.sleep(3000);
		
	
	}

}


	
	

	
	
