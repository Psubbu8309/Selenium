package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Searchcontextmethods.Using_findelemet;

public class Fetching_data_fromfb {

	public static void main(String[] args) throws IOException {
		
		
//step 01 converting physical prop file to java obj
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Fbdata.properties");

//		step-02 create an obj of property
		
		Properties p=new Properties();
		
//		step 03 load the pro obj
		
		p.load(fis);
		
//		fetch
		
		String ur = p.getProperty("url");

		
//		launch the browser
		
		WebDriver driver=new ChromeDriver();
		
//		maximize the window
		
		driver.manage().window().maximize();
		
//		implicit wait 
		String un=p.getProperty("un");
		
		String pswd=p.getProperty("pswd");
		
		
		 String time = p.getProperty("timeouts");
		 
		 long ti=Long.parseLong(time);
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ti));
		
		driver.get(ur);
		
	driver.findElement(By.id("email")).sendKeys(un);
	
	driver.findElement(By.id("pass")).sendKeys(pswd);
	
	driver.findElement(By.name("login")).click();
	
		
	
		
	
	}

}
