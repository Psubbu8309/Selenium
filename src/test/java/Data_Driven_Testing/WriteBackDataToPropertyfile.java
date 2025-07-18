package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyfile {

	public static void main(String[] args) throws IOException {
		
//			
//		step 01 converting physical prop file to java obj
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");

//		step-02 create an obj of property
		
		Properties p=new Properties();
		
//		step 03 load the pro obj
		
		p.load(fis);
		
//		add new data
		
		p.put("Tiger", "NTR");
		
//		remove data from prop file
		
		p.remove("Animal");
		
//		covert prop obj to physical file and save the file
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/CommonData.properties");
		p.store(fos, "updated");
		
	}

}
