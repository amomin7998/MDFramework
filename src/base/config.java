package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.WDFunctions;

public class config extends WDFunctions{
	
	@BeforeSuite
	public void beforeSuite(){
		//System.out.println("*** TEST SUITE STARTED ");
		APPLICATION_LOGS.info ("Test suite STARTED");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println("*** TEST SUITE ENDED ");
		APPLICATION_LOGS.info ("Test suite ENDED");
	}
	
	@Parameters ("Browser")
	@BeforeTest
	public void beforeTest (String browserName){
		
				
		if (browserName.equalsIgnoreCase("cH")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/drivers/chromedriver.exe");//2nd parameter would be the path to the driver you downloaded
			driver =new ChromeDriver();
			APPLICATION_LOGS.info ("Chrome STARTED");
		} else if (browserName.equalsIgnoreCase("FF")){
			APPLICATION_LOGS.info ("Firefox going to start");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			APPLICATION_LOGS.debug("Firefox has been selected");
		}else {
			throw new IllegalArgumentException ("The browser type is undefined");
		}
		
		driver.get("http://www.facebook.com");
		APPLICATION_LOGS.info ("www.facebook.com opened");
		maxPage();
	}
	
	@AfterTest
	public void afterTest (){
		System.out.println("Close the browser");
		APPLICATION_LOGS.info ("Driver got closed");
		// driver.close();
	}

}
