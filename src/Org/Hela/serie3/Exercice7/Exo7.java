package Org.Hela.serie3.Exercice7;


public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* TEST FONCTIONNEMENT CLASSE Equipe */
		
		Joueur j1 = new Joueur();
		j1.setNom("Zinedine");
		j1.setAge(42);
		
		Joueur j2 = new Joueur();
		j2.setNom("Fabien");
		j2.setAge(26);
	
		Joueur j3 = new Joueur();
		j3.setNom("Lilian");
		j3.setAge(26);
		
		Joueur j4 = new Joueur();
		j4.setNom("Bixente");
		j4.setAge(28);
		
		Joueur j5 = new Joueur();
		j5.setNom("Youri");
		j5.setAge(30);
		
		Joueur j6 = new Joueur();
		j6.setNom("Ronaldo");
		j6.setAge(33);
		
		Joueur j7 = new Joueur();
		j7.setNom("Messi");
		j7.setAge(32);
		
		/* création de deux equipes e et e1 */
		Equipe e = new Equipe();
		Equipe e1 = new Equipe();
		
		/*ajout des joueurs à l'equipe e*/		
		e.addJoueur(j1);
		e.addJoueur(j2);
		e.addJoueur(j3);
		e.addJoueur(j4);
		e.addJoueur(j5);
		
		/*ajout des joueurs à l'equipe e1*/
		e1.addJoueur(j1);
		e1.addJoueur(j6);
		e1.addJoueur(j7);
		e1.addJoueur(j5);
		
		/*test ajout*/
		System.out.println("\n********* Affichage joueurs equipe e initial *********\n" + e);
		
		/*Supprimer joueur 5 de l'equipe*/
		System.out.println("\n********* Test removeJoueur *********\n");
		if (e.removeJoueur(j5))
			System.out.println("Joueur 5 existe et a été supprimé avec succés");
		else
			System.out.println("Joueur 5 n'existe pas");
		 
		/*test isJoueurPresent()*/
		System.out.println("\n********* Test isJoueurPresent *********\n");
		System.out.println("joueur 1 ? " + e.isJoueurPresent(j1));
		System.out.println("joueur 5 ? " + e.isJoueurPresent(j5));
		
		/*Ajouter les joueurs de e1 à l'équipe e*/
		e.addAllEquipe(e1);
		System.out.println("\n********* Affichage joueurs equipe e après ajout de joueurs d'equipe e1 *********\n" + e);
		
		
		/*effacer le contenu de l'équipe e1*/
		e1.clear();
		System.out.println("\n********* Etat equipe e1 après appel à la fonction clear() *********\n" + e1);
		
		/*test de la fonction getNombreJoueurs()*/
		System.out.println("\nle nombre de joueur actuel de l'equipe e est " + e.getNombreJoueurs());
		
		/*test de la fonction getMoyenneAge()*/
		System.out.println("\nla moyenne des ages des joueurs de l'equipe e est " + e.getMoyenneAge());
		
	/* TEST FONCTIONNEMENT CLASSE EquipeLimitee */

		EquipeLimitee eL = new EquipeLimitee(3);
		
		/*test ajout*/
		System.out.println("\n********* Test Equipe Limitee *********\n");
	
		eL.addJoueur(j1);
		eL.addJoueur(j2);
		eL.addJoueur(j3);
		eL.addJoueur(j4);
		eL.addJoueur(j5);
		
		System.out.println("\n********* Affichage joueurs Equipe Limitee *********\n" + eL);
	}

}
