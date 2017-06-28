package classTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fbSignupTEST {
	
	WebDriver driver =null;
	
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
		System.out.println("Start the browser");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/drivers/chromedriver.exe");//2nd parameter would be the path to the driver you downloaded
		
		driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	}
	
	@AfterTest
	public void afterTest (){
		System.out.println("Browser will close now");
		//driver.close();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("---- before each test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("----- After each test");
	}

	@Test
	public void fbLogin (){
		System.out.println("fb Login test");
		
		
	}
	@Test
	public void fbSignout (){
		System.out.println("fb signout test");
		
	}
}
