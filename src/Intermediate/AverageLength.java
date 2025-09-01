package Intermediate;

import java.util.Arrays;
import java.util.List;

public class AverageLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names  = Arrays.asList("Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit", "Varun Kumar" );

		double avgLength = names.stream().mapToInt(String::length).average().orElse(0.0);
		
		System.out.println(avgLength);
		
	}

}
