package Org.Hela.serie1.Exo4;

public class Anagramme {

	String s1;
	String s2;
	
	/*constructeur de la classe anagramme*/
	Anagramme (String s1, String s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	/*methode qui retourne le nombre d'apparation d'un caractere dans une chaine*/
	public int NbOccurrences(String chaine, char caractere)
	{
	 int nb = 0;
	 /*parcourir la chaine*/
	 for (int i=0; i < chaine.length(); i++){
		 /*incrementer nb de 1 à chaque fois qu'on detecte la presence du caractere dans la chaine*/
		 if (chaine.charAt(i) == caractere)
		 nb++;
		 }
	 return nb;
	}
	
	boolean isAnagramme (String s1, String s2) {
		
		/*enlever les espaces de mot1 et de mot2*/
		String mot1 = s1.replaceAll(" ","");
		String mot2 = s2.replaceAll(" ","");
		/*enlever le caractere ' de mot1 et de mot2*/
		 mot1 = mot1.replaceAll("'","");
		 mot2 = mot2.replaceAll("'","");
		
		/*calculer la taille de mot1 et la taille de mot2*/
		int taille1 = mot1.length();
		int taille2 = mot2.length();
		
		/*si les mots n'ont pas la même taille donc ne sont pas anagrammes => sortie de la methode*/
		if (taille1 != taille2)
			return false;
		else {
			/*convertir toutes les lettres de mot1 et de mot2 en minuscule*/
			mot1 = mot1.toLowerCase();
			mot2 = mot2.toLowerCase();
			/*"convertir" une chaine en un tableau de caracteres*/
			char [] letters1 =mot1.toCharArray();
			for (int i=0; i<taille1 ; i++){
				/*tester si le caractere i du mot 1 existe dans mot 2 : s'il n'existe pas => pas anagramme => sortie de la boucle*/
				if (mot2.indexOf(letters1[i]) == -1)
						return false;
				/*tester si le nombre d'un caractere est le même dans les deux mots => si ce n'est pas le cas => pas anagramme*/
				if (NbOccurrences(mot1,letters1[i]) != NbOccurrences(mot2,letters1[i])) {
						return false ;
				}
			}
			return true;	
		}
	}
}
