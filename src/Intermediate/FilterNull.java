package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = Arrays.asList(54,null,32,21,null,44,67,null,87,62);
		List<String> words = Arrays.asList("apple", null, "banana", "orange", null, "grape","54",null,"32","21",null,"44","67",null,"87","62");

		List<String> filtered = words.stream().filter(Objects::nonNull).toList();
		
		System.out.println(filtered);
		
		
	}

}
