package Using_Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFrameUsingID {

	public static void main(String[] args) throws InterruptedException {
		
//		launch the browser
		WebDriver driver= new EdgeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an apln
		
		driver.get("https://www.zomato.com/hyderabad/delivery");
		
//		clink on login LINK
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		Thread.sleep(5000);
		
//		SWITCH TO FRAME USING ID
		
		driver.switchTo().frame("auth-login-ui");
		
//		enter phone number
		driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]")).sendKeys("8309606254");
		
//		click on cancel
		driver.findElement(By.xpath("//i[@aria-label=\"close Modal\"]")).click();
		
		Thread.sleep(3000);
		
//		switch back to webpage
		
		driver.switchTo().defaultContent();
		
//		click on biriyani
		
		driver.findElement(By.linkText("Biryani")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
