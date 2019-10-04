package stepDefination;

import java.util.logging.LogManager;

import org.apache.log4j.Logger;
import org.codehaus.plexus.logging.LoggerManager;

import PageObjects.HomepagePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomepageStep {

	HomepagePage homepage;
	
	Logger log = Logger.getLogger(HomepageStep.class);
//	Logger logger= LogManager.getLogger(HomepageStep.class);

	public HomepageStep() {
	this.homepage =	new HomepagePage();

		}
 
@When("^I enter \"([^\"]*)\" value in Searchbox$")
public void i_enter_value_in_Searchbox(String arg1) throws Throwable {
	homepage=new HomepagePage();
    homepage.enterValidLocationSearchBox(arg1);
	log.info("****************************** starting test case *****************************************");

}

@Then("^I verify list of search result is populated below$")
public void i_verify_list_of_search_result_is_populated_below() throws Throwable {
  Assert.assertTrue( homepage.verifyAutomatedSearchResultIsVisible());
}

@Then("^i selected First option$")
public void i_selected_First_option() throws Throwable {
   homepage.selectFirstFromList();
  Thread.sleep(3000);
}

@Then("^click on Find Food button$")
public void click_on_Find_Food_button() throws Throwable {
  homepage.clickOnFindFoodBtn();
  Thread.sleep(2000);
}

@Then("^I verify i landed on Page with \"([^\"]*)\" on top left corner i was entered for search$")
public void i_verify_i_landed_on_Page_with_on_top_left_corner_i_was_entered_for_search(String arg1) throws Throwable {
 Assert.assertTrue(homepage.verifyLocationOnTop(arg1));
 boolean location= homepage.verifyLocationOnTop(arg1);
 log.info(location);
 Thread.sleep(3000);
}

}
