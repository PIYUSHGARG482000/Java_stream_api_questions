package Intermediate;

import java.util.Arrays;
import java.util.List;

public class StartAndEndsWith {

	public static void main(String[] args) {
		//Find all words that starts and ends with same character
		 String sentence="apple anna civic banana level";
		 
			List<String> words = Arrays.stream(sentence.split("\\s+"))
								.filter(x -> x.charAt(0) == x.charAt(x.length() - 1)).toList();

		 System.out.println(words);
		 
	}

}
