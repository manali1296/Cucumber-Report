package common.predicates;

import java.util.function.Predicate;
import org.openqa.selenium.WebElement;

public class WebElementPredicates {

	public static Predicate<WebElement> mustHaveCssValue(String property, String value){
		
		return element -> element.getCssValue(property).equals(value);	
	}
	
	
	public static Predicate<WebElement> verifyPrizes(String val){
		return element-> element.getText().contains(val);
	}
}
