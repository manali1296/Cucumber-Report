package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;

public class Signup_PageObject extends SeleniumUtils{

	@FindBy(xpath="//a[text()='Sign up']")
	WebElement signUpBtn;
	
	@FindBy(xpath="//div[@style='padding-left: 40px; padding-right: 75px; width: 477px;']")
	WebElement signUpForm;
	
	@FindBy(xpath="//input[@id='mobile']")
	WebElement mobileNum;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(css="._22fFW.icon-close-thin")
	WebElement cancel;
	
	@FindBy(xpath="//div[@style='left: auto; right: 0px; transform: translate(0%, 0px);']")
	List<WebElement> signUpFormList;
	
	
public String getHomepageTitle() {
	System.out.println("Homepage title is:"+driver.getTitle());
	return driver.getTitle();
}

public void clickOnSignUpBtn() {
	signUpBtn.click();
}

public boolean verifySignUpFormIsVisible() {
	return	signUpForm.isDisplayed();
}

public void enterMobNum(String mob_num) {
	mobileNum.sendKeys(mob_num);
	}

public void enterName(String nameOfUser) {
	name.sendKeys(nameOfUser);
}

public void enterEmail(String emailOfUser) {
	Email.sendKeys(emailOfUser);
}

public void enterPassword(String passwordOfUser) {
	password.sendKeys(passwordOfUser);
}

public void clickOnCancelBtn() {
	WaitForElementToBeVisible(cancel);
	cancel.click();
}

public boolean isSignUpFormDisappered() {
if(signUpFormList.size()>=0) {
	return true;
}
return false;
}
}

