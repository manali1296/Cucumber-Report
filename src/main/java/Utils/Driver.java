package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Driver {
	static WebDriver driver;
	public static WebDriver initializeBrowser() 
	{
        WebDriverManager.chromedriver().setup();	
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
		return driver ;
		}
	
}