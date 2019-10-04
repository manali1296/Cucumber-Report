package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Signup_PageObject;
import Utils.Driver;
import Utils.SeleniumUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SeleniumUtils {
WebDriver driver;
//signup_PageObject signupPage;
SeleniumUtils base;
//
//public Hooks(SeleniumUtils base) {
//	this.base=base;
//}


	@Before
	public void setUP()
	{
		
		driver = Driver.initializeBrowser();
		//WebDriver d1=getDriver();
		SeleniumUtils.setDriver(driver);
		
	}
	
	@After
	public void closeDriver() {
		driver.close();
	}
	
}
