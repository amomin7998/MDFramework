package classTest;

import org.testng.annotations.Test;
import base.config;
import locators.fbLocators;
import values.fbValues;

public class frameworkTEST extends config{
	fbLocators fbl = new fbLocators ();
	fbValues   fbv = new fbValues ();

	
	// Apache log4j
	// log4j property file need to be under src folder
	// download log4j and dom4j jars
	
	@Test
	public void signIn (){
		
		APPLICATION_LOGS.info ("SignInf TEST STARTED");
		// type email address
		typeByXpath (fbl.fbLoginLocator, fbv.fbLoginValue);
		APPLICATION_LOGS.info ("Typed the email address");
		// type password
		typeByXpath (fbl.fbLoginPassLocator, fbv.fbloginPassValue);
		APPLICATION_LOGS.debug ("Typed the password");
		// click on login button
		clickByXpath (fbl.fbLoginButtonLocator);
		APPLICATION_LOGS.info ("Clicked on Login in button");
		
		
	}
	
	

}
