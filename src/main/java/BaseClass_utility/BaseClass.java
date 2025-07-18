package BaseClass_utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void bs() {
		
		System.out.println("BS-connection  with db");
		
		
	}

	@AfterSuite
	
	public void as() {
		
		System.out.println("As-dis-connection with DB");
	}
	
	@BeforeTest
	
	public void bt() {
		
		System.out.println("BT-parallel exe");
	}
	
	@AfterTest
	public void at() {
		
		System.out.println("as-close parallel exe");
	}
	
	@BeforeMethod
	public void bm() {
	
	System.out.println("bm-login");
	
	
	}
	
	@AfterMethod
	
	public void am() {
		
		System.out.println("am-logout");
	}
	
}
