package Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class Person{
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class LongestString {

	public static void main(String[] args) {
		String names[] = { "Mayank", "Abhinav", "Piyush", "Ramesh", "Abhijeet", "Amit", "Varun Kumar" };
		List<String> name = Arrays.asList(names);

		String longest = name.stream().max(Comparator.comparingInt(String::length)).orElse("No String Available");
		System.out.println(longest);
		
		
		List<Person> persons = Arrays.asList(
			    new Person("Alice", 25),
			    new Person("Bob", 30),
			    new Person("Charlie", 35)
			);
		
		double averageAge = persons.stream().mapToInt(Person::getAge).average().getAsDouble();
		
		System.out.println(averageAge);
		
		String find_longest = "Java Stream API makes    code elegant and    powerful     5891,89712893,Important,EveryThing";
		
		String logeest = Arrays.asList(find_longest.split("[,\\s]")).stream().filter(w -> w.matches("^[a-zA-Z]+$")).max(Comparator.comparingInt(String::length))
				.orElse("No longest String exist");
		
		System.out.println(logeest);
		System.out.println(logeest.length());
		
		
		
	}

}
