package Basic;

import java.util.List;
import java.util.stream.Stream;

public class CheckPrime {

	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}else {
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n%i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		
//		List<Integer> primeNumbers = numbers.stream().anyMatch(this::isPrime).toList();
		
		List<Integer> primeNumbers = numbers.stream().filter(x -> isPrime(x)).toList();
		System.out.println("Prime Numbers : "+ primeNumbers);
		
		//Merge two sorted list
		List<Integer> list1 = List.of(1, 3, 5, 7, 9);
		List<Integer> list2 = List.of(2, 4, 6, 8, 10);
		
		
		List<Integer> merged = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
		
		
		List<Integer> list3 = List.of(1, 2, 3, 4, 5);
		List<Integer> list4 = List.of(3, 4, 5, 6, 7);
		
		List<Integer> intersection = list3.stream().filter(list4::contains).toList();

		System.out.println("Merged list: " + merged);
		System.out.println("Intersection List: "+intersection);
		
	}

}
