package Org.Hela.serie3.Exercice7;
import java.util.*;

public class Equipe {

	Collection <Joueur> joueurs ; 
	
	//constructeur
	Equipe () {
		joueurs = new ArrayList <Joueur>(); 
	}
	
	
	public void addJoueur(Joueur j) {
		joueurs.add(j);
	}
	
	public boolean removeJoueur(Joueur j) {
		return (joueurs.remove(j));
	}
	
	
	boolean isJoueurPresent (Joueur j) {
		return (joueurs.contains(j));
	}

	
	@Override
	public String toString() {
		   String str = "Equipe : ";
		   str = str + (joueurs.size())+(" joueurs\n") ; //concaténation du message
		   
		   for (Joueur j : joueurs) {
		      str = str + j + "\n";
		   }
		   return str;
	}

	public void addAllEquipe(Equipe e1) {
		Collection <Joueur> c = new ArrayList <Joueur>() ; 
		c.addAll(joueurs);
		c.retainAll(e1.joueurs); /*c contient les joueurs en commun entre les deux collections */
		joueurs.removeAll(c);  /*Suppression des joueurs en commun pour eliminer les doublons*/
		joueurs.addAll(e1.joueurs);
		
		/*2eme méthode ; On peut aussi utiliser la fonction isJoueurPresent(Joueur), remove les joueurs en commun et appeler 
		 la fonction addAll())*/
	}
	
	/*methode qui efface le contenu de l’équipe*/
	public void clear () {
		joueurs.clear();
	}
	
	/*methode qui retourne le nombre de joueurs dans l’équipe*/
	public int  getNombreJoueurs() {
		return (joueurs.size());
	}
	
	/*methode qui retourne la moyenne des ages des joueurs de l’équipe*/
	public double getMoyenneAge()  {
		int s = 0;
		for (Joueur j : joueurs) {
			s = s+j.getAge();
		}
		double moyenne = s / (joueurs.size());
		return (moyenne);
	}

	
	
}
