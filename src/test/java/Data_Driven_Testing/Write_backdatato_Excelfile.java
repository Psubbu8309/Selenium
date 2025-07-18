package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_backdatato_Excelfile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		conver physical file to java obj
		
		FileInputStream fis= new FileInputStream(
				"C:\\Users\\psubb\\OneDrive\\Desktop\\BasicData1.xlsx");
		
//		fetch the work book
		
		Workbook wb = WorkbookFactory.create(fis);
		
//		fetch the sheet
		
		Sheet sh = wb.getSheet("data");
		
//		fetch the row
		
//  Row r = sh.getRow(3);
          Row r = sh.createRow(7);
  
//  create a cell
  
  Cell c = r.createCell(2);
  
  
//  set the  data
  
    c.setCellValue("selenium");
    
//    converting java obj to physical file
    
    FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\psubb\\\\OneDrive\\\\Desktop\\\\BasicData1.xlsx");
    
    wb.write(fos);
    
    wb.close();
	}

}
