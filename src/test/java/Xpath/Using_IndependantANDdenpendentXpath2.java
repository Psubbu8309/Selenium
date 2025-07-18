package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_IndependantANDdenpendentXpath2 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.xpath("//a[@class=\"nav-link\"]")).click();
		
	WebElement dr = driver.findElement(By.xpath("//img[@alt=\"Java\"]/../../div[@class=\"card-body px-0 text-center\"]/p/a"));
	      
	System.out.println(dr.getText());
Thread.sleep(3000);

driver.quit();
	}
}