package Basic;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class kthSmallest {

	public static void main(String args[]) {

		List<Integer> array = List.of(4, 2, 7, 1, 5, 3, 6);
		int k = 8; // Find the 3rd smallest element

		System.out.println(array.stream().sorted().toList());

		int smallest = array.stream().sorted().skip(k - 1).findFirst().orElse(-1);

		System.out.println(smallest);
		
		List<String> words = List.of("apple", "banana", "apple", "cherry", 
                "banana", "apple");
		
		Map<String, Long> frequency = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		System.out.println(frequency);
		
	}

}
