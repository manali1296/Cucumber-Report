package common.predicates;

import java.util.function.Predicate;

public class StringPredicates {

	public static Predicate<String> contains(String value){
		return string -> string.contains(value);
		
	}
	
	
}
