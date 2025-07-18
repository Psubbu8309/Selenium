package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_tagname {

	private static final boolean WebElement = false;

	public static void main(String[] args) {
		
//		launch the browser
		WebDriver driver =new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		navigate to an applin
		
		driver.get("https://demowebshop.tricentis.com/");
		
//		identify the links in the webpage
		
	List<WebElement> links =driver.findElements(By.tagName("a"));
	for(WebElement ele:links)
	{
		
	
	System.out.println(ele.getText());
	}
	
//	close the browser
	
	driver.quit();
		

		
		

	}

}
