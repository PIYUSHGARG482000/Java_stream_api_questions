package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStringLength {

	public static void main(String[] args) {
		String names[] = {"Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit"};
		List<String> name = Arrays.asList(names);
		
		//Boxed - Boxes IntStream to Stream<Integer>
		List<Integer> lengths = name.stream().mapToInt(String::length).boxed().collect(Collectors.toList());
		System.out.println(lengths);

	}

}
