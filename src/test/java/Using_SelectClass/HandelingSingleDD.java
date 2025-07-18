package Using_SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandelingSingleDD {

	public static void main(String[] args) throws InterruptedException {
		
//		LAUNCH THE BROWSER
		WebDriver driver = new EdgeDriver();

//		MAXIMIZE THE BROWSER
		
       driver.manage().window().maximize();
       
//       IMPLICIT WAIT
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       
//       NAVIGATE TO AN APPLN
       
       driver.get("https://www.amazon.in/");
       
//       identify the dd
       
       WebElement DD = driver.findElement(By.id("searchDropdownBox"));
       
//       Create an obj of select class
       
       Select s= new Select(DD);
       
//       SELECT AN OPTION BY INDEX VALUE
       s.selectByIndex(7);
       
       Thread.sleep(3000);
       
//       SELECT AN OPTIONS BY VALUE ATTRIBUTE
       
       s.selectByValue("search-alias=dvd");
       
//       SELECT AN OPTIONS BY VISIBLE TEXT
       
       s.selectByVisibleText("Subscribe & Save");
       
       Thread.sleep(3000);
       
//       FETCHING ALL THE OPTIONS FROM THE DROP DOWN
       
//       ITTERATE USING FOR LOOP AND PRINT THE TEXT FROM THE OPTION
       
       
       
     List<WebElement> options = s.getOptions();
      
     for(WebElement ele:options)
     {
    	 System.out.println(ele.getText());
    	 
     }
     
     driver.quit();
     
//     CHECK THE DROP DOWN IS SINGLE OR MULTI
     
      System.out.println("Multi select dd:"+s.isMultiple());
      
      
//      FETCH THE FIRST SELECTED OPTIONS
      
      WebElement option = s.getFirstSelectedOption();
      
      System.out.println("First selected option:"+option.getText());
      
//      Fetch all the selected options
      
      List<WebElement> selected = s.getAllSelectedOptions();
      
      for(WebElement ele:selected)
    	  
      {
    	  System.out.println("All the selectd options:"+ele.getText());
    	  
      }
     // driver.quit();
     
      
   
    	 
    	 
}
}