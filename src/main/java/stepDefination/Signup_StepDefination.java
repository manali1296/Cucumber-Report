package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomepagePage;
import PageObjects.Signup_PageObject;
import Utils.SeleniumUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Signup_StepDefination

{
	Signup_PageObject signUPPage;
	
	public Signup_StepDefination() {
		this.signUPPage=new Signup_PageObject();
	}
	
	@Given("^I Land on swiggy homepage$")
	public void verifyHomepage() {
		signUPPage=new Signup_PageObject();
		Assert.assertEquals(signUPPage.getHomepageTitle(), "Order food online from India's best food delivery service. Order from restaurants near you");
	}
	
	@When("^I click on signup button$")
	public void i_click_on_signup_button() throws Throwable {
	  signUPPage.clickOnSignUpBtn();
	}

	@Then("^signup form is opened$")
	public void signup_form_is_opened() throws Throwable {
	   signUPPage.verifySignUpFormIsVisible();
	}

	@Then("^I enter all the data and completed the registration form$")
	public void i_enter_all_the_data_and_completed_the_registration_form() throws Throwable {
		signUPPage.enterMobNum("8087751512");
		signUPPage.enterEmail("manaligaikwad12@gmail.com");
		signUPPage.enterPassword("manali12");
		signUPPage.enterName("Manali");
		
	}
	
	@Then("^I click on cancel button$")
	public void i_click_on_cancel_button() throws Throwable {
		signUPPage.clickOnCancelBtn();
	}

	@Then("^SignUp form dispappers$")
	public void signup_form_dispappers() throws Throwable {
	  // Assert.assertFalse();
	   Assert.assertTrue(signUPPage.isSignUpFormDisappered());
	}
}
