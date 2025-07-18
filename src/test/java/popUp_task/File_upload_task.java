package popUp_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_upload_task {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
//		LAUNCH THE BROWSER
		
		WebDriver driver = new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		navigate to applnm'
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		StringSelection srt= new StringSelection("C:\\Users\\psubb\\OneDrive\\Desktop\\html.txt");
		
		Thread.sleep(3000);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(srt, null);
		
		Thread.sleep(3000);
		
		
//		identify the element
		
		   WebElement upload = driver.findElement(By.id("resume"));
		
		Actions act =new Actions(driver);
		act.moveToElement(upload).click(upload).build().perform();
		
//		robot class
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	
	}

}
