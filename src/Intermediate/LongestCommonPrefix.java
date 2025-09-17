package Intermediate;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// We have to find the longest common prefix in all the strings present in list
		List<String> strings = Arrays.asList("flower", "flow", "flight", "flew");
		
		String commonPrefix = strings.stream().reduce((s1, s2) -> {
			int minlength = Math.min(s1.length(), s2.length());
			int i = 0;
			while (i < minlength && s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			return s1.substring(0, i);
		}).orElse("");
		
		System.out.println(commonPrefix);

	}

}
