package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;

public class HomepagePage extends SeleniumUtils{

	
	@FindBy(xpath="//input[@id='location']")
	WebElement searchBox;

	@FindBy(xpath="//div[@class='_1oLDb']")
	WebElement automatedSearchList;
	
	@FindBy(xpath="//div[@tabindex=\"2\"]")
	WebElement firstElementOfList;
	
	@FindBy(xpath="//a[@class='_3iFC5']")
	WebElement findFoodBtn;
	
	
	public void enterValidLocationSearchBox(String location) {
		searchBox.sendKeys(location);
		
	}

	public boolean verifyAutomatedSearchResultIsVisible() {
		WaitForElementToBeVisible(automatedSearchList);
		return automatedSearchList.isDisplayed();
	}
	
	public void selectFirstFromList() {
		firstElementOfList.click();
	}
	
	public void clickOnFindFoodBtn() {
		WaitForElementToBeVisible(findFoodBtn);
		findFoodBtn.click();
	}
	
	public boolean verifyLocationOnTop(String location) {
		WaitForElementToBeVisible(driver.findElement(By.xpath("//span[text()='"+location+"']")));
		return driver.findElement(By.xpath("//span[text()='"+location+"']")).getText().equals(location);
	}
}
