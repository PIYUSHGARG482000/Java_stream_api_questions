package Basic;

import java.util.Arrays;
import java.util.List;

public class FilterWithSpecialCharacter {
		
	public static void main(String[] args) {

		String names[] = {"Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit"};
		List<String> name = Arrays.asList(names);
		
		List<String> filtered = name.stream().filter(n -> n.startsWith("A")).toList();
		System.out.println(filtered);
		
	}
}
