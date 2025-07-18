package Using_TakeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotwebelement {

	public static void main(String[] args) throws IOException {
		
		
//		launch the browswer
		
		WebDriver driver=new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit waut
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to AN APPLN
		
		driver.get("https://www.flipkart.com/");
		
//		identify the element
		
		WebElement flipkart = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
		
//		take ss  and strore it  in temp file
		
		File src = flipkart.getScreenshotAs(OutputType.FILE);
		
//		create a new empyt file
		
		File dest= new File("./webelement/FK_icon.png");
		
//		copy the ss
		
		FileUtils.copyFile(src, dest);
		
		driver.quit();
	}

}
