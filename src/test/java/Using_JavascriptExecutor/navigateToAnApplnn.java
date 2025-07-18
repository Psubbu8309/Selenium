package Using_JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateToAnApplnn {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		navigate to an appln
		
		String url = "https://www.facebook.com/";
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("window.location=arguments[0]", url);
		
		Thread.sleep(3000);
		
//		Fetch the url and title
		
		   System.out.println(js.executeScript("return document.title"));
		   System.out.println(js.executeScript("return document.URL"));
		   
//		   REFRESH THE WEB PAGE
		   
		   js.executeScript("history.go(0)");
		   
		   Thread.sleep(3000);
			
			
		
		
		driver.quit();
	}

}
