package TestNG;

import org.testng.annotations.Test;

public class Using_Enabled {
	
	@Test(groups = "smoke")
	
	public void login() {
		
		System.out.println("login");
		
		
	}

	@Test(groups = "regession")
	
	public void register() {
		
		System.out.println("register");
		
		
		
	}
	
	@Test(enabled = false)
	
	public void create() {
		System.out.println("create");
		
	}
}
