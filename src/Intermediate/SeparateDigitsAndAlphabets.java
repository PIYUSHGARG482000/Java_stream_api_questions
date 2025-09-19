package Intermediate;

import java.util.stream.Collectors;

public class SeparateDigitsAndAlphabets {

	public static void main(String[] args) {
		String name = "piyush040820";
		
		String alphabets = name.chars().mapToObj(x -> (char) x).filter(Character::isLetter).map(String::valueOf)
				.collect(Collectors.joining());
		
		String digits = name.chars().mapToObj(x -> (char) x).filter(Character::isDigit).map(String::valueOf)
				.collect(Collectors.joining());
		
		System.out.println("Alphabats : " + alphabets);
		System.out.println("Digits : " + digits);
	}

}
