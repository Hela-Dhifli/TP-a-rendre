package Org.Hela.serie4.Exercice9;
import java.util.function.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question 1
				System.out.println("********** Question 1 **********\n");
				
				Predicate <String>  p1  = s -> s.length() > 4;
					//Tester Predicate p1
				List<String> strings = Arrays.asList("one", "three", "four", "five", "six");
				for (String s : strings) {
					System.out.println(s + " is > 4 ? " + p1.test(s));
				}
		
		//Question 2
				System.out.println("\n********** Question 2 **********\n");
				
				Predicate <String>  p2  = s -> s.isEmpty();
					//Tester Predicate p2
				List<String> words = Arrays.asList("one", "", "four", "", "six");
				for (String s : words) {
					System.out.println(s + " is empty ? " + p2.test(s));
				}
				
		//Question 3
				System.out.println("\n********** Question 3 **********\n");
				
				Predicate <String>  p3 = s -> s.startsWith("J");
					//Tester Predicate p3
				List<String> startWithJ = Arrays.asList("José", "Jane", "Alex","Remy");
				for (String s : startWithJ) {
					System.out.println(s + " starts With 'J' ? " + p3.test(s));
				}
				
		//Question 4
				System.out.println("\n********** Question 4 **********\n");
				
				Predicate <String>  p4  = s -> s.length() == 5;
				//Tester Predicate p4
				for (String s : strings) {
					System.out.println(s + " is = 5 ? " + p4.test(s));
				}
			
		//Question 5
				System.out.println("\n********** Question 5 **********\n");
			
				Predicate<String> p5 = p4.and(p3);
				//Tester Predicate p5
				List<String> name = Arrays.asList("José", "Janne", "Jones","yohan");
				for (String s : name) {
					System.out.println(s +  " J and  5 ? " + p5.test(s));
				}
				
	
	}

}
