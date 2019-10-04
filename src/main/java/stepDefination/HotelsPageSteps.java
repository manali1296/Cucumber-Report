package stepDefination;

import org.testng.Assert;

import PageObjects.HotelsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelsPageSteps {

	private HotelsPage hotelsPage;

	public HotelsPageSteps() {
		this.hotelsPage = new HotelsPage();
	}

	@Then("^I verify Hotels which Has Rating more than \"([^\"]*)\"$")
	public void i_verify_Hotels_which_Has_Rating_more_than(String arg1) throws Throwable {
		hotelsPage.verifyHotelsRating();
		System.out.println("Rating Count is" + hotelsPage.verifyHotelsRating());
	}

	@Then("^I verify Hotels which has \"([^\"]*)\" band on top left corner$")
	public void i_verify_Hotels_which_has_band_on_top_left_corner(String arg1) throws Throwable {
		hotelsPage.getCountOfPromotedOrExclusiveHotels("EXCLUSIVE");
		// System.out.println("Exclusive
		// Hotels:"+hotelsPage.verifyHotelsWithExclusiveBadge());
	}

	@Then("^I verify Hotels Has \"([^\"]*)\" band in left corner$")
	public void i_verify_Hotels_Has_band_in_left_corner(String arg1) throws Throwable {
		Assert.assertTrue(hotelsPage.getCountOfPromotedOrExclusiveHotels("PROMOTED") > 5);
	}

	@When("^I click on \"([^\"]*)\" option$")
	public void i_click_on_option(String arg1) throws Throwable {
		hotelsPage.clickOnSearchBox();
	}

	@When("^I entered \"([^\"]*)\"$")
	public void i_entered(String arg1) throws Throwable {
		hotelsPage.enterSearchItem(arg1);
	}

	@Then("^I verify hotels rating colors$")
	public void i_verify_hotels_colors() throws Throwable {
		Assert.assertTrue(hotelsPage.verifyRatingColor());
	}

	@Then("^I hover the mouse on \"([^\"]*)\"$")
	public void i_hover_the_mouse_on(String arg1) throws Throwable {
		hotelsPage.hoverMouseOnHotel();
	}

	@Then("^I click on \"([^\"]*)\" Link$")
	public void i_click_on_Link(String arg1) throws Throwable {
		hotelsPage.clickOnQuickViewLink();
	}

	@Then("^I verify second box opened with number of hotel menus$")
	public void i_verify_second_box_opened_with_number_of_hotel_menus() throws Throwable {
		hotelsPage.verifySecondBox();
	}

	@Then("^I verify hotel has \"([^\"]*)\" , \"([^\"]*)\" Of Rupees menus$")
	public void i_verify_hotel_has_Of_Rupees_menus(String arg1, String arg2) throws Throwable {
		Assert.assertTrue(hotelsPage.countOfPizzas(arg1, arg2));
	}

}
