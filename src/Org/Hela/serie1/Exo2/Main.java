package Org.Hela.serie1.Exo2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Bissextile annee1 = new Bissextile (2000);
				if(annee1.bissextile(annee1.année)) {
					System.out.println(annee1.année +" est une année bissextile" );
				}
				else
					System.out.println(annee1.année +" n'est pas une année bissextile" );
				
				Bissextile annee2 = new Bissextile (1901);
				if(annee2.bissextile(annee2.année)) {
					System.out.println(annee2.année +" est une année bissextile" );
				}
				else
					System.out.println(annee2.année +" n'est pas une année bissextile" );
				
				Bissextile annee3 = new Bissextile (1900);
				if(annee3.bissextile(annee3.année)) {
					System.out.println(annee3.année +" est une année bissextile" );
				}
				else
					System.out.println(annee3.année +" n'est pas une année bissextile" );
				
				Bissextile annee4 = new Bissextile (1996);
				if(annee4.bissextile(annee4.année)) {
					System.out.println(annee4.année +" est une année bissextile" );
				}
				else
					System.out.println(annee4.année +" n'est pas une année bissextile" );
					
			}

}

