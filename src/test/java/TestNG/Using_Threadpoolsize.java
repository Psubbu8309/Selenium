package TestNG;

import java.sql.Driver;

import org.testng.annotations.Test;

public class Using_Threadpoolsize {
	
	
	@Test(groups = "smoke")
	
	public void login() {
		
		System.out.println("login");

}
	@Test(groups = "regession")
	
	public void register() {
		System.out.println("register");
		
	}
	
	@Test(threadPoolSize = 3,invocationCount = 3)
	
	public void create() {
		
		System.out.println("create");
		

		
	}
	}
