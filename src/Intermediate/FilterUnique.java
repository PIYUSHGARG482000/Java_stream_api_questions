package Intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("apple", "kite", "banana", "dog", "lamp", "noon");
		
		List<String> unique = words.stream().filter(x -> x.chars().distinct().count() == x.length()).toList();
		
		System.out.println(unique);
		

	}

}
