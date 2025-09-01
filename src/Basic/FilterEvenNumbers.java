package Basic;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
	
	public static void main(String[] args) {
		
		Integer num[] = {5, 7, 8, 12, 34, 22, 65, 78, 21, 56};
		List<Integer> numbers = Arrays.asList(num);
		
		List<Integer> filtered = numbers.stream().filter(n -> n%2==0).toList();		
		System.out.println(filtered);
	}
}
