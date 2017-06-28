package classTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationTest {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("*** TEST SUITE STARTED ");
		// DB Connection
		// suite start time
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		// close db
		// suite end time
		
	}
	
	@BeforeTest
	public void beforeTest (){
		System.out.println("Before the test");
	}
	@AfterTest
	public void afterTest (){
		System.out.println("After the test");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("---- before each test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----- After each test");
	}
	
	
	@Test (priority=3)
	public void logOutTest(){
		System.out.println("Logout at the end");
	}
	
	@Test (priority=1)
	public void logInTest (){
		System.out.println("Login first");
		// selenium code 
	}
	
	@Test (priority=2)
	public void changePassword(){
		System.out.println("change password");
			}

}
