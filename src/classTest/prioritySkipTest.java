package classTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class prioritySkipTest {
	

	
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

	// skipping the test - but will be showing under the report
	// disable the test -- won't show in report
	
	@Test (priority=4)
	public void skipTest(){
		System.out.println("skipTest");
		throw new SkipException ("I am still working on it");
	}
	
	@Test (priority=5, enabled=false)
	public void disableTest(){
		System.out.println("Disable the test");
	
		
	}
	
}
