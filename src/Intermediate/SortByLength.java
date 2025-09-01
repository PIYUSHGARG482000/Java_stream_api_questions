package Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names  = Arrays.asList("Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit", "Varun Kumar" );
		
		List<String> sorted = names.stream().sorted(Comparator.comparingInt(String::length)).toList();
		
		String longest = names.stream().max(Comparator.comparingInt(String::length)).orElse("No Longest String present");
		
		System.out.println(sorted);
		
		
	}

}
