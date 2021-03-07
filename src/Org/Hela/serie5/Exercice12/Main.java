package Org.Hela.serie5.Exercice12;
import java.util.*;
import java.util.function.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> words = 
				Arrays.asList(
						"one", "two", "three", "four", "five", 
						"six", "seven", "eight", "nine", "ten",
						"eleven", "twelve");
	
		//Question 1
			System.out.println("\n********** Question 1 **********\n");
			
			words.forEach((String s) -> System.out.print(s + " "));
		
		//Question 2
			System.out.println("\n\n********** Question 2 **********\n");
			
			//creation liste mutable
			List <String> liste_mutable = new ArrayList<>(words);
			
			liste_mutable.removeIf(s -> s.length() %2 ==0 );
			
			//test
			System.out.print("Elements de longueur impair : \n\n --> ");
			liste_mutable.forEach((String s) -> System.out.print(s + " "));
			
		//Question 3
			System.out.println("\n\n********** Question 3 **********\n");
			
			words.replaceAll(s -> s.toUpperCase() );
			//test
			System.out.print("Elements en majuscule : \n\n --> ");
			words.forEach((String s) -> System.out.print(s + " "));
			
				//remettre les elements en miniscules
			words.replaceAll(s -> s.toLowerCase() );
				
			Predicate <String>  p1  = 
					s -> s.startsWith("e")||s.startsWith("i")||s.startsWith("a")||s.startsWith("o")||s.startsWith("u")||s.startsWith("y");
			
			words.replaceAll( s -> p1.test(s) ? s.toUpperCase() : s );
			System.out.print("\n\nElements qui commencent par voyelles en majuscules : \n\n --> ");
			words.forEach((String s) -> System.out.print(s + " "));
		
		//Question 4
			System.out.println("\n\n********** Question 4 **********\n");
			
			Comparator<String> cmpLength = (s1 , s2) -> s1.length() - s2.length();
			
				//test
			liste_mutable.sort(cmpLength);
				//affichage
			System.out.print("Trie selon longueur : \n\n --> ");
			liste_mutable.forEach((String s) -> System.out.print(s + " "));

		//Question 5
			System.out.println("\n\n********** Question 5 **********\n");
			
			Comparator<String> Alpha = (s1 , s2) -> s1.compareTo(s2);
			Comparator<String> lengthThenAlpha = cmpLength.thenComparing(Alpha);
			
				//test
			liste_mutable.sort(lengthThenAlpha);
				//affichage
			System.out.print("Trie length then alphabétique : \n\n --> ");
			liste_mutable.forEach((String s) -> System.out.print(s + " "));

	}

}
