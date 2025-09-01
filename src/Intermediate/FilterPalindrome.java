package Intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterPalindrome {

	
	public static boolean isPalindrome(String str) {
		int i=0;
		int j=str.length()-1;
		
		while(i<=j) {
			if(str.charAt(i) != str.charAt(j)) return false;
			i++;
			j--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("nitin", "Himanshu", "madam", "level", "Abhijet", "radar", "Gaurav");
		
		List<String> palindromes = names.stream().filter(FilterPalindrome::isPalindrome).toList();
		
		System.out.println(palindromes);

	}

}
