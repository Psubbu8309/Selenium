package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_ValidationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		
		
		WebElement sub_TF = driver.findElement(By.id("newsletter-email"));
		
		if(sub_TF.isDisplayed()) {
		
		sub_TF.sendKeys("selenium");
		
	
		
	} else
		//id="newsletter-subscribe-button"
	
		System.out.println("Element is not displayed");
		
		Thread.sleep(3000);
		
		WebElement sub_button = driver.findElement(By.id("newsletter-subscribe-button"));
		
		if(sub_button.isEnabled()) {
			
			sub_button.click();
			Thread.sleep(3000);
			
			
			
		}
		else
			System.out.println("sub_botton is disabled");
		
//		VERIFYING WHETHER THE RADIO BT IS SELECTED ON THE WEBPAGE
		
		
		WebElement E_radio = driver.findElement(By.id("pollanswers-1"));
		
		E_radio.click();
		
		if(E_radio.isSelected()) {
			
			System.out.println("selected");
			
		}
		else
			System.out.println("not selected");
	
	
		
		driver.quit();
	

	}

}
