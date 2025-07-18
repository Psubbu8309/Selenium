package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_GettersMethods {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/search?q=mobiles");
		
		    WebElement login_link = driver.findElement(By.linkText("Log in"));
		    
//		    IDENTIFY TEXT PRESENT ON THE ELEMENT
		    
		    String text = login_link.getText();
		    
		    System.out.println("Text :"+text);
		    
//		    FETCH THE TAG NAME OF AN ELEMENT
		    
             String tag= login_link.getTagName();
		    
		    System.out.println("Tagname :"+tag);
		    
//		    FETCH THE ATTRIBUTE VALUE
		    
            String Att = login_link.getAttribute("class");
		    
		    System.out.println("AttributeValue :"+Att);
		    
//		    FETCH THE SIZE OF THE WINDO
		    
          Dimension size = login_link.getSize();
		    
		    System.out.println("getsize :"+size);
		    
//		    FETCH THE LOCATION
		    
		    
             Point poi= login_link.getLocation();
		    
		    System.out.println("getLocation:"+poi);
		    
		    
//		    fetch the GETRECT
		    
            Rectangle rect = login_link.getRect();
		    
	         System.out.println("Width_r:"+rect.getWidth());
	         System.out.println("Heigth_r:"+rect.getHeight());
	         System.out.println("X-Axis:"+rect.getX());
	         System.out.println("Y-Axis:"+rect.getY());
//        FETCH THE GETCSSVALUE            
             
         String value= login_link.getCssValue("padding");
		    
		    System.out.println("getCssValue:"+value);
		    
		
		    
		    driver.quit();

	}

}
