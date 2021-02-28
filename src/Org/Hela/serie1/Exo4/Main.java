package Org.Hela.serie1.Exo4;

public class Main {

	public static void main(String[] args) {
		
		/*Mots qui ne sont pas anagrammes */
		System.out.println("\n ****** Mots NON anagrammes ****** \n ");
		
		Anagramme mot1 = new Anagramme ("Paul","Ngolo");
		if (mot1.isAnagramme(mot1.s1, mot1.s2)) {
			System.out.println(mot1.s1 + " et " + mot1.s2 + "  SONT ANAGRAMMES");
		}
		else {
			System.out.println(mot1.s1 + " et " + mot1.s2 + " NE SONT PAS ANAGRAMMES");
		}
	
		Anagramme mot2 = new Anagramme ("Telecom","Galilee");
		if (mot2.isAnagramme(mot2.s1, mot2.s2)) {
			System.out.println(mot2.s1 + " et " + mot2.s2 + "  SONT ANAGRAMMES");
		}
		else {
			System.out.println(mot2.s1 + " et " + mot2.s2 + " NE SONT PAS ANAGRAMMES");
		}
		
		Anagramme mot3 = new Anagramme ("Bonjour tout le monde", "hello word");
		if (mot3.isAnagramme (mot3.s1,mot3.s2)) {
			System.out.println(mot3.s1 + " et " + mot3.s2 + " SONT ANAGRAMMES");
		}
		else
			System.out.println(mot3.s1 + " et " + mot3.s2 + " NE SONT PAS ANAGRAMMES");
		
		Anagramme mot7 = new Anagramme ("le canard enchaine", "la canne de l'anarchie");
		if (mot7.isAnagramme (mot7.s1,mot7.s2)) {
			System.out.println(mot7.s1 + " et " + mot7.s2 + " SONT ANAGRAMMES");
		}
		else
			System.out.println(mot7.s1 + " et " + mot7.s2 + " NE SONT PAS ANAGRAMMES");
		
		/*Mots qui sont anagrammes */
		System.out.println("\n ****** Mots anagrammes ****** \n");
		
		Anagramme mot4 = new Anagramme ("galilee", "egaille");
		if (mot4.isAnagramme (mot4.s1,mot4.s2)) {
			System.out.println(mot4.s1 + " et " + mot4.s2 + " SONT ANAGRAMMES");
		}
		else
			System.out.println(mot4.s1 + " et " + mot4.s2 + " NE SONT PAS ANAGRAMMES");
		
		Anagramme mot5 = new Anagramme ("Serveur", "reveurs");
		if (mot5.isAnagramme (mot5.s1,mot5.s2)) {
			System.out.println(mot5.s1 + " et " + mot5.s2 + " SONT ANAGRAMMES");
		}
		else
			System.out.println(mot5.s1 + " et " + mot5.s2 + " NE SONT PAS ANAGRAMMES");
		
		Anagramme mot6 = new Anagramme ("Boris Vian", "Bison ravi");
		if (mot3.isAnagramme (mot6.s1,mot6.s2)) {
			System.out.println(mot6.s1 + " et " + mot6.s2 + " SONT ANAGRAMMES");
		}
		else
			System.out.println(mot6.s1 + " et " + mot6.s2 + " NE SONT PAS ANAGRAMMES");
		
		Anagramme mot8 = new Anagramme ("le canard enchaine", "canne de l'anarchie");
		if (mot7.isAnagramme (mot8.s1,mot8.s2)) {
			System.out.println(mot8.s1 + " et " + mot8.s2 + " SONT ANAGRAMMES");
		}
		else
			System.out.println(mot8.s1 + " et " + mot8.s2 + " NE SONT PAS ANAGRAMMES");
		
}
}
