package TestNG;

import java.sql.Driver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Dependsonmethod {
	
	@Test(dependsOnMethods = "register",groups = "smoke")
	
	public void login() {
		
//		System.out.println("login");
		
		Reporter.log("login",true);
	}
		
	
	
	@Test(groups = "regession")
	
	public void register() {
		
//		System.out.println("register");
		
		Reporter.log("register",true);
		
	}
	
	@Test(dependsOnMethods = "login")
	
	public void create(){
		
//		System.out.println("create");
		
		Reporter.log("create",true);
		
		

}}
