package Intermediate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {

	public static void main(String[] args) {
		
		List<List<Integer>> nestedList = Arrays.asList(
				Arrays.asList(54,32,21,44,67),
				Arrays.asList(90,88,43,23,64),
				Arrays.asList(55,74,39,81,96));
		
		
		int second_highest = nestedList.stream().flatMap(List::stream).distinct().sorted(Collections.reverseOrder())
				.skip(1).findFirst().orElseThrow(() -> new RuntimeException("No Second Highest Present"));
		
		System.out.println(second_highest);
	}

}
