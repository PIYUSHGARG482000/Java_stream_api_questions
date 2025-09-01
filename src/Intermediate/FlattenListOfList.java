package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<Integer>> nestedList = Arrays.asList(
				Arrays.asList(54,32,21,44,67),
				Arrays.asList(90,88,43,23,64),
				Arrays.asList(55,74,39,81,96));
		
		
		List<Integer> flattenlist = nestedList.stream().flatMap(List::stream).sorted().collect(Collectors.toList());;
		
		System.out.println(flattenlist);
		
	}

}
