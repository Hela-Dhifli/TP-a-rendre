package Org.Hela.serie1.Exo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Bissextile annee1 = new Bissextile (2000);
				if(annee1.bissextile(annee1.ann�e)) {
					System.out.println(annee1.ann�e +" est une ann�e bissextile" );
				}
				else
					System.out.println(annee1.ann�e +" n'est pas une ann�e bissextile" );
				
				Bissextile annee2 = new Bissextile (1901);
				if(annee2.bissextile(annee2.ann�e)) {
					System.out.println(annee2.ann�e +" est une ann�e bissextile" );
				}
				else
					System.out.println(annee2.ann�e +" n'est pas une ann�e bissextile" );
				
				Bissextile annee3 = new Bissextile (1900);
				if(annee3.bissextile(annee3.ann�e)) {
					System.out.println(annee3.ann�e +" est une ann�e bissextile" );
				}
				else
					System.out.println(annee3.ann�e +" n'est pas une ann�e bissextile" );
				
				Bissextile annee4 = new Bissextile (1996);
				if(annee4.bissextile(annee4.ann�e)) {
					System.out.println(annee4.ann�e +" est une ann�e bissextile" );
				}
				else
					System.out.println(annee4.ann�e +" n'est pas une ann�e bissextile" );
					
			}

}

