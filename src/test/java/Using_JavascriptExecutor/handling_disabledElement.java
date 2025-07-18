package Using_JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class handling_disabledElement {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH BROWSER
		
		WebDriver driver= new EdgeDriver();
		
//		MAXIMAZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an appln
		
		driver.get("file:///C:/Users/psubb/OneDrive/Desktop/sample1.html");
		
//		identify the un tf
		
		WebElement un_TF = driver.findElement(By.id("user"));
		
//		handling disabled tf
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value=arguments[1]",un_TF,"selenium");
		
		Thread.sleep(3000);
		
//		driver.quit(); 

		
//		handling disabled button
		
		WebElement cancel = driver.findElement(By.id("cancel"));
		
		js.executeScript("arguments[0].disabled=false",cancel);
		
		Thread.sleep(3000);
		
		driver.quit();

		

	}

}
