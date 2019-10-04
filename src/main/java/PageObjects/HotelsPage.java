package PageObjects;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections.CollectionUtils;
import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Utils.SeleniumUtils;
import common.predicates.StringPredicates;
import common.predicates.WebElementPredicates;
import edu.emory.mathcs.backport.java.util.Collections;
import gherkin.formatter.Filter;
import net.bytebuddy.agent.builder.AgentBuilder.Listener.Filtering;

public class HotelsPage extends SeleniumUtils {
	int count=0;
	String val = null;
	long startTime;
	long endTime;
	double totalTime;
	double divTime=1000000000.0;
	@FindBy(xpath="//div[@class='_9uwBC wY0my']/span[contains(text(),'4')]")
List <WebElement> hotelsRating;
	
	@FindBy(xpath="//div[text()='Exclusive']/../../div/div[@class='nA6kb']")
	List<WebElement> exclusiveBadge;
	
	@FindBy(xpath="//div[text()='Promoted']")
	List <WebElement> promotedHotels;
	
	@FindBy(css=".IJsqo")
	List<WebElement> hotelWithBadges;
	
	@FindBy(xpath="//div[@class='_3Ynv-']//a[@href=\"/search\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchBoxInputField;
	
	@FindBy(xpath="//div[@class='_3Mn31']/div/span[contains(text(),'.')]")
	List<WebElement> allHotelsRating; 
	
	@FindBy(css="._3Mn31 div:nth-child(1)")
	List<WebElement> hotelRatingColor;
	
	@FindBy(css=".nA6kb")
	List<WebElement> hotelNames;
	
	@FindBy(xpath="//div[contains(text(),'Chicken')]")
	List<WebElement> pizzaprizes;
	
	public int verifyHotelsRating() {
//		float rating= Float.parseFloat("4.5");
//		int count=0;
//		for(WebElement w: hotelsRating) {
//				if(Float.parseFloat(w.getText())>rating) {
//					count++;
//				}
//			}
//	return count;
	//	hotelsRating.forEach(w-> System.out.println(w.getText()));
		startTime=System.nanoTime();
		float rating=Float.parseFloat("4.5");
		//ForEach
		hotelsRating.forEach(each -> {
			if (Float.parseFloat(each.getText()) > rating) {
				count++;
			}
		}
				);
		endTime=System.nanoTime();
		totalTime = (endTime - startTime) / divTime;
		System.out.println("Total Time="+(startTime-endTime/divTime));
		return count;
	
	}
	
	public int getCountOfPromotedOrExclusiveHotels(String value) {
		return (int) hotelWithBadges.stream()
				.map(element -> element.getText())
				.filter(StringPredicates.contains(value)).count();
		}
	
	public void clickOnSearchBox() {
		searchBox.click();
	}
	
	public void enterSearchItem(String searchOption) {
		searchBoxInputField.sendKeys(searchOption);
	}
	
//	public Stream<WebElement> searchHotelNames() {
//		
//		List<WebElement> hotels= hotelNames.stream().filter(i->i.getText().startsWith("T")).filter(i->i.getText().contains("Tatva")).collect(Collectors.toList());
//	}
	
	public boolean verifyRatingColor() throws InterruptedException {
		Predicate<WebElement> colorGreenOrOrange = WebElementPredicates.mustHaveCssValue("background-color","rgba(219, 124, 56, 1)" )
				.or(WebElementPredicates.mustHaveCssValue("background-color", "rgba(72, 196, 121, 1)"));
//		System.out.println("Hotel badges with count:"+ hotelRatingColor.size());
		return hotelRatingColor.stream()
				.filter(WebElementPredicates.mustHaveCssValue("background-color", "rgba(0, 0, 0, 0)").negate())
				.allMatch(colorGreenOrOrange);
	}

	
	public void hoverMouseOnHotel() {
		Actions action=new Actions(driver);
		WebElement hotel=driver.findElement(By.xpath("//div[text()='Ovenstory pizza']"));
		WaitForElementToBeVisible(hotel);
		action.moveToElement(hotel).build().perform();
	}
	
	public void clickOnQuickViewLink() {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Ovenstory pizza']//../../../div/span[text()='Quick View']"))).click().build().perform();
	}
	
	public boolean verifySecondBox() {
	return	driver.findElement(By.xpath("//div[@class='I7rmU _3TvfX']")).isDisplayed();
	}
	
	public boolean countOfPizzas(String val1, String val2) throws InterruptedException {
		Thread.sleep(3000);
		Predicate< WebElement> prizes= WebElementPredicates.verifyPrizes(val2).and(WebElementPredicates.verifyPrizes(val1));
		System.out.println("Pizza: "+pizzaprizes.size());
		return pizzaprizes.stream().filter(element->element.getText().contains("Personal")).allMatch(prizes);
	}
}