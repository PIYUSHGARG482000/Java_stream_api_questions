package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		 List<String> words = Arrays.asList("bat", "tab", "cat", "act", "dog", "god", "tac");
		 
			Map<String, List<String>> groupAnagram = words.stream()
							.collect(Collectors.groupingBy(x -> x.chars().sorted()
							.collect(
									StringBuilder::new, 
									StringBuilder::appendCodePoint, //Converts the UniCode to Character example. 97 → 'a', 98 → 'b' 
									StringBuilder::append) // then appends the character to final String
							.toString()));
			
			// groupAnagram -  {abt=[bat, tab], act=[cat, act, tac], dgo=[dog, god]}
			
			List<List<String>> AnagramGroups = groupAnagram.values().stream().filter(x -> x.size() > 1).toList();
			
			System.out.println(AnagramGroups);

	}

}
