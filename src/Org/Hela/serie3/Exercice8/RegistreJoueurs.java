package Org.Hela.serie3.Exercice8;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RegistreJoueurs {

	private Map<Integer,List <String>> map = new HashMap<>();
	
	public void addJoueur(Joueur j) {
		
		//calculer la decennie qui correspond � l'ann�e de naissance
		int decennie = ((j.getAnneeDeNaissance())/10)*10;
		
		//si la cle existe deja
		if (map.containsKey(decennie)) {
			List <String> liste = new ArrayList <> ();
			//copier le contenu de la liste qui existe deja dans une nouvelle liste
			liste.addAll(map.get(decennie)); 
			//ajouter a la nouvelle liste le nom du joueur 
			liste.add(j.getNom());
			map.put(decennie, liste);
		}
		//si la cle n'existe pas
		else {
			List <String> liste = new ArrayList <> ();
			liste.add(j.getNom());
			map.put(decennie, liste);
		}
	}
	
	/*fonction qui retourne la liste des joueurs n�s dans une decennie*/
	public List <String> get(int decennie) {
		return (map.get(decennie));
	}
	
	/*fonction qui retourne le nombre de joueurs n�s dans une d�cennie*/
	public int count(int decennie) {
		return (map.get(decennie).size());
	}
	
	/*fonction qui retourne le nombre de joueurs enregistr�s dans le registre.*/
	public int count() {
		/*nous parcourons toute la table de hashage et calculons la somme*/
		int somme = 0 ;
		Set<Entry<Integer,List <String>>> entrySet = map.entrySet();
		for (Entry<Integer,List <String>> entry : entrySet) {
			somme += entry.getValue().size();
		}
		return (somme);
	}

	
	@Override
	public String toString() {
		return "RegistreJoueurs \n" + map ;
	}
	
	
	
}
