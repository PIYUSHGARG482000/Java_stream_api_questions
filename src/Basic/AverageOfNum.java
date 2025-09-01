package Basic;

import java.util.Arrays;
import java.util.List;

public class AverageOfNum {

	public static void main(String[] args) {
		Integer num[] = {5, 7, 8, 12, 34, 22, 65, 78, 21, 56};
		List<Integer> numbers = Arrays.asList(num);
		
		double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		System.out.println(avg);	
	}

}
