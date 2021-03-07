package Org.Hela.serie4.Exercice10;
import java.util.function.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Question 1
				System.out.println("********** Question 1 **********\n");
				
				List<String> strings = 
						Arrays.asList("one", "two", "three",null);
				
				Function <String, String>  f1 = (String s) -> s == null ? "" :s.toUpperCase(); 
					//Tester Function f1
				for (String s : strings) {
					System.out.println(s + " toUpperCase  " + f1.apply(s));
				}
		
		//Question 2
				System.out.println("\n********** Question 2 **********\n");
				
				
				Function <String, String>  f2 = (String s) -> s == null ? " " : s ;
					//Tester Function f2
				for (String s : strings) {
					System.out.println(s + " is null ? : " + f2.apply(s));
				}
		
		//Question 3
				System.out.println("\n********** Question 3 **********\n");
				
				Function <String, Integer>  f3 = (String s) -> s == null ? 0 : s.length() ;
					//Tester Function f3
				for (String s : strings) {
					System.out.println(s + " est de longueur : " + f3.apply(s));
				}
		
		//Question 4
				System.out.println("\n********** Question 4 **********\n");
				
				Function <String, String>  f4 = (String s) -> s == null ? "()": "("+s+")" ;
					//Tester Function f4
				for (String s : strings) {
					System.out.println(s + " --> " + f4.apply(s));
				}
				
		//Question 5
				System.out.println("\n********** Question 5 **********\n");
				
				BiFunction<String, String, Integer> bf1 = (s1, s2) -> s1.indexOf(s2);
					//Tester Function bf1
				System.out.println( "nj dans bonjour = " + bf1.apply("bonjour", "nj"));
				System.out.println("Hello dans bonjour = " + bf1.apply("bonjour", "Hello"));
				
		//Question 6
				System.out.println("\n********** Question 5 **********\n");
				
					//application partielle
				Function<String, Integer> f5 = s -> bf1.apply("abcdefghi",s);
					//Tester Function f5
				System.out.println( "de dans abcdefghi = " + f5.apply("de"));
				System.out.println("bon dans abcdefghi = " + f5.apply("bon"));
	}

}
