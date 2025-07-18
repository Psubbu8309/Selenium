package Using_JavascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handlingscrollbar {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH BROWSER
		
		WebDriver driver= new EdgeDriver();
		
//		MAXIMAZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an appln
		
		driver.get("https://www.amazon.in/");
		
//		handel scroll bar using hard coded coordinates
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(100,1000)");
		
		Thread.sleep(3000);
		
//	identifying search text field and enter mobiles 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles"+Keys.ENTER);
		
//		scroll the webpage using element co-ordinates
		
		  WebElement camera = driver.findElement(By.xpath("//span[text()='Camera Modes']"));
		  
//		  int x_axis=camera.getLocation().getX();
//		  int y_axis=camera.getLocation().getY();
		  
		  
		            
//		  js.executeScript("window.scrollBy("+x_axis+","+y_axis+")");
		  
//		  Thread.sleep(5000);
		  
		 
		  
//		  scroll the using element refarance
		  
		  js.executeScript("arguments[0].scrollIntoView(true)", camera);
		  
		  Thread.sleep(3000);
		  
//		  driver.quit();
		  
//		  scroll till bottom of the web page
		  
		  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  Thread.sleep(3000);
		  
//		  driver.quit(); 
		  
//		  scroll till top of the webpage
		  
     js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		  
		  Thread.sleep(3000);
		  
		  driver.quit(); 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		

	}

}
