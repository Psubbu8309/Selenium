package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_datafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
//		convert physical file to obj
		
		FileInputStream fis=new FileInputStream("./src/test/resources/BasicData1.xlsx");

//		creating /fetch the work book
		
		Workbook wb = WorkbookFactory.create(fis);
		
//		fetch the sheet
		
		Sheet sh = wb.getSheet("data");
		
//		fetch the row
		
		Row r = sh.getRow(1);
		
//		fetch the cell
		
	   Cell c = r.getCell(0);
	   
//	   fetch the data
	   
     String data = c.getStringCellValue();	
	   
   System.out.println(data);
   
	}
}
		

		
		
	   
	   
	   
	   
	   
	  
	

	

	


