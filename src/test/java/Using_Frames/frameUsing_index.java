package Using_Frames;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class frameUsing_index {

	public static void main(String[] args) throws InterruptedException {
		
		
//		launch the browser
		
		WebDriver driver= new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to an appln
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame(0);
String text = driver.findElement(By.xpath("//p")).getText();

System.out.println(text);

driver.switchTo().defaultContent();

driver.findElement(By.xpath("//span[text()='Paragraph']"));

Thread.sleep(3000);

	}

}
