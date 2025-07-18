package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_datatoexcelandnavitoDemoqspy {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
//		convert physicall file to jva obj
		
		FileInputStream fis= new FileInputStream("C:\\Users\\psubb\\OneDrive\\Desktop\\Book1.xlsx");

//		create a workbook
		
		Workbook wb = WorkbookFactory.create(fis);
		
//		fetch the shhet
		
		Sheet sh = wb.getSheet("ss");
		
		String name = sh.getRow(0).getCell(1).toString();
		
		String mail = sh.getRow(1).getCell(1).toString();
		
		String pswd = sh.getRow(2).getCell(1).toString();
		 String url = sh.getRow(3).getCell(1).toString();
		
		System.out.println(name+" "+mail+" "+pswd);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		driver.findElement(By.id("name")).sendKeys(name);
		
		driver.findElement(By.id("email")).sendKeys(mail);
		
		driver.findElement(By.id("password")).sendKeys(pswd);
		
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		Thread.sleep(3000);
		
		
		driver.quit();
		
	}
	
}
