package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WDFunctions {

	public static WebDriver driver;
	public static Logger APPLICATION_LOGS = Logger.getLogger ("devpinoyLogger");

	public void typeByXpath (String locators, String values){
		try {
			driver.findElement(By.xpath(locators)).clear();
			driver.findElement (By.xpath(locators)).sendKeys (values);
		} 
		catch (Exception e){
			System.err.println("issue with :"  + e.getMessage());
			APPLICATION_LOGS.debug("issue with : " + e.getMessage());
		}
	};

	public void typeByName (String locators, String values){
		driver.findElement(By.name(locators)).clear();
		driver.findElement (By.name(locators)).sendKeys (values);

	};
	
	public void typeById (String locators, String values){
		driver.findElement(By.id(locators)).clear();
		driver.findElement (By.id(locators)).sendKeys (values);

	};

	public void clickByXpath (String locators){
		driver.findElement (By.xpath(locators)).click();

	};
	public void maxPage (){
		driver.manage().window().maximize();

	};

}
