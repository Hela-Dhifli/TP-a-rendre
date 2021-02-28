package Org.Hela.serie3.Exercice7;

import java.util.*;

public class EquipeLimitee {
	
	Collection <Joueur> joueurs;
	int nombreMax;
	
	//constructeur
	
	EquipeLimitee (int nombreMax) {
		joueurs = new ArrayList <Joueur>(); 
		this.nombreMax = nombreMax;
	}
	
	public void addJoueur(Joueur j) {
		if (getNombreJoueurs() < nombreMax)
			joueurs.add(j);
		else 
			System.out.println("Joueur non ajouté, nombreMax de joueur atteint") ;
	}
	
	public boolean removeJoueur(Joueur j) {
		return (joueurs.remove(j));
	}
	
	
	boolean isJoueurPresent (Joueur j) {
		return (joueurs.contains(j));
	}

	public void affichage() {
		System.out.println("Equipe : " + joueurs.size());
		for (Joueur j : joueurs) {
			System.out.println(j.toString());
		}
	}
	
	public void addAllEquipe(Equipe e1) {
		joueurs.addAll(e1.joueurs);
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
	
	@Override
	public String toString() {
		   String str = "Equipe : ";
		   str = str + (joueurs.size())+(" joueurs\n") ;
		   
		   for (Joueur j : joueurs) {
		      str = str + j + "\n";
		   }

		   return str;
	}
}
