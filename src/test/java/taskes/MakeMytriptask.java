package taskes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytriptask {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		navigate go make my trip app
		
		driver.get("https://www.goibibo.com/");
		
		
		
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hyd");
		
		driver.findElement(By.xpath("(//span[@class=\"autoCompleteTitle \"])")).click();
	}

}
