package Intermediate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "Amesterdam";
		
		char c = str.toLowerCase().chars().mapToObj(x -> (char) x) //Converted to Char stream
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Preserving Order by using LinkedHashMap
				.entrySet().stream()
				.filter(x -> x.getValue() == 1) //Taking first non repeating Character
				.map(Map.Entry::getKey) //Value stored in Key of a entryset
				.findFirst()
				.orElse(null);
		
		System.out.println(c);
	}

}
