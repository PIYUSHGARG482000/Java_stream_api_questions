package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByRemainder {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 21, 22, 33, 40, 42, 55);
		
		Map<Integer, List<Integer>> grouping = numbers.stream().collect(Collectors.groupingBy(x -> x%3));
		
		System.out.println(grouping);
	}

}
