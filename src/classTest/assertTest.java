package classTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertTest {
	SoftAssert softAssert = new SoftAssert();
	
	@Test (priority=1)
	public void assertPass(){
		String act = "abc";
		String exp = "abc";
		Assert.assertEquals(act, exp);
		System.out.println ("TC1: PASS");
	}
	
	@Test (priority=2)
	public void softAssertTest(){
		String act = "abc";
		String exp = "abcd";
		System.out.println ("TC 2: Going to fail it with softAssert");
		softAssert.assertEquals(act, exp);
		System.err.println ("Soft assert working");
		softAssert.assertAll();
	}
	
	@Test (priority=3)
	public void assertFail(){
		String act = "abc";
		String exp = "abcd";
		System.err.println ("TC 3: Going to fail the test");
		Assert.assertEquals(act, exp);
		System.out.println ("FAILD");
	}
}
