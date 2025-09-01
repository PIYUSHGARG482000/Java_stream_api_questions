package Intermediate;

import java.util.Arrays;
import java.util.List;

public class SumOfSqaures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sumofsqaure = Arrays.asList(54,32,21,44,67);
		
		
		int summ = sumofsqaure.stream().map(x -> x*x).mapToInt(Integer::intValue).sum();

		System.out.println(summ);
	}

}
