package Using_TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_OF_Entirewebpage {

	public static void main(String[] args) throws IOException {
	
//	LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		IMplicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		NAVIGATE TO AN APPLN
		
		driver.get("https://www.flipkart.com/");
		
//		takesreenshot of web page
		
//	step1= downcast takescreeenshot with web driver
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
//		step2= take the screenshot and store in temp file
		
		File src= ts.getScreenshotAs(OutputType.FILE);
		
//		step3= create a new empty file
		
		File des= new File("./ScreenShot/flipkart.png");

		//step4= copy the screenshot in new file 
		
		FileUtils.copyFile(src, des);
		
		driver.quit();
	}

}
