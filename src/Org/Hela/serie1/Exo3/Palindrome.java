package Org.Hela.serie1.Exo3;

public class Palindrome {

	String mot ;
	
	/*constructeur de la classe Palindrome*/
	public Palindrome (String mot){
		this.mot = mot ;
	}
	
	/*methode qui retourne si un mot est palindrome ou non*/
	boolean palindrome(String chaine) {
		/*convertir la chaine en miniscule*/
		String mot1 = chaine.toLowerCase();
		/*enlever tous les espaces de la chaine*/
		mot1 = mot1.replaceAll(" ", "");
		/*enlever tous les "," de la chaine*/
		mot1 = mot1.replaceAll(",", "");
		/* "convertir" la chaine en tableau de caractere*/
		char [] letters = mot1.toCharArray();
		/* i est un compteur placé au debut le chaine*/
		int i = 0;
		/* j est un compteur placé a la fin de la chaine*/
		int j = (mot1.length())-1;
		
		while ( (i<j) ) {
			if (letters[i] == letters[j]) {
				i++; 
				j--;
			}
			else
				return false;
		}
			return true;
						
	}
}
