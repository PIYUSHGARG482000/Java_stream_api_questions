package Intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Cat","Pen","Bat", "Cat", "Bat", "Apple", "Bat", "Pen");
		
		Map<String, Long> occurance = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(occurance);
	}

}
