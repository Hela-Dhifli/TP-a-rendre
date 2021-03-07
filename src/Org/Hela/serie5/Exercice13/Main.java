package Org.Hela.serie5.Exercice13;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = Map.ofEntries(
				Map.entry(3, "one"), 
				Map.entry(4, "four"), 
				Map.entry(5, "three"), 
				Map.entry(6, "eleven"));
		
		Map<Integer, String> map_mutable = new HashMap<>(map);
		//
				System.out.println("\n********** toUpperCase **********\n");
				
				map_mutable.replaceAll((cle,valeur) -> valeur.toUpperCase() );
				
				//test
				System.out.println("Valeurs en majuscule : ");
				map_mutable.forEach((cle,valeur) -> System.out.println(cle + " - " + valeur ));
		
		
		List<Integer> keys = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		
		//
				System.out.println("\n********** puIfAbsent **********\n");
				//on utilise la methode puIfAbsent
				for (int key : keys) {
					map_mutable.putIfAbsent(key, ""); //on va avoir des chaine vides au lieu de null
					System.out.println(key + " = " + map_mutable.get(key) );
				}
			
				
		//
				System.out.println("\n********** computeIfAbsent **********\n");
				
				Map<Integer, List<String>> map2 = new HashMap<>();
				List<String> words = List.of("one","two","three","four","five","six","seven",
						"eight","nine","ten","eleven","twelve");

				
				for (String word : words) {
					map2.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
				}
				map2.forEach((key,valeur) -> System.out.println(key + " - " + valeur ));
				
		//
				System.out.println("\n********** merge **********\n");
				
				Map<Integer, String> map3 = new HashMap<>();
				for (String word : words) {
					int key = word.length();
					map3.merge(key, word,
							(val, nouv_val) -> val + ", " + nouv_val);
				}
				
				map3.forEach((key, value) -> System.out.println(key + " = " + value));
	}

}
