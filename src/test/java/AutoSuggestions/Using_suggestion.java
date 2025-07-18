package AutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_suggestion {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		IMplicit wait
		
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
//   Navigate to an appln
   
   driver.get("https://www.google.com/");
   
//   identift the search text field
   
   driver.findElement(By.name("q")).sendKeys("sel");
   
//   
   
   List<WebElement> result= driver.findElements(By.xpath("//span[contains(text(),'sel')]"));
   
   
   for(WebElement ele:result) {
	   	 System.out.println(ele.getText());
   }
   
   result.get(3).click();
   
   Thread.sleep(6000);
   
   driver.quit();
	
	}
}
