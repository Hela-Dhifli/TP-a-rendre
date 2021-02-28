package Org.Hela.serie3.Exercice8;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*les joueurs*/
		
		Joueur j1 = new Joueur();
		j1.setNom("Laurant");
		j1.setAnneeDeNaissance(1965);
		
		Joueur j2 = new Joueur();
		j2.setNom("Marcel");
		j2.setAnneeDeNaissance(1968);
		
		Joueur j3 = new Joueur();
		j3.setNom("Patrick");
		j3.setAnneeDeNaissance(1976);
		
		Joueur j4 = new Joueur();
		j4.setNom("Alain");
		j4.setAnneeDeNaissance(1970);
		
		Joueur j5 = new Joueur();
		j5.setNom("Didier");
		j5.setAnneeDeNaissance(1968);
		
		Joueur j6 = new Joueur();
		j6.setNom("Steve");
		j6.setAnneeDeNaissance(1980);
		
		Joueur j7 = new Joueur();
		j7.setNom("Hugo");
		j7.setAnneeDeNaissance(1986);
		
		Joueur j8 = new Joueur();
		j8.setNom("Djibril");
		j8.setAnneeDeNaissance(1992);
		
		Joueur j9 = new Joueur();
		j9.setNom("Blaise");
		j9.setAnneeDeNaissance(1987);
		
		Joueur j10 = new Joueur();
		j10.setNom("Paul");
		j10.setAnneeDeNaissance(1993);
		
		//
		RegistreJoueurs joueurs = new RegistreJoueurs();
		joueurs.addJoueur(j5);
		joueurs.addJoueur(j4);
		joueurs.addJoueur(j3);
		joueurs.addJoueur(j6);
		joueurs.addJoueur(j7);
		joueurs.addJoueur(j8);
		joueurs.addJoueur(j9);
		joueurs.addJoueur(j10);
		joueurs.addJoueur(j1);
		joueurs.addJoueur(j2);
		
		System.out.println("\n***** Affichage de Map *****\n" + joueurs);
		
		System.out.println("\n***** La décennie 1960 *****\n");
		System.out.println("La liste des joueurs nés dans cette décennie \n"+ joueurs.get(1960));
		System.out.println("Le nombre des joueurs nés dans cette décennie est : "+ joueurs.count(1960));
		
		System.out.println("\n***** La décennie 1970 *****\n");
		System.out.println("La liste des joueurs nés dans cette décennie \n"+ joueurs.get(1970));
		System.out.println("Le nombre des joueurs nés dans cette décennie est : "+ joueurs.count(1970));
		
		System.out.println("\n***** La décennie 1980 *****\n");
		System.out.println("La liste des joueurs nés dans cette décennie \n"+ joueurs.get(1980));
		System.out.println("Le nombre des joueurs nés dans cette décennie est : "+ joueurs.count(1980));
		
		System.out.println("\n***** La décennie 1990 *****\n");
		System.out.println("La liste des joueurs nés dans cette décennie \n"+ joueurs.get(1990));
		System.out.println("Le nombre des joueurs nés dans cette décennie est : "+ joueurs.count(1990));
		
		System.out.println("\n***** Le nombre des joueurs enregistrés dans le registre *****\n"+ joueurs.count() +" joueurs");
	}

}
