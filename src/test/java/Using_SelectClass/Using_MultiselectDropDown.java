package Using_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_MultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
	
//		LAUNCH THE BROWSER

	WebDriver driver= new ChromeDriver();
	
//	MAXIMIZE THE WINDOW
	
	driver.manage().window().maximize();
	
//	IMPLICIT WAIT
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	navigate to an appln
	
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	

	WebElement DD = driver.findElement(By.id("select-multiple-native"));
	
//	Create an object
	
	  Select s= new Select(DD);
	  
	  s.selectByIndex(5);
	  
	  Thread.sleep(3000);
	  s.selectByValue("WD 2TB Elements Portable External Hard Drive - USB 3.0 ");
	  
	  Thread.sleep(3000);
	  s.selectByVisibleText("Fjallraven - Foldsac...");
	  
	  Thread.sleep(3000);
	  
       WebElement option = s.getFirstSelectedOption();
      
      System.out.println("First selected option:"+option.getText());
      
      
      driver.quit();
      
      List<WebElement> selected = s.getAllSelectedOptions();
      
      for(WebElement ele:selected) {
    	  
    	  System.out.println("ALL THE SELECTED OPTINS:"+ele.getText());
    	  
    	  
      }
      
	}
//;check for multi select
      
//      System.out.println("Multi select DD:"+s.isMultiple());
      
//      deselect the options
      
//      s.deselectByIndex(0);
	    s.de
      
      
      
	  
	  
	
	

}
