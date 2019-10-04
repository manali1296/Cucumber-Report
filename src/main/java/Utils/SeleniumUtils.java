package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeleniumUtils {
	public static WebDriver driver;
	public SeleniumUtils() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void	WaitForElementToBeVisible(WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	
	public static void setDriver(WebDriver driver) {
		SeleniumUtils.driver = driver;

	}
}
