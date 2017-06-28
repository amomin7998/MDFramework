package classTest;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class dependsOnTest {
	
	@Test ()
	public void logOutTest(){
		System.out.println("Logout at the end");
	}
	
	@Test ()
	public void logInTest (){
		System.out.println("Login first");
		throw new SkipException ("I am still working on Login");
		// selenium code 
	}

	
	@Test (dependsOnMethods = {"logInTest"})
	public void changePassword(){
		System.out.println("change password");
	}

}
