package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_cssSELECTORS {

	public static void main(String[] args) throws InterruptedException {
//		launch the browser
		WebDriver driver =new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		navigate to an applin
		
		driver.get("https://demowebshop.tricentis.com/");
		
     driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("computers");
     
     
     driver.findElement(By.cssSelector( "input[type=\"submit\"]")).click();
     
     Thread.sleep(3000);
		

	}

}
