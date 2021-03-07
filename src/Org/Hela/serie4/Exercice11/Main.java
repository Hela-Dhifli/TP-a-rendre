package Org.Hela.serie4.Exercice11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Question  1
		System.out.println("\n********** Question 1 **********\n");
		
		List<String> words = 
				Arrays.asList("one", "two", "three", "four", "five", 
						"six", "seven", "eight", "nine", "ten");
		
		Comparator<String> cmp = (s1 , s2) -> s1.length() - s2.length();
		
		System.out.println("--------- Before sort");
		words.forEach((String s) -> System.out.print(s + " "));
			//Tester comparator
		words.sort(cmp);	
		System.out.println("\n--------- la plus petite -> la plus grande");
		words.forEach((String s) -> System.out.print(s + " "));
		
		//Question 2
		System.out.println("\n\n********** Question 2 **********\n");

		List<Person> personnes = List.of(
				new Person ("Tom","Jedusor",54),
				new Person("Hermione","Granger",29), 
				new Person("Ronald","Weasley",35),
				new Person("Fred","Weasley",31),
				new Person("George","Weasley",31),
				new Person ("Harry","Potter",29));
		List<Person> personnes_mutable = new ArrayList<>(personnes);
		
		Comparator<Person> cmpLastName = Comparator.comparing(Person::getLastName);
			//test 
		personnes_mutable.sort(cmpLastName);
		personnes_mutable.forEach(System.out::println);
		
		//Question 3
		System.out.println("\n\n********** Question 3 **********\n");
		Comparator<Person> cmp2=
				Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName);
			//test
		personnes_mutable.sort(cmp2);
		personnes_mutable.forEach(System.out::println);
		
		
		//Question 4
		System.out.println("\n\n********** Question 4 **********\n");

		Comparator<Person> cmp3= cmp2.reversed();
			//test
		personnes_mutable.sort(cmp3);
		
		personnes_mutable.forEach(System.out::println);
		
		
		// Question 5
		System.out.println("\n\n********** Question 5 **********\n");
		List<Person> listWithNull = Arrays.asList(
				new Person ("Tom","Jedusor",54),
				null, 
				new Person("Ronald","Weasley",35),
				new Person("Fred","Weasley",31),
				null,
				new Person ("Harry","Potter",29));
		
		Comparator<Person> cmp4 = 
				Comparator.nullsLast(Comparator.comparing(Person::getLastName));
		
		listWithNull.sort(cmp4);
		
		listWithNull.forEach(System.out::println);

		
	}

}
