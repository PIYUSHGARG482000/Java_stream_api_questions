package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingString {

	public static void main(String[] args) {
		//Group Strings with their first characters.
		
		List<String> name = Arrays.asList("Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit", "Priyanshu");

		
		Map<Character, List<String>> grouping = name.stream().collect(Collectors.groupingBy(w -> w.charAt(0)));
		
		System.out.println(grouping);
	}

}
