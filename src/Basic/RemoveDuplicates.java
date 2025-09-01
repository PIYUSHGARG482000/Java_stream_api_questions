package Basic;

import java.util.*;
import java.util.stream.Collectors;

class Transaction {
	String date;
	int amount;

	public Transaction(String date, int amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}

public class RemoveDuplicates {
	public static void main(String[] args) {
		Integer num[] = {5, 7, 8, 12, 34, 22, 12, 78, 7, 5};
		List<Integer> numbers = Arrays.asList(num);
		
		List<Integer> distinct = numbers.stream().distinct().toList();
//		System.out.print(distinct);	
		
		
		List<Transaction> transactions = Arrays.asList(
			    new Transaction("2022-01-01", 100),
			    new Transaction("2022-01-01", 200),
			    new Transaction("2022-01-02", 300),
			    new Transaction("2022-01-02", 400),
			    new Transaction("2022-01-03", 500)
			);
		
		Map<String, Integer> summary = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingInt(Transaction::getAmount)));
		
		System.out.println(summary.entrySet());
	}
}
