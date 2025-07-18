package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
//		step 01 converting physical prop file to java obj
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");

//		step-02 create an obj of property
		
		Properties p=new Properties();
		
//		step 03 load the pro obj
		
		p.load(fis);
		
		
//		step 04 fetch the data 
		
		  String data = p.getProperty("browser");
		  
		  System.out.println(data);
		  
		   String url= p.getProperty("url");
		          String time = p.getProperty("timeouts");
		          
		        String pwd = p.getProperty("pwsd");
		               String unn = p.getProperty("un");
		               
		               System.out.println(data+"->"+url+"timeouts: "+time+"un"+unn);
	}

}
