package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_multiple_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
// convert physical file to obj
		
		FileInputStream fis=new FileInputStream("./src/test/resources/BasicData1.xlsx");

//		creating /fetch the work book
		
		Workbook wb = WorkbookFactory.create(fis);
		
//		fetch the sheet 
		
		Sheet sh = wb.getSheet("data");
		
		for(int i=0;i<=sh.getLastRowNum();i++) {
			
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++) {
				
				 String data = sh.getRow(i).getCell(j).toString();
				
				
				
				System.out.print(data);
				System.out.print(" | ");
				
			}
System.out.println();
			}
	
	wb.close();
	fis.close();
	}
}

