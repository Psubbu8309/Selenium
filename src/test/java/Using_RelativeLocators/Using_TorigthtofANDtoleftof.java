package Using_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Using_TorigthtofANDtoleftof {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER 
		
		WebDriver driver = new ChromeDriver();
		
//		MAXIMIZE THE WINDOW
		
		driver.manage().window().maximize();
		
//		NAVIGATE TO APPLN
		
		driver.get("https://www.flipkart.com/");
		
//		identify cart link page and clicking on it
		
		WebElement cart = driver.findElement(By.linkText("Cart"));
		
//		using cart element click on become a seller link
		
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(cart)).click();
		
//		NAVIGATE TO PREVIOUS PAGE
		
		driver.navigate().back();
		
//		identify cross button on the login dialogue box (close login suggestion )
		
		driver.findElement(By.xpath("//span[@role='button']")).click();

//		AGAIN IDENTIFY CART LINK TP AVOID STATLE ELEMENT REFERANCE EXECEPTION 
		
		WebElement cart1 = driver.findElement(By.linkText("cart"));
		
		
//		USING CART LINK CLICK ON LOGIN LINK
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(cart1)).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
