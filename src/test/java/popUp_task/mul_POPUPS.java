package popUp_task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mul_POPUPS {

	public static void main(String[] args) throws InterruptedException {
        // Set path to chromedriver if required
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Navigate to shoppersstack
        driver.get("https://www.shoppersstack.com/");

        // Step 2: Mouse hover on "Kids" and select a category
        Actions actions = new Actions(driver);
        
//        IMPLICIT WAIT
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
//        identify kids click on it
        WebElement kidsMenu = driver.findElement(By.xpath("//a[text()='Kids']"));
        actions.moveToElement(kidsMenu).perform();
        Thread.sleep(2000); 
        // wait for submenu
        driver.findElement(By.xpath("//a[text()='T-Shirts']")).click(); // example category

        // Step 3: Select a product and click
        Thread.sleep(3000); // wait for products to load
        driver.findElement(By.xpath("//span[text()='us polo kids ']")).click();
        // select 1st product

        // Step 4: Click on Compare icon (assume it opens 3 windows)
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@aria-label='Compare']")).click();

        // Step 5: Switch driver control to Amazon window
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String win : allWindows) {
            driver.switchTo().window(win);
            if (driver.getCurrentUrl().contains("amazon")) {
                break;
                
                
                
            }
        }


	}

}
