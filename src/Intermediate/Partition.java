package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(3,2,6,7,9,12,54,22,31);

		
		Map<String, List<Integer>> partitioning = numbers.stream().collect(Collectors.groupingBy(x -> x%2==0 ? "Even" : "Odd"));
		
		System.out.println(partitioning);
	}

}
